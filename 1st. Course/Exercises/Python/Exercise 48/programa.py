import info_hipoteca

print("BIENVENIDX AL SIMULADOR DE HIPOTECA")
hipoteca_importe = int(input("Introduzca el importe de la hipoteca: "))
hipoteca_interes = float(input("Introduzca el interes de la hipoteca: "))
hipoteca_plazo = int(input("Introduzca el plazo de pago en años: "))
info_hipoteca.hipoteca_info(hipoteca_importe, hipoteca_interes, hipoteca_plazo)

while True:
    user_answer = input("Desea ver la tabla de amortización (S/N)? ")

    if user_answer.lower() == "s":
        info_hipoteca.amortizacion(hipoteca_importe, hipoteca_interes, hipoteca_plazo)
    elif user_answer.lower() == "n":
        print("El programa se cierra. Hasta luego")
        break
    else:
        print("Respuesta incorrecta\n")
