import java.util.Scanner;
import java.util.BitSet;

public class Solution {
    static void executeQuery(BitSet[] b, String q, int x, int y) {
        switch(q) {
            case "AND": b[x].and(b[y]);
                break;
            case "OR":  b[x].or(b[y]);
                break;
            case "XOR": b[x].xor(b[y]);
                break;
            case "FLIP": b[x].flip(y);
                break;
            case "SET": b[x].set(y);
                break;
            default: break;
        }

        System.out.println(b[1].cardinality() + " " + b[2].cardinality());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();

        BitSet[] b = new BitSet[3];
        b[1] = new BitSet(n);
        b[2] = new BitSet(n);

        for(int i = 0; i < m; i++) {
            String query = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();

            executeQuery(b, query, x, y);
        }
    }
}