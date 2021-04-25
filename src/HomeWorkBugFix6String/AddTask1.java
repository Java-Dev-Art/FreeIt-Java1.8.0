package HomeWorkBugFix6String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddTask1 {
    public static void main(String[] args) {
        System.out.println(" 1) Найти в строке не только запятые, но и другие знаки препинания.\n" +
                "        *  Подсчитать общее их количество.");
        String task3 = " 3)В исходном файле находятся слова, каждое слово на новой стороке. После" +
                " запуска программы должен создать файл, который будет содержать в себе только полиндромы топот";
        int indexTask = 0;
        Pattern pattern = Pattern.compile("[.,;-]");
        Matcher matcher = pattern.matcher(task3);
        while (matcher.find()){
            indexTask++;
        }
        System.out.println("Всего знаков препинания :" + indexTask);
    }
}
