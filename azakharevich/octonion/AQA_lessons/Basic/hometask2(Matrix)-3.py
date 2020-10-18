print("\n\rНайти минимальный элемент матрицы ниже побочной диагонали")
print("В квадратной матрице найти минимальный элемент ниже побочной диагонали. \nКроме того вывести на экран в табличном виде исходную матрицу и отдельно часть матрицы ниже побочной диагонали. \nПобочная диагональ матрицы идет от верхнего правого угла до нижнего левого\n\r")


matrix = [[3, 1, 6, 4],
          [1, 7, 8, -3],
          [2, -9, -2, 3],
          [9, -1, -1, 2]]

i = 0

res = 'Исходная матрица:\n'

for i in range(len(matrix)):
    j = 0
    for j in range(len(matrix)):
        res = res + '| ' + str(matrix[i][j]) + '|\t'
    res = res + '\n\r'
print(res)

i = 0
res = 'Часть матрицы ниже побочной диагонали:\n'

for i in range(len(matrix)):
    j = 0
    for j in range(len(matrix)):
        if (len(matrix) - i) > j:
            res = res + '|  |\t'
        else:
            res = res + '| ' + str(matrix[i][j]) + '|\t'
    res = res + '\n\r'

print(res)


i = 0
j = 0
res = matrix[i][j]

for i in range(len(matrix)):
    j = 0
    for j in range(len(matrix)):
        if j > (len(matrix) - i - 1):
            if matrix[i][j] < res:
                res = matrix[i][j]
print('Минимальный элемент ниже побочной диагонали:', res)