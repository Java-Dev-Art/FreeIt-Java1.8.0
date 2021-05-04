package Thread;
import static java.lang.System.err;
import static java.lang.System.out;
public class JoinThead extends Thread{
    public JoinThead(String name) {
        super(name);
    }
    public void run(){
        String nameT = getName();
        long timeout = 0;
        out.println("Start Thread" + nameT);
        try {
            switch (nameT) {
                case "First":
                    timeout = 5_000;
//                    break;
                case "Second":
                    timeout = 1_000;
//                    break;
            }
            Thread.sleep(timeout);
            out.println("Thread name " + nameT + " end");
            }catch (InterruptedException e){
            err.println("Exception thread " + e);
        }
    }
}
