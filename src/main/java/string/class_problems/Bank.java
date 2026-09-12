package string.class_problems;

public class Bank {

    public static String normalizeReference(String raw) {
        if (raw == null) return "";
        String reference = raw.trim();

        if (reference.length() >= 3) {
            reference = reference.substring(0, 3).toUpperCase() + reference.substring(3);
        }

        return reference;
    }

    public static String validateAndFormat(String reference) {
        if (reference == null || reference.length() != 14) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9, 14);

        String formattedDate = date.substring(0, 2) + "/"
                + date.substring(2, 4) + "/"
                + date.substring(4, 6);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(bankCode);
        sb.append("] DATE: ");
        sb.append(formattedDate);
        sb.append(" | SEQ: ");
        sb.append(sequence);

        return sb.toString();
    }

    public static void main(String[] args) {
        String raw1 = " hdf03022600042 ";
        String norm1 = normalizeReference(raw1);
        System.out.println("\"" + raw1 + "\" -> " + validateAndFormat(norm1));

        String raw2 = "12F03022600042";
        String norm2 = normalizeReference(raw2);
        System.out.println("\"" + raw2 + "\" -> " + validateAndFormat(norm2));
    }
}