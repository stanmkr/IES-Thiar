class Restaurante:
    """describe un restaurante"""
    def __init__(self, nombre_restaurante, tipo_cocina):
        #   atributos de instancia
        self.nombre = nombre_restaurante
        self.cocina = tipo_cocina

    def describir_restaurante(self):
        print("--------- Descripción del restaurante ---------")
        print("Nombre del restaurante:", self.nombre)
        print("Tipo de cocina:", self.cocina)

    def abrir_restaurante(self):
        print("El restaurante esta abierto.")


restaurante_torrevieja = Restaurante("La esquina", "Mediterránea")
print("El restaurante se llama", restaurante_torrevieja.nombre)
print("El restaurante tiene una cocina", restaurante_torrevieja.cocina)
restaurante_torrevieja.describir_restaurante()
restaurante_torrevieja.abrir_restaurante()
print()
restaurante_pilar = Restaurante("Pilarsico", "Asiático")
restaurante_pilar.describir_restaurante()
