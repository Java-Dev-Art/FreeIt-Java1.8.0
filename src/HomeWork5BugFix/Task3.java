package HomeWork5BugFix;

public class Task3 {
    public static void main(String[] args) {
         /*
        * Task #3
        * 3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
           массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
           это количество на экран на отдельной строке.
        *
        * */
        System.out.println("Task #3");
        int[] task3Mass = new int[15];
        int evenNumber = 0;
        for (int i = 0; i < task3Mass.length; i++) {
            task3Mass[i] = (int) (Math.random() * 99);
            if (task3Mass[i] % 2 == 0) {
                evenNumber++;
            }
        }
        System.out.println("Массив сожержет следуюшие цыфпы :");
        for (int i = 0; i < task3Mass.length; i++) {
            System.out.print(task3Mass[i] + " ");
        }
        System.out.println("\nКоличество четных чисел : " + evenNumber);
    }
}
