package Thread;
import static java.lang.System.out;
public class SimpleThread extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()){
                out.println("Start Demon Thread");
                Thread.sleep(1);
            }else {
                out.println("Start Normal Thread");
            }
        }catch (InterruptedException e){
            out.println(e);
        }finally {
            if (!isDaemon()){
                out.println("End Normal Thread");
            }
            if (isDaemon()){
                out.println("End Demon");
            }
        }
    }
}
