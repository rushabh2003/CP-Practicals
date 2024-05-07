#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k, cnt = 0;
    cout << "Enter n, k: ";
    cin >> n >> k;

    vector<int> nums(n);
    
    cout << "Enter nums: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    sort(nums.begin(), nums.end());
    
    int i = 0, j = 1;
    while (j < n) {
        int diff = nums[j] - nums[i];
        if (diff == k) {
            cnt++;
            i++;
            j++;
        } else if (diff < k) {
            j++;
        } else {
            i++;
        }
        if (i == j) j++;
    }

    cout << cnt << endl;

    return 0;
}
