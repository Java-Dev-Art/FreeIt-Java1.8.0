package HomeWork7.Transport;

public abstract class Transport {
    int power;
    int maxSpeed;
    String mark;

    public Transport(int power, int maxSpeed, String mark) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mark = mark;
    }
}
