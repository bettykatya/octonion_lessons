print("Требуется отсортировать массив по возрастанию. (используя поиск максимального ИЛИ минимального элемента)")

arr1 = [3, 1, 10]
arr2 = []

i = 0
j = 0

while i < len(arr1):
    print(min(arr1))
    while j < len(arr1):
        if arr1[i] == min(arr1):
            del arr1[i]
            print(arr1)
            break
        else:
            i += 1
    i += 1
