import java.util.*;

public class Main {
    public static int maxProduct(String[] words) {
        int maxProduct = 0;
        int[] wordBits = new int[words.length];
        
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                wordBits[i] |= 1 << (c - 'a');
            }
        }
        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((wordBits[i] & wordBits[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
            }
        }
        
        return maxProduct;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words: ");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        System.out.println(maxProduct(words));

        sc.close();
    }
}
