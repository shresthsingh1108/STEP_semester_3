package string.assigment_problems;

public class IsbnValidator {

    public static String normalizeCode(String raw) {
        if (raw == null) return "";
        String code = raw.trim();
        if (code.length() >= 3) {
            code = code.substring(0, 3).toUpperCase() + code.substring(3);
        }
        return code;
    }

    public static String validateAndFormat(String code) {
        if (code == null || code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(pubCode);
        sb.append("] YEAR: ");
        sb.append(year);
        sb.append(" | CATALOG: ");
        sb.append(catalog);

        return sb.toString();
    }

    public static void main(String[] args) {
        String raw1 = " pen2026004251 ";
        String norm1 = normalizeCode(raw1);
        System.out.println("\"" + raw1 + "\" -> " + validateAndFormat(norm1));

        String raw2 = "12N2026004251";
        String norm2 = normalizeCode(raw2);
        System.out.println("\"" + raw2 + "\" -> " + validateAndFormat(norm2));
    }
}