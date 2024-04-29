import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || (c == ')' && stack.peek() != '(')
                        || (c == ']' && stack.peek() != '[')
                        || (c == '}' && stack.peek() != '{')) {
                    flag = false;
                    break;
                }
                stack.pop();
            }
        }

        if (flag && stack.isEmpty()) {
            System.out.println("Valid string");
        } else {
            System.out.println("Not a Valid string");
        }

        sc.close();
    }
}
