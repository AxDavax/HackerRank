import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine()
                            .replaceAll("\\s+$", "")
                            .split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
                );
            } catch (java.io.IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                                            + arr.get(i+1).get(j+1)
                        + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                if (sum > maxSum) maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}