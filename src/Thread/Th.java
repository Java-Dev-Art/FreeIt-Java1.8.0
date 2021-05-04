package Thread;

import static java.lang.System.err;
import static java.lang.System.out;
public class Th extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            out.println("First thread extends Thread");
            try {
                Th.sleep(10);
            }catch (InterruptedException e){
                err.println("Exception find" + e);
            }
        }
    }
}
