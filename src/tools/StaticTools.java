package tools;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class StaticTools {
    public static NumberFormat numberFormater = NumberFormat.getNumberInstance(Locale.GERMANY);
    public static DecimalFormat decimalFormater = new DecimalFormat("#,##0.00");
    public static DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void clearScreen() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}
