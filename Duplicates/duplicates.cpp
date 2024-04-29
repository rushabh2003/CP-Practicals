#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

int main()
{

    int n;
    cout << "Enter n: ";
    cin >> n;

    vector<int> nums(n, 0);
    map<int, int> mp;

    cout << "Enter nums: ";

    for (int i = 0; i < n; i++)
    {
        cin >> nums[i];
        mp[nums[i]]++;
    }

    for (auto it : mp)
    {
        if (it.second > 1)
        {
            cout << it.first << " ";
        }
    }

    return 0;
}