#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;
    cout << "Enter nums: ";
    vector<int> nums(n);
    for(int i=0; i<n; i++) cin >> nums[i];
    
    int mini = *min_element(nums.begin(), nums.end());
    int maxi = *max_element(nums.begin(), nums.end());

    int result = gcd(mini, maxi);
    cout << result << endl;

    return 0;
}
