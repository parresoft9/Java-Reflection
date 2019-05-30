El concepto Java Reflection y como utilizarlo
=============================================


El API de Java reflection nos permite leer los metadatos de nuestras clases y trabajar con ellos.

El en siguiente ejemplo podemos ver su uso: tenemos tres clases que identifican tipos de vehículos. En este caso Coche, Autobús y Motocicleta.

Ambas clases disponen de las propiedades matricula,descripción y potencia. Sin embargo las clases no están relacionadas de ninguna forma. No son hijas de la clase Vehículo ni implementan un interface Vehículo así que trabajamos con ellas de forma independiente, creamos tres listas e imprimimos por consola recorriendo cada una de las listas previamente creadas.

Las soluciones más habituales a estos casos es crear interfaces o usar clases abstractas. De tal forma que a través del polimorfismo podamos trabajar de la misma forma con tipos muy dispares. El problema comienza cuando por ejemplo tenemos cientos de tipos diferentes y NO disponemos del código fuente.

Esto es un verdadero problema ya que nos posible modificar las clases existentes. Es aquí cuando entra en juego JAVA REFLECTION.

El API de reflection funciona leyendo los metadatos de nuestros objetos e invocando los métodos propios de dichos objetos.

Para ello se crea un método “printList”  que accede al API de reflection y lee los metadatos de cada objeto.

En primer lugar utiliza un bucle para recorrer el Array y lee la lista de métodos que cada objeto contiene con  reflection y getMethods();
En segundo lugar verifica que el objeto dispone de los métodos getMatricula(), getDescripcion() y getPotencia() usando m.getName().
Por último usa el método invoke del API de reflection para invocar el método que corresponda.

Para poder usar Java Reflection tendremos que sacrificar algo y ese algo es el tema de rendimiento. El código se ejecutará bastante más despacio que un simple código con bucles.

