package HomeWork3BugFix.FirstTrainingManualToEnd;

import java.util.Arrays;
import java.util.Collections;

public class Task15 {
    public static void main(String[] args) {
        /*
        * Task #15
        * Создать массив, заполнить его случайными элементами, распечатать,
          перевернуть, и снова распечатать (при переворачивании нежелательно создавать
          еще один массив).
        * */
        System.out.println("Task #15");

        int[] randomMass = new int[7];
        for (int i = 0; i < randomMass.length - 1; i++) {
            randomMass[i] = (int) (Math.random() * 5);
        }
        System.out.println("Массив до сортировки :" + Arrays.toString(randomMass));

        for (int i = 0; i < randomMass.length / 2; i++) {
            int tmp = randomMass[randomMass.length - i - 1];
            randomMass[randomMass.length - i - 1] = randomMass[i];
            randomMass[i] = tmp;
        }
        System.out.println("Массив после сортировки :" + Arrays.toString(randomMass));
    }
}
