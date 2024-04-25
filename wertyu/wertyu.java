import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class wertyu {
    public static void main(String[] args) {
        Map<Character, Character> mp = new HashMap<>();
        mp.put('w', 'q');
        mp.put('e', 'w');
        // Add other character mappings here...

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(mp.getOrDefault(c, c));
        }

        System.out.println("Mapped string: " + result);
    }
}
