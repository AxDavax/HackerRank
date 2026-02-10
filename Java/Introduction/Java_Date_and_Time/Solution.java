import java.io.*;
import java.util.Calendar;

class Result {
    public static String findDay(int month, int day, int year) {
        java.util.Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int wkDay = cal.get(Calendar.DAY_OF_WEEK);

        switch (wkDay) {
            case Calendar.SUNDAY: return "SUNDAY";
            case Calendar.MONDAY: return"MONDAY";
            case Calendar.TUESDAY: return "TUESDAY";
            case Calendar.WEDNESDAY: return "WEDNESDAY";
            case Calendar.THURSDAY: return "THURSDAY";
            case Calendar.FRIDAY: return"FRIDAY";
            case Calendar.SATURDAY: return"SATURDAY";
            default: return "";
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}