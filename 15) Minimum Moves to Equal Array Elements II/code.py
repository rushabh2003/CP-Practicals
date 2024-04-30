n = int(input("Enter n: "))
nums = list(map(int, input("Enter nums: ").split()))

nums.sort()
cnt = 0

median = nums[n//2]

for i in nums:
    cnt += abs(i - median)

print(cnt)