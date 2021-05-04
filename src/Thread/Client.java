package Thread;

public class Client extends Thread{
    private boolean reading = false;
    private ChannelPoolS313<AudioChanel> pool;
    public Client(ChannelPoolS313<AudioChanel>pool){
        this.pool = pool;
    }
    public void run(){
        AudioChanel audioChanel = null;
        try {
            audioChanel = pool.getResource(100);
            reading = true;
            System.out.println("Chanel Client # " + this.getId() + " took channel # " + audioChanel.getChannelId());
            audioChanel.using();
        }catch (ResourceException e){
            System.out.println("Client #" + this.getId() + " lot ->" + e.getMessage());
        }finally {
            if (audioChanel!=null){
                reading = false;
                System.out.println("Chanel Client #" + this.getId() + " : " + audioChanel.getChannelId() + " channel released" );
                pool.returnResource(audioChanel);
            }
        }
    }

    public boolean isReading() {
        return reading;
    }
}
