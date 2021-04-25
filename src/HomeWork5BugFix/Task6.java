package HomeWork5BugFix;

public class Task6 {
    public static void main(String[] args) {
        /*
        * Task #6
            * 6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
            на экран в строку. Определить и вывести на экран сообщение о том, является ли
            массив строго возрастающей последовательностью.
                    * */
        System.out.println("Task #6");
        int[] task6Mass = new int[4];
        for (int i = 0; i < task6Mass.length; i++) {
            task6Mass[i] = (int) (Math.random() * 10);
            System.out.print(task6Mass[i] + " ");
        }
        String task6MassString = "Прогрессия возврастающая";
        for (int i = 0; i < task6Mass.length; i++) {
            if (i > 0 && task6Mass[i - 1] >= task6Mass[i]) {
                task6MassString = "Прогрессия не возврастающая";
            } else {
                task6MassString = "Прогрессия возврастающая";
            }
        }
        System.out.println(task6MassString);
    }
}
