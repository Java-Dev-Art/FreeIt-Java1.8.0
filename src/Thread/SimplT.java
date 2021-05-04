package Thread;

public class SimplT extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.out.println("end SimplT");
        }
    }
}
