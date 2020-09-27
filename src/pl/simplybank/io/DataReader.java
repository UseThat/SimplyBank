package pl.simplybank.io;

import pl.simplybank.model.BankAccount;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner;

    public DataReader(){
        scanner  = new Scanner(System.in);
    }

    public void closeReader(){
        scanner.close();
    }

    public BankAccount createBankAccount(){
        return null;
    }
}
