import java.util.Scanner;

public class ATM_PinRetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPin = sc.nextLine();

        String[] attempts = new String[3];

        for (int i = 0; i < 3; i++) {
            attempts[i] = sc.nextLine();
        }

        int attempt = 0;
        boolean success = false;

        while (attempt < attempts.length && !success) {
            if (attempts[attempt].equals(correctPin)) {
                System.out.println("PIN accepted");
                success = true;
                break;
            }

            attempt++;
        }

        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }
}