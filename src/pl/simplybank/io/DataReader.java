package pl.simplybank.io;

import pl.simplybank.model.BankAccount;
import pl.simplybank.model.BankUser;

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
        printer.printLine("IBN:");
        int ibn = scanner.nextInt();
        scanner.nextLine();
        printer.printLine("Starting balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        printer.printLine("First name: ");
        String firstName = scanner.nextLine();
        printer.printLine("Last name: ");
        String lastName = scanner.nextLine();
        printer.printLine("Personal ID: ");
        String personalId = scanner.nextLine();

        return new BankAccount(ibn,balance,new BankUser(firstName,lastName,personalId));
    }
}
