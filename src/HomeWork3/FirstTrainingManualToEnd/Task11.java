package HomeWork3.FirstTrainingManualToEnd;

public class Task11 {
    public static void main(String[] args) {
         /*
        * Task #11
        *Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.
        * */
        System.out.println("Task #11");

        int naturalNumber = (int) (Math.random() * 45);

        if ((naturalNumber % naturalNumber) == 0 && (naturalNumber % 1) == 0) {
            System.out.println("Число " + naturalNumber + " простое");
        } else {
            System.out.println("Число не простое");
        }
    }
}
