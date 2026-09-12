package string.class_problems;

public class FileExtensionValidator {

    public static String validateFileExtension(String filename) {
        if (filename == null) {
            return "Rejected â€” invalid file type";
        }

        int dot = filename.lastIndexOf('.');

        if (dot == -1 || dot == filename.length() - 1) {
            return "Rejected â€” invalid file type";
        }

        String extension = filename.substring(dot + 1);

        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        }

        return "Rejected â€” invalid file type";
    }

    public static void main(String[] args) {
        System.out.println("\"Assignment1.PDF\" -> " + validateFileExtension("Assignment1.PDF"));
        System.out.println("\"notes.txt\" -> " + validateFileExtension("notes.txt"));
    }
}