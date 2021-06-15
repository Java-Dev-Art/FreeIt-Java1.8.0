package Serializable;

import java.io.Serializable;

public class Carable implements Serializable {
    private static final long serialVersionUID = 12345L;
    private String mark;
    private int speed;
    private int price;

    public Carable(String mark, int speed, int price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMark() {
        return mark;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return "\nMark " + getMark() + "\nPrice " + getPrice() + "\nSpeed " + getSpeed() + "\nID " + getSerialVersionUID();
    }
}
