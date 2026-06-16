import java.util.ArrayList;
import java.util.List;

public class Program_8 {
    public static void main(String[] args) {
        String[] words = {
            "cat",
            "dog",
            "red",
            "is",
            "am"
        };

        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        List<String> longestWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println("Longest word(s): " + longestWords);
    }
}