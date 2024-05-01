import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int countPrefixes(List<String> words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter words: ");
        String input = scanner.nextLine();
        String[] wordsArray = input.split(" ");
        List<String> words = new ArrayList<>();
        for (String word : wordsArray) {
            words.add(word);
        }

        System.out.print("Enter s: ");
        String s = scanner.next();

        int result = countPrefixes(words, s);
        System.out.println(result);
    }
}
