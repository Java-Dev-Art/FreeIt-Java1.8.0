package Thread;

public class Producer extends Subject implements Runnable{
    public Producer(String name, Item item) {
        super(name, item);
    }

    @Override
    public void run() {
        try {
            synchronized (item){
                int proposedNUMBER = this.getItem().getNumber();
                item = exchanger.exchange(item);
                if (proposedNUMBER <= item.getNumber()){
                    System.out.println("Producer " + getName() + " rise plan production");
                }else {
                    System.out.println("Producer " + getName() + " down plan production");
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
