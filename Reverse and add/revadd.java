import java.util.Scanner;

public class ReverseAndAdd {

    static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }

    static int[] reverseAndAdd(int n) {
        int times = 0;
        while (!isPalindrome(n)) {
            n += Integer.parseInt(new StringBuilder(Integer.toString(n)).reverse().toString());
            times++;
        }
        return new int[]{n, times};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] result = reverseAndAdd(n);
        System.out.println(result[1] + " " + result[0]);

        sc.close();
    }
}
