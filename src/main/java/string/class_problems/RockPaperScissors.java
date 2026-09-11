package string.class_problems;

import java.util.Random;

public class RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random(42);

        int totalRounds = 5;
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[][] summaryTable = new String[totalRounds][4];

        for (int i = 0; i < totalRounds; i++) {
            String pMove = playerMoves[i];
            String cMove = moves[random.nextInt(moves.length)];
            String result = playRound(pMove, cMove);

            summaryTable[i][0] = String.valueOf(i + 1);
            summaryTable[i][1] = pMove;
            summaryTable[i][2] = cMove;
            summaryTable[i][3] = result;

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.println("Round " + (i + 1) + " â€” Player: " + pMove + ", Computer: " + cMove + " | " + result);
        }

        double winPercentage = ((double) wins / totalRounds) * 100.0;

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Round | Player Move | Computer Move | Result");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < totalRounds; i++) {
            System.out.printf("%-5s | %-11s | %-13s | %s%n",
                    summaryTable[i][0], summaryTable[i][1], summaryTable[i][2], summaryTable[i][3]);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Final Summary (after %d rounds) | Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                totalRounds, wins, losses, draws, winPercentage);
    }
}