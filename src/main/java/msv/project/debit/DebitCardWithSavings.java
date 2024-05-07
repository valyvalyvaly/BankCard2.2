package msv.project.debit;

import msv.project.model.DebitCard;

public class DebitCardWithSavings extends DebitCard {
    private double savings;

    public DebitCardWithSavings(double balance) {
        super(balance);
        this.savings = 0;
    }

    @Override
    public void topUp(double amount) {
        super.topUp(amount);
        double savingAmount = amount * 0.00005;
        savings += savingAmount;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > getBalance()){
            System.out.println("сумма превышает лимит");
            return false;
        }
        return super.pay(amount);
    }

    @Override
    public String getAvailableFundsInfo() {
        return super.getAvailableFundsInfo() + ", Savings: " + savings;
    }
}
