package string.assigment_problems;

public class SeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length == 0) {
            System.out.println("No Duplicate Seats Found");
            return;
        }

        int n = seatNumbers.length;
        boolean[] alreadyReported = new boolean[n];
        boolean duplicateFound = false;

        for (int i = 0; i < n; i++) {
            if (alreadyReported[i]) {
                continue;
            }
            boolean isDup = false;
            for (int j = i + 1; j < n; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    isDup = true;
                    alreadyReported[j] = true;
                }
            }
            if (isDup) {
                System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                duplicateFound = true;
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] hallA = {101, 102, 103, 102, 105};
        System.out.print("Input {101, 102, 103, 102, 105}: ");
        checkDuplicateSeats(hallA);

        int[] hallB = {101, 102, 103, 104, 105};
        System.out.print("Input {101, 102, 103, 104, 105}: ");
        checkDuplicateSeats(hallB);
    }
}