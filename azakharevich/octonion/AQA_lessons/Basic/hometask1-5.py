print("Требуется отсортировать массив по возрастанию. (используя поиск максимального ИЛИ минимального элемента)")

arr = [3, 1, 10, 1, 2, 10, 5, 5, 5, 8]
print('Было: ', arr)

i = 0

while i < len(arr):
    buf = i
    j = i
    while j < len(arr):
        if arr[j] <= arr[buf]:
            buf = j
            j += 1
        j += 1
    tmp = arr[i]
    arr[i] = arr[buf]
    arr[buf] = tmp
    i += 1

print('Стало: ', arr)

'''
Не такой уж крутой код, но тоже ничего
while i < len(arr):
    while arr[i] < arr[i-1]:
        tmp = arr[i]
        arr[i] = arr[i-1]
        arr[i-1] = tmp
        if i > 1:
            i -= 1
    i += 1

print('Стало: ', arr)
'''


'''
Крутой питонский код

arr1 = [3, 1, 10, 2, 5]
arr2 = []

print('Было: ', arr1)

while 0 < len(arr1):
    j = 0
    while j < len(arr1):
        if arr1[j] == min(arr1):
            arr2.append(arr1[j])
            del arr1[j]
            break
        else:
            j += 1

print('Стало: ', arr2)
'''