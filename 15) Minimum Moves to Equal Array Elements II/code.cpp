#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter nums: ";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    sort(nums.begin(), nums.end());
    
    int cnt = 0;
    int median = nums[n / 2];
    for (int i : nums) {
        cnt += abs(i - median);
    }

    cout << cnt << endl;

    return 0;
}
