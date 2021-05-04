package Thread;
import static java.lang.System.err;
import static java.lang.System.out;
public class Run implements Runnable{
    @Override
    public void run() {
        out.println("Thread run implements Runnable");
        try {
            Thread.sleep(1);
        }catch (InterruptedException e){
            err.println(e);
        }
    }
}
