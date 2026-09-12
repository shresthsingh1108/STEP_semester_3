package string.class_problems;

public class Vowelsconsonants {

    public static void countVowelsAndConsonants(String text) {
        if (text == null) {
            System.out.println("Vowels: 0 | Consonants: 0");
            return;
        }

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void countVowelsconsonants(String text) {
        countVowelsAndConsonants(text);
    }

    public static void main(String[] args) {
        String sample = "Java Programming";
        System.out.print("\"" + sample + "\" -> ");
        countVowelsAndConsonants(sample);
    }
}