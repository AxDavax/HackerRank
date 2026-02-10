import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println(S.substring(start, end));

        scan.close();
    }
}