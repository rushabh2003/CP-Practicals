def reverse_and_add(n):
    def is_palindrome(num):
        return str(num) == str(num)[::-1]

    times = 0
    while not is_palindrome(n):
        n += int(str(n)[::-1])
        times += 1

    return n, times

n = int(input("Enter n: "))
result, times = reverse_and_add(n)
print(times, result)