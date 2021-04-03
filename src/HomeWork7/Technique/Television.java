package HomeWork7.Technique;

public class Television extends Appliances {
    int voltage;
    boolean wiFi;
    boolean netWork;
    boolean on;
    boolean off;
    int cell;

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    public Television(int voltage, boolean wiFi, boolean netWork, int cell) {
        this.voltage = voltage;
        this.wiFi = wiFi;
        this.netWork = netWork;
        this.cell = cell;
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
