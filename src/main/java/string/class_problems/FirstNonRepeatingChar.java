package string.class_problems;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) {
            return '\0';
        }

        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void checkAndDisplay(String text) {
        char result = findFirstNonRepeatingChar(text);
        if (result != '\0') {
            System.out.println("\"" + text + "\" -> First Non-Repeating Character: '" + result + "'");
        } else {
            System.out.println("\"" + text + "\" -> No Non-Repeating Character Found");
        }
    }

    public static void main(String[] args) {
        checkAndDisplay("swiss");
        checkAndDisplay("aabbcc");
    }
}