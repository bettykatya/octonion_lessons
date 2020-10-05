print("Количество отрицательных элементов под главной диагональю матрицы")


matrix = [[3, 1, 6, 4],
          [1, 7, 8, -1],
          [2, -9, 4, 3],
          [9, -9, -1, 2]]

i = 0
j = 0
count = 0

for i in range(len(matrix)):
    j = 0
    for j in range(len(matrix)):
        if j > (len(matrix) - i - 1):
            if matrix[i][j] < 0:
                count += 1
print('Количество отрицательных элементов:', count)