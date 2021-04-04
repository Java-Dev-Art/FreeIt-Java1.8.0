package HomeWork7.Transport;

public class Terrestrial extends Transport {
    int numberOfWheels;
    int fuelConsumption;

    public Terrestrial(int power, int maxSpeed, String mark, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, mark);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }




}
