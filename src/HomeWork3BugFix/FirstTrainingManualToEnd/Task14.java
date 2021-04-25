package HomeWork3BugFix.FirstTrainingManualToEnd;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*
        * Task #14
        *Создать массив оценок произвольной длины, вывести максимальную и
        минимальную оценку, её (их) номера.
        *
        * */
        System.out.println("Task #14");
        int[] rating = new int[10];
        int maxRating = rating[0];
        int minRating = rating[0];
        for (int i = 0; i < rating.length ; i++) {
            rating[i] = (int) (Math.random() * 10);
            if (rating[i] > maxRating) {
                maxRating = rating[i];
            }
            if (rating[i] < minRating) {
                minRating = rating[i];
            }
        }
        System.out.println("Mass :" + Arrays.toString(rating));
        System.out.println("Maximum grade: ");
        System.out.println("Number :" + rating[maxRating] + " Grade :" + maxRating);
        System.out.println("***************\nMinimal grade:");
        System.out.println("Number :" + rating[minRating] + " Grade :" + minRating);
    }
}
