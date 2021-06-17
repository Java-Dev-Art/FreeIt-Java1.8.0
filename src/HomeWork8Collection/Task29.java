package HomeWork8Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task29<T> {
    //    Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.
    private ArrayList<T> rang = new ArrayList<>();

    public void setRang(int index, T number) {
        rang.add(index, number);
    }

    public void setRang(T number) {
        rang.add(number);
    }

    public ArrayList<T> getRang() {
        return rang;
    }

    public void deleteRang(int rang) {
        Iterator<T> my = getRang().iterator();
        while (my.hasNext()) {
            Integer num = (Integer) my.next();
            if (num < rang) {
                my.remove();
                System.out.println(" Минимальная оценка удалена ");
            } else {
                System.out.println(" Оценка больше минимальной ");
            }
        }
        System.out.print("Оценки >||=" + rang + " :" + getRang());
    }
}
