package pl.simplybank.model;

public class BankAccount {
    private int IBN;
    private double amount;

    public BankAccount(int IBN, double amount) {
        this.IBN = IBN;
        this.amount = amount;
    }

    public int getIBN() {
        return IBN;
    }

    public void setIBN(int IBN) {
        this.IBN = IBN;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
