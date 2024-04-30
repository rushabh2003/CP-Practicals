MOD = int(1e9 + 7)

n = int(input("Enter n: "))

if n % 2 == 0:
    even = n // 2
    odd = n // 2

    ans = pow(5, even, MOD)
    ans *= pow(4, odd, MOD)
    ans %= MOD
    
    print(ans)
else:
    even = n // 2 + 1
    odd = n // 2

    ans = pow(5, even, MOD)
    ans *= pow(4, odd, MOD)
    ans %= MOD
    
    print(ans)
