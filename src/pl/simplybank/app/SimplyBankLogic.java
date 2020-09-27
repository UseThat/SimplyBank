package pl.simplybank.app;

import pl.simplybank.io.ConsolePrinter;
import pl.simplybank.io.DataReader;
import pl.simplybank.model.*;

public class SimplyBankLogic {
    private ConsolePrinter consolePrinter = new ConsolePrinter();
    private DataReader dataReader;
    private Bank bank;

    public SimplyBankLogic(){
        bank = new Bank();
    }

    public void simplyBankLoop(){
        dataReader = new DataReader(consolePrinter);
        bank.addBankAccount(dataReader.createBankAccount());
        System.out.println(bank.getBankAccounts().values());

        dataReader.closeReader();
    }

}
