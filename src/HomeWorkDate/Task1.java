package HomeWorkDate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
//    По введенной дате вывести название месяца.
    public static void main(String[] args)  {

        System.out.println("Enter Year");
        Scanner scanner1 = new Scanner(System.in);
        int year = scanner1.nextInt();

        System.out.println("Enter Month");
        Scanner scanner2 = new Scanner(System.in);
        int month = scanner2.nextInt() - 1;

        System.out.println("Enter Day");
        Scanner scanner3 =new Scanner(System.in);
        int day = scanner3.nextInt();

        SimpleDateFormat df = new SimpleDateFormat("MMMM", Locale.UK);
        Date date = new Date(year,month,day);
        System.out.println("Name of month " + df.format(date));
    }
}
