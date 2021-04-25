package HomeWorkBugFix6String;

public class Task3 {
    public static void main(String[] args) {
        String task3 = " 3)В исходном файле находятся слова, каждое слово на новой стороке. После" +
                " запуска программы должен создать файл, который будет содержать в себе только полиндромы топот";
        task3.replaceAll("([.,]+\\s+\\t+\\n+)", "");
        String[] tMass = task3.split("\\s");
        for (String task : tMass) {
            if (task.equals(new StringBuilder(task).reverse().toString())) {
                System.out.println("полиндромы в тексте :" + task);
            }
        }
    }
}
