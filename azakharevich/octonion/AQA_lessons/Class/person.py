import json

class Person:
    def __init__(self) -> None:
        super().__init__()
        self.itemPrice = 0
        self.equipArray = []


    def addEquip(self, object):
        self.itemPrice += object.price
        self.equipArray.append(object)


    def fullEquipPrice(self):
        return self.itemPrice


    def sortEquip(self):
        print('\n\rSorting has been started...\n\r')
        sortedArray = []
        while len(self.equipArray) > 0:
            minEquip = self.equipArray[0]
            minIndex = 0
            for i in range(len(self.equipArray)):
                currEquip = self.equipArray[i]
                if currEquip.weight < minEquip.weight:
                    minEquip = currEquip
                    minIndex = i
            sortedArray.append(minEquip)
            self.equipArray.pop(minIndex)
        self.equipArray = sortedArray


    def equipWeightList(self):
        for i in range(len(self.equipArray)):
            print('-', self.equipArray[i].weight)


    def findEquip(self, min, max):
        self.min = min
        self.max = max
        searchResult = []
        for i in range(len(self.equipArray)):
            if min < self.equipArray[i].price < max:
                searchResult.append(self.equipArray[i])
        return searchResult


    def searchResult(self, searchResult):
        print('\n\rSearch equip from', self.min,'to', self.max, '$')
        for i in range(len(searchResult)):
            print('- Model:', searchResult[i].model, '; Price:', searchResult[i].price)


    def to_json(self):
        return json.dumps(self, default=lambda o: o.__dict__, indent=4)