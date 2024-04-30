import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> diffWaysToCompute(String s) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(s.substring(0, i));
                List<Integer> right = diffWaysToCompute(s.substring(i + 1));

                for (int l : left) {
                    for (int r : right) {
                        if (c == '+') result.add(l + r);
                        else if (c == '-') result.add(l - r);
                        else if (c == '*') result.add(l * r);
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(s));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();

        List<Integer> result = diffWaysToCompute(s);

        for (int i = 0; i < result.size(); ++i) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) System.out.print(",");
        }
        
        sc.close();
    }
}
