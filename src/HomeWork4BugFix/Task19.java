package HomeWork4BugFix;

public class Task19 {
    public static void main(String[] args) {
         /* Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться
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
    }
}
