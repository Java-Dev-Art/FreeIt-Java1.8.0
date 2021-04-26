package HomeWork7BugFix.Transport;

public class Cargo extends Terrestrial {
    final int CARRYING_CAPACITY = 15;
    boolean cargoBool;

    public Cargo(int power, int maxSpeed, String mark, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, mark, numberOfWheels, fuelConsumption);

    }

    public double powerCargo(){
        return super.getPower() * 0.74;
    }
    public void carrCargo(int t){
        if (t < CARRYING_CAPACITY){
            cargoBool = true;
            int ton = CARRYING_CAPACITY - t;
            System.out.println("Загрузка возможна.\nЕше можно загрузить :" + ton);
        } else {
            cargoBool = false;
            System.out.println("Загрузка не возможна");
        }
    }
    public String toStringCargo(){
        return "Марка : " + super.getMark() + "." + "\nМощность :"  + super.getMaxSpeed() + " л.с, " + powerCargo() + " кВ." +
                "\nМаксимальная скорость : " + super.getMaxSpeed()+ "км/ч." + "\nРасход топлива на 100 км : " + super.getFuelConsumption() + "л. " +
                "\nМаксимальная грузоподбемность : " + CARRYING_CAPACITY + "тон.";
    }
}
