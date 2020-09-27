package pl.simplybank.model;

public class BankAccount {
    private int IBN;
    private double amount;
    private BankUser person;

    public BankAccount(int IBN, double amount, BankUser person) {
        this.IBN = IBN;
        this.amount = amount;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(BankUser person) {
        this.person = person;
    }
}
