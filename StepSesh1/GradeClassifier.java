import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        int attendance = sc.nextInt();

        if (!(attendance >= 75 && marks >= 40)) {
            System.out.println("Detained");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}