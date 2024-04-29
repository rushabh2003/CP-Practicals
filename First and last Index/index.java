import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int find_Occurrence(int[] arr, int key, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Sorting array
        Arrays.sort(a);

        System.out.println("Therefore, the sorted array is:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        int first = find_Occurrence(a, key, true);
        int last = find_Occurrence(a, key, false);
        System.out.println("First Occurrence of " + key + " is index " + first);
        System.out.println("Last Occurrence of " + key + " is index " + last);

        scanner.close();
    }
}
