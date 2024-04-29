def find_Occurrence(arr, key, isFirst):
    start = 0
    end = len(arr) - 1
    ans = -1
    while start <= end:
        mid = start + (end - start) // 2
        if arr[mid] == key:
            ans = mid
            if isFirst:
                end = mid - 1
            else:
                start = mid + 1
        elif arr[mid] < key:
            start = mid + 1
        else:  # arr[mid] > key
            end = mid - 1
    return ans

if __name__ == "__main__":
    n = int(input("Enter the size of array: "))
    a = list(map(int, input("Enter the elements of array: ").split()))

    # Sorting array
    a.sort()

    print("Therefore, the sorted array is:")
    print(*a)

    key = int(input("Enter the key: "))

    first = find_Occurrence(a, key, True)
    last = find_Occurrence(a, key, False)
    print("First Occurrence of", key, "is index", first)
    print("Last Occurrence of", key, "is index", last)
