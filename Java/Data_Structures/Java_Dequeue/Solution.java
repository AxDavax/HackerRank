import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = scan.nextInt();
        int m = scan.nextInt();

        if(m == 1)  {
            System.out.println(1);
            return;
        }

        scan.nextLine();

        Map<Integer, Integer> dict = new HashMap<>();
        int maxCount = 0;

        for(int i = 0; i < n; i++) {
            int num = scan.nextInt();
            deque.addLast(num);
            dict.put(num, dict.getOrDefault(num, 0) + 1);

            if(deque.size() == m) {
                maxCount = Math.max(maxCount, dict.size());

                int key = deque.removeFirst();
                int count = dict.get(key);
                if(count > 1)
                    dict.put(key, count - 1);
                else
                    dict.remove(key);
            }
        }

        System.out.println(maxCount);
    }
}