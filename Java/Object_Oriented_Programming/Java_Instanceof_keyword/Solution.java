import java.util.Scanner;
import java.util.ArrayList;

class GreatStudent {}
class Rockstar {}
class Hacker {}

public class Main {
    static String count(ArrayList<?> mylist) {
        int a = 0, b = 0, c = 0;
        for (Object element : mylist) {
            if (element instanceof GreatStudent) a++;
            else if (element instanceof Rockstar) b++;
            else if (element instanceof Hacker) c++;
        }

        return a + " " + b + " " + b;
    }

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            String s = sc.next();
            if(s.equals("Student")) myList.add(new GreatStudent());
            else if(s.equals("Rockstar")) myList.add(new Rockstar());
            else if(s.equals("Hacker")) myList.add(new Hacker());
        }

        System.out.println(count(myList));
    }
}