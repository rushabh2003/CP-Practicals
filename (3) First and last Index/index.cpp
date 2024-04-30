#include <iostream>
using namespace std;

int find_Occurrence(int arr[], int size, int key, bool isFirst)
{
    int start = 0;
    int end = size - 1;
    int mid;
    int ans = -1;
    while (start <= end)
    {
        mid = start + (end - start) / 2;
        if (arr[mid] == key)
        {
            ans = mid;
            if (isFirst)
                end = mid - 1;
            else
                start = mid + 1;
        }
        else if (arr[mid] < key)
        {
            start = mid + 1;
        }
        else // arr[mid] > key
        {
            end = mid - 1;
        }
    }
    return ans;
}

int main()
{

    int n, temp;
    cout << "Enter the size of array: ";
    cin >> n;

    int a[n];
    cout << "Enter the elements of array: ";
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    // Sorting array
    sort(a, a+n)

    cout << "Therefore, the sorted array is " << endl;
    for (int i = 0; i < size; i++)
    {
        cout << a[i] << " ";
    }

    int key;
    cout << "\nEnter the key: ";
    cin >> key;

    int first = find_Occurrence(a, size, key, true);
    int last = find_Occurrence(a, size, key, false);
    cout << "First Occurrence of " << key << " is index " << first << endl;
    cout << "Last Occurrence of " << key << " is index " << last << endl;

    return 0;
}
