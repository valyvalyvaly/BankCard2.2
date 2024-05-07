package msv.project.model;

import msv.project.model.BankCard;

public class CreditCard extends BankCard {
    private double creditLimit;
    private double creditFunds;

    public CreditCard(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
        this.creditFunds = creditLimit;
    }
    @Override
    public void topUp(double amount) {
        if (amount <= creditLimit - creditFunds) {
            creditFunds += amount;
        } else {
            double remainingAmount = amount - (creditLimit - creditFunds);
            creditFunds = creditLimit;
            balance += remainingAmount;
        }
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            double remainingAmount = amount - balance;
            if (remainingAmount <= creditFunds) {
                balance = 0;
                creditFunds -= remainingAmount;
                return true;
            }
        }
        return false;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Balance: " + balance + ", Credit Funds: " + creditFunds;
    }
}
