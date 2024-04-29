#include <bits/stdc++.h>
using namespace std;

void gP(int ind, vector<int> &nums, vector<vector<int>> &ans)
{
    if (ind == nums.size())
    {
        ans.push_back(nums);
        return;
    }

    for (int i = ind; i < nums.size(); i++)
    {
        swap(nums[i], nums[ind]);
        gP(ind + 1, nums, ans);
        swap(nums[i], nums[ind]);
    }
}

int main()
{

    int n;
    cout << "Enter n: ";
    cin >> n;

    vector<int> nums(n, 0);
    vector<vector<int>> ans;

    cout << "Enter nums: ";

    for (int i = 0; i < n; i++)
    {
        cin >> nums[i];
    }

    gP(0, nums, ans);

    cout << "Permutations: " << endl;
    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[i].size(); j++)
        {
            cout << ans[i][j] << " ";
        }
        cout << endl;
    }
}