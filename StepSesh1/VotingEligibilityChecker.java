import java.util.Scanner;
public class VotingEligibilityChecker {
    void checkVotingEligibilty(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        VotingEligibilityChecker checker = new VotingEligibilityChecker();
        checker.checkVotingEligibilty(age);
    }
}