package HomeWork9Exception;

public class Main {
    public static void main(String[] args) throws CarEx {
        Car car = new Car("Audi", 1222.6);
        Car car1 = new Car("Volvo", 456689.2);
        Car car2 = new Car("Mazda", 456863.3);

        try{
            car.eng();
            car1.eng();
            car2.eng();
        }catch (CarEx e){
            System.err.println(e);
        }
        System.out.println(car.toStringCar());
        System.out.println("***********");
        System.out.println(car1.toStringCar());
        System.out.println("**********");
        System.out.println(car2.toStringCar());
    }
}
