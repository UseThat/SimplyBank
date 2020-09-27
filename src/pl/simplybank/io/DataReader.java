package pl.simplybank.io;

import pl.simplybank.model.BankAccount;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner;
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer){
        this.printer = printer;
        scanner  = new Scanner(System.in);
    }

    public void closeReader(){
        scanner.close();
    }

    public BankAccount createBankAccount(){
        System.out.println();
        return null;
    }
}
