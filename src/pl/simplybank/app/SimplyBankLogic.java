package pl.simplybank.app;

import pl.simplybank.io.ConsolePrinter;
import pl.simplybank.io.DataReader;

public class SimplyBankLogic {
    ConsolePrinter consolePrinter = new ConsolePrinter();
    DataReader dataReader;


    public void simplyBankLoop(){
        dataReader = new DataReader(consolePrinter);
        dataReader.closeReader();
    }

}
