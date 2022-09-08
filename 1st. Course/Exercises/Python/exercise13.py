# persona 1
print("\n------------- PERSONA 1 -------------\n")
p1_nombre = input("Introduce tu nombre : ")
p1_apellido1 = input("Introduce tu primer apellido : ")
p1_apellido2 = input("Introduce tu segundo apellido : ")

# Persona 2
print("\n------------- PERSONA 2 -------------\n")
p2_nombre = input("Introduce tu nombre : ")
p2_apellido1 = input("Introduce tu primer apellido : ")
p2_apellido2 = input("Introduce tu segundo apellido : ")

# comparo los 2 apellidos de las 2 personas, utilizo el método casefold para ignorar mayúsculas y minúsculas
if p1_apellido1.casefold() == p2_apellido1.casefold() and p1_apellido2.casefold() == p2_apellido2.casefold():
    print(f"{p1_nombre} y {p2_nombre} pueden ser hermanxs y primxs al mismo tiempo.")
elif p1_apellido2.casefold() == p2_apellido2:
    print()
    print(f"{p1_nombre} y {p2_nombre} no son hermanxs, pero pueden ser primxs.")

else:
    print(f"{p1_nombre} y {p2_nombre} no pueden ser hermanxs ni primxs.")