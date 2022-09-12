from Practica56.admin import Administrador
from Practica56.user import Usuario

usuario1 = Usuario("Stanislav", "Krastev", "SmK", "stanislav@gmail.com")
usuario1.describir_usuario()
print()
usuario1.saludar_usuario()

admin1 = Administrador("Pepito", "Pérez", "p€p0_Re$hUL0N", "moreniko@hotmail.com")
admin1.describir_usuario()
print()
admin1.saludar_usuario()
print()

admin1.incrementar_intentos_inicio()
admin1.incrementar_intentos_inicio()
print(admin1.intentos_inicio,"intentos de inicio de sesión")
admin1.restablecer_intentos_inicio()
print(admin1.intentos_inicio,"intentos de inicio de sesión")
print()
admin1.muestra_privilegios()



