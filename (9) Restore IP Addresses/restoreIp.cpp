#include <iostream>
#include <vector>
#include <string>
using namespace std;

bool isValid(string s) {
    if (s.length() > 3 || s.empty() || (s[0] == '0' && s.length() > 1) || stoi(s) > 255) {
        return false;
    }
    return true;
}

vector<string> restoreIpAddresses(string s) {
    vector<string> result;
    int n = s.size();

    for (int i = 1; i < 4 && i < n - 2; ++i) {
        for (int j = i + 1; j < i + 4 && j < n - 1; ++j) {
            for (int k = j + 1; k < j + 4 && k < n; ++k) {
                string a = s.substr(0, i);
                string b = s.substr(i, j - i);
                string c = s.substr(j, k - j);
                string d = s.substr(k);

                if (isValid(a) && isValid(b) && isValid(c) && isValid(d)) {
                    result.push_back(a + "." + b + "." + c + "." + d);
                }
            }
        }
    }

    return result;
}

int main() {
    string s;
    cout << "Enter str: ";
    cin >> s;

    vector<string> ips = restoreIpAddresses(s);

    cout << "Valid IP addresses: ";
    for (const string& ip : ips) {
        cout << ip << " ";
    }
    cout << endl;

    return 0;
}
