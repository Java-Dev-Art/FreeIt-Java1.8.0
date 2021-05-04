package Thread;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage45 implements Iterable<Item44>{
    public static final int STORAGE = 20;
    private Queue<Item44> goods =null;
    private Storage45(){
        goods = new LinkedBlockingQueue<Item44>(STORAGE);
    }
    private Storage45(int capacity){
        goods = new LinkedBlockingQueue<Item44>(capacity);
    }
    public static Storage45 createStorage(int capacity){
        Storage45 storage45 = new Storage45(capacity);
        return storage45;
    }
    public static Storage45 createStorage(int capacity, List<Item44> goods){
        Storage45 storage45 = new Storage45(capacity);
        storage45.goods.addAll(goods);
        return storage45;
    }
    public Item44 getGood(){
        return goods.poll();
    }
    public boolean setGood(Item44 good){
        return goods.add(good);
    }

    @Override
    public Iterator<Item44> iterator() {
        return goods.iterator();
    }
}
