def hipoteca_info(prestamo, interes, plazo_anyos):
    p = plazo_anyos * 12
    i = interes / 1200
    cuota_mensual = (prestamo * i) / (1 - ((1 + i) ** (-p)))
    coste_total_hipoteca = p * cuota_mensual
    intereses_hipoteca = coste_total_hipoteca - prestamo
    print(f"""\n--- SIMULADOR HIPOTECAS ---
    Importe del préstamo: {prestamo}
    Interés: {interes}%
    Plazo: {plazo_anyos} años
    Cuota mensual: {cuota_mensual:.2f}€
    Interés hipoteca: {intereses_hipoteca:.2f}€
    Coste total hipoteca: {coste_total_hipoteca:.2f}€
    """)


def amortizacion(prestamo, interes, plazo_anyos):
    p = plazo_anyos * 12
    i = interes / 1200
    cuota_mensual = (prestamo * i) / (1 - ((1 + i) ** (-p)))
    coste_total_hipoteca = p * cuota_mensual

    interes_x_cuota = prestamo * i
    amortizacion_x_cuota = cuota_mensual - interes_x_cuota
    amortizacion_total = 0
    amortizacion_total += amortizacion_x_cuota
    print("\n--- TABLA DE AMORTIZACIÓN ---")
    print("CUOTA| INTERESESxCUOTA| AMORTIZACIÓNxCUOTA| AMORTIZACIÓN TOTAL|")
    for x in range(1, p+1):
        if x == 1:
            print(
                f"{x:5}| {interes_x_cuota:14.2f}€| {cuota_mensual - interes_x_cuota:17.2f}€| {amortizacion_total:17.2f}€|")
        else:
            print(
                f"{x:5}| {(prestamo - amortizacion_total) / 1200:14.2f}€| {cuota_mensual - ((prestamo - amortizacion_total) / 1200):17.2f}€| {amortizacion_total + (cuota_mensual - ((prestamo - amortizacion_total) / 1200)) :17.2f}€|")

            amortizacion_x_cuota = cuota_mensual - ((prestamo - amortizacion_total) / 1200)
            amortizacion_total = amortizacion_total + amortizacion_x_cuota
    return
