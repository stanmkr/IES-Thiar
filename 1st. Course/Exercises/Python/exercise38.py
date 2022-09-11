persona1 = {"Nombre": "Pepe", "Apellido": "Pepito", "Edad": 25, "Ciudad": "Nueva York"}
persona2 = {"Nombre": "Juan", "Apellido": "Juanito", "Edad": 18, "Ciudad": "Murcia"}
persona3 = {"Nombre": "John", "Apellido": "Smith", "Edad": 33, "Ciudad": "Londres"}
lista_de_personas = [persona1, persona2, persona3]
media = 0

for persona in lista_de_personas:
    print(persona.get("Nombre"), "vive en ", persona.get("Ciudad"))
    media += persona.get("Edad")
print(f"La media de las edades de las personas es {media / len(lista_de_personas):.2f}")
