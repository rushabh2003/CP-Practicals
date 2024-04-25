#include <iostream>
#include <vector>

using namespace std;

int countHartals(int N, vector<int>& hartalGaps) {
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

int main() {
    int N, m;
    cout << "Enter no. of days: ";
    cin >> N;
    cout << "Enter no. of parties: ";
    cin >> m;
    vector<int> hartalGaps(m);
    cout << "Enter gaps: ";
    for (int i = 0; i < m; ++i) {
        cin >> hartalGaps[i];
    }

    int totalHartals = countHartals(N, hartalGaps);
    cout << "Total hartals in " << N << " days: " << totalHartals << endl;

    return 0;
}
