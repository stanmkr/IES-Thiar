def resumen_ingrediente(*args):
    ingredientes = []
    for arg in args:
        ingredientes.append(arg)
    return ingredientes


ingredientes = {"peperoni": "Peperoni", "cebolla": "Cebolla", "tomate": "Tomate", "mozzarella": "Mozzarella",
                "olivas": "Olivas", "jamon_york": "Jamón York", "bacon": "Bacon", "atun": "Atún", }

print("INGREDIENTES:",
      resumen_ingrediente(ingredientes["peperoni"], ingredientes["tomate"], ingredientes["mozzarella"]))
print("INGREDIENTES:", resumen_ingrediente(ingredientes["atun"], ingredientes["cebolla"]))
print("INGREDIENTES:", resumen_ingrediente(ingredientes["tomate"]))
