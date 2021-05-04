package Thread;

public class BuffThread {
    static int counter = 0;
//    static StringBuffer s = new StringBuffer();
    static StringBuilder s = new StringBuilder();
    public static void main(String[] args) throws InterruptedException{
        new Thread(){
            public void run(){
                synchronized (s){
                    while (BuffThread.counter++<3){
                        s.append("A");
                        System.out.print(">" + counter + " ");
                        System.out.println(s);
                        try {
                            sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        Thread.sleep(100);
        while (BuffThread.counter++<6){
            System.out.print("<" + counter + " ");
            s.append("B");
            System.out.println(s);
        }
    }
}
