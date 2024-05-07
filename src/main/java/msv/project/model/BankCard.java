package msv.project.model;

public abstract class BankCard {
    protected double balance;

    public BankCard(double balance) {
        this.balance = balance;
    }

    public abstract void topUp(double amount);

    public abstract boolean pay(double amount);

    public double getBalance() {
        return balance;
    }

    public abstract String getAvailableFundsInfo();
}
