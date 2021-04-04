package HomeWork3;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Task #5");
        double cell = 1;
        for (int z = 1; z <= 20; z++) {
            cell = z * 2.54;
            System.out.println(z + " Дюйм = " + cell + " cm");
        }
    }
}
