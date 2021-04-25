package HomeWork3BugFix.FirstTrainingManualToEnd;

public class Task4 {
    public static void main(String[] args) {
        /* Task #4
       Определить число, полученное выписыванием в обратном порядке цифр
        любого 4-х значного натурального числа n.
        */
        System.out.println("Task #4");
        int num = 2193;
        System.out.println("Было :" + num);
        int reversNum = 0;
        while (num != 0) {
            reversNum += num % 10;
            num /= 10;
            if (num != 0) {
                reversNum *= 10;
            }
        }
        System.out.println("Стало :" + reversNum);
    }
}
