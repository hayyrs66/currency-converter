package modules;

import api.ExchangeAPI;
import interfaces.Command;

import java.io.IOException;

public class ArgentinePesoToDollar implements Command {

    @Override
    public void execute(double amount) throws IOException, InterruptedException {
        double conversion = ExchangeAPI.getConversion("ARS");
        double convertedValue = amount / conversion;

        DecimalFormatter decimalFormatter = new DecimalFormatter();
        System.out.println(amount + " ARS "  + " are " + decimalFormatter.format(convertedValue) + " USD ");
    }
}
