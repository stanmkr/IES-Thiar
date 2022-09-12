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


class Administrador(Usuario):
    def __init__(self, nombre, apellidos, nombre_de_usuario, email):
        super().__init__(nombre, apellidos, nombre_de_usuario, email)
        self.privilegios = Privilegios()
        # Privilegios(self.privilegios)

    # def muestra_privilegios(self):
    #     print(f"Privilegios de {self.nombre_usuario}: ", end="")
    #     for privilegio in self.privilegios:
    #         print(privilegio, end=" | ")


class Privilegios:

    #   CONSTRUCTOR

    def __init__(self, privilegios=None):
        if privilegios is None:
            privilegios = []
        self.privilegios = privilegios

    def muestra_privilegios(self):
        print(f"Privilegios: ", end="")
        for privilegio in self.privilegios:
            print(privilegio, end=" | ")


admin = Administrador("Jose", "Gonzalez", "jg", "jose@gmail.com")
admin.incrementar_intentos_inicio()
print(f"Intentos de inicio:{admin.intentos_inicio}")
admin.restablecer_intentos_inicio()
print(f"Intentos de inicio:{admin.intentos_inicio}")

admin.privilegios.privilegios = ["Establecer password", "Banear", "Borrar usuarios"]
admin.privilegios.muestra_privilegios()
