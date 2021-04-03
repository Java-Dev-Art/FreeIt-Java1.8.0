package HomeWork7.Technique;

public class Kettle extends Appliances{
    boolean on;
    boolean off;

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    int liters;
    String material;

    public Kettle(int liters, String material) {
        this.liters = liters;
        this.material = material;
    }

    @Override
    public void oN() {
        this.on = true;
    }

    @Override
    public void off() {
        this.off = true;
        this.on = false;

    }

    @Override
    public void reset() {

    }
}
