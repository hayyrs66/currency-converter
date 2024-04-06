package modules;

import api.ExchangeAPI;
import interfaces.Command;

import java.io.IOException;

public class DollarToBrazilianReal implements Command {
    @Override
    public void execute(double amount) throws IOException, InterruptedException {
        double conversion = ExchangeAPI.getConversion("BRL");
        double convertedValue = amount * conversion;
        DecimalFormatter decimalFormatter = new DecimalFormatter();

        System.out.println(amount + " USD " +  " are " + decimalFormatter.format(convertedValue) + " BRL ");
    }
}
