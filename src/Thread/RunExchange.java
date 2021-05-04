package Thread;

public class RunExchange {
    public static void main(String[] args) {
        Item item = new Item(34,100);
        Item item1 = new Item(34,80);
        new Thread(new Producer("HP",item)).start();
        new Thread(new Consumer("RETAIL TRAIDE", item1)).start();
    }
}
