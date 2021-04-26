package HomeWork7BugFix.Card;

public class WithoutOverdraft extends DebitCard{
    int percentForCard;

    public WithoutOverdraft(int id, String owner, String bank, String paymentSystem, int percentageForOperation, int percentForCard) {
        super(id, owner, bank, paymentSystem, percentageForOperation);
        this.percentForCard = percentForCard;
    }
}
