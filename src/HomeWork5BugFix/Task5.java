package HomeWork5BugFix;

public class Task5 {
    public static void main(String[] args) {
        /*
        * Task #5
        *5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
        арифметическое элементов каждого массива и сообщите, для какого из
        массивов это значение оказалось больше (либо сообщите, что их средние
        арифметические равны).
        *
        *
        * */
        System.out.println("Task #5");
        int[] task5Mass1 = new int[5];
        int[] task5Mass2 = new int[5];
        int firstMass = 0;
        int secondMass = 0;
        int first = 0;
        int second = 0;
        for (int i = 0; i < 5; i++) {
            task5Mass1[i] = (int) (Math.random() * 15);
            task5Mass2[i] = (int) (Math.random() * 15);
        }
        System.out.println("First Array : ");
        for (int i = 0; i < task5Mass1.length; i++) {
            System.out.print(task5Mass1[i] + " ");
        }
        System.out.println();
        System.out.println("Second Array : ");
        for (int i = 0; i < task5Mass2.length; i++) {
            System.out.print(task5Mass2[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < task5Mass1.length; i++) {
            firstMass += task5Mass1[i];
            first++;
        }
        int massF = firstMass / first;
        System.out.println("Среднее значение  первого массива : " + massF);
        for (int i = 0; i < task5Mass2.length; i++) {
            secondMass += task5Mass2[i];
            second++;
        }
        int massS = secondMass / second;
        System.out.println("Среднее значение  второго массива : " + massS);
        if (massF > massS) {
            System.out.println("Значение первого массива больше");
        } else if (massF < massS) {
            System.out.println("Значение второго массива больше");
        } else {
            System.out.println("Значения равны ");
        }
    }
}
