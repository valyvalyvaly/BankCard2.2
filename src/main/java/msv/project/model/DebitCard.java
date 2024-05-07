package msv.project.model;

import msv.project.model.BankCard;

public class DebitCard extends BankCard {
    public DebitCard(double balance) {
        super(balance);
    }

    @Override
    public void topUp(double amount) {
        balance += amount;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Balance: " + balance;
    }
}
