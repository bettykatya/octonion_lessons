print("Количество отрицательных элементов под главной диагональю матрицы")


matrix = [[3, 1, 6, 4],
          [1, 7, 8, -1],
          [2, -9, 4, 3],
          [9, -9, -1, 2]]

i = 0
y = 1
j = 0
count = 0

while i < len(matrix):
    j = 0
    while j < len(matrix):
        if j > (len(matrix) - y):
            if matrix[i][j] < 0:
                count += 1
            j += 1
        else:
            j += 1
    i += 1
    y += 1
print('Количество отрицательных элементов:', count)