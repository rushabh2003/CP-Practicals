import java.util.Scanner;

public class Main {
    public static String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx != -1) {
            StringBuilder sb = new StringBuilder(word.substring(0, idx + 1));
            return sb.reverse().toString() + word.substring(idx + 1);
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.next();
        System.out.print("Enter character: ");
        String ch = sc.next();

        String result = reversePrefix(word, ch.charAt(0));
        System.out.println("Result: " + result);
    }
}
