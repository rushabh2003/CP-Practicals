def defangIPaddr(address):
    defangedIP = ''
    for c in address:
        if c == '.':
            defangedIP += '[.]'
        else:
            defangedIP += c
    return defangedIP

address = input("Enter IP address: ")
defangedAddress = defangIPaddr(address)
print(defangedAddress)
