package HomeWork4BugFix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20 {
    public static void main(String[] args) {
        /*
         * Task #20
         * Имеется строка с текстом. Вывести текст, составленный из последних бук всех слов.
         *
         * */
        System.out.println("Task #20");
        String text20 ="Вывести текст, составленный из последних бук всех слов";
        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile("([а-яА-Я]+)");
        Matcher matcher = pattern.matcher(text20);
        int count20 = 0;
        while (matcher.find()){
            builder.append(text20.substring(matcher.end()-1,matcher.end()));
            count20++;
        }
        System.out.println("Количество слов в тексте : " + count20 + "\nПослелние буквы в словах : " + builder);
    }
}
