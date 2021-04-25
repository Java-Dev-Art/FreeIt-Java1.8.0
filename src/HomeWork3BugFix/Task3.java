package HomeWork3BugFix;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task #3");
        int sum = 0;
        for (int i = 1; i <= 256; i++) {
            sum += i;
            System.out.println(i + " сумма = " + sum);
        }
    }
}
