print("Найти сумму положительных элементов массива.")

arr = [1, -1, 2, 0, 3, 5, 11]
print('Массив: ', arr)

i = 0
res = 0

while i < len(arr):
    if arr[i] > 0:
        res += arr[i]
    i += 1
print('Сумма: ', res)