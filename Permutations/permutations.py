def generatePermutations(nums, ind, ans):
    if ind == len(nums):
        ans.append(nums[:])
        return

    for i in range(ind, len(nums)):
        nums[ind], nums[i] = nums[i], nums[ind]
        generatePermutations(nums, ind + 1, ans)
        nums[ind], nums[i] = nums[i], nums[ind]

n = int(input("Enter n: "))
nums = list(map(int, input("Enter nums: ").split()))
ans = []

generatePermutations(nums, 0, ans)

print("Permutations:")
for perm in ans:
    print(*perm)

