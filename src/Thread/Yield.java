package Thread;

public class Yield {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("Start Thread #1");
                Thread.yield();
                for (int i = 0; i < 20; i ++){
                    System.out.println(getState() + " " + i + "/" + getName());
                    if (i == 15) {
                        Thread.interrupted();
                    }
                }
                System.out.println("Thread #1 end");
            }
        }.start();
        new Thread(){
            public void run(){
                System.out.println("Start Thread #2");
                System.out.println("Thread #2 end");
                System.out.println(getState());
            }
        }.start();

    }
}
