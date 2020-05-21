def calcularCostoHamburguesaDMP():
    costoFinal=0
    #Datos de Entrada y Proceso
    for tipoHam in range(1,4):
        if tipoHam==1:
            cantidadHam=int(input("Ingrese la cantidad de Hamburguesas de Tipo Simple:"))
            costoFinal=costoFinal+cantidadHam*20
        elif tipoHam==2:
            cantidadHam=int(input("Ingrese la cantidad de Hamburguesas de Tipo Doble:"))
            costoFinal=costoFinal+cantidadHam*25
        else:
            cantidadHam=int(input("Ingrese la cantidad de Hamburguesas de Tipo Triple:"))
            costoFinal=costoFinal+cantidadHam*28
    #Datos de Salida, Proceso, Entrada
    print(f"El costo de las Hamburguesas hasta el momento es: {costoFinal}")
    pagoTarjeta=input("Desea Pagar con Tarjeta?")
    if pagoTarjeta=="SI":
        costoFinal=costoFinal+costoFinal*0.05
    print(f"El costo total de la Hamburguesa es: {costoFinal}")

calcularCostoHamburguesaDMP()