#include <iostream>
#include <vector>

using namespace std;

bool searchMatrix(vector<vector<int>>& matrix, int target) {
    if (matrix.empty() || matrix[0].empty()) return false;
    
    int n = matrix.size();
    int m = matrix[0].size();
    
    int low = 0, high = n * m - 1;
    
    while (low <= high) {
        int mid = low + (high - low) / 2;
        int row = mid / n;
        int col = mid % n;
        
        if (matrix[row][col] == target) {
            return true;
        } else if (matrix[row][col] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    
    return false;
}

int main() {
    int n, m;
    cout << "Enter n, m: ";
    cin >> n >> m;

    vector<vector<int>> matrix(n, vector<int>(m));
    cout << "Enter matrix:" << endl;
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            cin >> matrix[i][j];
        }
    }

    int target;
    cout << "Enter target: ";
    cin >> target;

    bool result = searchMatrix(matrix, target);
    if (result) {
        cout << "true" << endl;
    } else {
        cout << "false" << endl;
    }

    return 0;
}
