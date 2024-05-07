package msv.project.debit;

import msv.project.model.DebitCard;

public class DebitCardWithPoints extends DebitCard {
    private double points;

    public DebitCardWithPoints(double balance) {
        super(balance);
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
