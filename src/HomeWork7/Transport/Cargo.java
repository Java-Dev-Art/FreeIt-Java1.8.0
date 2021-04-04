package HomeWork7.Transport;

import javax.swing.plaf.PanelUI;

public class Cargo extends Terrestrial{
    final int CARRYING_CAPACITY = 15;
    boolean cargoBool;

    public Cargo(int power, int maxSpeed, String mark, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, mark, numberOfWheels, fuelConsumption);

    }

    public double powerCargo(){
        return super.power * 0.74;
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
        return "Марка : " + super.mark + "." + "\nМощность :"  + super.power  + " л.с, " + powerCargo() + " кВ." +
                "\nМаксимальная скорость : " + super.maxSpeed + "км/ч." + "\nРасход топлива на 100 км : " + super.fuelConsumption + "л. " +
                "\nМаксимальная грузоподбемность : " + CARRYING_CAPACITY + "тон.";
    }

}
