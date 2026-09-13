import java.util.Scanner;

public class WordReversalEncoder {

    static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder word = new StringBuilder(words[i]);

            word.reverse();

            result.append(word);

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseEachWord(sentence);

        System.out.println(reversedSentence);

        scanner.close();
    }
}