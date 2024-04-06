package modules;

import api.ExchangeAPI;
import interfaces.Command;

import java.io.IOException;

public class ColombianPesoToDollar implements Command {
    @Override
    public void execute(double amount) throws IOException, InterruptedException {
        double conversion = ExchangeAPI.getConversion("COP");
        double convertedValue = amount / conversion;
        System.out.println(amount + " COP "  + " are " + convertedValue + " USD ");
    }
}
