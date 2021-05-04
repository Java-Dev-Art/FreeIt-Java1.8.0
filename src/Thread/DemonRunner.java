package Thread;

public class DemonRunner {
    public static void main(String[] args) {
        SimpleThread usual = new SimpleThread();
        SimpleThread demon = new SimpleThread();
        demon.setDaemon(true);
        demon.start();
        usual.start();
        System.out.println(Thread.currentThread().getName());
    }
}
