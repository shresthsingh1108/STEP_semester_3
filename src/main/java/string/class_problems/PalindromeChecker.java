package string.class_problems;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        if (text == null) return false;
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text == null) return false;
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        if (text == null) return false;
        char[] chars = text.toCharArray();
        int n = chars.length;
        char[] reversed = new char[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = chars[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            if (chars[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void checkAndPrint(String text) {
        boolean iterative = isPalindromeIterative(text);
        boolean recursive = isPalindromeRecursive(text);
        boolean arrayReversal = isPalindromeArrayReversal(text);

        String iterResult = iterative ? "Palindrome" : "Not Palindrome";
        String recurResult = recursive ? "Palindrome" : "Not Palindrome";
        String arrResult = arrayReversal ? "Palindrome" : "Not Palindrome";

        System.out.println("\"" + text + "\" -> Iterative: " + iterResult + " | Recursive: " + recurResult + " | Array Reversal: " + arrResult);
    }

    public static void main(String[] args) {
        checkAndPrint("madam");
        checkAndPrint("hello");
    }
}