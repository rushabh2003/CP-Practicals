#include <bits/stdc++.h>
using namespace std;

vector<vector<string>> groupAnagrams(vector<string>& strs) {
    unordered_map<string, vector<string>> mp;
    for (string s : strs) {
        string sorted_str = s;
        sort(sorted_str.begin(), sorted_str.end());
        mp[sorted_str].push_back(s);
    }
    vector<vector<string>> result;
    for (auto it : mp) {
        result.push_back(it.second);
    }
    return result;
}

int main() {
    int n;
    cout << "Enter no. of strings: ";
    cin >> n;

    vector<string> strs(n);
    cout << "Enter the strings:" << endl;
    for (int i = 0; i < n; ++i) {
        cin >> strs[i];
    }

    vector<vector<string>> result = groupAnagrams(strs);
    
    for (vector<string> group : result) {
        for (int i = 0; i < group.size(); ++i) {
            cout << group[i] << " ";
        }
        cout << endl;
    }

    return 0;
}
