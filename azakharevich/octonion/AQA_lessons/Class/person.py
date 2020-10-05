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
        print('\n\rSorting has been started...')

        self.sortedArray = []

        print(' Before:')
        for i in range(len(self.equipArray)):
            print('-', self.equipArray[i].weight)

        while len(self.equipArray) > 0:
            self.minEquip = self.equipArray[0]
            self.minIndex = 0
            for i in range(len(self.equipArray)):
                self.currEquip = self.equipArray[i]
                if self.currEquip.weight < self.minEquip.weight:
                    self.minEquip = self.currEquip
                    self.minIndex = i
            self.sortedArray.append(self.minEquip)
            self.equipArray.pop(self.minIndex)
        self.equipArray = self.sortedArray

        print(' After:')
        for i in range(len(self.equipArray)): #Помню, что если использовали 2 раза, то можно вынести в отдельный метод, но копипаст тут быстрее ;)
            print('-', self.equipArray[i].weight)


    def findEquip(self, min, max):
        self.min = min
        self.max = max
        self.searchResult = []
        for i in range(len(self.equipArray)):
            if min < self.equipArray[i].price < max:
                self.searchResult.append(self.equipArray[i])

        print('\n\rSearch equip from', self.min,'to', self.max, '$')
        for i in range(len(self.searchResult)):
            print('- Model:', self.searchResult[i].model, '; Price:', self.searchResult[i].price)