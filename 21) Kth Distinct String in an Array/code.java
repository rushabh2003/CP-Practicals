import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n, k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        String[] arr = new String[n];
        Map<String, Integer> mp = new HashMap<>();
        
        System.out.print("Enter strings:\n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        
        String ans = "";
        for (String str : arr) {
            if (mp.get(str) == 1) {
                if (k == 1) {
                    ans = str;
                    break;
                } else {
                    k--;
                }
            }
        }
        
        if (ans.isEmpty()) {
            System.out.println("\nans: ");
        } else {
            System.out.println("\nans: " + ans);
        }
        
        sc.close();
    }
}
