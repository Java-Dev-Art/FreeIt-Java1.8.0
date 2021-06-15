package Serializable;

import java.io.InvalidObjectException;

public class RunnerMain {
    public static void main(String[] args) {
        Carable carable = new Carable("Volvo",123,125689);
        System.out.println(carable);
        String file = "data\\demo.data";
        Serializator ser = new Serializator();
        boolean b = ser.serialization(carable,file);
        Carable car = null;
        try {
            car = ser.deserialization(file);
        }catch (InvalidObjectException e){
            e.printStackTrace();
        }
        System.out.println(car);
    }
}
