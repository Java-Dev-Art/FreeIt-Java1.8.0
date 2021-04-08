package HomeWork7.Cosmos;

public class Sputnik implements IStart{
    boolean systemSputnik;
    public void checkSystem() {
        int start = (int)(Math.random() * 10);
        if (start > 3){
            System.out.println("Все системы в норме");
            engine();
            this.systemSputnik = true;
        }else {
            System.out.println("Идет наладка системы");
            this.systemSputnik = false;
        }
    }

    @Override
    public void engine() {
        System.out.println("Двигатели Sputnik запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла Sputnik");
    }
}
