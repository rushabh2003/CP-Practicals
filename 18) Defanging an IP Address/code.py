#include <bits/stdc++.h>
using namespace std;

string defangIPaddr(string address) {
    string defangedIP;
    for (char c : address) {
        if (c == '.') {
            defangedIP += "[.]";
        } else {
            defangedIP += c;
        }
    }
    return defangedIP;
}

int main() {
    string address;
    cout << "Enter IP address: ";
    cin >> address;

    string defangedAddress = defangIPaddr(address);
    cout << defangedAddress << endl;

    return 0;
}
