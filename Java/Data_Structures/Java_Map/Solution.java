import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        Map<String, Integer> dict = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name = scan.nextLine();
            int phone = scan.nextInt();
            scan.nextLine();
            dict.put(name, phone);
        }

        int q = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < q; i++) {
            String query = scan.nextLine();
            if(dict.containsKey(query))
                System.out.println(query + "=" + dict.get(query));
            else
                System.out.println("Not found");
        }
    }
}