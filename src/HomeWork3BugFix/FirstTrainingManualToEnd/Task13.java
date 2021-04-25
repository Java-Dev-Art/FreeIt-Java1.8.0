package HomeWork3BugFix.FirstTrainingManualToEnd;

public class Task13 {
    public static void main(String[] args) {
        /*
        * Task #13
        * Создать последовательность случайных чисел, найти и вывести наибольшее
        из них.
        * */
        System.out.println("Task #13");
        int[] randomNumber = new int[16];
        int maxValueNumber = 0;

        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) (Math.random() * 50);
            if (randomNumber[i] > maxValueNumber) {
                maxValueNumber = randomNumber[i];
            }
        }
        System.out.println("Наибольшее рандомное число из массива  :" + maxValueNumber);
    }
}
