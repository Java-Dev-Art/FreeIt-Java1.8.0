package Thread;

public class AudioChanel {
    private int channelId;

    public AudioChanel(int id) {
        super();
        this.channelId = id;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int id) {
        this.channelId = id;
    }
    public void using(){
        try {
            Thread.sleep(new java.util.Random().nextInt(500));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
