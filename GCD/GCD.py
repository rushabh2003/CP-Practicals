def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

num1, num2 = map(int, input("Enter num1, num2: ").split())
result = gcd(num1, num2)
print("GCD: ", gcd)
