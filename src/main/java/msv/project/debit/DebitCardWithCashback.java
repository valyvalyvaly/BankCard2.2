package msv.project.debit;

import msv.project.model.DebitCard;

public class DebitCardWithCashback extends DebitCard {
    private double cashback;

    public DebitCardWithCashback(double balance) {
        super(balance);
        this.cashback = 0;
    }

    @Override
    public void topUp(double amount) {
        super.topUp(amount);
        if (amount >= 5000) {
            cashback += amount * 0.05;
        }
    }

    @Override
    public boolean pay(double amount) {
        if (amount > getBalance()){
            System.out.println("сумма превышает лимит");
            return false;
        }
        boolean paid = super.pay(amount);
        return paid;
    }

    @Override
    public String getAvailableFundsInfo() {
        return super.getAvailableFundsInfo() + ", Cashback: " + cashback;
    }
}
