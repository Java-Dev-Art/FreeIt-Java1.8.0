package Thread;

import java.util.Random;

public class ARunner {
    public static void main(String[] args) {
        Auction auction = new Auction();
        int startPrice = new Random().nextInt(100);
        for (int i = 0; i < auction.NUMBERS; i++){
            Bid thread = new Bid(i, startPrice,auction.getBarrier());
            auction.add(thread);
            thread.start();
        }
    }
}
