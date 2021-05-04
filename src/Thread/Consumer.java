package Thread;

public class Consumer extends Subject implements Runnable{

    public Consumer(String name, Item item) {
        super(name, item);

    }
    @Override
    public void run() {
        try {
            synchronized (item){
                int requiredNumber = item.getNumber();
                item = exchanger.exchange(item);
                if (requiredNumber >= item.getNumber()){
                    System.out.println("Consumer " + getName() + " rise price product");
                }else {
                    System.out.println("Consumer" + getName() + " down price product");
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
