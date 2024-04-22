def encrypt(text):
  """Encrypts a text using a Caesar cipher with a custom mapping."""
  # Define the character mapping dictionary
  mapping = {
      'w': 'q',
      'e': 'w',
      'r': 'e',
      't': 'r',
      'y': 't',
      'u': 'y',
      'i': 'u',
      'o': 'i',
      'p': 'o',
      '[': 'p',
      's': 'a',
      'd': 's',
      'f': 'd',
      'g': 'f',
      'h': 'g',
      'j': 'h',
      'k': 'j',
      'l': 'k',
      ';': 'l',
      'x': 'z',
      'c': 'x',
      'v': 'c',
      'b': 'v',
      'n': 'b',
      'm': 'n',
      ',': 'm',
      ' ': ' '
  }

  # Encrypt the text
  encrypted_text = ""
  for char in text:
    if char in mapping:
      encrypted_text += mapping[char]
    else:
      encrypted_text += char
  return encrypted_text

# Get user input
text = input("Enter str: ")

# Encrypt and print the result
encrypted_text = encrypt(text)
print("Ans:", encrypted_text)
