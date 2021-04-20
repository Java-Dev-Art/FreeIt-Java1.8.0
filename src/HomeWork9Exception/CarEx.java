package HomeWork9Exception;

public class CarEx extends Exception {
    private String message;

    public CarEx(String message) {
        super(message);
    }
    public CarEx(){
        super("Машина не заводиться");
    }
}
