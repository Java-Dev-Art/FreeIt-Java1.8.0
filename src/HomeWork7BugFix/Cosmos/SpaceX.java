package HomeWork7BugFix.Cosmos;

public class SpaceX implements IStart {
    boolean systemSpaceX;
    public void checkSystemSpaceX() {
        int start = (int)(Math.random() * 10);
        if (start > 3){
            System.out.println("Все системы в норме");
            engine();
            this.systemSpaceX = true;
        }else {
            System.out.println("Идет наладка системы");
            this.systemSpaceX = false;
        }
    }

    @Override
    public void engine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла SpaceX");
    }
}
