package HomeWork8Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task30 {
    //    Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            integers.add((int) (Math.random() * 10) + i);
        }
        integers.stream().forEach(System.out::println);
        System.out.println("**************");
        Set<Integer> integerSet = new HashSet<>(integers);
        integers.clear();
        integers.addAll(integerSet);
        integers.stream().forEach(System.out::println);
    }
}
