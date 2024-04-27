import java.util.Scanner;

public class Main {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n, m: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter matrix:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        boolean result = searchMatrix(matrix, target);
        System.out.println(result ? "true" : "false");

        scanner.close();
    }
}
