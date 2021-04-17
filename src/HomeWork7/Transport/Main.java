package HomeWork7.Transport;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(67,77,"Volvo",4,6,"cupe",2);

        System.out.println(passenger.toStringPass());
        passenger.liters(5);
        passenger.litersPass();
        System.out.println("*******************");
        Cargo cargo = new Cargo(45,80,"Maz",6,12);
        cargo.carrCargo(12);
        System.out.println(cargo.toStringCargo());
        System.out.println("*****************");
        Civil civil = new Civil(458,786,"Lot",true);
        civil.setLimitPassenger(34);
        System.out.println(civil.toStringCivil());
        civil.tickets(30);
        System.out.println("********************");
        Military military = new Military(785,456,"Vetralot");
        military.setEjectionSystem();
        military.setNumberOfMissiles(55);
        System.out.println(military.toStringMilitary());
        System.out.println("*************");
        military.ejection();
        military.shot(50);
        military.shot(6);
    }
}
