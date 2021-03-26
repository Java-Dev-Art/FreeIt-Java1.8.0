package HomeWork3.FirstTrainingManualToEnd;

import java.util.Arrays;
import java.util.Random;

public class FirstTrainingManualToEnd {
    public static void main(String[] args) {
        /*
        *Task #3
        * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
        А) минут + секунд,
        В) часов + минут + секунд,
        С) дней + часов + минут + секунд,
        D) недель + дней + часов + минут + секунд.
        по аналогии с примером выше.
        * */
        System.out.println("Training manual Task #3");
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60; //min
        int min = m % 60;
        double h = (m - min) / 60;//hour
        double hour = h % 60;
        double d = (h - hour) / 24;
        double day = d % 24;
        double w = (d - day) / 7;
//        double week = w % 7;

        System.out.println("A :" + m + " минут, " + s + " секунд");
        System.out.println("B :" + h + " часов, " + m + " минут, " + s + " секунд");
        System.out.println("C :" + d + " дней, " + h + " часов, " + m + " минут, " + s + " секунд");
        System.out.println("D :" + w + " недель, " + d + " дней, " + h + " часов, " + m + " минут, " + s + " секунд");
        System.out.println("");

       /* Task #4
       Определить число, полученное выписыванием в обратном порядке цифр
        любого 4-х значного натурального числа n.
        */
        System.out.println("Task #4");
        int num = 2193;
        System.out.println("Было :" + num);
        int reversNum = 0;
        while (num != 0) {
            reversNum += num % 10;
            num /= 10;
            if (num != 0) {
                reversNum *= 10;
            }
        }
        System.out.println("Стало :" + reversNum);
        System.out.println("");
//        Task #5 ******************************************************************************************************
//        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//          различны?
        System.out.println("Task #5");
        int natNumber = 5786;

        char[] chars = String.valueOf(natNumber).toCharArray();
        if ((chars[0] != chars[1]) && (chars[0] != chars[2]) && (chars[0] != chars[3]) && (chars[1] != chars[2]) && (chars[1] != chars[3])) {
            System.out.println("Совпадений не найдено , \nцифры не равны!");
        } else {
            System.out.println("Совпадения есть, но не все так и плохо");
        }
        System.out.println("");
        /*
        * Task #6
        *
            Задание 6
            Создайте число. Определите, является ли число трехзначным. Определите, является
            ли его последняя цифра семеркой. Определите, является ли число четным.
        * */
        System.out.println("Task #6");
        int numberT = 234;
        char[] charsNumberT = String.valueOf(numberT).toCharArray();
        if (charsNumberT.length < 3) {
            System.out.println("Целое число " + numberT + " не трехзначное");
        } else {
            System.out.println("Целое число " + numberT + " трехзначное");
            if (charsNumberT[2] == 7) {
                System.out.println("Последняя цифра равна 7.");
            } else {
                System.out.println("Последняя цифра не равна 7.");
            }
        }
        System.out.println("");
        /*
        * Task #7
        * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
          полностью закрыть круглой картонкой радиусом r.
        * */
        System.out.println("Task #7");
        int sideA = 12;
        int sideB = 3;
        int radius = 45;
//        int radiusAb = (sideA * sideA + sideB * sideA) / 4; //45
//        System.out.println(radiusAb);
        if (radius >= (sideA * sideA + sideB * sideA) / 4) {
            System.out.println("Закрыть можно, но осторожно");
        } else {
            System.out.println("К сожелению не все так просто");
        }
        System.out.println("");
        /*
        * Task #8
        * Имеется целове число (задать с помощью Random rand = new Random(); int x =
          rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
          нему слово «рублей» в правильном падеже.
        * */
        System.out.println("Task #8");
        Random random = new Random();
        int x = random.nextInt(28);
        if (x == 1) {
            System.out.println(x + " рубль");
        } else if (x > 1 && x <= 4) {
            System.out.println(x + " рубля");
        } else if (x > 4 && x < 28) {
            System.out.println(x + " рублей");
        }
        System.out.println("");
        /*
        * Task #9
        *
            Задание 9
            Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
            произведение, т.е. факториал числа.
        * */
        System.out.println("Task #9");
//?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        double sumNumbers = 1;
        int randomNumbers = (int) (Math.random() * 20);
        int count = 0;

        while (randomNumbers != 0) {
            sumNumbers *= randomNumbers;
            count++;
            randomNumbers = (int) (Math.random() * 20);
            if (count != 0) {
                System.out.println(count + ": " + sumNumbers);
            } else {
                System.out.println("Косяк на касяке");
            }
        }

//
        System.out.println("");
        /*
        * Task # 10
        *Задание 10
         Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
      *
        * */
        System.out.println("Task #10");
        int resultFactor = 1;
        for (int i = 10; i <= 15; i++) {
            resultFactor *= i;
        }
        System.out.println("Факториал :" + resultFactor);
        System.out.println("");
        /*
        * Task #11
        *Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.
        * */
        System.out.println("Task #11");

        int naturalNumber = (int) (Math.random() * 45);

        if ((naturalNumber % naturalNumber) == 0 && (naturalNumber % 1) == 0) {
            System.out.println("Число " + naturalNumber + " простое");
        } else {
            System.out.println("Число не простое");
        }
        System.out.println("");
        /*
         * Task #12
         * Найдите сумму первых n целых чисел, которые делятся на 3.
         * */
        System.out.println("Task #12");
        int integerNumbers = (int) (Math.random() * 32);
        int sumIntegerNumbers = 0;
        for (int i = 1; i < 10; i++) {
            if ((integerNumbers % 3) == 0) {
                sumIntegerNumbers += integerNumbers;

            }

        }
        System.out.println("сумму первых n целых чисел, которые делятся на 3 = " + sumIntegerNumbers);
        System.out.println("");
        /*
        * Task #13
        * Создать последовательность случайных чисел, найти и вывести наибольшее
        из них.
        * */
        System.out.println("Task #13");
        int[] randomNumber = new int[16];
        int maxValueNumber = 0;

        for (int index = 0; index < randomNumber.length - 1; index++) {
            randomNumber[index] = (int) (Math.random() * 50);
            if (randomNumber[index] > maxValueNumber) {
                maxValueNumber = randomNumber[index];

            }
        }
        System.out.println("Наибольшее рандомное число из массива  :" + maxValueNumber);
        System.out.println("");
        /*
        * Task #14
        *Создать массив оценок произвольной длины, вывести максимальную и
        минимальную оценку, её (их) номера.
        *
        * */
        System.out.println("Task #14");
        int[] rating = new int[10];
        int maxRating = rating[0];
        int minRating = rating[0];
        for (int index = 0; index < rating.length - 1; index++) {
            rating[index] = (int) (Math.random() * 10);
            if (rating[index] > maxRating) {
                maxRating = rating[index];

            }
            if (rating[index] < minRating) {
                minRating = rating[index];
            }
        }
        System.out.println("Mass :" + Arrays.toString(rating));
        System.out.println("Maximum grade: ");
        System.out.println("Number :" + rating[maxRating] + " Grade :" + maxRating);
        System.out.println("***************\nMinimal grade:");
        System.out.println("Number :" + rating[minRating] + " Grade :" + minRating);
        System.out.println("");
        /*
        * Task #15
        * Создать массив, заполнить его случайными элементами, распечатать,
          перевернуть, и снова распечатать (при переворачивании нежелательно создавать
          еще один массив).
        * */
        System.out.println("Task #15");

        int[] randomMass = new int[7];
        for (int index = 0; index < randomMass.length - 1; index++) {
            randomMass[index] = (int) (Math.random() * 5);
        }
        System.out.println("Массив до сортировки :" + Arrays.toString(randomMass));
        for (int start = 0; start < randomMass.length - 1; start++) {
            for (int index = 0; index < randomMass.length - 1 - start; index++) {
                if (randomMass[index] > randomMass[index + 1]) {
                    int tmp = randomMass[index];
                    randomMass[index] = randomMass[(index + 1)];
                    randomMass[(index + 1)] = tmp;
                }
            }
        }
        System.out.println("Массив после сортировки :" + Arrays.toString(randomMass));
        System.out.println("");

        /*
        * Task #16
        *Определите сумму элементов одномерного массива, расположенных между
        минимальным и максимальным значениями.
        *
        *
        * */
        System.out.println("Task #16");
        int[] randomValue = new int[10];
        int minRandomValue = randomValue[0];
        int maxRandomValue = randomValue[0];
        int sumRandomValue = 0;

        for (int index = 0; index < randomValue.length - 1; index++) {
            randomValue[index] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(randomValue));
        for (int index = 0; index < randomValue.length - 1; index++) {
            if (randomValue[index] > maxRandomValue) {
                maxRandomValue = randomValue[index];

            }
            if (randomValue[index] < minRandomValue) {
                minRandomValue = randomValue[index];
            }
            for (int indexRandom = minRandomValue; indexRandom < randomValue.length - 1; indexRandom++) {

                if (randomValue[indexRandom] == maxRandomValue) {
                    sumRandomValue += randomValue[indexRandom];
                    break;
                }

            }
        }
        System.out.println(maxRandomValue + " " + minRandomValue);

        System.out.println(sumRandomValue);
        System.out.println("");
//??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        /*
        * Task #17
        *Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
        таким образом:
        1 1 1 1 1
        0 1 1 1 0
        0 0 1 0 0
        0 1 1 1 0
        1 1 1 1 1
        *
        * */
        System.out.println("Task #17");
        int[][] twoDim = new int[7][7];

        System.out.println(twoDim.length);
        for (int indexI = 0; indexI < twoDim.length; indexI++) {
            for (int indexJ = 0; indexJ < twoDim[indexI].length; indexJ++) {
                if (indexI == twoDim.length - 1 || indexI == indexJ + 1) {
                    twoDim[indexI][indexJ] = 1;
                }
                if (indexJ == indexI || indexJ == twoDim.length - 1 - indexI) {
                    twoDim[indexI][indexJ] = 1;
                } else {
                    twoDim[indexI][indexJ] = 0;
                }
//                if (indexI == twoDim.length - 1){
//                    twoDim[indexI][indexJ] = 1;
//                }


            }
        }
//        не бабочка  а крееест
        for (int indexI = 0; indexI < twoDim.length; indexI++) {
            for (int indexJ = 0; indexJ < twoDim[indexI].length; indexJ++) {
                System.out.print(twoDim[indexI][indexJ] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(twoDim));
//        int i, j;
//
//
//        for (i = 0; i < twoDim.length / 2 + 1; i++) {
//            for (j = 0; j < twoDim[i].length; j++) {
//                if ((j < i) || (j >= (twoDim[i].length - i))) {
//                    twoDim[i][j] = 0;
//                } else {
//                    twoDim[i][j] = 1;
//                }
//            }
//            for (i = twoDim.length - 1; i >= twoDim.length / 2 + 1; i--) {
//                for (j = 0; j < twoDim[i].length; j++) {
//                    if ((j < (twoDim[i].length - 1 - i)) || (j > i)) {
//                        twoDim[i][j] = 0;
//                    } else {
//                        twoDim[i][j] = 1;
//                    }
//                }
//
//            }
//        }
//        System.out.printf(Arrays.deepToString(twoDim));
//        На этом я туплю!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
}