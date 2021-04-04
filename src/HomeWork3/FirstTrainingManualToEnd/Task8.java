package HomeWork3.FirstTrainingManualToEnd;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        /*
        * Task #8
        * Имеется целове число (задать с помощью Random rand = new Random(); int x =
          rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
          нему слово «рублей» в правильном падеже.
        * */
        System.out.println("Task #8");
        Random random = new Random();
        int x = random.nextInt(28);
        if (x == 1) {
            System.out.println(x + " рубль");
        } else if (x > 1 && x <= 4) {
            System.out.println(x + " рубля");
        } else if (x > 4 && x < 28) {
            System.out.println(x + " рублей");
        }else if (x == 21){
            System.out.println(x + " рубль");
        }
    }
}
