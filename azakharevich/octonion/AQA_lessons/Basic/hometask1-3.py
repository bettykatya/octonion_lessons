print("Задание: Дан массив целых чисел. Проверить, есть ли в нем одинаковые элементы.")

arr = [1, 4, 5, 2, 1, 3, 0, 2, 4]
print('Массив: ', arr)

i = 0

while i < len(arr):
    n = i + 1
    while n < len(arr):
        if arr[i] == arr[n]:
            print('Повторяется число ', arr[i])
        n += 1
    i += 1