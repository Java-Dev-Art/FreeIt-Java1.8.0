package HomeWork5BugFixF;

public class Task1 {
    public static void main(String[] args) {
        /*1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
        созданием массива подумайте, какого он будет размера.
        *
        * */
        System.out.println("Task #1");
        int k = 0;

        for (int i = 0; i < 21; i++) {

            if ((i % 2) == 0) {
                k++;
            }
        }
        int[] massTask1 = new int[k];
        for (int i = 2, b = 0; i < 21; i++) {
            if (i % 2 == 0) {
                massTask1[b] = i;
                System.out.print(massTask1[b] + " ");
                b++;
            }
        }
        for (int i = 0; i < massTask1.length - 1; i++) {
            System.out.println(massTask1[i]);
        }
    }
}
