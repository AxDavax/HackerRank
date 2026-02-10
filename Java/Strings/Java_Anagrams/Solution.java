import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())  return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> dict = new HashMap<>();

        for(char c: a.toCharArray())
            dict.put(c, dict.getOrDefault(c, 0) +1);

        int nbDict;

        for(char c: b.toCharArray()) {
            if(!dict.containsKey(c)) return false;

            nbDict = dict.get(c);
            if(nbDict == 1)
                dict.remove(c);
            else
                dict.put(c, nbDict - 1);
        }

        return dict.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}