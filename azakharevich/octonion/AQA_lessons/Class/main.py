"""
Мотоциклист. Определить иерархию амуниции.
Экипировать мотоциклиста. Подсчитать стоимость.
Провести сортировку амуниции на основе веса.
Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
"""

from helmet import *
from gloves import *
from person import *
import pickle
import binascii
import json


class Task:
    helmet1 = Helmet('HJC', 200, 1300, 'Yeah')
    helmet1.display_info()

    glove = Gloves('Alpinestar', 60, 300)
    glove.setProtection('Nope') #для тренировки по разному реализовал передачу нового параметра в классах Helmet и Gloves
    glove.display_info()

    try:
        helmet2 = Helmet('Shark', 100, 'No')
    except TypeError:
        print('Exception changed this object')
        helmet2 = Helmet('Shark', 100, 1100, 'No')
    helmet2.display_info()

    print('')

    man = Person()
    man.addEquip(helmet1)
    man.addEquip(glove)
    man.addEquip(helmet2)

    print('Full equip price:', man.getFullPrice(), '$\n\r')

    print('Equip list:')
    man.getWeightList()
    man.sortEquip()
    print('Equip list:')
    man.getWeightList()

    result = man.findEquip(80, 250)

    #serialization
    serResult = pickle.dumps(result)

    #file writing
    file = open('file.txt', 'wb')
    file.write(serResult)
    file.close()

    #file reading
    file = open('file.txt', 'rb')
    fileData = file.read()
    file.close()

    #deserialization
    desData = pickle.loads(fileData)
    man.searchResult(desData)

    #JSON
    with open("json.txt", "w") as write_file:
        json.dump(man.to_json(), write_file)

    with open("json.txt", "r") as json_file:
        data = json.load(json_file)
        print('\nJSON data:\n', data)