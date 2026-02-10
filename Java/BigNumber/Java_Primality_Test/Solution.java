import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bN = new BigInteger(n);

        if(bN.isProbablePrime(10))
            System.out.println("prime");
        else
            System.out.println("not prime");

        bufferedReader.close();
    }
}