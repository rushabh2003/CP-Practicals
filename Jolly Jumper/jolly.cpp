#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {

    int n;
    bool jolly = true;
    cout << "Enter n: ";
    cin >> n;

    vector<int> arr(n, -1);

    cout << "Enter array: ";
    for(int i=0; i<n; i++) cin >> arr[i];

    vector<int> diffs;
    
    for(int i=0;i<n - 1; i++) {
        diffs.push_back(abs(arr[i] - arr[i + 1]));
    }

    sort(diffs.begin(), diffs.end());

    for(int i=0; i<diffs.size(); i++) {
        if(i + 1 != diffs[i]) {
            jolly = false;
            break;
        }
    }

    if(jolly) {
        cout << "Jolly" << endl;
    } else{
        cout << "Not Jolly" << endl;
    }

    return 0;
}