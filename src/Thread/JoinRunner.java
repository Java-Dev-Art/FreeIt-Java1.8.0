package Thread;
import static java.lang.System.err;
import static java.lang.System.out;
public class JoinRunner {
    static {
        out.println("Start thread MAIN");
    }
    public static void main(String[] args) {
        JoinThead t1 = new JoinThead(" FIRST");
        JoinThead t2 = new JoinThead(" SECOND");
        t1.start();
        t2.start();
        try {
            t1.join(500);
//            t2.join();
        }catch (InterruptedException e){
            err.println(e);
        }
        out.println("Thread name " + Thread.currentThread().getName() + " end");//name thread
    }
}
