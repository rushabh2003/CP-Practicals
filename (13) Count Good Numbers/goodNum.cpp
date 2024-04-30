#include <iostream>
using namespace std;
const int MOD = 1000000007;

long long power(long long base, long long exp, int mod) {
    long long result = 1;
    while (exp > 0) {
        if (exp % 2 == 1) {
            result = (result * base) % mod;
        }
        base = (base * base) % mod;
        exp /= 2;
    }
    return result;
}

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    long long even, odd;
    long long ans;

    if (n % 2 == 0) {
        even = n / 2;
        odd = n / 2;

        ans = power(5, even, MOD);
        ans *= power(4, odd, MOD);
        ans %= MOD;
    } else {
        even = n / 2 + 1;
        odd = n / 2;

        ans = power(5, even, MOD);
        ans *= power(4, odd, MOD);
        ans %= MOD;
    }

    cout << ans << endl;

    return 0;
}
