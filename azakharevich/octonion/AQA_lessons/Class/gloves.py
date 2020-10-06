from motoequip import *

class Gloves(Motoequip):
    def protection(self, protection):
        self.protection = protection

    def display_info(self):
        print('Model:', self.model, '; Price:', self.price, '; Weight:', self.weight, '; Protection:', self.protection)