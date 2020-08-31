print("Требуется отсортировать массив по возрастанию. (используя поиск максимального ИЛИ минимального элемента)")

arr1 = [3, 1, 10, 2, 5]
arr2 = []

i = 0

print('Было: ', arr1)

while i < len(arr1):
    j = 0
    while j < len(arr1):
        if arr1[j] == min(arr1):
            arr2.append(arr1[j])
            del arr1[j]
            break
        else:
            j += 1

print('Стало: ', arr2)