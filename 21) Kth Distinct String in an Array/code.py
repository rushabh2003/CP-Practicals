n, k = map(int, input("Enter n, k: ").split())
arr = []
mp = {}

print("Enter strings:")
for _ in range(n):
    string = input()
    arr.append(string)
    mp[string] = mp.get(string, 0) + 1

ans = ""
for string in arr:
    if mp[string] == 1:
        if k == 1:
            ans = string
            break
        else:
            k -= 1

if ans == "":
    print("ans:")
else:
    print("ans:", ans)
