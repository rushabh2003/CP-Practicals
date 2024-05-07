#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cout << "Enter n, k: ";
    cin >> n >> k;
    vector<string> arr(n);
    map<string, int> mp;
    cout << "Enter strings: ";
    for(int i=0; i<n; i++) {
        cin >> arr[i];
        mp[arr[i]]++;
    }
    
    string ans;
    for(int i=0; i<n; i++) {
        if(mp[arr[i]] == 1) {
            if(k==1) {
                ans = arr[i];
                break;
            }
            else k--;
        }
    }
    
    if(ans.length() == 0) {
        cout << "ans: " << endl;
    } else {
        cout << "ans: " << ans << endl;
    }
    
    return 0;
}