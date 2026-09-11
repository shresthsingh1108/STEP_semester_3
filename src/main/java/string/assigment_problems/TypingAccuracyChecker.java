package string.assigment_problems;

public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid input");
            return;
        }

        int total = original.length();
        int matched = 0;
        int firstMismatchPos = -1;
        char origMismatch = ' ';
        char typedMismatch = ' ';

        int compareLen = Math.min(original.length(), typed.length());
        for (int i = 0; i < compareLen; i++) {
            char o = original.charAt(i);
            char t = typed.charAt(i);
            if (o == t) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1;
                origMismatch = o;
                typedMismatch = t;
            }
        }

        double accuracy = total > 0 ? ((double) matched / total) * 100.0 : 0.0;

        if (firstMismatchPos != -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, total, accuracy, firstMismatchPos, origMismatch, typedMismatch);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matched, total, accuracy);
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}