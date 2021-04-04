package HomeWork3;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Task #2");
        int amoebas = 1;
        for (int i = 3; i <= 24; i += 3) {
            amoebas *= 2;
            System.out.println("Прошло\t" + i + " ч. Количкство амеб : " + amoebas);
        }
    }
}
