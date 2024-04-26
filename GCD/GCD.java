import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1, num2: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = gcd(num1, num2);
        System.out.println("GCD: " + result);

        sc.close();
    }
}
