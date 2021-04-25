package HomeWork4BugFix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {
        /*
         *
         * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
         * записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу 3BD16.
         *
         * */
        System.out.println("Task #22");
        String task22 = "Написать программу, выполняющую поиск в строке 3A5 шестнадцатеричных чисел,\n" +
                " * записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу 3BD16.";
        Pattern patternTask22 = Pattern.compile("[0-9]\\w+[0-9]+");
        Matcher matcherTask22 = patternTask22.matcher(task22);
        while (matcherTask22.find()){
            System.out.println("Шеснатиртчное число в стороке :" + matcherTask22.group());
        }
    }
}
