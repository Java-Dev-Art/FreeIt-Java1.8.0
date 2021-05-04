package Thread;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;

public class Truck43 implements Runnable{
    private Phaser phaser;
    private String name;
    private int capacity;
    private Storage45 storageFrom;
    private Storage45 storageTo;
    private Queue<Item44> bodyStorage;

    public Truck43(Phaser phaser, String name, int capacity, Storage45 storageFrom, Storage45 storageTo) {
        this.phaser = phaser;
        this.name = name;
        this.capacity = capacity;
        this.storageFrom = storageFrom;
        this.storageTo = storageTo;
    }

    @Override
    public void run() {

    }
    private void loadTruck(){
        for (int i = 0; i < capacity; i++){
            Item44 g = storageFrom.getGood();
            if (g == null){
                return;
            }
            bodyStorage.add(g);
            System.out.println("Грузовик " + name + " загрузил товар №" + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private void unloadTruck(){
        int size = bodyStorage.size();
        for (int i = 0; i < size; i++){
            Item44 g = bodyStorage.poll();
            storageTo.setGood(g);
            System.out.println("Грузовик " + name + " разгрузил товар №" + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private void goTruck(){
        try {
            Thread.sleep(new Random(100).nextInt(500));
            System.out.println("Грущовик " + name + " начал поездку");
            Thread.sleep(new Random(100).nextInt(1000));
            System.out.println("Грузовик " + name + " завершил поездку");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
