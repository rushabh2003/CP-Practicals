import java.util.HashMap;
import java.util.Scanner;

public class wertyu {

    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap<>();

        map.put('w', 'q');
        map.put('e', 'w');
        map.put('r', 'e');
        map.put('t', 'r');
        map.put('y', 't');
        map.put('u', 'y');
        map.put('i', 'u');
        map.put('o', 'i');
        map.put('p', 'o');
        map.put('[', 'p');
        map.put('s', 'a');
        map.put('d', 's');
        map.put('f', 'd');
        map.put('g', 'f');
        map.put('h', 'g');
        map.put('j', 'h');
        map.put('k', 'j');
        map.put('l', 'k');
        map.put(';', 'l');
        map.put('x', 'z');
        map.put('c', 'x');
        map.put('v', 'c');
        map.put('b', 'v');
        map.put('n', 'b');
        map.put('m', 'n');
        map.put(',', 'm');
        map.put(' ', ' ');

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter str: ");
        String inp = scanner.nextLine();

        String ans = "";
        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (map.containsKey(ch)) {
                ans += map.get(ch);
            } else {
                ans += ch;
            }
        }

        System.out.println("Ans: " + ans);
    }
}
