package HomeWork7BugFix;

public class ATM {
    /*
    * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
    банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
    50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
    снимающую деньги. На вход передается сумма денег. На выход – булевское
    значение (операция удалась или нет). При снятии денег функция должна
    рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
    конструктор с тремя параметрами – количеством купюр.
    *
    * */
    private int banknote20;
    private int banknote50;
    private int banknote100;
    private int balance;
    private boolean boolBalance;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        this.balance = (this.banknote20 * 20) + (this.banknote50 * 50) + (this.banknote100 * 100);
    }

    public int getBanknote20() {
        return banknote20;
    }

    public void setBanknote20(int banknote20) {
        this.banknote20 = banknote20;
    }

    public int getBanknote50() {
        return banknote50;
    }

    public void setBanknote50(int banknote50) {
        this.banknote50 = banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    public void setBanknote100(int banknote100) {
        this.banknote100 = banknote100;
    }

    public void myBalance() {
        System.out.println(this.balance);
    }

    public void toUpMoneyATM(int toUp) {
        this.balance += toUp;
    }

    public boolean takeOffMoneyATM(int takeOff) {
        if (takeOff > this.balance) {
            System.out.println("Operation impossible check your balance");
            return false;
        } else {
            this.balance -= takeOff;
            System.out.println("Take your money");
            if (takeOff % 20 == 0 && takeOff <= getBanknote20() * 20) {
                int t20 = takeOff / 20;
                int nom20 = getBanknote20() - t20;
                setBanknote20(nom20);
                System.out.println("Снято " + takeOff + "\nНоминал 20\nКоличество банкнот " + t20 + "\nОсталось банкнот в банкомате " + getBanknote20());
            }
            if (takeOff % 50 == 0 && takeOff <= getBanknote50() * 50) {
                int t50 = takeOff / 50;
                int nom50 = getBanknote50() - t50;
                setBanknote50(nom50);
                System.out.println("Снято " + takeOff + "\nНоминал 50\nКоличество банкнот " + t50 + "\nОсталось банкнот в банкомате " + getBanknote50());
            }
            if (takeOff % 100 == 0 && takeOff <= getBanknote50() * 100) {
                int t100 = takeOff / 100;
                int nom100 = getBanknote50() - t100;
                setBanknote100(nom100);
                System.out.println("Снято " + takeOff + "\nНоминал 100\nКоличество банкнот " + t100 + "\nОсталось банкнот в банкомате " + getBanknote100());
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(5, 10, 8);
        atm.takeOffMoneyATM(1000);
    }
}

