package HomeWorkDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
//        Вывести дату в формате даты (DD/MM/YYYY) + время hh:mm:ss
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
