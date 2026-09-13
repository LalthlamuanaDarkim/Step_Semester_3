import java.util.*;

public class StopWordFrequencyReport {

    static void printFilteredWordFrequency(String feedback) {

        String[] stopWordArray = {
            "the", "was", "and", "a", "is", "of", "in"
        };

        HashSet<String> stopWords = new HashSet<>();

        for (String stopWord : stopWordArray) {
            stopWords.add(stopWord);
        }

        feedback = feedback.toLowerCase();

        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            if (stopWords.contains(word)) {
                continue;
            }

            frequency.put(
                word,
                frequency.getOrDefault(word, 0) + 1
            );
        }

        List<Map.Entry<String, Integer>> entries =
            new ArrayList<>(frequency.entrySet());

        entries.sort(
            (a, b) -> b.getValue() - a.getValue()
        );

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(
                entry.getKey() + ": " + entry.getValue()
            );
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter feedback: ");
        String feedback = scanner.nextLine();

        printFilteredWordFrequency(feedback);

        scanner.close();
    }
}