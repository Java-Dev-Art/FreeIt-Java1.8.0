package Thread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Bid extends Thread{
    private Integer bidId;
    private int price;
    private CyclicBarrier cyclicBarrier;
    public Bid(int id,int price,CyclicBarrier cyclicBarrier){
        this.bidId = id;
        this.price = price;
        this.cyclicBarrier = cyclicBarrier;
    }

    public Integer getBidId() {
        return bidId;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void run() {
        try {
            System.out.println("Client " + this.bidId + " specifies price.");
            Thread.sleep(new Random().nextInt(3000));
            int delta = new Random().nextInt(50);
            price +=delta;
            System.out.println("Bid " + this.bidId + " : " + price);
            this.cyclicBarrier.await();
            System.out.println("Continue to work.....");
        }catch (BrokenBarrierException e){
            System.out.println(e);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
