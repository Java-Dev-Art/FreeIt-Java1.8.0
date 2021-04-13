package HomeWorkDate;

import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        По введенной дате вывести возраст
        System.out.println("Enter Year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.println("Enter Month");
        Scanner scanner1 = new Scanner(System.in);
        int month = scanner1.nextInt();

        System.out.println("Enter Day");
        Scanner scanner2 = new Scanner(System.in);
        int day = scanner2.nextInt();

        Date bd = new Date(year,month -1,day);
        Date now = new Date();

        int b = bd.getYear();
        int nd = now.getYear() + 1900;
        int result = nd - b;

        System.out.println("Your age :" + result);
    }
}
