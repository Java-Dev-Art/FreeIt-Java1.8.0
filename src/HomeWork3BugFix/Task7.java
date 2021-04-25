package HomeWork3BugFix;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Task #7");
        int sum2 = 0;
        int[] numL = new int[100];
        for (int q = 1; q < numL.length; q++) {
            numL[q] = q;
            if ((numL[q] % 2) != 0) {
                sum2 += numL[q];
            }
        }
        System.out.println("Сумма не четных чисел = " + sum2);
    }
}
