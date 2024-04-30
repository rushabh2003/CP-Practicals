def search_matrix(matrix, target):
    if not matrix or not matrix[0]:
        return False
    
    n, m = len(matrix), len(matrix[0])
    low, high = 0, n * m - 1
    
    while low <= high:
        mid = (low + high) // 2
        row, col = mid // m, mid % m
        
        if matrix[row][col] == target:
            return True
        elif matrix[row][col] < target:
            low = mid + 1
        else:
            high = mid - 1
            
    return False

n, m = map(int, input("Enter n, m: ").split())
matrix = [list(map(int, input().split())) for _ in range(n)]
target = int(input("Enter target: "))

result = search_matrix(matrix, target)
print("true" if result else "false")
