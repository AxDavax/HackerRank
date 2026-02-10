import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);

        int n = scan.nextInt();
        List<List<Integer>> matrix = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            matrix.add(new ArrayList<>());
            int m = scan.nextInt();
            for(int j = 0; j < m; j++)
                matrix.get(i).add(scan.nextInt());
        }

        int q = scan.nextInt();

        for(int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            try {
                System.out.println(matrix.get(x-1).get(y-1));
            }
            catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}