package HomeWork7.Technique;

public class SmartPhone extends Appliances{
    boolean on;
    boolean off;
    int cell;
    boolean wiFi;

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setOff(boolean off) {
        this.off = off;
    }



    public SmartPhone(int cell, boolean wiFi) {
        this.cell = cell;
        this.wiFi = wiFi;
    }

    @Override
    public void oN() {
        if (this.off == true){
            this.on = true;
            System.out.println("Welcome");

        }else{
            System.out.println("The technique was not off normal, pleas reset now.\nAnd put on again.");
        }

    }

    @Override
    public void off() {
        if (this.on == true){
            this.off = true;
        }
    }

    @Override
    public void reset() {
        if (this.on == true || this.off == false){
            this.on = false;
            this.off = true;
            System.out.println("Please wait");
        }
    }
}
