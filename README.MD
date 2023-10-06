# Conversor de Divisas
![Challenge Oracle Next Education + Alura Banner](https://raw.githubusercontent.com/EduardoUT/ConversorMoneda-ONE-Alura_Challenge/master/src/Imagenes/challengeImage.jpg)
## Descripcion
Aplicación creada para convertir diversas divisas a traves del consumo del API 
**ExchangeRate-API**. Ademas de contener la logica para convertir **longitud**, **temperatura** y **masa**

## Requisitos
- Java(TM) SE Runtime Environment (build 19.0.2+7-44)
- Conexion a internet para el uso de la funcion conversor de divisas (las demas funciones no requieren de internet)

## Estructura del proyecto
- El archivo **ConversorConsumoApi** comienza la creacion de la interfaz
- El paquete **container** contiene las clases responsables de generar el entorno visual de la aplicacion y esta dividido de la siguiente forma:   
    - Archivo **RaizFrame**: Es el marco raiz en el que sera agregado todo el contenido visual
    - Paquete **panel**: Contiene las clases responsables de generar los contenedores que estaran distribuidos a traves del marco principal para mostrar el contenido, y a su vez contiene otro paquete llamado **contenidos** en el que se encuentran las clases encargadas de renderizar el contenido visual para cada opcion de conversion.
    - El paquete **modulos**: el cual se subdivide en cuatro paquetes con los elementos individuales que seran utilizados para renderizar los botones, labels, cajas de texto y combo box de la aplicacion.
- Paquete **controller**: se subdivide en tres paquetes responsables de la logica de la aplicacion:
    - **apiRequest**: Contiene la clase responsable de la peticion a la api para conversion de divisas.
    - **beans**: Contiene la logica y validaciones para llenar los combobox, controlar los colores y las fuentes dentro de nuestra aplicacion.
    - **logica**: Contiene la logica responsable de ejecutar las conversiones de acuerdo con el tipo de conversion utilizado.

## Vista previa del proyecto

