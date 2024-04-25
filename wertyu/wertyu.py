def main():
    mp = {
        'w': 'q', 'e': 'w', 'r': 'e', 't': 'r', 'y': 't', 'u': 'y', 'i': 'u', 'o': 'i', 'p': 'o',
        '[': 'p', 's': 'a', 'd': 's', 'f': 'd', 'g': 'f', 'h': 'g', 'j': 'h', 'k': 'j', 'l': 'k',
        ';': 'l', 'x': 'z', 'c': 'x', 'v': 'c', 'b': 'v', 'n': 'b', 'm': 'n', ',': 'm', ' ': ' '
    }

    inp = input("Enter string: ")
    ans = ''.join(mp.get(char, char) for char in inp)
    print("Ans:", ans)

if __name__ == "__main__":
    main()
