n = int(input("Enter n: "))
nums = list(map(int, input("Enter nums: ").split()))
nums.sort()
ans = []

for i in range(n):
    j, k = i + 1, n - 1
    while j < k:
        _sum = nums[i] + nums[j] + nums[k]
        if _sum == 0:
            ans.append([nums[i], nums[j], nums[k]])
            break
        elif _sum > 0:
            k -= 1
        elif _sum < 0:
            j += 1

print("Triplets:")
for triplet in ans:
    print(*triplet)
