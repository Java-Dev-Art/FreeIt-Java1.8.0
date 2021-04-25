package HomeWork5BugFix;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*
        * TAsk #9
        *9)Пользователь должен указать с клавиатуры положительное число, а
        программа должна создать массив указанного размера из случайных целых
        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
        определить и сообщить пользователю о том, сумма какой половины массива
        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
        пользователь введёт неподходящее число, то выдать соответствующее
        сообщение
        *
        * */
        System.out.println("TAsk #9");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] task9Mass;
        int left = 0;
        int right = 0;
        if (input > 0) {
            task9Mass = new int[input];
            for (int i = 0; i < task9Mass.length; i++) {
                task9Mass[i] = (int) (Math.random() * 15);
                System.out.print(task9Mass[i] + " ");
            }
            for (int i = 0; i < task9Mass.length / 2; i++) {
                left += task9Mass[i];
            }
            for (int i = task9Mass.length / 2; i < task9Mass.length; i++) {
                right += task9Mass[i];
            }
            if (left > right) {
                System.out.println("Левая часто больше правой !");
            } else {
                System.out.println("Правая часть больше левой !");
            }
        }
        System.out.println("Сумма левой части равна : " + left);
        System.out.println("Сумма праваой части больше левой : " + right);
    }
}
