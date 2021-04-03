package HomeWork4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task23 {
    public static void main(String[] args) {
        /*
         * Task #23
         * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
         * которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
         * */
        System.out.println("Task #23");
        String task23 = "Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у\n" +
                "которых есть параметры, например <p id=”p1”>, и замену их на простые теги\n" +
                "абзацев <p>.";
        String tegTask23 = "<([a-z]\\s[a-z]{2}=.[a-z][0-9].)>";
        Pattern patternTask23 = Pattern.compile(tegTask23);
        Matcher matcherTask23 = patternTask23.matcher(task23);
        String teg = "<p>";

        while (matcherTask23.find()){
            System.out.println("Тег : "+ matcherTask23.group() + " найден в тексте.");
        }
        System.out.println("Текст task23 :" + task23 + "\n");
        System.out.println("Тег <p id=”p1” найден и заменен на тег " + teg);
        System.out.println("Текст task23 :\n" + task23.replaceAll(tegTask23, teg));
    }
}
