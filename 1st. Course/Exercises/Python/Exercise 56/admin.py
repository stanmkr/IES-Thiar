from Practica56.user import Usuario
from Practica57.practica57_stanislav import Privilegios


class Administrador(Usuario):
    def __init__(self, nombre, apellidos, nombre_de_usuario, email):
        super().__init__(nombre, apellidos, nombre_de_usuario, email)
        self.privilegios = ["Puede añadir comentario", "Puede expulsar usuarios", "Puede banear usuarios",
                            "Puede dar privilegios"]
        Privilegios(self.privilegios)

    # def muestra_privilegios(self):
    #     print(f"Privilegios de {self.nombre_usuario}: ", end="")
    #     for privilegio in self.privilegios:
    #         print(privilegio, end=" | ")


admin = Administrador("Jose", "Gonzalez", "jg", "jose@gmail.com")
admin.privilegios.privilegios = ["Privilegio1", "Privilegio2", "Privilegio3"]
