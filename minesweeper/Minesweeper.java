
import java.util.Scanner;

class Minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Minesweeper!\nLet's play!!\n");
        System.out.println("Remember: - for safe, * for bomb\n");

        // Get input for n and m
        int n, m, bombs = 0;
        System.out.print("Enter n, m: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter two integers: ");
            scanner.next();
        }
        n = scanner.nextInt();
        m = scanner.nextInt();

        // Create and initialize the minefield
        char[][] ms = new char[n][m];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                char ch;
                do {
                    System.out.print("Enter * or -: ");
                    ch = scanner.next().charAt(0);
                } while (ch != '*' && ch != '-');
                ms[row][col] = ch;
                if (ch == '*') {
                    bombs++;
                }
            }
        }

        // Calculate neighboring bombs
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (ms[row][col] == '-') {
                    int neighbor_bombs = 0;
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            int drow = row + x, dcol = col + y;
                            if (drow >= 0 && drow < n && dcol >= 0 && dcol < m && ms[drow][dcol] == '*') {
                                neighbor_bombs++;
                            }
                        }
                    }
                    ms[row][col] = (char) (neighbor_bombs + '0'); // Convert to ASCII digit
                }
            }
        }

        // Print the final minesweeper
        System.out.println("Final Minesweeper: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ms[i][j] + " ");
            }
            System.out.println();
        }
    }
}