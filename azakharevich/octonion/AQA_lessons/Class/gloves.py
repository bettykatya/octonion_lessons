from motoequip import *

class Gloves(Motoequip):
    def __init__(self, model, price, weight):
        super().__init__(model, price, weight)

    def setProtection(self, protection):
        self.protection = protection

    def display_info(self):
        print('Model:', self.model, '; Price:', self.price, '; Weight:', self.weight, '; Protection:', self.protection)