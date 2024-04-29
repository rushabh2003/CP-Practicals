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
    vector<vector<int>> ans;

    cout << "Enter nums: ";

    for (int i = 0; i < n; i++)
    {
        cin >> nums[i];
    }

    sort(nums.begin(), nums.end());

    for (int i = 0; i < n; i++)
    {
        int j = i + 1, k = n - 1;

        while (j < k)
        {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0)
            {
                ans.push_back({nums[i], nums[j], nums[k]});
                break;
            }
            else if (sum > 0)
            {
                k--;
            }
            else if (sum < 0)
            {
                j++;
            }
        }
    }

    cout << "Triplets: " << endl;
    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << ans[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}