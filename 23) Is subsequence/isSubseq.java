import java.util.Scanner;

public class Main {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.nextLine();
        System.out.print("Enter t: ");
        String t = sc.nextLine();
        System.out.println(isSubsequence(s, t));
        sc.close();
    }
}
