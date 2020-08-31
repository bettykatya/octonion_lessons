print("Требуется отсортировать массив по возрастанию. (используя поиск максимального ИЛИ минимального элемента)")

arr = [3, 1, 10, 1, 2, 10, 5]
print('Было: ', arr)

i = 1

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