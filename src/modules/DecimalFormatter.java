package modules;

import java.text.DecimalFormat;

public class DecimalFormatter {
    private final DecimalFormat decimalFormat;

    public DecimalFormatter(){
        this.decimalFormat = new DecimalFormat("#.##");
        this.decimalFormat.setMinimumFractionDigits(2);
        this.decimalFormat.setMaximumFractionDigits(2);
    }

    public String format(double number){
        return decimalFormat.format(number);
    }

}
