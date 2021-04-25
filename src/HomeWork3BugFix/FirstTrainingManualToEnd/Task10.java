package HomeWork3BugFix.FirstTrainingManualToEnd;

public class Task10 {
    public static void main(String[] args) {
         /*
        * Task # 10
        *Задание 10
         Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
      *
        * */
        System.out.println("Task #10");
        int resultFactor = 1;
        for (int i = 10; i <= 15; i++) {
            resultFactor *= i;
        }
        System.out.println("Факториал :" + resultFactor);
    }
}
