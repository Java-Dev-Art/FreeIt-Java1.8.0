package HomeWork7.Cosmos;

public class SpacePort {
    private boolean check;
    private IStart iStart;
    public void setCheck(boolean b){
        this.check = b;
    }
    public void start(IStart start){
        if (start.checkSystem(true) == check){
            System.out.println("система в порядке горовтесь к старту");
            Shuttle shuttle = new Shuttle();
            Sputnik sputnik = new Sputnik();
            SpaceX spaceX = new SpaceX();
            shuttle.checkSystem();
            sputnik.checkSystem();
            spaceX.checkSystemSpaceX();
            if (sputnik.systemSputnik == true){
                int count = 11;
                while (count > 0){
                    count--;
                    System.out.println(count + " секунд");
                    if (count == 0){
                        System.out.println("Start");
                        sputnik.start();
                    }
                }
            }else {
                System.out.println("Спутник не летит");
            }
            if (shuttle.systemShuttle == true){
                int count = 11;
                while (count > 0){
                    count--;
                    System.out.println(count + " секунд");
                    if (count == 0){
                        System.out.println("Start");
                        sputnik.start();
                    }
                }
            }else {
                System.out.println("Shuttle не летит");
            }
            if (spaceX.systemSpaceX == true){
                int count = 11;
                while (count > 0){
                    count--;
                    System.out.println(count + " секунд");
                    if (count == 0){
                        System.out.println("Start");
                        sputnik.start();
                    }
                }
            }else {
                System.out.println("SpaceX не летит");
            }

        }else {
            System.out.println("Система не впорядке, проверте систему");
        }
    }

    public static void main(String[] args) {
        SpacePort port = new SpacePort();
        IStart start = new IStart() {
            @Override
            public void engine() {

            }

            @Override
            public void start() {

            }
        };
        port.setCheck(true);
        port.start(start);
    }
}
