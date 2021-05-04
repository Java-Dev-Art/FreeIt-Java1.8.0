package Thread;

import java.util.concurrent.TimeUnit;

public class SunchroMain37 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++){
            DoubleResource35 resource35 = new DoubleResource35();
            new ResThread36("A",resource35).start();
            new ResThread36("B",resource35).start();
            new ResThread36("C",resource35).start();
            TimeUnit.MILLISECONDS.sleep(1_000);
            System.out.println(resource35);
        }
    }
}
