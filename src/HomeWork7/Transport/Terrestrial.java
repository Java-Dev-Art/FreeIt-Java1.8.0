package HomeWork7.Transport;

public class Terrestrial extends Transport {
    private int numberOfWheels;
    private int fuelConsumption;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Terrestrial(int power, int maxSpeed, String mark, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, mark);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }




}
