import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        int numSentences = Integer.parseInt(scan.nextLine());

        while (numSentences-- > 0) {
            String input = scan.nextLine();
            Matcher m = p.matcher(input);

            while (m.find())
                input = input.replaceAll(m.group(0), m.group(1));

            System.out.println(input);
        }

        scan.close();
    }
}