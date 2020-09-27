package pl.simplybank.io;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner;

    public DataReader(){
        scanner  = new Scanner(System.in);
    }

    public void closeReader(){
        scanner.close();
    }
}
