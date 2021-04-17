package HomeWork7.Transport;

public abstract class Transport {
    private int power;
    private int maxSpeed;
    private String mark;

    public Transport(int power, int maxSpeed, String mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
