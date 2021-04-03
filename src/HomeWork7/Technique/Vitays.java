package HomeWork7.Technique;

public class Vitays {
   public String model;
   public Television television;
   public Kettle kettle;
   public SmartPhone phone;

    public Vitays(String model, Television television) {
        this.model = model;
        this.television = television;
    }

    public Vitays(String model, Kettle kettle) {
        this.model = model;
        this.kettle = kettle;
    }

    public Vitays(String model, SmartPhone phone) {
        this.model = model;
        this.phone = phone;
    }


}
