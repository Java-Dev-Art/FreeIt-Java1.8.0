package HomeWork5BugFix;

public class Task2 {
    public static void main(String[] args) {
        /*
        * Task #2
        * 2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
            строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
            порядке (99 97 95 93 ... 7 5 3 1).
        * */
        System.out.println("TAsk #2");
        int task2 = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                task2++;
            }
        }
        int[] taskMass2 = new int[task2];
        System.out.println("Normal :");
        for (int a = 0, i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                taskMass2[a] = i;
                System.out.print(taskMass2[a] + " ");
                a++;
            }
        }
        System.out.println();
        System.out.println("Reverse :");
        for (int i = taskMass2.length - 1; i >= 0; i--) {
            System.out.print(taskMass2[i] + " ");
        }
    }
}
