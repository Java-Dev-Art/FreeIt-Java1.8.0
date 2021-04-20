package HomeWork8Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task32 {
    private Map<String, Integer> map = new HashMap<>();

    //    Задание 32
//Имеется текст. Следует составить для него частотный словарь.
    public void dictionary(String text) {
        String str = text.replaceAll("[.,?!]", " ");
        String[] strings = str.split("\\s");

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];

            map.compute(s, ((s1, integer) -> integer == null ? 1 : integer + 1));
        }
    }

    public void printD() {
        ArrayList<Map.Entry<String, Integer>> enter = new ArrayList<>(map.entrySet());
        enter.sort(((o1, o2) -> o1.getValue() - o2.getValue()));
        for (Map.Entry<String, Integer> entry : enter) {
            System.out.println("Слово :" + "\"" + entry.getKey() + "\"" + " Упоминалось " + entry.getValue());
        }
    }
}
