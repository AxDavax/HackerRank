import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();

        for(int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int somme = a + b;
            System.out.print(somme + " ");
            for(int j = 1; j < n; j++) {
                somme += (int)Math.pow(2, j) * b;
                System.out.print(somme + " ");
            }
            System.out.print("\n");

            scan.close();
        }
    }
}
