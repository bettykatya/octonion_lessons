import math

print("Задание: При заданных координатах A1, A2, ..., An одной точки и координатах B1, B2, ..., Bn другой точки n-мерного пространства. Найти расстояние между ними по формуле sqrt(sqr(A1-B1) + ... + sqr(An-Bn)).")

arr1 = [2, 3, 5]
arr2 = [5, 7, 11]

i = 0
sq = 0

while i < len(arr1):
    sq += (arr1[i]-arr2[i])**2
    i += 1
sq = math.sqrt(sq)
print('Расстояние между точек: ', sq)