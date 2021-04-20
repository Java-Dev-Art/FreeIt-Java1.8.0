package HomeWork9Exception;

public class Car {
    private String mark;
    private int speed;
    private double price;
    private boolean eng;

    public Car(String mark, double price) {
        this.mark = mark;
        this.price = price;
        this.speed = 130;
    }

    public boolean isEng() {
        return eng;
    }

    public void setEng(boolean eng) {
        this.eng = eng;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void eng() throws CarEx {
        int eng = (int) (Math.random() * 20);
        if (eng % 2 == 0) {
            setEng(false);
            throw new CarEx();
        } else {
            System.out.println("Машина завелась");
            setEng(true);
        }
    }

    public String toStringCar() {
        return "Марка " + getMark() + "\nСтоимость " + getPrice() + "\nСкорость " + getSpeed() +
                "\nМашина завилась " + isEng();
    }
}
