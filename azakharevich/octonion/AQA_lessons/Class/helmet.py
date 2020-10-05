from motoequip import *

class Helmet(Motoequip):
    def __init__(self, model, price, weight, sunglass):
        super().__init__(model, price, weight)
        #Motoequip.__init__(self, model, price, weight)
        self.sunglass = sunglass

    def display_info(self):
        print('Model:', self.model, '; Price:', self.price, '; Weight:', self.weight, '; Sunglass:', self.sunglass)
