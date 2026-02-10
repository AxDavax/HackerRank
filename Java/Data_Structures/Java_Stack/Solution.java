import java.util.Scanner;
import java.util.Stack;

public class Solution {

    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                if((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '['))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < n; i++) {
            String input = scan.next();
            System.out.println(isBalanced(input));
        }
    }
}