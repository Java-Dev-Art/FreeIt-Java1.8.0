package Thread;
import static java.lang.System.err;
import static java.lang.System.out;

public class PriorThread extends Thread{
//    public PriorThread(String name) {
public PriorThread(ThreadGroup thread,String name) {//for group
    super(thread, name);

}
    public void run (){
        for (int i = 0; i < 80; i++){
            out.println(getName() + " " + i);
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){
                err.println(e);
            }
        }
    }
}
