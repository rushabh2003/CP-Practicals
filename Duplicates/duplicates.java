import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();

        System.out.print("Enter nums: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        System.out.print("Duplicate numbers: ");
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

        sc.close();
    }
}
