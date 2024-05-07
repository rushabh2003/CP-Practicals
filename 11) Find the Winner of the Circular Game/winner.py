def find_winner(n, k):
    friends = list(range(1, n + 1))

    current = 0
    while len(friends) > 1:
        current = (current + k - 1) % len(friends)
        del friends[current]

    return friends[0]

n = int(input("Enter n: "))
k = int(input("Enter k: "))
winner = find_winner(n, k)
print(winner)
