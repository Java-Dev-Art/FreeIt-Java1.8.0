package HomeWork3.FirstTrainingManualToEnd;

public class Task6 {
    public static void main(String[] args) {
         /*
        * Task #6
        *
            Задание 6
            Создайте число. Определите, является ли число трехзначным. Определите, является
            ли его последняя цифра семеркой. Определите, является ли число четным.
        * */
        System.out.println("Task #6");
        int numberT = 234;
        char[] charsNumberT = String.valueOf(numberT).toCharArray();
        if ((numberT >= 100) && (numberT <= 999)){
            System.out.println("Число является трехзначным");
           if (charsNumberT[charsNumberT.length -1] == 7){
               System.out.println("Последний элемент числа = 7");
           }else {
               System.out.println("Последний элемент числа != 7\nПослелний элемент числа = " + charsNumberT[charsNumberT.length -1]);
           }
        }else {
            System.out.println("Число не является трехзначным");
        }
    }
}
