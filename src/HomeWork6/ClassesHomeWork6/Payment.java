package HomeWork6.ClassesHomeWork6;

public class Payment {
    private int myMoney;
    private boolean accept;
    private Pay pay;
    public void isAccept(){
        accept = true;
    }
    public void noAccept(){
        accept = false;
    }

    public int getMyMoney() {
        return myMoney;
    }

    public void setMyMoney(int myMoney) {
        this.myMoney = myMoney;
    }

    public class Pay{
        private String title;
        private int price;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public int getPrice() {
            return price;
        }

        public void pay(String title, int price){
            setPrice(price);
            setTitle(title);
        }
        public void acceptPrice(){
            if (getPrice() > getMyMoney()){
                System.out.println("Покупка не возможна");
                noAccept();
            }else {
                isAccept();
                Payment.this.myMoney -= getPrice();
                System.out.println("Вы приобрели нужный товар!");
                System.out.println("Название " + getTitle() + "\nЦена " + getPrice()+ " руб.");
            }
        }
    }

    public void money(){
        System.out.println("Остаток равен " + getMyMoney());
    }

    public static void main(String[] args) {
        Payment payment = new Payment();
        Pay pay = payment.new Pay();
        pay.pay("ruka",100);
        payment.setMyMoney(125);

        pay.acceptPrice();
        payment.money();
    }
}
