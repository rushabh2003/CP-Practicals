#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int minDistanceToRelatives(vector<int>& houses) {
    sort(houses.begin(), houses.end());

    int medianIndex = houses.size() / 2;
    int medianHouse = houses[medianIndex];

    int totalDist = 0;
    for (int house : houses) {
        totalDist += abs(house - medianHouse);
    }

    return totalDist;
}

int main() {
    int n;
    cout << "Enter no. of houses: ";
    cin >> n;

    vector<int> houses(n);
    cout << "Enter houses: ";
    for (int i = 0; i < n; ++i) {
        cin >> houses[i];
    }

    int minDist = minDistanceToRelatives(houses);
    cout << minDist << endl;

    return 0;
}
