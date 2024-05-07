package msv.project.credit;

import msv.project.model.CreditCard;

public class CreditCardWithSavings extends CreditCard {
    private double savings;

    public CreditCardWithSavings(double balance, double creditLimit) {
        super(balance, creditLimit);
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
