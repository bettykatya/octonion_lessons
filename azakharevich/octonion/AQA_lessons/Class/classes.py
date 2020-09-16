class Motoequip:
    def __init__(self, name, price, place, weight):
        self.name = name
        self.price = price
        self.place = place
        self.weight = weight

    def display_info(self):
        print(self.name, self.price, self.place, self.weight)

    @staticmethod
    def Whami():
        a = 0


print(Motoequip.Whami())