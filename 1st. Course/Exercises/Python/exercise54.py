import re


class Persona:
    # constructor

    def __init__(self, nombre, edad, DNI):
        self.nombre = nombre
        self.edad = edad
        self.dni = DNI

    def validar_dni(self, dni):
        """Devuelve true si el dni introduce es un dni válido, false en caso contrario"""
        expresion_regular = "[0-9]{8}[A-Z]"
        control_digitos = "TRWAGMYFPDXBNJZSQVHLCKE"
        dni_invalidos = {"00000000T", "00000001R", "99999999R"}
        if dni not in dni_invalidos and re.match(expresion_regular, dni) is not None and dni[8] == control_digitos[
            int(dni[0:8]) % 23]:
            print("El dni es válido")
        else:
            print("El dni NO es válido")

    def mostrar(self):
        """muestra la información del objeto persona"""
        print(f"nombre:{self.nombre}, edad:{self.edad}, DNI:{self.dni}")

    def es_mayor_de_edad(self, edad):
        if edad >= 18:
            print(f"{self.nombre} es mayor de edad, tiene {self.edad} años.")
        else:
            print(f"{self.nombre} es menor de edad, tiene {self.edad} años.")


persona1 = Persona("Juanito", 14, "52771373N")
persona2 = Persona("Manolo", 55, "5277173N")

persona1.validar_dni(persona1.dni)
persona1.es_mayor_de_edad(persona1.edad)
persona1.mostrar()
print()
persona2.validar_dni(persona2.dni)
persona2.es_mayor_de_edad(persona2.edad)
persona2.mostrar()
