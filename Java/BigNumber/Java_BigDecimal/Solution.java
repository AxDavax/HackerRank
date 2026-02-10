import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];
        for(int i = 0; i < n; i++)
            s[i] = sc.next();

        sc.close();

        Arrays.sort(s, new Comparator<String>() {
            public int compare(String a, String b) {
            BigDecimal bd1 = new BigDecimal(a);
            BigDecimal bd2 = new BigDecimal(b);
            return bd2.compareTo(bd1);
            }
        });

        for(int i = 0; i<n; i++)
            System.out.println(s[i]);
    }
}