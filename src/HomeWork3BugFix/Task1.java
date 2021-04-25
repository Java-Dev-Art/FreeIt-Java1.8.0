package HomeWork3BugFix;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("task #1");
        double km = 10;
        for (int i = 1; i <= 7; i++) {
            km += (km * 0.1);
            System.out.println("День тренировки : " + i + " Дистанция пройдена : " + km);
        }
    }
}
