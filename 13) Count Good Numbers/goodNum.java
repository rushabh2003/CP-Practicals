import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    static long power(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        long even, odd;
        long ans;

        if (n % 2 == 0) {
            even = n / 2;
            odd = n / 2;

            ans = power(5, even, MOD);
            ans = (ans * power(4, odd, MOD)) % MOD;
        } else {
            even = n / 2 + 1;
            odd = n / 2;

            ans = power(5, even, MOD);
            ans = (ans * power(4, odd, MOD)) % MOD;
        }

        System.out.println(ans);
    }
}
