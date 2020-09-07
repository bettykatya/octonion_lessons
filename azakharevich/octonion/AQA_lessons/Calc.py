matrix = [['', '', ''],
          ['', '', ''],
          ['', '', '']]

def showtab ():
    i = 0
    res = 'Игровое поле:\n'
    for i in range(len(matrix)):
        j = 0
        for j in range(len(matrix)):
            res = res + '|' + str(matrix[i][j]) + '| '
        res = res + '\n\r'
    return res

def addchoice (inp, tmp, x):
    i = 0
    count = 0
    for i in range(len(matrix)):
        j = 0
        for j in range(len(matrix)):
            count += 1
            if count == inp:
                if matrix[i][j] != '':
                    print('Занято, дядя!')
                    counter(x)
                else:
                    matrix[i][j] = tmp
                    checker(x)

def inp (x, tmp):
    i = input()
    while i.isalpha() or int(i) < 0 or int(i) > 9:
        print('Закусывай, шляпа!')
        counter(x)
    i = int(i)
    addchoice(i, tmp, x)

def counter (x):
    if x%2:
        print('Введите номер ячейки для Х')
        tmp = 'x'
    else:
        print('Введите номер ячейки для O')
        tmp = 'o'
    inp(x, tmp)

def checker (x):
    print(showtab())
    x += 1
    var = 0
    for var in range(5):
        i = 0
        j = 0
        countx = 0
        counto = 0
        '''Главная диагональ'''
        if var == 0:
            for i in range(len(matrix)):
                j = 0
                for j in range(len(matrix)):
                    if j == i:
                        if matrix[i][j] == 'x':
                            countx += 1
                        elif matrix[i][j] == 'o':
                            counto += 1
                    result(countx, counto)
        '''Побочная диагональ'''
        if var == 1:
            for i in range(len(matrix)):
                j = 0
                for j in range(len(matrix)):
                    if j == (len(matrix) - i - 1):
                        if matrix[i][j] == 'x':
                            countx += 1
                        elif matrix[i][j] == 'o':
                            counto += 1
                    result(countx, counto)
        '''Строки'''
        if var == 2:
            for i in range(len(matrix)):
                j = 0
                countx = 0
                counto = 0
                for j in range(len(matrix)):
                    if matrix[i][j] == 'x':
                        countx += 1
                    elif matrix[i][j] == 'o':
                        counto += 1
                    result(countx, counto)
        '''Столбцы'''
        if var == 3:
            for j in range(len(matrix)):
                i = 0
                countx = 0
                counto = 0
                for i in range(len(matrix)):
                    if matrix[i][j] == 'x':
                        countx += 1
                    elif matrix[i][j] == 'o':
                        counto += 1
                    result(countx, counto)
        '''Ничья'''
        if var == 4:
            for i in range(len(matrix)):
                j = 0
                for j in range(len(matrix)):
                    if matrix[i][j] == 'x' or matrix[i][j] == 'o':
                        counto += 1
                    if counto == 9:
                        print('Ничья!')
                        quit()
    counter(x)

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





