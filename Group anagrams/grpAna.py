def groupAnagrams(strs):
    groups = {}
    for s in strs:
        sorted_str = ''.join(sorted(s))
        groups.setdefault(sorted_str, []).append(s)
    return list(groups.values())

n = int(input("Enter no. of strings: "))
print("Enter the strings:")
strs = [input() for _ in range(n)]

result = groupAnagrams(strs)
print("Output:")
for group in result:
    print(group)

