#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector<int> diffWaysToCompute(string s) {
    vector<int> result;

    for (int i = 0; i < s.size(); ++i) {
        char c = s[i];
        if (c == '+' || c == '-' || c == '*') {
            vector<int> left = diffWaysToCompute(s.substr(0, i));
            vector<int> right = diffWaysToCompute(s.substr(i + 1));

            for (int l : left) {
                for (int r : right) {
                    if (c == '+') result.push_back(l + r);
                    else if (c == '-') result.push_back(l - r);
                    else if (c == '*') result.push_back(l * r);
                }
            }
        }
    }

    if (result.empty()) {
        result.push_back(stoi(s));
    }

    return result;
}

int main() {
    string s;
    cout << "Enter s: ";
    cin >> s;
    vector<int> result = diffWaysToCompute(s);

    for (int i = 0; i < result.size(); ++i) {
        cout << result[i];
        if (i < result.size() - 1) cout << ",";
    }

    return 0;
}
