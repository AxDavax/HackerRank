import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        int fstCmp = Integer.compare(b.score, a.score);
        return (fstCmp != 0) ? fstCmp : a.name.compareTo(b.name);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++)
            player[i] = new Player(scan.next(), scan.nextInt());

        Arrays.sort(player, checker);
        for (Player value : player)
            System.out.printf("%s %s\n", value.name, value.score);
    }
}