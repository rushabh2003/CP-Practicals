import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int findWinner(int n, int k) {
        List<Integer> friends = new LinkedList<>();
        for (int i = 1; i <= n; ++i) {
            friends.add(i);
        }

        int current = 0;
        while (friends.size() > 1) {
            current = (current + k - 1) % friends.size();
            friends.remove(current);
        }
        return friends.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int winner = findWinner(n, k);
        System.out.println(winner);
        
        sc.close();
    }
}
