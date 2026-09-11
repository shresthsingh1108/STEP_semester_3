package string.assigment_problems;

public class TrafficSignalStreakAnalyzer {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("No signals recorded.");
            return;
        }

        char longestColor = signalLog.charAt(0);
        int maxStreak = 1;

        char currentColor = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char ch = signalLog.charAt(i);
            if (ch == currentColor) {
                currentStreak++;
            } else {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    longestColor = currentColor;
                }
                currentColor = ch;
                currentStreak = 1;
            }
        }

        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            longestColor = currentColor;
        }

        System.out.println("Longest Streak: '" + longestColor + "' repeated " + maxStreak + " times");
    }

    public static void main(String[] args) {
        System.out.print("\"RRGGGYRR\" -> ");
        findLongestStreak("RRGGGYRR");

        System.out.print("\"RRRRYYGG\" -> ");
        findLongestStreak("RRRRYYGG");
    }
}