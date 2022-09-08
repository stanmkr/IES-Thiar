import random

descuento_blanca = 0
descuento_verde = 10
descuento_amarilla = 25
descuento_azul = 50
descuento_roja = 100
compra = int(input("Introduce el importe de la compra: "))
bolas = ["blanca",  "verde", "amarilla", "azul", "roja"]
# saco un color aleatorio entre los valores que tengo
color = bolas[random.randint(0, 4)]
print(color)
if color == "blanca":
    print(f"Has sacado la bola {color}, ({descuento_blanca}%), tu descuento es {descuento_blanca:.2f}€")
    print(f"Precio final {compra:.2f}€")
elif color == "verde":
    print(f"Has sacado la bola {color} ({descuento_verde}%), tu descuento es {(compra * descuento_verde) / 100:.2f}€")
    print(f"Precio final {compra - (compra * descuento_verde) / 100:.2f}€")
elif color == "amarilla":
    print(
        f"Has sacado la bola {color} ({descuento_amarilla}%), tu descuento es {(compra * descuento_amarilla) / 100:.2f}€")
    print(f"Precio final {compra - (compra * descuento_amarilla) / 100:.2f}€")
elif color == "azul":
    print(f"Has sacado la bola {color} ({descuento_azul}%), tu descuento es {(compra * descuento_azul) / 100:.2f}€")
    print(f"Precio final {compra - (compra * descuento_azul) / 100:.2f}€")
else:
    print(f"Has sacado la bola {color} ({descuento_roja}%), tu descuento es {compra:.2f}€")
    print(f"Precio final {0:.2f}€")
