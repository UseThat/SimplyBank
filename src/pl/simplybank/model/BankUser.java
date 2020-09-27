package pl.simplybank.model;

public class BankUser extends Person{
    private String bankUserID;

    public BankUser(String firstName, String lastName, String bankUserID) {
        super(firstName, lastName);
        this.bankUserID = bankUserID;
    }

    public String getBankUserID() {
        return bankUserID;
    }

    public void setBankUserID(String bankUserID) {
        this.bankUserID = bankUserID;
    }
}
