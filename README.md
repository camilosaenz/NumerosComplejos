# Librería de Numeros Complejos

# CNYT - Ciencias Naturales y Tecnología

_Librería computación Cuántica: Números complejos._

El objetivo de este proyecto es realizar una libreria de Números Complejos.

# ¿Instalación de la Librería? :file_folder:

```
Para instalar la librería en sus Computadores siga estos pasos:
```

> Clonar en sus computadores con el link del repositorio, utilizando el codigo: git clone (link repositorio).

![clone](https://user-images.githubusercontent.com/48153830/64622164-7eff3180-d3ac-11e9-8887-a47bee03693e.PNG)

Ya con el repositorio clonado en sus computadores, podremos trabajar en el por medio de diferentes compiladores.

# ¿Uso de la Librería? :hand:

> Cuando este clonado el repositorio abrir en un compilador de Java (Eclipse, Netbeans), ya abierto podemos trabajar en este, vamos a encontrar en este tanto las clases para la libreria como para las pruebas cada una de estas esta separada en paquetes diferentes ademas de que la clase de Complejos esta separada en operaciones para numeros complejos basicas y para vectores y matrices.

# ¿Probar la Librería? :wrench:

> Ya abierto en algun compilador hacer uso de los metodos creados para pruebas, en los paquetes se encontraran los Test para numeros Complejos con operaciones basicas y al igual para operaciones con matrices y vectores.

Se puede probar por medio de Maven, utilizando el siguiente comando mvn test

![mvnTest](https://user-images.githubusercontent.com/48153830/64622976-cd610000-d3ad-11e9-94a4-8aca5a8d4ac9.PNG)

Luego de esto se compilan las pruebas:

![test](https://user-images.githubusercontent.com/48153830/64623424-8de6e380-d3ae-11e9-890b-8c9b0f9fe0ca.PNG)

_Libreria Numeros Complejos_

_Para esto primero definimos que es un Número Complejo._

> **Definición según Wikipedia** Los números complejos son una extensión de los números reales y forman un cuerpo algebraicamente cerrado. El conjunto de los números complejos se designa con la notación **C**.  Los números complejos incluyen todas las raíces de los polinomios, a diferencia de los reales. Todo número complejo puede representarse como la suma de un número real y un número imaginario (que es un múltiplo real de la unidad imaginaria, que se indica con la letra i), o en forma polar.

```
El proyecto se dividira en diferentes entregas.
```

# Primer Entrega

> **Primer Entrega** Para esta primer entrega de la librería de Números Complejos estara compuesta de las operaciones básicas de estos, a continuación se mostraran las operaciones que componen esta primer entrega.

La librería tiene las siguientes operaciones entre números complejos:

# 1. Suma:

La suma de los complejos, es un número complejo cuya parte real es la suma de las partes reales y cuya parte imaginaria es la suma de las partes imaginarias:
En la libreria yo sumo tanto las partes enteras como las partes imaginarias aparte y creo el número complejo a partir de los resultados obtenidos.

# 2. Resta:

La resta de los complejos, es un número complejo cuya parte real es la resta de las partes reales y cuya parte imaginaria es la resta de las partes imaginarias:
En la libreria yo resto tanto las partes enteras como las partes imaginarias aparte y creo el número complejo a partir de los resultados obtenidos.
   
# 3. Producto:
  
  El producto de numeros complejos da como resultado otro numeros complejo y se encarga de distribuir la primer parte del primer numero   complejo sobre el otro numero complejo, como se puede ver en la suguiente ecuacion.
  Para el producto de numeros complejos en la libreria sigo la ecuacion para hallar esta y con el resultado creo el numero complejo
            
# 4. División:

  La division de los numeros complejos, es un numero complejo tal que al dividir el primero en el segundo esto siempre y cuando el         modulo del segundo numero complejo sea diferente de cero.

# 5. Módulo:

   El modulo de un numero Complejo es un real tal que sale de realizar la raiz cuadrada de la suma de los cuadrados tanto de la parte      entera como de la parte imaginaria.

# 6. Conjugado:

El conjugado de un numero Complejo sale es otro numero complejo pero con la parte imaginaria de un signo diferente a el primer numero complejo.
  
# 7. Conversión entre representaciones polar y cartesiano

La forma trigonométrica de un complejo z con módulo r y ángulo α es:

La forma polar de un complejo es cualquiera de las siguientes:

# 8. Retornar la fase de un número complejo.

  La fase de un numero complejo es el arcotangente de la division entre la parte imaginaria sobre la parte entera, siempre y cuando la     parte entera sea diferente de cero.
  
# Segunda Entrega

> **Segunda Entrega** En esta entrega se tendran oparaciones de numeros complejos en vectores y matrices.

La librería tiene las siguientes operaciones entre números complejos:

# Adición de vectores complejos.

Se suman dos vectores de numeros Complejos se utilizan las operaciones basicas en este caso la suma de complejos para hacer la operacion

# Inversa de vectores complejos.

Se restan dos vectores de numeros Complejos se utilizan las operaciones basicas en este caso la suma de complejos para hacer la operacion

# Multiplicación escalar de vectores complejos.

Se multiplican dos vectores de numeros Complejos se utilizan las operaciones basicas en este caso la suma de complejos para hacer la operacion

# Adición de matrices complejos.

Se suman dos matrices de numeros Complejos se utilizan las operaciones basicas en este caso la suma de complejos para hacer la operacion

# Inversa de matrices complejos.

Se restan dos matrices de numeros Complejos se utilizan las operaciones basicas en este caso la resta de complejos para hacer la operacion

# Multiplicación escalar de matrices complejas.

Se multiplican dos matrices de numeros Complejos se utilizan las operaciones basicas en este caso el producto de complejos para hacer la operacion

# Matriz transpuesta

Para esta se comparan las pocisiones de los indices de la matriz original con los de la transpuesta en este caso se cambian las pocisiones se la matriz original

# Matriz conjugada

Se cambia el signo de la parte imaginaria de cada indice imaginario de la matriz se utiliza el conjugado de complejos y luego se guarda en la matriz original

# Matriz adjunta

Para esta utilizo el conjugado de la matriz y la transpuesta de este para hallar la adjunta de una matriz, se comparan una matriz con su adjunta

# Norma de matrices

Se halla la norma de cada elemento de la matriz de los numeros complejos

# Distancia entrematrices

Se encuentra la di

# Revisar si es unitaria

Se analiza si la matriz es unitaria comparando los valores de las matrices con las operaciones entre estas necesarias para hallarla 

# Revisar si es Hermitian

Para este caso se mira si la matriz dada es Hermitiana y se devuelve con un Booleano

# Producto tensor.

Se realiza la operacion de producto tensor entre dos matrices

_Autor_
> Rubian Camilo Saenz Rodriguez
