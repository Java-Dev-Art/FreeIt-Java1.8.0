package HomeWork7.Cosmos;

import java.util.regex.Matcher;

public class Shuttle implements IStart{
    boolean systemShuttle;
    public void checkSystem() {
        int start = (int)(Math.random() * 10);
        if (start > 3){
            System.out.println("Все системы в норме");
            engine();
            this.systemShuttle = true;
        }else {
            System.out.println("Идет наладка системы");
            this.systemShuttle = false;
        }
    }

    @Override
    public void engine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
