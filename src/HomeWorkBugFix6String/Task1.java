package HomeWorkBugFix6String;

public class Task1 {
    public static void main(String[] args) {
        String task1 = " Вырезать подстроку из строки начиная с первого вхождения символа(А) до," + "" +
                "последнего вхождения сивола(B).";
        System.out.println("Первое вхождение интекса в строку мы майдем методом indexOf()\n***************************");
        System.out.println("Символ который мы ищем будет ('а') , индекс = " + task1.indexOf('а'));
        System.out.println("Последнее вхождение этого символа в текст = " + task1.lastIndexOf('а'));
        System.out.println("Теперь вырезаем этот диапазон из текста и резултат = \n" + task1.substring(6, 98 + 1));
    }
}
