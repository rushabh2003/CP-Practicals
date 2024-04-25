#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

bool isPalindrome(int num) {
    string numStr = to_string(num);
    return numStr == string(numStr.rbegin(), numStr.rend());
}

pair<int, int> reverseAndAdd(int n) {
    int times = 0;
    while (!isPalindrome(n)) {
        string numStr = to_string(n);
        reverse(numStr.begin(), numStr.end());
        n += stoi(numStr);
        times++;
    }
    return make_pair(n, times);
}

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    pair<int, int> result = reverseAndAdd(n);
    cout << result.second << " " << result.first << endl;

    return 0;
}
