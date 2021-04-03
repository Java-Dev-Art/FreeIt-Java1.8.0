package HomeWork4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
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
                System.out.println("Знаков препинания нет!");
            }
        }
        System.out.println("Есть " + index + " знаков припинания ");
        System.out.println("Alternative answer Pattern");
        int indexPattern = 0;
        Pattern pattern = Pattern.compile("[,.-]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            indexPattern++;
        }
        System.out.println("Количество зеаков препинания " + indexPattern);
    }
}
