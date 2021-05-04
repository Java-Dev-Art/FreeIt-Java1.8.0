package Thread;

public class ThreadException extends Thread{
    @Override
    public void run() {
        boolean flag = true;
        if (flag){
            throw new RuntimeException();
        }
        System.out.println("end of ExceptTread");
    }
}
