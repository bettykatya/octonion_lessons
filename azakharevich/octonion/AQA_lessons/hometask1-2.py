print("Дан одномерный массив. Найти среднее арифметическое его элементов. Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.")

arr = [1, -1, 2, 0, 3, 5, 11]
print('Массив: ', arr)

i = 0
mid = 0

while i < len(arr):
    mid += arr[i]
    i += 1
mid = mid/len(arr)
print('Среднее:', mid)

i = 0
while i < len(arr):
    if arr[i] > mid:
        print('Цифра ', arr[i], ' больше среднего')
    i += 1