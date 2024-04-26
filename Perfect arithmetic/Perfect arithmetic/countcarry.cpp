#include <iostream>
using namespace std;

int countCarry(int a, int b) {
    int carry = 0;
    int carryCount = 0;
    while (a > 0 || b > 0) {
        int digitA = a % 10;
        int digitB = b % 10;
        int sum = digitA + digitB + carry;
        carry = sum / 10;
        if (carry > 0) {
            carryCount++;
        }
        a /= 10;
        b /= 10;
    }
    return carryCount;
}

int main() {
    int n1, n2;
    cout << "Enter n1, n2: ";
    cin >> n1 >> n2;
    
    cout << countCarry(n1, n2) << " carry operations" << endl;
    return 0;
}
