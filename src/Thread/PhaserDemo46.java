package Thread;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Phaser;

public class PhaserDemo46 {
    public static void main(String[] args) {
        Item44[] goods = new Item44[20];
        for (int i = 0; i < goods.length; i++){
            goods[i] = new Item44(i + 1);
        }
        List<Item44> listGoods = Arrays.asList(goods);
        Storage45 storageA = Storage45.createStorage(listGoods.size(),listGoods);
        Storage45 storageB = Storage45.createStorage(listGoods.size());
        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;
        Thread tr1 = new Thread(new Truck43(phaser,"tr1",5,storageA,storageB));
        Thread tr2 = new Thread(new Truck43(phaser,"tr2",6,storageA,storageB));
        Thread tr3 = new Thread(new Truck43(phaser,"tr3",7,storageA,storageB));
        printGoodsToConsole("Товар на складе А", storageA);
        printGoodsToConsole("Товар на складе B", storageB);
        tr1.start();
        tr2.start();
        tr3.start();
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Загрузка колоны завершена. Фаза" + currentPhase + " завершена");
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Загрузка колоны завершена. Фаза" + currentPhase + " завершена");
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Загрузка колоны завершена. Фаза" + currentPhase + " завершена");
        phaser.arriveAndDeregister();
        if (phaser.isTerminated()){
            System.out.println("Фазы синхронизированы и завершены");
        }
        printGoodsToConsole("Товар на складе А", storageA);
        printGoodsToConsole("Товар на складе B", storageB);
    }
    public static void printGoodsToConsole(String title, Storage45 storage){
        System.out.println(title);
        Iterator<Item44> goodIterator = storage.iterator();
        while (goodIterator.hasNext()){
            System.out.print(goodIterator.next().getRegistrationNumber() + " ");
        }
        System.out.println();
    }
}
