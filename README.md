# PruebaGitDesarrollo
## ¿En qué consiste el proyecto?

Una compañía dedicada al alquiler por largos periodos de automóviles cobra:
- Una cantidad fijo de 200€ para los primeros 300 km de recorrido.
- Para más de 300 km y hasta 1000 km, cobra un coste adicional de 0.30€ por cada kilómetro en exceso sobre 300.
- Para más de 1000 km cobra un monto adicional de 0.15€ por cada kilómetro en exceso sobre 1000 km.
  
Si el cliente es usuario vip de la compañía se le aplica un 5% de descuento.

El precio final debe incluir el 21% del impuesto general a las ventas, IVA. 

El algoritmo determina y muestra el precio final a pagar por el alquiler de un vehículo.

# Comentario del usuario Juanma
-E declarado las siguientes variables como absolutas, ya que es un valor que no vamos a cambiar a lo largo del programa:

        final double iva = 1.21;
		final double descvip = 0.95;
		final double costeAdicional1 = 0.30;
		final double costeAdicional2 = 0.15;
		final int sobreKilometros1 = 300;
		final int sobreKilometros2 = 1000;

-Tambien e comentado cada paso del if-else del programa, para que sea mas claro que hace cada instrucción.