import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n); 
        return root * root == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int number = sc.nextInt();

        if (isPerfectSquare(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
