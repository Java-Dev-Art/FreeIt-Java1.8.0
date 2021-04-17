package HomeWork7.Transport;

public class Aerial extends Transport{
    private int wingspan;
    private int minTakeOfPassLength;

    public Aerial(int power, int maxSpeed, String mark) {
        super(power, maxSpeed, mark);
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinTakeOfPassLength() {
        return minTakeOfPassLength;
    }

    public void setMinTakeOfPassLength(int minTakeOfPassLength) {
        this.minTakeOfPassLength = minTakeOfPassLength;
    }
}
