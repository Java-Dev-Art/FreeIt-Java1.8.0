package HomeWork6;
import javafx.util.Builder;

import java.lang.String;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTask {
    public static void main(String[] args) {
        /*
        * 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
        * последнего вхождения сивола(B).
        * 2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в  позиции 0
        * 3)В исходном файле находятся слова, каждое слово на новой стороке. После
        *  запуска программы должен создать файл, который будет содержать в себе только полиндромы
        *  4)Текстовый файл содержит текст. После запуска программы в другой файл
        *  должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
        *  предложении присутствует слово-палиндром, то не имеет значения какое кол-во
        *  слов в предложении, оно попадает в новый файл.
        *  Пишем все в ООП стиле. Создаём класс TextFormater
        *   в котором два статических метода:
        *   1. Метод принимает строку и возвращает кол-во слов в строке.
        *   2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
        *  есть возвращает true, если нет false
        *   В main считываем файл.
        *  Разбиваем текст на предложения. Используя методы класса TextFormater
        *   определяем подходит ли нам предложение. Если подходит добавляем его в
        *   новый файл
        *
        * Дополнительное задание
        * 1) Найти в строке не только запятые, но и другие знаки препинания.
        *  Подсчитать общее их количество.
        * 2) Имеется строка с текстом. Вывести текст, составленный из последних букв
        * всех слов.
        * */
        System.out.println("Task #1");
        String task1 = " Вырезать подстроку из строки начиная с первого вхождения символа(А) до," + "" +
                "последнего вхождения сивола(B).";
        System.out.println("Первое вхождение интекса в строку мы майдем методом indexOf()\n***************************");
        System.out.println("Символ который мы ищем будет ('а') , индекс = " + task1.indexOf('а'));
        System.out.println("Последнее вхождение этого символа в текст = " + task1.lastIndexOf('а'));
        System.out.println("Теперь вырезаем этот диапазон из текста и резултат = \n" + task1.substring(6, 98 + 1));
        System.out.println("***********************************************************************************");
        System.out.println("Task #2");
        String task2 ="2)Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в  позиции 0";
        System.out.println("Примитивно ,но работает ");
        System.out.println(task2.replace('З','2'));
        System.out.println("***********************************************");
        System.out.println("Task #3");
        String task3 = " 3)В исходном файле находятся слова, каждое слово на новой стороке. После" +
                " запуска программы должен создать файл, который будет содержать в себе только полиндромы топот";
        task3.replaceAll("([.,]+\\s+\\t+\\n+)","");
        StringBuilder builder = new StringBuilder();
        StringBuilder revers = new StringBuilder();
        String [] tMass = task3.split("\\s");
        int index = 0;
        for (String task: tMass){
//            builder.append(task+"\n");
            if (task.equals(new StringBuilder(task).reverse().toString())){
                System.out.println( "полиндромы в иексте :" + task);
            }
        }
        System.out.println("**************************************************");
        System.out.println("Task #4");
        String st = "новой мам";
        System.out.println(TextFormater.length(st) + " слов, содержит строка st :\nВид строки :" + st);

        System.out.println("#2 содержаться ли в файле полиндромы :" + TextFormater.revers(st));
        System.out.println("№3 текст, который слдержит от 3 слов " + TextFormater.builderN(st));
        System.out.println("*****************************************");
        System.out.println(" 1) Найти в строке не только запятые, но и другие знаки препинания.\n" +
                "        *  Подсчитать общее их количество.");

        int indexTask = 0;
        Pattern pattern = Pattern.compile("[.,;-]");
        Matcher matcher = pattern.matcher(task3);
        while (matcher.find()){
            indexTask++;
        }
        System.out.println("Всего знаков препинания :" + indexTask);
        System.out.println("************************************************************************");
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
