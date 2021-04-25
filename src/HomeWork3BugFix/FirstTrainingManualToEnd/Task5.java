package HomeWork3BugFix.FirstTrainingManualToEnd;

public class Task5 {
    public static void main(String[] args) {
//        Task #5 ******************************************************************************************************
//        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//          различны?
        System.out.println("Task #5");
        int natNumber = 5786;

        char[] chars = String.valueOf(natNumber).toCharArray();
        if ((chars[0] != chars[1]) && (chars[0] != chars[2]) && (chars[0] != chars[3]) && (chars[1] != chars[2]) &&
                (chars[1] != chars[3]) && chars[2] != chars[3]) {
            System.out.println("Совпадений не найдено , \nцифры не равны!");
        } else {
            System.out.println("Совпадения есть, но не все так и плохо");
        }
    }
}
