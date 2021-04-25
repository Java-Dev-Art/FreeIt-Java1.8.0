package HomeWork3BugFix.FirstTrainingManualToEnd;

public class Task3 {
    public static void main(String[] args) {
         /*
        *Task #3
        * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
        А) минут + секунд,
        В) часов + минут + секунд,
        С) дней + часов + минут + секунд,
        D) недель + дней + часов + минут + секунд.
        по аналогии с примером выше.
        * */
        System.out.println("Training manual Task #3");
        int s = 4500;

        long week =s % 604800 / 86400;
        long day =s / 86400;
        long hour = s % 86400/3600;
        long min = s % 3600 / 60;
        long sec = s % 60;

        System.out.println("A :" + min + " минут, " + sec + " секунд");
        System.out.println("B :" + hour + " часов, " + min + " минут, " + sec + " секунд");
        System.out.println("C :" + day + " дней, " + hour + " часов, " + min + " минут, " + sec + " секунд");
        System.out.println("D :" + week + " недель, " + day + " дней, " + hour + " часов, " + min + " минут, " + sec + " секунд");
    }
}
