package HomeWork7.Transport;

public class Passenger extends Terrestrial {
    private String carcase;
    private int numberOfPassengers;
    private double km;
    private double l;
    private double time;

    public String getCarcase() {
        return carcase;
    }

    public void setCarcase(String carcase) {
        this.carcase = carcase;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getKm() {
        return km;
    }

    public double getL() {
        return l;
    }

    public double getTime() {
        return time;
    }

    public Passenger(int power, int maxSpeed, String mark, int numberOfWheels, int fuelConsumption, String carcase, int numberOfPassengers) {
        super(power, maxSpeed, mark, numberOfWheels, fuelConsumption);
        this.carcase = carcase;
        this.numberOfPassengers = numberOfPassengers;
    }


    public double powerPass(){
        return super.getPower() * 0.74;
    }
    public void liters(double time){
        this.time = time;
        this.km = super.getMaxSpeed() * time;
        this.l = (km /100) * super.getFuelConsumption();
    }
    public void litersPass(){
        System.out.println("За время " + getTime() + " часа, автомобиль " + super.getMark() +" двигаясь с максимальной скоростью " +
                super.getMaxSpeed() + " км/ч израсходует " + getL() +" литров топлива");
    }
    public String toStringPass(){
        return "Марка : " + super.getMark()+ "." + "\nМощность :"  + super.getPower()  + " л.с, " + powerPass() + " кВ." +
                "\nМаксимальная скорость : " + super.getMaxSpeed() + "км/ч." + "\nРасход топлива на 100 км : " + super.getFuelConsumption() + "л. " + "\nТип кузова : " + this.carcase + " ." +
                "\nКоличество пасажиров : " + this.numberOfPassengers +".";
    }
}
