def is_jolly_jumper(sequence):
  """Checks if a sequence is a jolly jumper."""
  n = len(sequence)

  if n == 1:
    return True

  differences = set()

  for i in range(n - 1):
    diff = abs(sequence[i + 1] - sequence[i])
    if diff == 0:
      continue
    differences.add(diff)

  for i in range(1, n):
    if i not in differences:
      return False

  return True

n = int(input("Enter n: "))
sequence = list(map(int, input("Enter array: ").split()))

if is_jolly_jumper(sequence):
  print("Jolly")
else:
  print("Not jolly")
