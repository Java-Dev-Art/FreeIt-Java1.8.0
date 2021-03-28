package HomeWork5.OneDimensionalArrays;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {
        /*1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
        созданием массива подумайте, какого он будет размера.
        *
        * */
        System.out.println("Task #1");
        int k = 0;

        for (int i =0; i < 21; i++){

            if ((i % 2) == 0){
                k++;
            }
        }
        int [] massTask1 = new int[k];
        for (int i = 2, b = 0; i < 21; i++){
            if (i % 2 == 0){
                massTask1[b] = i;
                System.out.print(massTask1[b] + " ");
                b++;
            }
        }
        for (int i = 0; i < massTask1.length - 1; i++){
            System.out.println(massTask1[i]);
        }
        System.out.println("*******************************");
        /*
        * Task #2
        * 2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
            строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
            порядке (99 97 95 93 ... 7 5 3 1).
        * */
        System.out.println("TAsk #2");
        int task2 = 0;
        for (int i = 0; i < 100; i++){
            if (i % 2 != 0){
                task2++;
            }
        }
        int [] taskMass2 = new int[task2];
        System.out.println("Normal :");
        for (int a = 0, i = 0; i < 100; i++){
            if (i % 2 != 0){
                taskMass2[a] = i;
                System.out.print( taskMass2[a] + " ");
                a++;
            }
        }
        System.out.println();
        System.out.println("Reverse :");
        for (int i = taskMass2.length -1 ; i >= 0; i --){
            System.out.print( taskMass2[i] + " ");
        }
        System.out.println("");
        /*
        * Task #3
        * 3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
           массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
           это количество на экран на отдельной строке.
        *
        * */
        System.out.println("Task #3");
        int[] task3Mass = new  int [15];
        int evenNumber = 0;
        for (int i = 0; i < task3Mass.length ; i ++ ){
            task3Mass[i] = (int)(Math.random() * 99);
            if (task3Mass[i] % 2 == 0){
                evenNumber++;
            }
        }
        System.out.println("Массив сожержет следуюшие цыфпы :");
        for (int i = 0; i < task3Mass.length ; i ++){
            System.out.print(task3Mass[i] + " ");
        }
        System.out.println("\nКоличество четных чисел : " + evenNumber);
        System.out.println("");
        /*
        * Task #4
        *4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
            массив на экран в строку. Замените каждый элемент с нечётным индексом на
            ноль. Снова выведете массив на экран на отдельной строке.
        *
        *
        * */
        System.out.println("Task #4");
        int [] task4Mass = new int[20];
        for (int i = 0; i < task4Mass.length; i ++){
            task4Mass[i] = (int)(Math.random()*20);
        }
        System.out.println("Random Array :");
        for (int i = 0; i < task4Mass.length; i++){
            System.out.print(task4Mass[i] + " ");
        }
        System.out.println("");
        System.out.println("Replace odd numbers");
        for (int i = 0; i < task4Mass.length; i++){
            if (task4Mass[i] %2 !=0){
                task4Mass[i] = 0;
            }
        }
        for (int i = 0; i < task4Mass.length; i++){
            System.out.print(task4Mass[i] + " ");
        }
        System.out.println(" ");
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
        int [] task5Mass1 = new int[5];
        int [] task5Mass2 = new int[5];
        int firstMass = 0;
        int secondMass = 0;
        int first = 0;
        int second = 0;
        for (int i = 0; i< 5; i++){
            task5Mass1[i] = (int) (Math.random() * 15);
            task5Mass2[i] = (int) (Math.random() * 15);
        }
        System.out.println("First Array : ");
        for (int i = 0; i < task5Mass1.length; i ++){
            System.out.print(task5Mass1[i] + " ");
        }
        System.out.println();
        System.out.println("Second Array : ");
        for (int i = 0; i < task5Mass2.length; i ++){
            System.out.print(task5Mass2[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < task5Mass1.length; i ++){
            firstMass += task5Mass1[i];
            first ++;
        }
        int massF = firstMass / first;
        System.out.println("Среднее значение  первого массива : " + massF);
        for (int i = 0; i < task5Mass2.length; i ++){
            secondMass += task5Mass2[i];
            second ++;
        }
        int massS = secondMass / second;
        System.out.println("Среднее значение  второго массива : " + massS);
        if (massF > massS){
            System.out.println("Значение первого массива больше");
        }else if (massF < massS){
            System.out.println("Значение второго массива больше");
        }else {
            System.out.println("Значения равны ");
        }
        System.out.println("");
        /*
        * Task #6
            * 6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
            на экран в строку. Определить и вывести на экран сообщение о том, является ли
            массив строго возрастающей последовательностью.
                    * */
        System.out.println("Task #6");
        int []task6Mass = new  int [4];
        for (int i = 0; i < task6Mass.length; i++){
            task6Mass[i] = (int) (Math.random() * 10);
            System.out.print(task6Mass[i] + " ");
        }
        String task6MassString = "Прогрессия возврастающая";
        for (int i = 0; i < task6Mass.length; i ++){
            if (i > 0 && task6Mass[i - 1] >= task6Mass[i]){
                task6MassString = "Прогрессия не возврастающая";
            }else {
                task6MassString = "Прогрессия возврастающая";
            }
        }
        System.out.println(task6MassString);
        System.out.println("");
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
        for (int i = 0; i < task7Mass.length; i ++){
            task7Mass[i] = (int)(Math.random() * 15);
            System.out.print(task7Mass[i] + " ");
            if (task7Mass[i] > maksT7){
                maksT7 = task7Mass[i];
                index7 = i + 1;
//                System.out.print( i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Максимальное значение раавно : " + maksT7);
        System.out.println("Индекс первого вхождения равен : " + index7 );
        System.out.println("");
        /*
        * TAsk #8
        *
        * 8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
        массива должен равняться отношению элемента из первого массива с i-ым
        индексом к элементу из второго массива с i-ым индексом. Вывести все три
        массива на экран (каждый на отдельной строке), затем вывести количество
        целых элементов в третьем массиве.
        *
        */
//        System.out.println("Task #8");
//        int [] task8MassFirst = new int[10];
//        int [] task8MassSecond = new int[10];
//        System.out.println("First Random Array : ");
//        for (int i = 0; i < task8MassFirst.length; i ++){
//            task8MassFirst[i] = (int)(Math.random() * 9);
//            System.out.print(task8MassFirst[i] + " ");
//        }
//        System.out.println("");
//        System.out.println("Second Random Array :");
//        for (int i = 0; i < task8MassSecond.length; i++){
//            task8MassSecond[i] = (int)(Math.random() * 9);
//            System.out.print(task8MassSecond[i] + " ");
//        }
//        System.out.println(" ");
//
//        System.out.println("Third Normal Array :");
//        double[]task8MassThird = new double [11];
//        for (int i = 1; i < task8MassThird.length ;i++){
//            task8MassThird[i] = i;
//            System.out.print(task8MassThird[i] + " ");
//        }
//        System.out.println("");
//        System.out.println("Соотношеник массивов First and Second = Third : ");
//        int indexTask8 = 0;
//        for (int i = 0; i < task8MassThird.length - 1; i ++){
//            task8MassThird[i] = task8MassFirst[i] / task8MassSecond[i] ;
//            System.out.print(task8MassThird[i] + " ");
//            if (task8MassThird[i] > 0){
//                indexTask8 ++;
//            }
//        }
//        System.out.println("");
//        System.out.println("Результат соотношений : ");
//        for (int i = 0; i < task8MassThird.length -1; i ++){
//            if (task8MassThird[i] > 0.0){
//                System.out.print(task8MassThird[i] + " ");
//            }
//        }
//        System.out.println("");
//        System.out.println("Количество целых злементов : " + indexTask8);
//        System.out.println("");
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
//        * */
//        System.out.println("TAsk #9");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        int [] task9Mass;
//        int left =0;
//        int right = 0;
//        if (input > 0){
//            task9Mass = new int[input];
//            for (int i = 0; i < task9Mass.length; i++){
//                task9Mass[i] = (int)(Math.random() * 15);
//                System.out.print(task9Mass[i] + " ");
//            }
//            for (int i = 0; i < task9Mass.length / 2; i++){
//                left +=task9Mass[i];
//            }
//            for (int i = task9Mass.length /2 ; i < task9Mass.length ; i++){
//                right+=task9Mass[i];
//            }
//            if (left > right){
//                System.out.println("Левая часто больше правой !");
//            }else {
//                System.out.println("Правая часть больше левой !");
//            }
//        }
//        System.out.println("Сумма левой части равна : " + left);
//        System.out.println("Сумма праваой части больше левой : " + right);
//        System.out.println(" ");
        /*
        * Task #10
        * 10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
            переменную n. Если пользователь ввёл не подходящее число, то программа
            должна выдать соответствующее сообщение. Создать массив из n случайных
            целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
            только из чётных элементов первого массива, если они там есть, и вывести его
            на экран.
        *
        *
        * */
//        System.out.println("TAsk #10");
//        Scanner scanner1 =new Scanner(System.in);
//        int input = scanner1.nextInt();
//        int [] task10Mass;
//        int [] task10MassS;
//        int task10 =1;//Вроде делаю , как надо, но еще не могу полчучить нужного резултьаьа
//        if (input > 3) {
//            task10Mass = new int[input];
//            for (int i = 0; i < task10Mass.length ; i++) {
//                task10Mass[i] = (int) (Math.random() * input);
//                System.out.print(task10Mass[i] + " ");
//                if ((task10Mass[i] % 2) == 0 ) {
//                    System.out.print(task10);
//                    task10++;
//
//                }
//            }
////            task10MassS = new int[task10];
////            for (int i = 0; i < task10MassS.length; i++){
////                if ((task10Mass[i] % 2 )== 0){
////                    task10MassS[i] = task10Mass[i];
////                    System.out.print(task10MassS[i] + " ");
////                }
////            }
//        } else {
//            System.out.println("Ввидтье чисто больше 3 ");
//        }

        System.out.println("Доп задание.");
        /*
        *   1) Найти произведение элементов, кратных 3.
            2) Найти среднее арифметическое элементов с нечетными номерами.
            3) Найти средне арифметическое элементов массива, превосходящих некоторое
            число С.
            4) Найти наименьший нечетный элемент.
            5) «Сожмите» массив, выбросив из него каждый второй элемент.
            «Освободившиеся» места массива заполните нулями.
            6) Проверить, различны ли все элементы массива.
            7) Подсчитать, сколько раз встречается элемент с заданным значением.
            8) Найти второй по величине (т.е. следующий по величине за максимальным)
            элемент в массиве.
            9) Найти наименьший элемент среди элементов с четными индексами массива
            10) Найти максимальный элемент в массиве и поменять его местами с нулевым
            элементом
        *
        *
        * */
        System.out.println("Доп. дз №1");
        int [] dopTask1 = new int[20];
        int dop = 1;
        int oddNumber = 0;
        int indexOddNumber = 0;
        int dopU = 5;
        int iOddN = 0;
        int oN = 0;

        for (int i = 1; i < dopTask1.length; i++){
            dopTask1[i] = i;
            if (dopTask1[i] % 3 == 0){
                dop *= dopTask1[i];
            }
            if ((i % 2) !=0){
                oddNumber += dopTask1[i];
                indexOddNumber++;
            }
            if (dopTask1[i] > dopU){
                oN += dopTask1[i];
                iOddN++;
            }
        }
        int result = oddNumber / indexOddNumber;
        int resultT = oN / iOddN;
        System.out.println("Произведение : " + dop);
        System.out.println(" ");
        System.out.println("Доп. дз №2");
        System.out.println("Средне арифмитическое :" + result);
        System.out.println("");
        System.out.println("Доп. Дз №3");
        System.out.println("Средне арифмитическое :" + resultT);
        System.out.println(" ");
        System.out.println("4) Найти наименьший нечетный элемент.");
        int min = dopTask1[0];
        for (int i = 0; i< dopTask1.length; i++){
            if (dopTask1[i] < min && (dopTask1[i] % 2) !=0 ){
                min = dopTask1[i];
            }
        }
        System.out.println("наименьший нечетный элемент = " + min);
        System.out.println("");
        System.out.println(" 5) «Сожмите» массив, выбросив из него каждый второй элемент.\n" +
                "            «Освободившиеся» места массива заполните нулями.");
        int [] dopTask5 = new int[8];
        for (int i = 0;i < dopTask5.length; i++){
            dopTask5 [i] = i;
            System.out.print(dopTask5[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i<dopTask5.length; i++){
            if ((i % 2 )!= 0){
                dopTask5[i] = 0;
                System.out.print(dopTask5[i] + " ");
            }
            System.out.print(dopTask5[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" 6) Проверить, различны ли все элементы массива.");
        int[] taskD6 = {1,4,5,8};
        int[] taskD6S = {4,4,7,8};
        boolean bool ;
        for (int i = 0; i < taskD6.length; i++){
            if (taskD6[i] != taskD6S[i]){
                bool = false;
                System.out.println("Индекс : " + i + " массива №1 не совпадает с Массивом №2 " + bool);
            }else {
                bool = true;
                System.out.println("Индекс : " + i + " массива совпадает с Массивом №2 " + bool);
            }
        }
        System.out.println(" ");
        System.out.println(" 7) Подсчитать, сколько раз встречается элемент с заданным значением.");
        int[] taskD7 ={1,2,2,2,3,4,5,6,7,8,9,};
        int taskD7Number = 2;
        int indexD7 = 0;
      for (int i = 0; i < taskD7.length; i++){
          if (taskD7[i] == taskD7Number){
              indexD7++;
          }
      }
    System.out.println(indexD7 + " столько раз встречается элемент в массиве ");
    System.out.println("");
    System.out.println("  8) Найти второй по величине (т.е. следующий по величине за максимальным)\n" +
                "            элемент в массиве.");
        int [] taskD8 = new int[15];
        int maxTaskD8 = taskD8[0];
        int maxTaskD8S = taskD8[0];
        boolean boolTask8 = false;
        for (int i = 0; i < taskD8.length; i++){
            taskD8[i] = i +2;
            System.out.print(taskD8[i] + " ");
            if (taskD8[i] > maxTaskD8 ){
                maxTaskD8 = taskD8[i];
                if (maxTaskD8 > maxTaskD8S){
                    maxTaskD8S = maxTaskD8;
                    if (maxTaskD8S > taskD8[i]){
                        boolTask8 = true;
                    }else {
                        boolTask8 = false;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("Максимальное значение в масиве : "+ maxTaskD8 + "\nЕсть ли значение больше максимального :" + boolTask8);
//        System.out.println(maxTaskD8S); ??????????????????????????????????????????????????????/
        System.out.println("");
        System.out.println(" 9) Найти наименьший элемент среди элементов с четными индексами массива");
        int [] task9DMass = new int[10];
        int minIndex9D = task9DMass[0];
        for (int i = 1; i < task9DMass.length; i ++){
            task9DMass[i] = i;
            System.out.print(task9DMass[i] + " ");
            if ((i % 2) !=0 ){
                if (task9DMass[i] < minIndex9D){
                    minIndex9D = task9DMass[i];
                }

            }
        }
        System.out.println("");
        System.out.println("наименьший элемет с нечетным индексом : " + minIndex9D);
        System.out.println(" ");
        System.out.println("10) Найти максимальный элемент в массиве и поменять его местами с нулевым\n" +
                "            элементом");
        int [] taskD10 = new int[15];
        int maxTaskD10 = taskD8[0];
        int maxIndex = 0;


        boolean boolTask10 = false;
        for (int i = 0; i < taskD10.length; i++){
            taskD10[i] = i +2;
            System.out.print(taskD10[i] + " ");
            if (taskD10[i] > maxTaskD10 ){
                maxTaskD10 = taskD10[i];
                maxIndex++;

            }
        }
        System.out.println(" ");
        for (int i = 0; i < taskD10.length; i ++){

            taskD10[maxIndex] = taskD10[0];
            System.out.print(taskD10[i] + " ");
        }
        System.out.println();
        /*
        * Начало всех задач:
            Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
            случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
            матрицы).
            1) Почитать сумму четных элементов стоящих на главной диагонали.
            2)Вывести нечетные элементы находящиеся под главной
            диагональю(включительно).
            3)Проверить произведение элементов какой диагонали больше.
            4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
            включительно)
            5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
            строкой и т. д.)
        *
        * */
        System.out.println(" Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем\n" +
                "            случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде\n" +
                "            матрицы).");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        int input = scanner.nextInt();
        int input2 = scanner1.nextInt();
        int sum = 0;
        int [][] matrix1 = new int[input][input2];
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = (int) (Math.random() * 50);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();


        }
        System.out.println(" ");
        System.out.println(" 1) Почитать сумму четных элементов стоящих на главной диагонали.");
        for (int i = 0; i < matrix1.length && i < matrix1[i].length; i ++){
            if ((matrix1[i][i] % 2)== 0){
                sum += matrix1[i][i];
            }
        }
//        Не совсем понимаю, как это сделать
        System.out.println("Сумма четных элементов по диагонали : " + sum);
        System.out.println();
        System.out.println("2. Вывести нечетные элементы находящиеся под главной\n" +
                "            диагональю(включительно)");

        int sum2 = 0;
        for (int i = 1; i < matrix1.length && i < matrix1[i].length; i ++){
            if ((matrix1[i][i] % 2) != 0){
                sum2 += matrix1[i][i];
            }
        }
        System.out.println(sum2);
        System.out.println("");
        System.out.println();































    }
}
