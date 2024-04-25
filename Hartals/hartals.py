def count_hartals(N, hartal_gaps):
    hartals = 0
    for day in range(1, N + 1):
        if day % 7 == 6 or day % 7 == 0:
            continue
        for h in hartal_gaps:
            if day % h == 0:
                hartals += 1
                break
    return hartals


N = int(input("Enter no. of days: "))
m = int(input("Enter no. of parties: "))
hartal_gaps = list(map(int, input("Enter gaps: ").split()))

total_hartals = count_hartals(N, hartal_gaps)
print("Total hartals in {} days:".format(N), total_hartals)
