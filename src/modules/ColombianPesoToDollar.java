package modules;

import api.ExchangeAPI;
import interfaces.Command;

import java.io.IOException;

public class ColombianPesoToDollar implements Command {
    @Override
    public void execute(double amount) throws IOException, InterruptedException {

        double conversion = ExchangeAPI.getConversion("COP");
        double convertedValue = amount / conversion;
        DecimalFormatter decimalFormatter = new DecimalFormatter();

        System.out.println(amount + " COP "  + " are " + decimalFormatter.format(convertedValue) + " USD ");
    }
}
