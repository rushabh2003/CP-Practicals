import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter nums: ");
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        
        int cnt = 0;
        int median = nums[n / 2];
        for (int i : nums) {
            cnt += Math.abs(i - median);
        }

        System.out.println(cnt);
        
        sc.close();
    }
}
