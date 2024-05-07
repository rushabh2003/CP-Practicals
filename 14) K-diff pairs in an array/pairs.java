import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n, k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter nums: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int cnt = 0;
        int i = 0, j = 1;
        while (j < n) {
            int diff = nums[j] - nums[i];
            if (diff == k) {
                cnt++;
                i++;
                j++;
            } else if (diff < k) {
                j++;
            } else {
                i++;
            }
            if (i == j) j++;
        }

        System.out.println(cnt);
        
        sc.close();
    }
}
