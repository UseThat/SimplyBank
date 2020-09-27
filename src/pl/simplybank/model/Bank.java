package pl.simplybank.model;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> bank = new HashMap<>();

    public void addBankAccount(BankAccount bankAccount){
        bank.put(bankAccount.getPerson().getBankUserID(), bankAccount);
    }

    public Map<String, BankAccount> getBankAccounts(){
         return bank;
    }
}
