package HomeWork7.Transport;

public class Passenger extends Terrestrial {
    String carcase;
    int numberOfPassengers;
    private double km;
    private double l;
    private double time;

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
        return super.power * 0.74;
    }
    public void liters(double time){
        this.time = time;
        this.km = super.maxSpeed * time;
        this.l = (km /100) * super.fuelConsumption;
    }
    public void litersPass(){
        System.out.println("За время " + getTime() + " часа, автомобиль " + super.mark +" двигаясь с максимальной скоростью " +
                super.maxSpeed + " км/ч израсходует " + getL() +" литров топлива");
    }
    public String toStringPass(){
        return "Марка : " + super.mark + "." + "\nМощность :"  + super.power  + " л.с, " + powerPass() + " кВ." +
                "\nМаксимальная скорость : " + super.maxSpeed + "км/ч." + "\nРасход топлива на 100 км : " + super.fuelConsumption + "л. " + "\nТип кузова : " + this.carcase + " ." +
                "\nКоличество пасажиров : " + this.numberOfPassengers +".";
    }
}
