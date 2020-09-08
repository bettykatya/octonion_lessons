matrix = [[' ', ' ', ' '],
          [' ', ' ', ' '],
          [' ', ' ', ' ']]

def showtab ():
    res = 'Игровое поле:\n'
    for i in range(len(matrix)):
        for j in range(len(matrix)):
            res = res + '|' + str(matrix[i][j]) + '| '
        res = res + '\n\r'
    return res

def addchoice (inp, tmp, count):
    num = 0
    for i in range(len(matrix)):
        for j in range(len(matrix)):
            num += 1
            if num == inp:
                if matrix[i][j] != ' ':
                    print('Занято, дядя!')
                    counter(count)
                else:
                    matrix[i][j] = tmp
                    checker(count)

def inp (count, tmp):
    i = input()
    while i.isalpha() or int(i) < 0 or int(i) > 9:
        print('Закусывай, шляпа!')
        counter(count)
    i = int(i)
    addchoice(i, tmp, count)

def counter (count):
    if count%2:
        print('Введите номер ячейки для Х')
        tmp = 'x'
    else:
        print('Введите номер ячейки для O')
        tmp = 'o'
    inp(count, tmp)

def checker (count):
    print(showtab())
    count += 1
    for var in range(5):
        countX = 0
        countO = 0
        '''Главная диагональ'''
        if var == 0:
            for i in range(len(matrix)):
                if matrix[i][i] == 'x':
                    countX += 1
                elif matrix[i][i] == 'o':
                    countO += 1
                result(countX, countO)
        '''Побочная диагональ'''
        if var == 1:
            for i in range(len(matrix)):
                if matrix[i][len(matrix) - i - 1] == 'x':
                    countX += 1
                elif matrix[i][len(matrix) - i - 1] == 'o':
                    countO += 1
                result(countX, countO)
        '''Строки'''
        if var == 2:
            for i in range(len(matrix)):
                countX = 0
                countO = 0
                for j in range(len(matrix)):
                    if matrix[i][j] == 'x':
                        countX += 1
                    elif matrix[i][j] == 'o':
                        countO += 1
                    result(countX, countO)
        '''Столбцы'''
        if var == 3:
            for j in range(len(matrix)):
                countX = 0
                countO = 0
                for i in range(len(matrix)):
                    if matrix[i][j] == 'x':
                        countX += 1
                    elif matrix[i][j] == 'o':
                        countO += 1
                    result(countX, countO)
        '''Ничья'''
        if var == 4:
            for i in range(len(matrix)):
                for j in range(len(matrix)):
                    if matrix[i][j] == 'x' or matrix[i][j] == 'o':
                        countO += 1
                    if countO == 9:
                        print('Ничья!')
                        quit()
    counter(count)

def result (resx, reso):
    if resx == 3:
        print('Выйграл Х')
        quit()
    elif reso == 3:
        print('Выйграл O')
        quit()

def game ():
    print(showtab())
    counter(1)

game()