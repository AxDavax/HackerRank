import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNumber = 1;

        while(scan.hasNextLine()) {
            System.out.println(lineNumber + " " + scan.nextLine());
            lineNumber++;
        }

        scan.close();
    }
}