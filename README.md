# PruebaGitDesarrollo
## ¿En qué consiste el proyecto?

Una compañía dedicada al alquiler por largos periodos de automóviles cobra:
- Una cantidad fijo de 200€ para los primeros 300 km de recorrido.
- Para más de 300 km y hasta 1000 km, cobra un coste adicional de 0.30€ por cada kilómetro en exceso sobre 300.
- Para más de 1000 km cobra un monto adicional de 0.15€ por cada kilómetro en exceso sobre 1000 km.
  
Si el cliente es usuario vip de la compañía se le aplica un 5% de descuento.

El precio final debe incluir el 21% del impuesto general a las ventas, IVA. 

El algoritmo determina y muestra el precio final a pagar por el alquiler de un vehículo.

se ha vambiado "desvip" por "descVip" y en la ultima opcion en ved de multiplicar p2 * 0.95 se ha puesto p2 * descVip ya que es vip y puede generar error en el futuro ya que al principio si estaba asi
