package HomeWork7.Transport;

public class Military extends Aerial {
    private boolean ejectionSystem;
    private int numberOfMissiles;

    public Military(int power, int maxSpeed, String mark) {
        super(power, maxSpeed, mark);
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public double powerMilitary(){
        return super.power * 0.74;
    }


    public void setEjectionSystem(){
        this.ejectionSystem = true;
    }
    public void setNumberOfMissiles(int rocket){
        this.numberOfMissiles = rocket;
    }
    public void shot(int shot){
        if (shot > getNumberOfMissiles()){
            System.out.println("Выстрел не возможен!\nТакого количества ракет нет");
        }else{
            int num = getNumberOfMissiles() - shot;
            System.out.println("Произведено выстрелов " + shot + "\nОсталось снарядов :" + num);
            setNumberOfMissiles(num);
        }
    }
    public void ejection(){
        if (isEjectionSystem() != true){
            System.out.println("Катопультирование не возможно! Будте аккуратнее");
        }else {
            System.out.println("Приготовтесь к катапультированию");
        }
    }
    public String toStringMilitary(){
        return "Марка :" + super.mark + "." + "\nМаксимальная скорость :" + super.maxSpeed + "км/ч." +
                "\nМощность :" + super.power + " л.с , " + powerMilitary() + " кВ." +
                "\nНаличие сиситемы катапультирования :" + isEjectionSystem() + "." +
                "\nКоличество ракет :" + getNumberOfMissiles();
    }
}
