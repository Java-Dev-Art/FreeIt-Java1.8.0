package HomeWork5BugFixF;

public class Task4 {
    public static void main(String[] args) {
         /*
        * Task #4
        *4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
            массив на экран в строку. Замените каждый элемент с нечётным индексом на
            ноль. Снова выведете массив на экран на отдельной строке.
        *
        *
        * */
        System.out.println("Task #4");
        int[] task4Mass = new int[20];
        for (int i = 0; i < task4Mass.length; i++) {
            task4Mass[i] = (int) (Math.random() * 20);
        }
        System.out.println("Random Array :");
        for (int i = 0; i < task4Mass.length; i++) {
            System.out.print(task4Mass[i] + " ");
        }
        System.out.println("");
        System.out.println("Replace odd numbers");
        for (int i = 0; i < task4Mass.length; i++) {
            if (task4Mass[i] % 2 != 0) {
                task4Mass[i] = 0;
            }
        }
        for (int i = 0; i < task4Mass.length; i++) {
            System.out.print(task4Mass[i] + " ");
        }
    }
}
