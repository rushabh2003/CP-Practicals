s = input("Enter s: ")

stack = []
flag = True

for char in s:
    if char in ['(', '[', '{']:
        stack.append(char)
    else:
        if char == ')':
            if not stack or stack[-1] != '(':
                flag = False
                break
            else:
                stack.pop()
        elif char == '}':
            if not stack or stack[-1] != '{':
                flag = False
                break
            else:
                stack.pop()
        elif char == ']':
            if not stack or stack[-1] != '[':
                flag = False
                break
            else:
                stack.pop()

if flag and not stack:
    print("Valid string")
else:
    print("Not a Valid string")
