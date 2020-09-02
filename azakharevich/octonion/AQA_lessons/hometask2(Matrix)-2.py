print("Количество отрицательных элементов под главной диагональю матрицы")


matrix = [[3, 1, 6, 4],
          [1, 7, 8, -1],
          [2, -9, 4, 3],
          [9, -9, -1, 2]]

i = 0
j = 1
count = 0

while i < len(matrix) and j < len(matrix):
    i += 1
    if matrix[len(matrix) - i][j] < 0:
        count += 1
    j += 1
print('Отрицательных элементов:', count)