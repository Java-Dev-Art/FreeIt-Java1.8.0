package HomeWork3;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Task #6");
        int[] listNumbers = new int[101];
        for (int l = 1; l < listNumbers.length; l++) {
            listNumbers[l] = l;
            if ((listNumbers[l] % 2)== 0) {
                System.out.println(" числа " + listNumbers[l] + " не делятся на 2");
            }
        }
    }
}
