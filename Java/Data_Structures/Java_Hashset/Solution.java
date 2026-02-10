import java.util.Scanner;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();
        int t = scan.nextInt();

        for(int i = 0; i < t; i++) {
            String left = scan.next();
            String right = scan.next();

            set.add(left + " " + right);
            System.out.println(set.size());
        }
    }
}