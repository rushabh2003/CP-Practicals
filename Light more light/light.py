import math

def is_perfect_square(n):
    root = math.isqrt(n)  # integer square root
    return root * root == n

# Example usage:
number = int(input("Enter n: "))
if is_perfect_square(number):
    print("yes")
else:
    print("no")
