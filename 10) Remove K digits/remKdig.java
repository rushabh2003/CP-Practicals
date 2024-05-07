import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static String removeKDigits(String num, int k) {
        int n = num.length();
        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            if (!stack.isEmpty() || digit != '0') {
                stack.push(digit);
            }
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        String num = sc.next();
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        String result = removeKDigits(num, k);
        System.out.println(result);
        
        sc.close();
    }
}
