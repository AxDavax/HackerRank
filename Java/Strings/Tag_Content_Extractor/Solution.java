import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases > 0) {
            String line = scan.nextLine();
            boolean found = false;

            Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            while(matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if(!found) System.out.println("None");

            testCases--;
        }

        scan.close();
    }
}