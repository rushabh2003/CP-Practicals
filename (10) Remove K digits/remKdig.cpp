#include <iostream>
#include <string>
#include <stack>
using namespace std;

string removeKDigits(string num, int k) {
    int n = num.size();
    stack<char> s;

    for (char digit : num) {
        while (k > 0 && !s.empty() && s.top() > digit) {
            s.pop();
            k--;
        }
        if (!s.empty() || digit != '0') {
            s.push(digit);
        }
    }

    while (k > 0 && !s.empty()) {
        s.pop();
        k--;
    }

    string result;
    while (!s.empty()) {
        result = s.top() + result;
        s.pop();
    }

    return result.empty() ? "0" : result;
}

int main() {
    string num;
    int k;

    cout << "Enter num: ";
    cin >> num;
    cout << "Enter k: ";
    cin >> k;

    string result = removeKDigits(num, k);
    cout << result << endl;

    return 0;
}
