package pl.simplybank.app;

import pl.simplybank.io.DataReader;

public class SimplyBankLogic {
    DataReader dataReader;


    public void simplyBankLoop(){
        dataReader = new DataReader();
        dataReader.closeReader();
    }

}
