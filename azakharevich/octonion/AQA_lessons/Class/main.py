"""
Мотоциклист. Определить иерархию амуниции.
Экипировать мотоциклиста. Подсчитать стоимость.
Провести сортировку амуниции на основе веса.
Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
"""

from helmet import *
from gloves import *
from person import *


class Task:
    helmet1 = Helmet('HJC', 200, 1300, 'Yeah')
    helmet1.display_info()

    glove = Gloves('Alpinestar', 60, 300)
    glove.fingerProtection('Nope') #для тренировки по разному реализовал передачу нового параметра в классах Helmet и Gloves
    glove.display_info()

    helmet2 = Helmet('Shark', 100, 1100, 'No')
    helmet2.display_info()

    print('')

    man = Person()
    man.addEquip(helmet1)
    man.addEquip(glove)
    man.addEquip(helmet2)

    print('Full equip price:', man.fullEquipPrice())

    man.sortEquip()

    man.findEquip(80, 250)
