Algoritmo calcularCostoHamburguesaDMP
	Definir cantidadHam Como Entero
	Definir pagoTarjeta como Cadena
	Definir costoFinal Como Real
	costoFinal<-0
	//Proceso y Datos de Entrada
	Para tipoHam<-1 Hasta 3 Con Paso 1 Hacer
		si tipoHam==1 Entonces
			Escribir "Ingrese la cantidad de Hamburguesas de Tipo Simple:"
			Leer cantidadHam
			costoFinal=costoFinal+cantidadHam*20
		Sino si tipoHam==2 Entonces
				Escribir "Ingrese la cantidad de Hamburguesas de Tipo Doble:"
				Leer cantidadHam
				costoFinal=costoFinal+cantidadHam*25
			SiNo
				Escribir "Ingrese la cantidad de Hamburguesas de Tipo Triple:"
				Leer cantidadHam
				costoFinal=costoFinal+cantidadHam*28				
			FinSi	
		FinSi
	FinPara
	//Datos de Salida Preceso, Datos entrada
	Escribir "Costo de Hamburguesas hasta el momento:", costoFinal
	Escribir "Va Pagar con Tarjeta?"
	Leer pagoTarjeta
	Si pagoTarjeta=="SI" Entonces
		costoFinal= costoFinal+costoFinal*0.05
	FinSi
	Escribir "Costo Total de las Hambueguesas es:", costoFinal
FinAlgoritmo
