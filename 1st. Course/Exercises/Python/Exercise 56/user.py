class Usuario:
    intentos_inicio = 0

    #   CONSTRUCTOR
    def __init__(self, nombre, apellidos, nombre_de_usuario, email):
        self.nombre = nombre
        self.apellidos = apellidos
        self.nombre_usuario = nombre_de_usuario
        self.email = email
        self.intentos_inicio = 0

    def describir_usuario(self):
        print(
            f"\n---INFO USUARIO---\nNombre: {self.nombre}\nApellidos: {self.apellidos}\nUsername: {self.nombre_usuario}\nEmail: {self.email} ")

    def saludar_usuario(self):
        print(f"Hola soy {self.nombre_usuario}! Lets rock!")

    def incrementar_intentos_inicio(self):
        self.intentos_inicio += 1

    def restablecer_intentos_inicio(self):
        self.intentos_inicio = 0
