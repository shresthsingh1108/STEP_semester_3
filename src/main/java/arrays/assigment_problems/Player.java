package arrays.assigment_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        return isDraftable(matchesPlayed) || (matchesPlayed >= 5 && !injured);
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    public static String draftAndRank(Player[] players) {
        List<Player> draftableList = new ArrayList<>();
        for (Player p : players) {
            if (isDraftable(p.matchesPlayed, p.injured)) {
                draftableList.add(p);
            }
        }

        Player[] draftable = draftableList.toArray(new Player[0]);
        Arrays.sort(draftable);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            sb.append(String.format("%d. %s", (i + 1), draftable[i].name));
            if (i < draftable.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Player[] list = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        System.out.println(draftAndRank(list));
    }
}