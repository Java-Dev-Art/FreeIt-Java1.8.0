package HomeWork7.Card;

public class DebitCard extends PlasticCard{
    int percentageForOperation;

    public DebitCard(int id, String owner, String bank, String paymentSystem, int percentageForOperation) {
        super(id, owner, bank, paymentSystem);
        this.percentageForOperation = percentageForOperation;
    }
}
