package HomeWork7BugFix.Card;

public class WithOverdraft extends DebitCard{
    int limitOverdraft;

    public WithOverdraft(int id, String owner, String bank, String paymentSystem, int percentageForOperation, int limitOverdraft) {
        super(id, owner, bank, paymentSystem, percentageForOperation);
        this.limitOverdraft = limitOverdraft;
    }
}
