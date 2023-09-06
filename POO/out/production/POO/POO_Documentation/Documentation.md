# POO (Programación orientada a objetos // Object-oriented programming)
## ¿En qué consiste? 

- La programación orientada a objetos consiste en trasladar la naturaleza de los objetos de la vida real al código de programación. 
- Con esto conseguimos facilitar la depuración o la reutilización el código entre otras cosas.
- Los objetos tienen un estado, un comportamiento y unas propiedades.

## Ejemplo (Coche) 
 
- Estado: Parado, circulando, aparcado, etc..
- Propiedades: Color, peso, tamaño, etc..
- Comportamiento: Arrancar, frenar, acelerar, girar, etc..
  
## Ventajas 

- Programas divididos en "trozos", "partes", "módulos" o "clases" (Modularización).
- Muy reutilizable (Herencia).
- Si existe fallo en alguna línea del código, el programa continuará su funcionamiento. Pasa como en la vida real, si por ejemplo se rompe la puerta de un coche, el coche sigue funcionando (Tratamiento de excepciones).
- Encapsulamiento. Los objetos son independientes, pueden comunicarse entre sí de alguna forma pero no directamente. Una rueda no sabe como está construida la caja de cambio.

## Vocabulario en POO

- ### Clase: 
Es la base sobre la cual se construye todo el lenguaje Java porque la clase define la naturaleza de un objeto. Como tal, la clase forma la base para la programación orientada a objetos en Java. <br>

La clase sería por ejemplo la plataforma (La base) que comparten distintos coches, que aun siendo diferentes casas comparten la misma plataforma. (Características comunes de un grupo de objetos).  


- ### Objeto: 
Tiene propiedades (Atributos). Color, peso, alto, largo, etc.. <br>
Tiene un comportamiento (Que es capaz de hacer). Arrancar, frenar, girar, acelerar, etc..


- ### Modularización: 
La modularización en Programación Orientada a Objetos (POO) se refiere al proceso de dividir un programa en módulos o componentes independientes y cohesivos que realizan una función específica dentro del sistema.

En la POO, los módulos suelen ser clases, que contienen variables y métodos que realizan tareas específicas y que pueden interactuar con otros objetos. Al dividir el código en clases y módulos más pequeños y cohesivos, se mejora la legibilidad, el mantenimiento y la escalabilidad del programa. Además, la modularización permite la reutilización de código, lo que puede reducir la cantidad de código necesario para construir un sistema.


- ### Encapsulación: 
- La encapsulación es un principio fundamental de la POO que permite crear programas más eficientes, seguros y mantenibles al ocultar los detalles internos de un objeto y restringir el acceso directo a sus datos.
- La encapsulación es un concepto importante en la programación orientada a objetos que se refiere a la ocultación de la complejidad interna de un objeto y la exposición de una interfaz pública simplificada para interactuar con él. En POO, la encapsulación se logra mediante la definición de atributos privados y métodos públicos o protegidos.
- Los atributos privados son variables de instancia que solo pueden ser accedidas y modificadas desde dentro de la misma clase en la que se definen. Los métodos públicos y protegidos son métodos que pueden ser accedidos desde fuera de la clase y que proporcionan una interfaz pública para interactuar con los atributos privados. <br><br>
- Las ventajas de la encapsulación en POO son:
- Mejora la seguridad del código: La encapsulación permite proteger los datos de un objeto de accesos no autorizados o modificaciones inesperadas, evitando que se alteren los estados internos del objeto.
- Mejora la modularidad del código: La encapsulación permite ocultar la complejidad interna de un objeto y proporcionar una interfaz pública simplificada para interactuar con él, lo que facilita la creación de código reutilizable y la modificación de código existente.
- Mejora el rendimiento del código: La encapsulación puede permitir el control del acceso y la modificación de los datos de un objeto, lo que puede mejorar el rendimiento del código al reducir la sobrecarga de procesamiento. <br> <br>
- Un ejemplo de encapsulación en POO podría ser una clase "Persona" que tiene atributos privados como "nombre" y "edad", y métodos públicos como "getNombre()" y "setEdad()". En este caso, la encapsulación permite ocultar la complejidad interna de la clase "Persona" y proporcionar una interfaz pública simplificada para interactuar con ella.
- El método "getNombre()" permite obtener el valor del atributo privado "nombre", mientras que el método "setEdad()" permite modificar el valor del atributo privado "edad". Los atributos privados "nombre" y "edad" solo pueden ser accedidos y modificados desde dentro de la clase "Persona", lo que garantiza la seguridad de los datos del objeto.
- En este ejemplo, la encapsulación permite proteger los datos de un objeto de accesos no autorizados o modificaciones inesperadas, proporcionando una interfaz pública simplificada para interactuar con él.

