def count_carry(a, b):
    carry = 0
    carry_count = 0
    while a > 0 or b > 0:
        digit_a = a % 10
        digit_b = b % 10
        carry, digit_sum = divmod(digit_a + digit_b + carry, 10)
        if carry > 0:
            carry_count += 1
        a //= 10
        b //= 10
    return carry_count

n1, n2 = map(int, input("Enter n1, n2: ").split())
print(count_carry(n1, n2), "carry operations.")
