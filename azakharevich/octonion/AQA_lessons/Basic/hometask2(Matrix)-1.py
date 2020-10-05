print("Найти максимальный элемент для каждого столбца матриц размерностью NxN.")


matrix = [[3, 1, 6],
          [1, 7, 8],
          [2, 9, 4]]
print(matrix)

j = 0

for j in range(len(matrix)):
    res = 0
    i = 0
    for i in range(len(matrix)):
        if matrix[i][j] > res:
            res = matrix[i][j]
    print('Максимальный элемент в столбце №', j, ':', res)