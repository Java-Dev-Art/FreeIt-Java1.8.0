package HomeWork7;

public class TimeInterval {
    /*
    * Задание 24
    Создать класс и объекты описывающие промежуток времени. Сам промежуток
    в классе должен задаваться тремя свойствами: секундами, минутами, часами.
    Сделать методы для получения полного количества секунд в объекте, сравнения
    двух объектов (метод должен работать аналогично compareTo в строках). Создать
    два конструктора: получающий общее количество секунд, и часы, минуты и секунды
    по отдельности. Сделать метод для вывода данных.
    * */

    private int sec;
    private int min;
    private int hour;

    public TimeInterval(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }
    public TimeInterval(int secAll){
        this.sec = secAll;
    }
    public int timeInterval(){
        return (hour * 60) + (min * 60) + sec;
    }
    public void printTime(){
        System.out.println("Сукунд" + sec);
    }
    public  void printAllSec(){
        System.out.println(timeInterval());
    }
    public void compareTime(){
        if (this.sec > this.timeInterval()){
            System.out.println("First object >  Second object ");
        }else if (this.sec == this.timeInterval()){
            System.out.println("First object = Second object");
        }else if (this.sec != this.timeInterval()){
            System.out.println("First object != Second object");
        }else {
            System.out.println("First object < Second object ");
        }
    }
}
