package HomeWork3BugFix.FirstTrainingManualToEnd;

public class Task12 {
    public static void main(String[] args) {
        /*
         * Task #12
         * Найдите сумму первых n целых чисел, которые делятся на 3.
         * */
        System.out.println("Task #12");
        int integerNumbers = (int) (Math.random() * 32);
        int sumIntegerNumbers = 0;
        for (int i = 1; i < integerNumbers; i++) {
            if ((integerNumbers % 3) == 0) {
                sumIntegerNumbers += integerNumbers;
                integerNumbers = (int) (Math.random() * 32);
            }
        }
        System.out.println("сумму первых n целых чисел, которые делятся на 3 = " + sumIntegerNumbers);
    }
}
