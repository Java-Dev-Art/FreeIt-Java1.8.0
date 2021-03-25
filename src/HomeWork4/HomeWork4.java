package HomeWork4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        * Task # 18
        * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
        * */
        System.out.println("Task #18");
        String text = "Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.";
        int index = 0;
        char symbol;
        for (int i = 0;i < text.length(); i++){
            symbol = text.charAt(i);
            if (symbol != 0){
                if (symbol == '.' || symbol == ',' || symbol == '!' || symbol == '?') {
                    index ++;
                }
            }else {
                System.out.printf("Знаков препинания нет!");
            }
        }
        System.out.println("Есть " + index + " знаков припинания ");
        System.out.println("");
        /*
        * Task #19
        * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться
        * несколькими пробелами, в начале и конце
        * текста также могут быть пробелы, но могут и отсутствовать.
        *
        * */
        System.out.println("Task #19");
        String text19 = "Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно\n" +
                "учесть, что слова могут разделяться несколькими пробелами, в начале и конце\n" +
                "текста также могут быть пробелы, но могут и отсутствовать.";
        int countText19 = 0;
        String [] strings = text19.split("\\s+");
        for (int i = 0; i < strings.length - 1; i++){
            String text19C = strings[i];
            if (text19C != null){
                countText19++;
            }
        }
        System.out.println("Всего слов в тексте : " + countText19);
        System.out.println("");
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
        System.out.println("");
        /*
        * Task #21
        *Напишите три цикла выполняющих многократное сложение строк, один с
        * помощью оператора сложения и String, другой с помощью StringBuilder и метода
        * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
        * */
        System.out.println("Task #21");
        String text21 = "Напишите три цикла выполняющих многократное сложение строк, один с\n" +
                "помощью оператора сложения и String, другой с помощью StringBuilder и метода\n" +
                "append, а также аналогино для StringBuffer. Сравните скорость их выполнения.\n" +
                "Регулярные выражения";
        String[] text21Strings = text21.split("\\s+");
        String text21S = "";
        long start= System.nanoTime();


        for (int i = 0; i< text21Strings.length; i++){
            text21S += text21Strings[i];
        }

        long end =  System.nanoTime();
        long result = end - start;

        System.out.println("Добавление строк String . \nВремени затрачено на добавление :" + result / 1000 +
                " мс. \nРезультат доьвыления : " + text21S );
        System.out.println("");


        System.out.println("StringBuilder");

        StringBuilder text21StringBuilder = new StringBuilder();

        long startBuilder = System.nanoTime();
        for (int i = 0; i < text21Strings.length; i++){
            text21StringBuilder.append(text21Strings[i]);
        }

        long endBuilder = System.nanoTime();
        long resultBuilder = endBuilder - startBuilder;

        System.out.println("Добавление строк String . \nВремени затрачено на добавление :" + resultBuilder / 1000 +
                " мс. \nРезультат доьвыления : " + text21StringBuilder );
        System.out.println("");

        System.out.println("StringBuffer");
        StringBuffer text21StringBuffer = new StringBuffer();

        long startBuffer = System.nanoTime();

        for (int i = 0; i < text21Strings.length; i++){
            text21StringBuffer.append(text21Strings[i]);
        }
        long endBuffer = System.nanoTime();
        long resultBuffer = endBuffer - startBuffer;

        System.out.println("Добавление строк String . \nВремени затрачено на добавление :" + resultBuffer / 1000 +
                " мс. \nРезультат доьвыления : " + text21StringBuffer );
        System.out.println("");

        /*
        *
        * Task #22
        * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
        * записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу 3BD16.
        *
        *
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
        System.out.println("");
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
        System.out.println("");
        /*
        *
        *
        *
        * */










    }
}
