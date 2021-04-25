package HomeWork5BugFixF;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
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
        System.out.println("TAsk #10");
        Scanner scanner1 =new Scanner(System.in);
        int input = scanner1.nextInt();
        int [] task10Mass;
        int [] task10MassS;
        int task10 =1;//Вроде делаю , как надо, но еще не могу полчучить нужного резултьаьа
        if (input > 3) {
            task10Mass = new int[input];
            for (int i = 0; i < task10Mass.length ; i++) {
                task10Mass[i] = (int) (Math.random() * input);
                System.out.print(task10Mass[i] + " ");
                if ((task10Mass[i] % 2) == 0 ) {
                    System.out.print(task10);
                    task10++;

                }
            }
            task10MassS = new int[task10];
            for (int i = 0; i < task10MassS.length; i++){
                if ((task10Mass[i] % 2 )== 0){
                    task10MassS[i] = task10Mass[i];
                    System.out.print(task10MassS[i] + " ");
                }
            }
        } else {
            System.out.println("Ввидтье чисто больше 3 ");
        }
    }
}
