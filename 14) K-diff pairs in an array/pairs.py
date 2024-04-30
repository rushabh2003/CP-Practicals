n, k = map(int, input("Enter n, k: ").split())
nums = list(map(int, input("Enter nums: ").split()))

nums.sort()

cnt = 0
i, j = 0, 1
while j < n:
    diff = nums[j] - nums[i]
    if diff == k:
        cnt += 1
        i += 1
        j += 1
    elif diff < k:
        j += 1
    else:
        i += 1
    if i == j:
        j += 1

print(cnt)
