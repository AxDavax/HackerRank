import java.util.Scanner;

public class Solution {
    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        int len = A.length() + B.length();
        System.out.println(len);

        String isAlargerThanB = (A.compareTo(B) > 0) ? "Yes" : "No";
        System.out.println(isAlargerThanB);
        System.out.println(capitalize(A) + " " + capitalize(B));

        scan.close();
    }
}