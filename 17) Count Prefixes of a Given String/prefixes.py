def count_prefixes(words, s):
    count = 0
    for word in words:
        if s.startswith(word):
            count += 1
    return count

words = input("Enter words: ").split()
s = input("Enter s: ")

result = count_prefixes(words, s)
print(result)