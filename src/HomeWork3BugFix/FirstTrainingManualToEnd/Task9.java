package HomeWork3BugFix.FirstTrainingManualToEnd;

public class Task9 {
    public static void main(String[] args) {
         /*
        * Task #9
        *
            Задание 9
            Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
            произведение, т.е. факториал числа.
        * */
        System.out.println("Task #9");
        double sumNumbers = 1;
        int randomNumber = (int) (Math.random() * 20);
        int count = 0;

        while (randomNumber != 0) {
            sumNumbers *= randomNumber;
            count++;
            randomNumber = (int) (Math.random() * 20);
            if (count != 0) {
                System.out.println(count + ": " + sumNumbers);
            } else {
                System.out.println("Косяк на касяке");
            }
        }
    }
}
