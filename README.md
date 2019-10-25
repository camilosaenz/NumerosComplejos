# Librería de Numeros Complejos

# CNYT - Ciencias Naturales y Tecnología

_Librería computación Cuántica: Números complejos._

El objetivo de este proyecto es realizar una libreria de Números Complejos.

# ¿Instalación de la Librería? 📂

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
> Ejemplo
Para esta prueba, se colocan dos vectores de igual dimension y se suman
![image](https://user-images.githubusercontent.com/48153830/64641338-94d31d80-d3d1-11e9-8508-685972318691.png)

# 2. Resta:

La resta de los complejos, es un número complejo cuya parte real es la resta de las partes reales y cuya parte imaginaria es la resta de las partes imaginarias:
En la libreria yo resto tanto las partes enteras como las partes imaginarias aparte y creo el número complejo a partir de los resultados obtenidos.
   
# 3. Producto:
  
  El producto de numeros complejos da como resultado otro numeros complejo y se encarga de distribuir la primer parte del primer numero   complejo sobre el otro numero complejo, como se puede ver en la suguiente ecuacion.
  Para el producto de numeros complejos en la libreria sigo la ecuacion para hallar esta y con el resultado creo el numero complejo
  
  ![image](https://user-images.githubusercontent.com/48153830/64641384-b2a08280-d3d1-11e9-8c58-5653976cd4ee.png)
            
# 4. División:

  La division de los numeros complejos, es un numero complejo tal que al dividir el primero en el segundo esto siempre y cuando el         modulo del segundo numero complejo sea diferente de cero.

# 5. Módulo:

   El modulo de un numero Complejo es un real tal que sale de realizar la raiz cuadrada de la suma de los cuadrados tanto de la parte      entera como de la parte imaginaria.
   ![image](https://user-images.githubusercontent.com/48153830/64641440-ce0b8d80-d3d1-11e9-9a65-024b78372965.png)

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
![sumaVector](https://user-images.githubusercontent.com/48153830/64641101-10809a80-d3d1-11e9-9923-854d0325ebd4.PNG)

# Inversa de vectores complejos.

Se restan dos vectores de numeros Complejos se utilizan las operaciones basicas en este caso la suma de complejos para hacer la operacion

# Multiplicación escalar de vectores complejos.

Se multiplican dos vectores de numeros Complejos se utilizan las operaciones basicas en este caso la suma de complejos para hacer la operacion

# Adición de matrices complejos.

Se suman dos matrices de numeros Complejos se utilizan las operaciones basicas en este caso la suma de complejos para hacer la operacion

# Inversa de matrices complejos.

Se restan dos matrices de numeros Complejos se utilizan las operaciones basicas en este caso la resta de complejos para hacer la operacion

# Multiplicación de matrices complejas.

Se multiplican dos matrices de numeros Complejos se utilizan las operaciones basicas en este caso el producto de complejos para hacer la operacion
![productoMatriz](https://user-images.githubusercontent.com/48153830/64641154-2f7f2c80-d3d1-11e9-90c3-4c8160d8906b.PNG)

# Matriz transpuesta

Para esta se comparan las pocisiones de los indices de la matriz original con los de la transpuesta en este caso se cambian las pocisiones se la matriz original

# Matriz conjugada

Se cambia el signo de la parte imaginaria de cada indice imaginario de la matriz se utiliza el conjugado de complejos y luego se guarda en la matriz original

![conjugada](https://user-images.githubusercontent.com/48153830/64641211-4f165500-d3d1-11e9-9730-e4063f4be779.PNG)

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

# Segundo Tercio.

# Clasico a lo Cuantico

Para este segundo tercio el Objetivo del proyecto es poder realizar el programa de lo Clasico a lo Cuantico, donde se evaluaran los siguientes aspectos

# Canicas con Coeficientes Booleanos :mag_right:

Este ejercicio muestra lo siguiente, primero se ingresa una matriz de Booleanos e ingresar el numero de clicks luego se mostrara cual es el estado del sistema despues de n clicks.

``` 
Prueba 
```

![image](https://user-images.githubusercontent.com/48153830/67412063-35495f80-f584-11e9-8d52-3c24087fd0d2.png)

# Rendijas Probabilisticas

En este caso se ingresan dos enteros y se recorrera la matriz.

```
Prueba
```

![image](https://user-images.githubusercontent.com/48153830/67412722-6d04d700-f585-11e9-995d-d4a430c7dd56.png)

# Doble Rendijas

Para este caso se calcula la matriz resultante del experimento de multiples rendijas. Para este caso se ingresa el numero de rendijas, y de blancos mas las probabilidades para los blancos.

```
Prueba
```

![image](https://user-images.githubusercontent.com/48153830/67412918-cf5dd780-f585-11e9-99e3-2d7a65df53ad.png)

# Probabilidad por Posicion

En este caso se debe encontrar la probabilidad de posicion de la particula 

``` 
Prueba 
```

![image](https://user-images.githubusercontent.com/48153830/67582301-2511bb80-f70f-11e9-8979-68119db69cbb.png)

# De Ket a Ket

En este busca transitar de un vector a otro los cuales seran Ket

``` 
Prueba 
```

![image](https://user-images.githubusercontent.com/48153830/67582486-7a4dcd00-f70f-11e9-9c93-d9f389729e30.png)


# Valor Medio

_Autor_
> Rubian Camilo Saenz Rodriguez
