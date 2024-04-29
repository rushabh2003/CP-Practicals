import java.util.Scanner;

public class Main {

    static boolean isPrime(int x) {
        int s = (int) Math.sqrt(x);
        for (int i = 2; i <= s; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    static void Num(int x, int[] ab) {
        for (int i = 2; i <= x / 2; i++) {
            if (isPrime(i) && isPrime(x - i)) {
                ab[0] = i;
                ab[1] = x - i;
                return;
            }
        }
    }

    static void generate(int n) {
        if (n <= 7) {
            System.out.println("Impossible to form");
            return;
        }

        int[] ab = new int[2];

        if (n % 2 != 0) {
            Num(n - 5, ab);
            System.out.println("2 3 " + ab[0] + " " + ab[1]);
        } else {
            Num(n - 4, ab);
            System.out.println("2 2 " + ab[0] + " " + ab[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        generate(n);
        sc.close();
    }
}
