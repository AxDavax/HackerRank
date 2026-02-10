import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        List<Integer> liste = new ArrayList<>();

        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
            liste.add(scan.nextInt());

        int q = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < q; i++) {
            String cmnd = scan.next();

            int x = scan.nextInt();
            if(Objects.equals(cmnd, "Insert"))
                liste.add(x, scan.nextInt());
            else if(Objects.equals(cmnd, "Delete"))
                liste.remove(x);
        }

        for (int value : liste)
            System.out.print(value + " ");
    }
}