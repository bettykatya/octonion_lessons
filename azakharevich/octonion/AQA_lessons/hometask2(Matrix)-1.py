print("Найти максимальный элемент для каждого столбца матриц размерностью NxN.")


matrix = [[3, 1, 6],
          [1, 7, 8],
          [2, 9, 4]]
print(matrix)

j = 0

while j < len(matrix):
    res = 0
    i = 0
    while i < len(matrix):
        if matrix[i][j] > res:
            res = matrix[i][j]
            i += 1

        else:
            i += 1
    j += 1
    print('Максимальный элемент в столбце №', j, ':', res)