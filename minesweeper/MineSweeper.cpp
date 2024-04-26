#include <iostream>
#include <vector>

int main() {
    int n, m, bombs = 0;

    std::cout << "Welcome to Minesweeper!\nLet's play!!\n";
    std::cout << "Remember: - for safe, * for bomb\n";

    // Get input for n and m
    std::cout << "Enter n, m: ";
    if (!(std::cin >> n >> m)) {
        std::cerr << "Invalid input. Please enter two integers.\n";
        return 1;
    }

    // Create a 2D vector to store the minefield
    std::vector<std::vector<char>> ms(n, std::vector<char>(m));

    // Read the minefield
    for (int row = 0; row < n; ++row) {
        for (int col = 0; col < m; ++col) {
            char ch;
            do {
                std::cout << "Enter * or -: ";
                std::cin >> ch;
            } while (ch != '*' && ch != '-');
            ms[row][col] = ch;
            if (ch == '*') {
                ++bombs;
            }
        }
    }

    // Calculate neighboring bombs
    for (int row = 0; row < n; ++row) {
        for (int col = 0; col < m; ++col) {
            if (ms[row][col] == '-') {
                int neighbor_bombs = 0;
                for (int x = -1; x <= 1; ++x) {
                    for (int y = -1; y <= 1; ++y) {
                        int drow = row + x, dcol = col + y;
                        if (drow >= 0 && drow < n && dcol >= 0 && dcol < m && ms[drow][dcol] == '*') {
                            ++neighbor_bombs;
                        }
                    }
                }
                ms[row][col] = neighbor_bombs + '0'; // Convert to ASCII digit
            }
        }
    }

    // Print the final minesweeper
    std::cout << "Final Minesweeper: \n";
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            std::cout << ms[i][j] << " ";
        }
        std::cout << "\n";
    }

    return 0;
}