n = int(input("Enter n: "))
matrix = []

print("Enter matrix:")
for _ in range(n):
    row = list(map(int, input().split()))
    matrix.append(row)

# Transpose the matrix
for i in range(n):
    for j in range(i + 1, n):
        matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

# Reverse each row of the transposed matrix
for i in range(n):
    matrix[i] = matrix[i][::-1]

print("Rotated matrix:")
for row in matrix:
    print(*row)
