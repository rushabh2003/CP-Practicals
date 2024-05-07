def gcd(a, b):
    while b:
        a, b = b, a % b
    return a
    

nums = list(map(int, input("Enter nums: ").split()))
mini = min(nums)
maxi = max(nums)

result = gcd(mini, maxi)
print(result)