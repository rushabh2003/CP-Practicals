#include <iostream>
#include <list>
using namespace std;

int findWinner(int n, int k) {
    list<int> friends;
    for (int i = 1; i <= n; ++i) {
        friends.push_back(i);
    }
    
    auto current = friends.begin();
    while (friends.size() > 1) {
        for (int count = 1; count < k; ++count) {
            ++current;
            if (current == friends.end()) {
                current = friends.begin();
            }
        }
        auto nextt = next(current);
        if (nextt == friends.end()) {
            nextt = friends.begin();
        }
        friends.erase(current);
        current = nextt;
    }
    return friends.front();
}

int main() {
    int n, k;
    cout << "Enter n: ";
    cin >> n;
    cout << "Enter k: ";
    cin >> k;
    int winner = findWinner(n, k);
    cout << winner << endl;
    return 0;
}
