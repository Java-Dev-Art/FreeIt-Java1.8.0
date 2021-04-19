package HomeWork8Collection;

import java.util.ArrayList;

public class Task31 {
    //    Cоздать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            integers.add((int) (Math.random() * 7));
            i++;
        }
        integers.stream().forEach(System.out::println);
        int max = integers.get(0);
        int min = integers.get(0);
        for (Integer integer : integers) {
            if (integer < min) {
                min = integer;
            }
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println("*********************");
        System.out.println("Минимальная оценка :" + min);
        System.out.println("Максималтная оценка :" + max);
    }
}
