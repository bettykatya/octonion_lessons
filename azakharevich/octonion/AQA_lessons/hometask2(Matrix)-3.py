print("\n\rНайти минимальный элемент матрицы ниже побочной диагонали")
print("В квадратной матрице найти минимальный элемент ниже побочной диагонали. \nКроме того вывести на экран в табличном виде исходную матрицу и отдельно часть матрицы ниже побочной диагонали. \nПобочная диагональ матрицы идет от верхнего правого угла до нижнего левого\n\r")


matrix = [[3, 1, 6, 4],
          [1, 7, 8, -3],
          [2, -9, -2, 3],
          [9, -1, -1, 2]]

i = 0

res = 'Исходная матрица:\n'

while i < len(matrix):
    j = 0
    while j < len(matrix):
        res = res + '| ' + str(matrix[i][j]) + '|\t'
        j += 1
    i += 1
    res = res + '\n\r'
print(res)

i = 0
y = 0
res = 'Часть матрицы ниже побочной диагонали:\n'

while i < len(matrix):
    j = 0
    while j < len(matrix):
        if (len(matrix) - y) > j:
            res = res + '|  |\t'
            j += 1
        else:
            res = res + '| ' + str(matrix[i][j]) + '|\t'
            j += 1
    i += 1
    y += 1
    res = res + '\n\r'

print(res)


i = 0
y = 1
j = 0
res = matrix[i][j]

while i < len(matrix):
    j = 0
    while j < len(matrix):
        if j > (len(matrix) - y):
            if matrix[i][j] < res:
                res = matrix[i][j]
            j += 1
        else:
            j += 1
    i += 1
    y += 1
print('Минимальный элемент ниже побочной диагонали:', res)