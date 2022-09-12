from Practica55.restaurante import Restaurante

sabores = []


class CarritoHelados(Restaurante):
    """ Describe los sabores de un carrito de helados"""

    # CONSTRUCTOR
    def __init__(self, nombre_restaurante, tipo_cocina, sabores):
        super().__init__(nombre_restaurante, tipo_cocina)
        self.sabores = sabores

    def muestra_sabores(self):
        print("Sabores: ",end="")
        for sabor in self.sabores:
            print(sabor,end=" | ")
