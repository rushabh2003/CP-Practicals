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
        System.out.print("Enter nums: ");
        String[] numsStr = sc.nextLine().split(" ");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }
        
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        }
        
        int result = gcd(mini, maxi);
        System.out.println(result);
    }
}
