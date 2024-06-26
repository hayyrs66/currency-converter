package modules;

import api.ExchangeAPI;
import interfaces.Command;

import java.io.IOException;

public class BrazilianRealToDollar implements Command {
    @Override
    public void execute(double amount) throws IOException, InterruptedException {
        double conversion = ExchangeAPI.getConversion("BRL");
        double convertedValue = amount / conversion;
        DecimalFormatter decimalFormatter = new DecimalFormatter();
        System.out.println(amount + " BRL "  + " are " + decimalFormatter.format(convertedValue) + " USD ");
    }
}
