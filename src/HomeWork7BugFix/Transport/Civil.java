package HomeWork7BugFix.Transport;

public class Civil extends Aerial {
    private int numberOfPassengers;
    boolean businessClass;


    public Civil(int power, int maxSpeed, String mark, boolean businessClass) {
        super(power, maxSpeed, mark);
        this.businessClass = businessClass;
    }

    public void setLimitPassenger(int passenger){
        this.numberOfPassengers = passenger;
    }
    public int limitPassenger(){
        return this.numberOfPassengers;
    }
    public double powerCivil(){
        return super.getPower() * 0.74;
    }
    public void tickets(int ticket){
        if (ticket > limitPassenger()){
            System.out.println("Количество билетов превышает количкства мест");
        }else {
            int tik = limitPassenger() - ticket;
            System.out.println(ticket + " Мест продано");
            System.out.println("Количесто свободеых мест " + tik);
        }
    }
    public String toStringCivil(){
        return "Марка :" + super.getMark() + "." + "\nМаксимальная скорость :" + super.getMaxSpeed() + "км/ч." + "\nМощность :" + super.getPower() + " л.с, " + powerCivil() + "кВ." +
                "\nЛимит посадочных мест :" + limitPassenger() + "." + "\nНаличие Бизнес Класса :" + this.businessClass;
    }
}
