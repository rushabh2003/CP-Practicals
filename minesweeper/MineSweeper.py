print("Welcome to Minesweeper!\nLet's play!!\n")
print("Remember: - for safe, * for bomb\n")

n, m = map(int, input("Enter n, m: ").split())

# Create an n x m array filled with zeros
ms = [[0 for col in range(m)] for row in range(n)]

for row in range(n):
  for col in range(m):
    x = input("Enter * or -: ")
    ms[row][col] = x

#Printing current minesweeper
print("Current Minesweeper: ")
for i in ms:
  for j in i:
    print(j, end=' ')
  print()
   

#identifying bombs and counting
for row in range(n):
  for col in range(m):
    if(ms[row][col] == '-'):
      #let's find how many bombs are their in it's neighbour
      bombs = 0
      for x in range(-1, 2):
        for y in range(-1, 2):
          drow = row + x
          dcol = col + y
           
          if(drow >= 0 and drow < n and dcol >= 0 and dcol < m and ms[drow][dcol] == '*'):
            bombs += 1
      ms[row][col] = bombs


#Printing final minesweeper
print("Final Minesweeper: ")
for i in ms:
  for j in i:
    print(j, end=' ')
  print()