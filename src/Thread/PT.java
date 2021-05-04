package Thread;

public class PT {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("group thread 1");
        PriorThread min = new PriorThread(tg,"MIN");
        PriorThread max = new PriorThread(tg,"MAX");
        PriorThread norm = new PriorThread(tg,"NORMAL");
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        min.start();
        norm.start();
        max.start();


//        PriorThread t0 = new PriorThread(tg,"Thread0")
//        Thread thread1 = new Thread(tg,"Thead0");
//        Thread thread2 = new Thread(tg,"Thread1");
//        thread1.start();
//        thread2.
    }

}
