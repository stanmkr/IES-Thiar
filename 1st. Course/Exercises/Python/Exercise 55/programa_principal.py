from Practica55.carrito import CarritoHelados

sabores_helados = ["fresa", "chocolate", "mango"]

#   Crea una instancia de CarritoDeHelados.
carrito_chulo = CarritoHelados("Restaurante la Veleta", "Mediterránea", sabores_helados)

#   Llama al método describir_restaurante()
carrito_chulo.describir_restaurante()

#   Llama al método establecer_numero_servicios() pasándole un número natural (entero positivo).
carrito_chulo.establecer_numero_servicios(7)

# Muestra por pantalla el atributo numero_servicios.
print(carrito_chulo.numero_servicios, "servicios")

#    Llama al método muestra_sabores().
carrito_chulo.muestra_sabores()
