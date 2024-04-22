import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Jolly {

    public static boolean isJollyJumper(ArrayList<Integer> sequence) {
        int n = sequence.size();

        if (n == 1) {
            return true;
        }

        HashSet<Integer> differences = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(sequence.get(i + 1) - sequence.get(i));
            if (diff == 0) {
                continue; 
            }
            differences.add(diff);
        }
        
        for (int i = 1; i < n; i++) {
            if (!differences.contains(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        ArrayList<Integer> sequence = new ArrayList<>();
        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            sequence.add(scanner.nextInt());
        }

        if (isJollyJumper(sequence)) {
            System.out.println("Jolly");
        } else {
            System.out.println("Not jolly");
        }

        scanner.close();
    }
}
