import math

def is_prime(x):
    s = int(math.sqrt(x))
    for i in range(2, s + 1):
        if x % i == 0:
            return False
    return True

def Num(x):
    for i in range(2, x // 2 + 1):
        if is_prime(i) and is_prime(x - i):
            return [i, x - i]

def generate(n):
    if n <= 7:
        print("Impossible to form")
        return

    ab = [0, 0]

    if n % 2 != 0:
        ab = Num(n - 5)
        print("2 3 {} {}".format(ab[0], ab[1]))
    else:
        ab = Num(n - 4)
        print("2 2 {} {}".format(ab[0], ab[1]))

if __name__ == "__main__":
    n = int(input("Enter n: "))
    generate(n)
