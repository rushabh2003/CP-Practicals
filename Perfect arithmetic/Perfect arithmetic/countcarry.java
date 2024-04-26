import java.util.Scanner;

public class CarryCounter {

    public static int countCarry(int a, int b) {
        int carry = 0;
        int carryCount = 0;
        while (a > 0 || b > 0) {
            int digitA = a % 10;
            int digitB = b % 10;
            int sum = digitA + digitB + carry;
            carry = sum / 10;
            if (carry > 0) {
                carryCount++;
            }
            a /= 10;
            b /= 10;
        }
        return carryCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        sc.close();

        System.out.println(countCarry(n1, n2) + " carry operations");
    }
}
