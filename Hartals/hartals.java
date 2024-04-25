import java.util.Scanner;
import java.util.ArrayList;

public class Hartals {
    public static int countHartals(int N, ArrayList<Integer> hartalGaps) {
        int hartals = 0;
        for (int day = 1; day <= N; ++day) {
            if (day % 7 == 6 || day % 7 == 0)
                continue;
            for (int h : hartalGaps) {
                if (day % h == 0) {
                    hartals++;
                    break;
                }
            }
        }
        return hartals;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of days: ");
        int N = scanner.nextInt();
        System.out.print("Enter no. of parties: ");
        int m = scanner.nextInt();
        ArrayList<Integer> hartalGaps = new ArrayList<>();
        System.out.print("Enter gaps: ");
        for (int i = 0; i < m; ++i) {
            hartalGaps.add(scanner.nextInt());
        }

        int totalHartals = countHartals(N, hartalGaps);
        System.out.println("Total hartals in " + N + " days: " + totalHartals);

        scanner.close();
    }
}
