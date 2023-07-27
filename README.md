# Challenge_Conversor
Desafío Conversión de Monedas
Este desafío está realizado de acuerdo a los requerimientos dados por Alura, el proyecto cuenta con dos package o carpetas.
La carpeta principal que permite ejecutar el Menú de inicio se llama iniciar y contiene la clase Menu y la clase MenuConver.
La clase Menu, es la que contiene el main que permite instanciar a la clase MenuConver.
Desde la clase MenuConver instanciadada desde la clase Menu, Aqui nos encontramos con el diseño de la interfaz que se le proporciona
al usuario, mediante el uso de la librería JOptionPane.
Esta interfaz le presenta al usuario un Menú de opciones, que en este caso son tres, de las cuales solamente está implementada la 
"Conversión de Moneda", la que al ser seleccionada por el usuario, le permite realizar las conversiones correspondientes de acuerdo a
la selección de Moneda de Origen y Moneda de Cambio.
Este procedimiento se realiza consumiendo la siguiente API "https://v6.exchangerate-api.com/v6/",  con la cual se obtiene el Tipo de Cambio
que corresponde al valor de la Moneda Destino según la Fecha de Consulta, entregando al usuario la información de Cantidad de Moneda de Origen
ingresada por el usuario y la conversión ejemplo: 600.0 USD = 497266.8, en la 2da. línea entrega: Tasa de Cambio: 828.778, y por último en
la 3ra.línea entrega la Fecha en que se hace la consulta: Fecha Consulta: 27/07/2023, que corresponde a este ejemplo.
