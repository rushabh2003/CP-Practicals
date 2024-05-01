def reversePrefix(word, ch):
    idx = word.find(ch)
    if idx != -1:
        return word[:idx + 1][::-1] + word[idx + 1:]
    return word

word = input("Enter word: ")
ch = input("Enter character: ")

result = reversePrefix(word, ch)
print("Result:", result)
