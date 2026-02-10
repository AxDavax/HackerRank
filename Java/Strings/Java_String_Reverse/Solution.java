import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        scan.close();

        String revStr = new StringBuilder(A).reverse().toString();
        String isPalindrome = (A.compareTo(revStr) == 0) ? "Yes" : "No";
        System.out.println(isPalindrome);
    }
}