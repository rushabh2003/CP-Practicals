import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int minDistanceToRelatives(int[] houses) {
        Arrays.sort(houses);

        int medianIndex = houses.length / 2;
        int medianHouse = houses[medianIndex];

        int totalDist = 0;
        for (int house : houses) {
            totalDist += Math.abs(house - medianHouse);
        }

        return totalDist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of houses: ");
        int n = sc.nextInt();

        int[] houses = new int[n];
        System.out.print("Enter houses: ");
        for (int i = 0; i < n; ++i) {
            houses[i] = sc.nextInt();
        }

        int minDist = minDistanceToRelatives(houses);
        System.out.println(minDist);

        sc.close();
    }
}