- ### Método constructor: 
Es un método que se encarga de dar un estado inicial a nuestro objeto.
El método constructor se tiene que llamar igual que la clase.
<br><br>
---

- ## Los métodos "setters" y "getters" 

Los métodos "setters" y "getters" son métodos de acceso que se utilizan en la programación orientada a objetos (POO) para acceder y modificar los atributos privados de una clase.

- Un "setter" es un método que se utiliza para asignar un valor a un atributo privado de una clase. El nombre del método suele comenzar con "set" seguido del nombre del atributo, y el método toma un parámetro que representa el nuevo valor que se asignará al atributo. Por ejemplo, si tenemos un atributo privado "nombre" en una clase "Persona", el método "setter" para ese atributo podría ser: <br>

      public void setNombre(String nuevoNombre) { 
      this.nombre = nuevoNombre;
      } 

- Un "getter" es un método que se utiliza para obtener el valor de un atributo privado de una clase. El nombre del método suele comenzar con "get" seguido del nombre del atributo, y el método no toma parámetros, sino que devuelve el valor del atributo. Por ejemplo, si tenemos un atributo privado "nombre" en una clase "Persona", el método "getter" para ese atributo podría ser: <br>

      public String getNombre() {
      return this.nombre; 
      } 

Los métodos "setters" y "getters" permiten acceder y modificar los atributos privados de una clase de forma controlada y segura, sin necesidad de hacerlos públicos y exponerlos al resto del programa. Además, los métodos "setters" y "getters" pueden incluir validaciones y lógica adicional para garantizar que los valores asignados o recuperados sean válidos y consistentes.<br>

- ### Paso de parámetros 

El paso de parámetros en Programación Orientada a Objetos (POO) se refiere al proceso de enviar valores o referencias de objetos como argumentos a los métodos de una clase.

- El operador this sirve par hacer de referencia a la propia clase


## Métodos Static
- No actuan sobre objetos, sino sobre la clase en si misma.
- No acceden a campos de ejemplar(variables/constantes declaradas en la clase), a menos que estas sean tambien static.
- Para llamarlos se utiliza el nombre de la clase, no el nombre del objeto (nombreClase.nombreMetodo).



## Herencia
- La herencia es uno de los conceptos fundamentales de la programación orientada a objetos (POO). En POO, una clase es una plantilla o un molde para crear objetos, que son instancias de la clase. La herencia permite que una clase hija herede los atributos y métodos de una clase padre, lo que facilita la reutilización de código y la creación de jerarquías de clases.
- En POO, una clase puede tener una clase padre (o superclase) y una o varias clases hijas (o subclases). La clase padre es la clase que se hereda, mientras que las clases hijas son las clases que heredan. La clase hija hereda todos los atributos y métodos públicos y protegidos de la clase padre, y puede añadir sus propios atributos y métodos. Además, la clase hija puede sobrescribir los métodos de la clase padre con su propia implementación. <br><br>
- Las ventajas de la herencia en POO son: <br> <br>
      - Reutilización de código: La herencia permite que las clases hijas hereden los atributos y métodos de la clase padre, lo que facilita la reutilización de código. <br>
      - Facilita la creación de jerarquías de clases: La herencia permite crear jerarquías de clases, en las que las clases hijas pueden ser más específicas que la clase padre. Esto ayuda a organizar el código y hacerlo más fácil de entender. <br>
      - Mejora la mantenibilidad del código: Al utilizar la herencia, los cambios en la clase padre se propagan automáticamente a las clases hijas, lo que facilita la mantenibilidad del código.


