import java.util.*;

public class Main {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted_str = new String(chars);
            map.computeIfAbsent(sorted_str, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; ++i) {
            strs[i] = sc.nextLine();
        }

        List<List<String>> result = groupAnagrams(strs);
        System.out.println("Output:");
        for (List<String> group : result) {
            for (int i = 0; i < group.size(); ++i) {
                System.out.print(group.get(i) + " ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}
