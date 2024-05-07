package msv.project.credit;

import msv.project.model.CreditCard;

public class CreditCardWithCashback extends CreditCard {
    private double cashback;

    public CreditCardWithCashback(double balance, double creditLimit) {
        super(balance, creditLimit);
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
