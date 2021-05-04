package Thread;

public class TwoThread {
    static int counter = 0;

    public static void main(String[] args) {
        final StringBuilder s = new StringBuilder();
        new Thread(){
            @Override
            public void run() {
               synchronized (s){
                   do {
                       s.append("A");
                       System.out.println(s);
                       try {
                           Thread.sleep(1000);
                       }catch (InterruptedException e){
                           System.out.println(e);
                       }
                   }while (TwoThread.counter++ < 4);
               }//end synchronized
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (s){
                    while (TwoThread.counter++ < 8){
                        s.append("B");
                        System.out.println(s);
                    }
                }//end synchronize
            }
        }.start();
    }
}
