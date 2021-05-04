package Thread;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicDeme {
    private static final int BROKERS = 30;

    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        market.start();
        for (int i = 0; i < BROKERS;i++){
            new Broker(market).start();
        }
    }
}

