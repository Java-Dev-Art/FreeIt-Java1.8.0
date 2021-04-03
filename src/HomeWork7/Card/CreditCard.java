package HomeWork7.Card;

public class CreditCard extends PlasticCard{

    String company;
    int limit;

    public CreditCard(int id, String owner, String bank, String paymentSystem, String company, int limit) {
        super(id, owner, bank, paymentSystem);
        this.company = company;
        this.limit = limit;
    }


}
