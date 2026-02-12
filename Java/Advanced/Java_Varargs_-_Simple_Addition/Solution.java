import java.util.Scanner;

class Add {
    public void add(int... numbers) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int n : numbers) {
            sb.append(n).append("+");
            sum += n;
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("=").append(sum);

        System.out.println(sb.toString());
    }
}

public class Solution {
    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        int[] nb = new int[6];
        Add ob = new Add();

        for(int i = 0; i < 6; i++)
            nb[i] = scan.nextInt();

        ob.add(nb[0], nb[1]);
        ob.add(nb[0], nb[1], nb[2]);
        ob.add(nb[0], nb[1], nb[2], nb[3], nb[4]);
        ob.add(nb[0], nb[1], nb[2], nb[3], nb[4], nb[5]);
    }
}