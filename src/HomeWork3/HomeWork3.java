package HomeWork3;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        *
 1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы предыдущего
 * дня. Какой суммарный путь пробежит спортсмен за 7 дней?
2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
3)Вычислить: 1+2+4+8+...+256
4)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
5)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
6)Напишите программу вывода всех четных чисел от 2 до 100 включительно
7)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

1-я методичка - до конца со всеми Задачами.
краткая инфа по занятию так же есть в выдержке Lesson3 (папка presentations)
*/
//        Task #1 ******************************************************************************************************
        System.out.println("task #1");
        int km = 10;
        for (int i = 1; i <= 7; i++) {
            km += (km * 0.1);
            System.out.println("День тренировки : " + i + " Дистанция пройдена : " + km);
        }
        System.out.println("");
//        Task #2 ******************************************************************************************************
        System.out.println("Task #2");
        int amoebas = 1;
        for (int i = 3; i <= 24; i += 3) {
            amoebas *= 2;
            System.out.println("Прошло\t" + i + " ч. Количкство амеб : " + amoebas);
        }
        System.out.println("");
//        Task #3*******************************************************************************************************
        System.out.println("Task #3");
        int sum = 0;
//      Тут я не уверен
        for (int i = 1; i < 256; i++) {
            sum += i;
            System.out.println(i + " сумма = " + sum);

        }
        System.out.println("");
//        Task #4 ******************************************************************************************************
        System.out.println("Task #4");

        int a = 3;
        int b = 4;

        int c = 0;
        int i = 0;

        while (i != a) {
            c += b;
            i++;
        }
        System.out.println("Произвидение A и B раавно = " + c);
        System.out.println("");
//        Task #5 ******************************************************************************************************
        System.out.println("Task #5");
        double cell = 1;
        for (int z = 1; z <= 20; z++) {
            cell = z * 2.54;
            System.out.println(z + " Дюйм = " + cell + " cm");
        }
        System.out.println("");
//        Task #6 ******************************************************************************************************
        System.out.println("Task #6");
        int[] listNumbers = new int[101];
        for (int l = 1; l < listNumbers.length; l++) {
            listNumbers[l] = l;
            if ((listNumbers[l] % 2) == 0) {
                System.out.println(" числа " + listNumbers[l] + " делятся на 2");
            }
        }
        System.out.println("");
//        Task #7 ******************************************************************************************************
        System.out.println("Task #7");
        int sum2 = 0;
        int[] numL = new int[100];
        for (int q = 1; q < numL.length; q++) {
            numL[q] = q;
            if ((numL[q] % 2) == 0) {

            } else {
                sum2 += numL[q];
                System.out.println("Сумма не четных чисел = " + sum2);
            }
        }
//        Это все что успел за сегодня
    }

}
