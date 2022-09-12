class Restaurante:
    numero_servicios = 0
    """describe un restaurante, establece valores e incrementa comensales"""

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

    def establecer_numero_servicios(self, numero_clientes):
        self.numero_servicios = numero_clientes

    def incrementar_numero_servicios(self, incremento):
        self.numero_servicios += incremento


restaurante_torrevieja = Restaurante("La esquina", "Mediterránea")
print("El restaurante se llama", restaurante_torrevieja.nombre)
print("El restaurante tiene una cocina", restaurante_torrevieja.cocina)
restaurante_torrevieja.describir_restaurante()
restaurante_torrevieja.abrir_restaurante()
print()
restaurante_pilar = Restaurante("Pilarsico", "Asiático")
restaurante_pilar.describir_restaurante()
print()

restaurante_alicante = Restaurante("Alicante Come", "Mediterránea")
print(f"El restaurante {restaurante_alicante.nombre} ha servido a {restaurante_alicante.numero_servicios} personas")
restaurante_alicante.numero_servicios = 5
print(f"El restaurante {restaurante_alicante.nombre} ha servido a {restaurante_alicante.numero_servicios} personas")
restaurante_alicante.establecer_numero_servicios(26)
print(f"El restaurante {restaurante_alicante.nombre} ha servido a {restaurante_alicante.numero_servicios} personas")
restaurante_alicante.incrementar_numero_servicios(4)
print(f"El restaurante {restaurante_alicante.nombre} ha servido a {restaurante_alicante.numero_servicios} personas")


