package HomeWork5BugFix;

import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {
        System.out.println(" Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем\n" +
                "            случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде\n" +
                "            матрицы).");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        int input = scanner.nextInt();
        int input2 = scanner1.nextInt();
        int sum = 0;
        int[][] matrix1 = new int[input][input2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 50);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println(" 1) Почитать сумму четных элементов стоящих на главной диагонали.");
        for (int i = 0; i < matrix1.length && i < matrix1[i].length; i++) {
            if ((matrix1[i][i] % 2) == 0) {
                sum += matrix1[i][i];
            }
        }
//        Не совсем понимаю, как это сделать
        System.out.println("Сумма четных элементов по диагонали : " + sum);
        System.out.println();
        System.out.println("2. Вывести нечетные элементы находящиеся под главной\n" +
                "            диагональю(включительно)");

        int sum2 = 0;
        for (int i = 1; i < matrix1.length && i < matrix1[i].length; i++) {
            if ((matrix1[i][i] % 2) != 0) {
                sum2 += matrix1[i][i];
            }
        }
        System.out.println(sum2);
        System.out.println("");
        System.out.println();
        System.out.println("");


        System.out.println(" 5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й\n" +
                "            строкой и т. д.)");
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        int input3 = scanner2.nextInt();
        int input4 = scanner3.nextInt();
        int sum3 = 0;
        int[][] matrix2 = new int[input][input2];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (int) (Math.random() * 50);
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = i + 1; j < matrix1[i].length; j++) {
                int tmp = matrix1[i][j];
                matrix1[i][j] = matrix1[j][i];
                matrix1[j][i] = tmp;

            }
        }
        System.out.println("Транспонтрованая матрица :");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
        }
    }
}
