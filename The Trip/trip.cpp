#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

double minMoneyExchange(const vector<double>& expenses) {
    double totalExpenses = 0;
    for (double expense : expenses) {
        totalExpenses += expense;
    }
    cout << fixed;
    cout.precision(2);
    cout << totalExpenses << endl;

    double equalShare = totalExpenses / expenses.size();

    double moneyExchange = 0;
    for (double expense : expenses) {
        moneyExchange += abs(expense - equalShare);
    }

    return moneyExchange;
}

int main() {
    int n;
    cout << "Enter no. of friends: ";
    cin >> n;

    vector<double> expenses(n);
    cout << "Enter expenses: ";
    for (int i = 0; i < n; ++i) {
        cin >> expenses[i];
    }

    double minMoney = minMoneyExchange(expenses);
    cout << round(minMoney / 2 * 100) / 100 << endl;

    return 0;
}
