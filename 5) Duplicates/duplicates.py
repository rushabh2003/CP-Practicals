n = int(input("Enter n: "))
nums = list(map(int, input("Enter nums: ").split()))
mp = {}

for num in nums:
    mp[num] = mp.get(num, 0) + 1

print("Duplicate numbers:", end=" ")
for key, value in mp.items():
    if value > 1:
        print(key, end=" ")
