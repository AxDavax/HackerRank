import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1 = scan.next();
            int x = scan.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

        scan.close();
    }
}