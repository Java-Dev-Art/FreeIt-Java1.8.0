package Thread;

public class ETD {
    public static void main(String[] args) throws InterruptedException{
        new ThreadException().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}
