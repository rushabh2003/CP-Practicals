#include <iostream>
#include <cmath>
using namespace std;

bool isPerfectSquare(int n) {
    int root = (int)sqrt(n); 
    return root * root == n;
}

int main() {
    int number;
    cout << "Enter n: ";
    cin >> number;

    if (isPerfectSquare(number)) {
        cout << "yes" << endl;
    } else {
        cout << "no" << endl;
    }

    return 0;
}
