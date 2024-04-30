def diffWaysToCompute(s):
    result = []

    for i in range(len(s)):
        c = s[i]
        if c in ['+', '-', '*']:
            left = diffWaysToCompute(s[:i])
            right = diffWaysToCompute(s[i + 1:])

            for l in left:
                for r in right:
                    if c == '+':
                        result.append(l + r)
                    elif c == '-':
                        result.append(l - r)
                    elif c == '*':
                        result.append(l * r)

    if not result:
        result.append(int(s))

    return result

s = input("Enter s: ")
result = diffWaysToCompute(s)

print(",".join(map(str, result)))
