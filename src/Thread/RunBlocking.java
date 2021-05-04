package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class RunBlocking {
    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        new Thread(){
            public void run(){
                for (int i = 0; i <45;i++){
                    try {
                        queue.put("Java" + i);
                        System.out.println("Element " + i + " added");
                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                try {
                    Thread.sleep(1_000);
                    System.out.println("Element" + queue.take() + " took");
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }.start();
    }
}
