import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter nums: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    break;
                } else if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                }
            }
        }

        System.out.println("Triplets:");
        for (List<Integer> triplet : ans) {
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