## Polimorfismo

- El polimorfismo permite que los objetos de diferentes clases se comporten de manera similar, incluso si la implementación de su comportamiento es diferente.<br>
- En POO, el polimorfismo se puede implementar de varias maneras, pero las dos formas principales son el polimorfismo de sobrecarga y el polimorfismo de anulación.<br>
- El polimorfismo de sobrecarga se refiere a la capacidad de una clase de tener varios métodos con el mismo nombre pero diferentes parámetros. En este caso, la clase puede responder al mismo mensaje de diferentes maneras, dependiendo de los argumentos que se le pasen.<br>
- Por otro lado, el polimorfismo de anulación se refiere a la capacidad de una clase hija de proporcionar su propia implementación de un método de la clase padre. En este caso, la clase hija puede redefinir el comportamiento del método de la clase padre, proporcionando su propia implementación.<br>
- Las ventajas del polimorfismo en POO son:<br>
- Mayor flexibilidad: El polimorfismo permite que los objetos de diferentes clases se comporten de manera similar, lo que aumenta la flexibilidad y la capacidad de respuesta de un programa.<br>
- Facilita la creación de código modular: El polimorfismo facilita la creación de código modular y reutilizable, ya que los objetos pueden ser intercambiados sin afectar el comportamiento del programa.<br>
- Mayor legibilidad del código: El polimorfismo hace que el código sea más legible y fácil de entender, ya que los objetos de diferentes clases pueden responder al mismo mensaje de manera similar.<br>
- Un ejemplo de polimorfismo en POO podría ser una clase "Animal" que tiene un método "hablar()". Luego, se crean dos clases hijas: "Perro" y "Gato". Cada una de estas clases hijas tiene su propia implementación del método "hablar()".
- Por ejemplo, el método "hablar()" de la clase "Perro" podría imprimir "Guau", mientras que el método "hablar()" de la clase "Gato" podría imprimir "Miau".
- En este caso, si se crea una instancia de la clase "Perro" y se llama al método "hablar()", se imprimirá "Guau". Si se crea una instancia de la clase "Gato" y se llama al método "hablar()", se imprimirá "Miau".
- Este es un ejemplo de polimorfismo de anulación, ya que cada clase hija proporciona su propia implementación del método "hablar()", lo que permite que los objetos de diferentes clases respondan al mismo mensaje de manera diferente.

## Abstracción
- Una clase abstracta es una clase que no puede ser instanciada, pero que puede ser utilizada como base para crear otras clases. 
- Una clase abstracta proporciona una interfaz para las clases que se derivan de ella, definiendo métodos abstractos que deben ser implementados por las clases hijas. 
- Los métodos abstractos son métodos que no tienen una implementación concreta y deben ser implementados por las clases hijas.

## Las interfaces

- Las interfaces son un conjunto de directrices o comportamientos que han de cumplir las clases que las implementen.<br>
- Hay interfaces predefinidas y nosotros podemos crear nuestras propias interfaces también.<br>
- Solo pueden contener métodos abstractos, constantes.<br>
- Se almacenan en archivos con extensión .class.<br>
- No se pueden instanciar.<br>
- Todos sus métodos son públicos y abstractos.<br>
- No pueden contener constructores ni variables, pero si constantes.<br> <br>
- Las interfaces se utilizan ya que no se pueden heredar de varias clases, pero si de varias interfaces.<br>
