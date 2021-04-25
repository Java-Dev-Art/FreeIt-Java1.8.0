package HomeWork5BugFixF;

public class Task7 {
    public static void main(String[] args) {
        /*
        * TAsk #7
        *7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
        какой элемент является в этом массиве максимальным и сообщите индекс его
        последнего вхождения в массив.
        *
        *
        * */
        System.out.println("Task #7");
        int[] task7Mass = new int[12];
        int maksT7 = task7Mass[0];
        int index7 = 0;
        System.out.println("Случайный массив №7 : ");
        for (int i = 0; i < task7Mass.length; i++) {
            task7Mass[i] = (int) (Math.random() * 15);
            System.out.print(task7Mass[i] + " ");
            if (task7Mass[i] > maksT7) {
                maksT7 = task7Mass[i];
                index7 = i + 1;
            }
        }
        System.out.println(" ");
        System.out.println("Максимальное значение раавно : " + maksT7);
        System.out.println("Индекс первого вхождения равен : " + index7);
    }
}
