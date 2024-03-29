n = int(input("Enter a positive integer: "))
print(f"The 3n + 1 sequence starting at {n} is:")

while n != 1:
    print(n, end=" ")
    if n % 2 == 0:
        n = n // 2
    else:
        n = 3 * n + 1
print(n)
