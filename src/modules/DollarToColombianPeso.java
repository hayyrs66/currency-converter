package modules;

import api.ExchangeAPI;
import interfaces.Command;

import java.io.IOException;

public class DollarToColombianPeso implements Command {
    @Override
    public void execute(double amount) throws IOException, InterruptedException {
        double conversion = ExchangeAPI.getConversion("COP");
        double convertedValue = amount * conversion;
        System.out.println(amount + " USD " +  " are " + convertedValue + " COP ");
    }
}
