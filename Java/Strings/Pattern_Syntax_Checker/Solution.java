import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases > 0) {
            String pattern = scan.nextLine();
            try {
                java.util.regex.Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (java.util.regex.PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;
        }

        scan.close();
    }
}