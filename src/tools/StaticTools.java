package tools;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StaticTools {
    public static NumberFormat numberFormater = NumberFormat.getNumberInstance(Locale.GERMANY);
    public static DecimalFormat decimalFormater = new DecimalFormat("#,##0.00");
    public static DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
}
