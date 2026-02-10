import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        // Locales
        java.util.Locale[] pays = {
                Locale.US, new Locale("en", "IN"), Locale.CHINA, Locale.FRANCE
        };

        // Formatters
        java.text.NumberFormat[] formats = new java.text.NumberFormat[4];

        for(int i = 0; i < pays.length; i++)
            formats[i] = java.text.NumberFormat.getCurrencyInstance(pays[i]);

        // Output
        String[] strPays = {"US", "India", "China", "France"};

        for(int i = 0; i < strPays.length; i++)
            System.out.println(strPays[i] + ": " + formats[i].format(payment));
    }
}
