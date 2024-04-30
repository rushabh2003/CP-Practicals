import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void generatePermutations(int[] nums, int ind, List<List<Integer>> ans) {
        if (ind == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            ans.add(perm);
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            int temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp;

            generatePermutations(nums, ind + 1, ans);

            temp = nums[ind];
            nums[ind] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter nums: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> ans = new ArrayList<>();
        generatePermutations(nums, 0, ans);

        System.out.println("Permutations:");
        for (List<Integer> perm : ans) {
            for (int num : perm) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
