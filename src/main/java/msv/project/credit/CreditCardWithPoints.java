package msv.project.credit;

import msv.project.model.CreditCard;

public class CreditCardWithPoints extends CreditCard {
    private double points;

    public CreditCardWithPoints(double balance, double creditLimit) {
        super(balance, creditLimit);
        this.points = 0;
    }

    @Override
    public void topUp(double amount) {
        super.topUp(amount);
        points += amount * 0.01;
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
        return super.getAvailableFundsInfo() + ", Points: " + points;
    }
}
