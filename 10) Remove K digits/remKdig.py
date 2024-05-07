def remove_k_digits(num, k):
    stack = []

    for digit in num:
        while k > 0 and stack and stack[-1] > digit:
            stack.pop()
            k -= 1
        if stack or digit != '0':
            stack.append(digit)

    while k > 0 and stack:
        stack.pop()
        k -= 1

    result = ''.join(stack)
    return result if result else '0'

num = input("Enter num: ")
k = int(input("Enter k: "))

result = remove_k_digits(num, k)
print(result)