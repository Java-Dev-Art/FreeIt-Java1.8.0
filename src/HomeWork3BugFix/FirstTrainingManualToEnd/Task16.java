package HomeWork3BugFix.FirstTrainingManualToEnd;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        /*
        * Task #16
        *Определите сумму элементов одномерного массива, расположенных между
        минимальным и максимальным значениями.
        *
        *
        * */
        System.out.println("Task #16");
        int[] randomValue = new int[10];
        int minRandomValue = randomValue[0];
        int maxRandomValue = randomValue[0];
        int sumRandomValue = 0;

        for (int i = 0; i < randomValue.length - 1; i++) {
            randomValue[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(randomValue));
        for (int i = 0; i < randomValue.length - 1; i++) {
            if (randomValue[i] > maxRandomValue) {
                maxRandomValue = randomValue[i];
            }
            if (randomValue[i] < minRandomValue) {
                minRandomValue = randomValue[i];
            }
            for (int j = minRandomValue; j < maxRandomValue; j++) {
                if (randomValue[j] == maxRandomValue) {
                    sumRandomValue += randomValue[j];
                    break;
                }
            }
        }
        System.out.println(maxRandomValue + " " + minRandomValue);
        System.out.println(sumRandomValue);
    }
}
