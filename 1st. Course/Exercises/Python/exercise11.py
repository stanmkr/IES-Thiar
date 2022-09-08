# persona 1
p1_nombre = input("Introduce tu nombre : ")
p1_apellido1 = input("Introduce tu primer apellido : ")
p1_apellido2 = input("Introduce tu segundo apellido : ")

# Persona 2
p2_nombre = input("Introduce tu nombre : ")
p2_apellido1 = input("Introduce tu primer apellido : ")
p2_apellido2 = input("Introduce tu segundo apellido : ")

# comparo los 2 apellidos de las 2 personas, utilizo el método casefold para ignorar mayúsculas y minúsculas
if p1_apellido1.casefold() == p2_apellido1.casefold() and p1_apellido2.casefold() == p2_apellido2.casefold():
    print(f"{p1_nombre} y {p2_nombre} pueden ser hermanxs")
else:
    print("Las personas no son hermanxs")