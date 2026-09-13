import java.util.Scanner;

public class LibraryISBNValidator {

    static String normalizeCode(String raw) {

        String code = raw.trim();

        String publisher = code.substring(0, 3).toUpperCase();

        return publisher + code.substring(3);
    }

    static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(code.substring(0, 3));
        result.append("] YEAR: ");
        result.append(code.substring(3, 7));
        result.append(" | CATALOG: ");
        result.append(code.substring(7, 13));

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ISBN-style code: ");
        String rawCode = scanner.nextLine();

        String normalizedCode = normalizeCode(rawCode);

        String result = validateAndFormat(normalizedCode);

        System.out.println(result);

        scanner.close();
    }
}