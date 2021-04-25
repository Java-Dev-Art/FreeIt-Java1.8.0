package HomeWorkBugFix6String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddTask2 {
    public static void main(String[] args) {
        System.out.println("2) Имеется строка с текстом. Вывести текст, составленный из последних букв\n" +
                "        * всех слов.");
        String taskD = "2) Имеется строка с текстом. Вывести текст, составленный из последних букв\n" +
                "        * всех слов.";
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern1 = Pattern.compile("[а-яА-Я]+");
        Matcher matcher1 = pattern1.matcher(taskD);
        while (matcher1.find()){
            stringBuilder.append(taskD.substring(matcher1.end()-1,matcher1.end()));
        }
        System.out.println("Последние буквы " + stringBuilder);
    }
}
