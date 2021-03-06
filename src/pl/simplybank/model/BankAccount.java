package pl.simplybank.model;

public class BankAccount {
    private int IBN;
    private double balance;
    private BankUser person;

    public BankAccount(int IBN, double balance, BankUser person) {
        this.IBN = IBN;
        this.balance = balance;
        this.person = person;
    }

    public void doTransaction(int amount){
        balance += amount;
    }


    public int getIBN() {
        return IBN;
    }

    public void setIBN(int IBN) {
        this.IBN = IBN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankUser getPerson() {
        return person;
    }

    public void setPerson(BankUser person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "IBN=" + IBN +
                ", balance=" + balance +
                ", person=" + person.getLastName() +
                '}';
    }
}
