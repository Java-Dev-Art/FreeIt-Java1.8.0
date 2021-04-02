package HomeWork7;

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
    public void myBalance(){
        System.out.println(this.balance);
    }
    public void toUpMoneyATM(int toUp){
        this.balance += toUp;
    }
    public boolean takeOffMoneyATM(int takeOff){
        if (takeOff > this.balance){
            System.out.println("Operation impossible check your balance");
            return false;
        }else {
            this.balance -=takeOff;
            System.out.println("Take your money");

            this.banknote20 = takeOff % 20;
            this.banknote50 = (takeOff - this.banknote20) / 50;
            int bank50 = this.banknote50 % 50;
            this.banknote100 = (this.banknote50 - bank50) / 100;

            System.out.println("Quantity of banknotes :\nDenomination $100 :" + this.banknote100 +"\nDenomination $ 50 :" +
                    bank50+ "\nDenomination $ 20 :" + this.banknote20);
            return true;
        }
    }

}

