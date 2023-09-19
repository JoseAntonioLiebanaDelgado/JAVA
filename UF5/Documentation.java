import java.util.*;

public class Documentation {

    //ARRAY

    /*Un "array" (arreglo en español) es una estructura de datos en programación
    que se utiliza para almacenar una colección de elementos del mismo tipo de datos
    bajo un mismo nombre. Los elementos dentro de un arreglo están organizados en una
    secuencia, y cada elemento tiene un índice que indica su posición dentro del arreglo.
    Los arreglos son muy utilizados en programación para almacenar y manipular conjuntos
    de datos de manera eficiente.*/

    int[] numeros1 = new int[5]; // Crea un arreglo de enteros con capacidad para 5 elementos.
    int[] numeros2 = {1, 2, 3, 4, 5}; // Crea y asigna valores a un arreglo de enteros.

    /*Métodos más utilizados en arreglos en Java:

    Acceder a elementos: Puedes acceder a elementos individuales de un arreglo utilizando su índice.
    Por ejemplo, numeros[0] accedería al primer elemento del arreglo.

    Obtener la longitud: Puedes obtener la longitud (es decir, el número de elementos) de un arreglo
    utilizando la propiedad length. Por ejemplo, numeros.length te dará la longitud del arreglo numeros.

    Modificar elementos: Puedes modificar un elemento de un arreglo asignándole un nuevo valor.
    Por ejemplo, numeros[1] = 10 asignaría el valor 10 al segundo elemento del arreglo.

    Recorrer un arreglo: Puedes usar bucles (como for o foreach) para recorrer todos los elementos de un arreglo
    y realizar operaciones en cada uno de ellos.

    Copiar arreglos: Para copiar un arreglo a otro, puedes utilizar el método System.arraycopy()
    o crear un nuevo arreglo y copiar manualmente los elementos.

    Ordenar arreglos: Puedes utilizar métodos de ordenamiento como Arrays.sort()
    para ordenar los elementos de un arreglo en orden ascendente.

    Buscar elementos: Puedes buscar elementos dentro de un arreglo utilizando bucles for o
    métodos como Arrays.binarySearch() (solo si el arreglo está ordenado).

    Agregar o eliminar elementos: Los arreglos en Java tienen un tamaño fijo, por lo que no puedes agregar
    o eliminar elementos fácilmente. Para hacerlo, a menudo se crea un nuevo arreglo más grande o más pequeño
    y se copian los elementos.

    Inicialización rápida: Puedes inicializar todos los elementos de un arreglo al mismo valor
    utilizando bucles o el método Arrays.fill().*/

//----------------------------------------------------------------------------------------------------------------------

    //LIST

    /*Una List en Java es una interfaz que representa una colección ordenada de elementos donde cada elemento puede repetirse.
    La implementación más común de esta interfaz es ArrayList, pero también existen otras implementaciones como LinkedList.*/

    List<String> nombres1 = new ArrayList<>();
    List<String> nombres2 = new ArrayList<>(Arrays.asList("Juan", "María", "Carlos"));


    /*Métodos más utilizados en List en Java:

    Agregar elementos: Puedes agregar elementos a una List utilizando el método add(). Por ejemplo:
    nombres.add("Ana");

    Acceder a elementos: Puedes acceder a elementos individuales de una List utilizando su índice.
    Por ejemplo, nombres.get(0) accedería al primer elemento de la lista.

    Obtener la longitud: Puedes obtener el tamaño (es decir, el número de elementos) de una List utilizando
    el método size().
    Por ejemplo, nombres.size() te dará el tamaño de la lista nombres.

    Modificar elementos: Puedes modificar un elemento de una List asignándole un nuevo valor. Por ejemplo:
    nombres.set(1, "Luis");
    Esto cambiaría el segundo elemento de la lista de "María" a "Luis".

    Recorrer una List: Puedes usar bucles (como for o foreach) para recorrer todos los elementos de una List y realizar
    operaciones en cada uno de ellos.

    Eliminar elementos: Puedes eliminar elementos de una List utilizando el método remove(). Por ejemplo:
    nombres.remove(2); // Elimina el tercer elemento de la lista.

    Verificar si un elemento existe: Puedes verificar si un elemento específico existe en una List utilizando
    el método contains(). Por ejemplo:
    boolean contieneCarlos = nombres.contains("Carlos");

    Ordenar elementos: Puedes ordenar los elementos de una List utilizando el método Collections.sort()
    (si la List contiene elementos comparables).

    Copiar List: Para copiar una List a otra, puedes crear una nueva List y agregar todos los elementos de la original
    utilizando addAll().

    Agregar o eliminar elementos en posición específica: Puedes agregar o eliminar elementos en una posición específica
    de la List utilizando add(index, elemento) y remove(index) respectivamente.

    Sublista: Puedes obtener una sublista de una List utilizando el método subList(inicio, fin).*/

//----------------------------------------------------------------------------------------------------------------------

    //ARRAYLIST

    /*Un ArrayList en Java es una implementación específica de la interfaz List que se basa en un arreglo dinámico,
    lo que significa que puede cambiar de tamaño de manera automática según sea necesario.
    Dado que ArrayList implementa la interfaz List, admite todas las operaciones de List y algunas más específicas
    de ArrayList.*/

    ArrayList<String> nombres3 = new ArrayList<>();
    ArrayList<String> nombres4 = new ArrayList<>(Arrays.asList("Juan", "María", "Carlos"));

    /*Métodos más utilizados en ArrayList en Java:

    Agregar elementos: Puedes agregar elementos a un ArrayList utilizando el método add(). Por ejemplo:
    nombres.add("Ana");

    Acceder a elementos: Puedes acceder a elementos individuales de un ArrayList utilizando su índice.
    Por ejemplo, nombres.get(0) accedería al primer elemento de la lista.

    Obtener la longitud: Puedes obtener el tamaño (es decir, el número de elementos) de un ArrayList utilizando
    el método size(). Por ejemplo, nombres.size() te dará el tamaño de la lista nombres.

    Modificar elementos: Puedes modificar un elemento de un ArrayList asignándole un nuevo valor. Por ejemplo:
    nombres.set(1, "Luis");
    Esto cambiaría el segundo elemento de la lista de "María" a "Luis".

    Recorrer un ArrayList: Puedes usar bucles (como for o foreach) para recorrer todos los elementos de un ArrayList
    y realizar operaciones en cada uno de ellos.

    Eliminar elementos: Puedes eliminar elementos de un ArrayList utilizando el método remove(). Por ejemplo:
    nombres.remove(2); // Elimina el tercer elemento de la lista.

    Verificar si un elemento existe: Puedes verificar si un elemento específico existe en un ArrayList utilizando
    el método contains(). Por ejemplo:
    boolean contieneCarlos = nombres.contains("Carlos");

    Ordenar elementos: Puedes ordenar los elementos de un ArrayList utilizando el método Collections.sort()
    (si el ArrayList contiene elementos comparables).

    Copiar ArrayList: Para copiar un ArrayList a otro, puedes crear un nuevo ArrayList y agregar todos los elementos
    del original utilizando addAll().

    Agregar o eliminar elementos en posición específica: Puedes agregar o eliminar elementos en una posición
    específica de un ArrayList utilizando add(index, elemento) y remove(index) respectivamente.

    Sublista: Puedes obtener una sublista de un ArrayList utilizando el método subList(inicio, fin).*/


//----------------------------------------------------------------------------------------------------------------------

    //STACK

    /*Un Stack en Java es una estructura de datos que implementa una pila, siguiendo el principio de "último en entrar,
    primero en salir" (LIFO, por sus siglas en inglés). La clase Stack en Java se utiliza para almacenar y manipular
    elementos de manera similar a como lo harías con una pila física, donde los elementos se apilan uno encima del otro.*/

    Stack<String> pila = new Stack<>();

//   Agregar elementos en la parte superior de la pila
//   pila.push("Uno");
//   pila.push("Dos");
//   pila.push("Tres");
//   System.out.println("Pila después de agregar elementos: " + pila);
//
//    // Eliminar y devolver el elemento en la parte superior de la pila
//    String elementoEliminado = pila.pop();
//    System.out.println("Elemento eliminado de la parte superior de la pila: " + elementoEliminado);
//    System.out.println("Pila después de eliminar elemento: " + pila);
//
//    // Obtener el elemento en la parte superior de la pila sin eliminarlo
//    String elementoEnLaParteSuperior = pila.peek();
//    System.out.println("Elemento en la parte superior de la pila: " + elementoEnLaParteSuperior);
//
//    // Verificar si la pila está vacía
//    boolean estaVacia = pila.empty();
//    System.out.println("¿La pila está vacía? " + estaVacia);
//
//    // Buscar un elemento específico en la pila
//    int posicion = pila.search("Dos");
//    System.out.println("Posición de 'Dos' en la pila: " + posicion);

//----------------------------------------------------------------------------------------------------------------------

    //QUEUE

    /*Una cola (Queue en inglés) es una estructura de datos lineal que sigue el principio de "primero en entrar,
    primero en salir" (FIFO, por sus siglas en inglés). En una cola, los elementos se agregan al final y se e
    liminan desde el frente. Se utiliza comúnmente para administrar elementos en una secuencia ordenada,
    donde el primer elemento en agregarse es el primero en procesarse o eliminar.

    Por ejemplo, imagina una cola de personas esperando en una fila (cola) para comprar boletos.
    La primera persona en llegar a la fila es la primera en comprar un boleto y salir de la fila.
    Esto refleja el comportamiento de una cola en programación.

    En Java, la interfaz Queue es una abstracción de una cola y proporciona una serie de métodos para administrar
    elementos en una cola. Algunos de los métodos más comunes incluyen:

    offer(E e): Agrega un elemento al final de la cola. Retorna true si se pudo agregar, o false si no se pudo
    (por ejemplo, si la cola está llena).

    poll(): Obtiene y elimina el elemento en la parte frontal de la cola. Retorna null si la cola está vacía.

    peek(): Obtiene el elemento en la parte frontal de la cola sin eliminarlo. Retorna null si la cola está vacía.

    size(): Retorna el número de elementos en la cola.

    isEmpty(): Retorna true si la cola está vacía, de lo contrario, retorna false.*/

    Queue<String> cola = new LinkedList<>();

//    Agregar elementos a la cola
//    cola.offer("Uno");
//    cola.offer("Dos");
//    cola.offer("Tres");
//    System.out.println("Cola después de agregar elementos: " + cola);
//
//    // Obtener y eliminar el elemento en la parte frontal de la cola
//    String elementoEliminado = cola.poll();
//    System.out.println("Elemento eliminado de la parte frontal de la cola: " + elementoEliminado);
//    System.out.println("Cola después de eliminar elemento: " + cola);
//
//    // Obtener el elemento en la parte frontal de la cola sin eliminarlo
//    String elementoEnLaParteFrontal = cola.peek();
//    System.out.println("Elemento en la parte frontal de la cola: " + elementoEnLaParteFrontal);
//
//    // Verificar si la cola está vacía
//    boolean estaVacia = cola.isEmpty();
//    System.out.println("¿La cola está vacía? " + estaVacia);

//----------------------------------------------------------------------------------------------------------------------

    //LINKEDLIST

    /*LinkedList en Java es una implementación de la interfaz List que se basa en una estructura de datos enlazada.
    A diferencia de ArrayList, que utiliza un arreglo dinámico, LinkedList utiliza una lista doblemente enlazada
    para almacenar sus elementos. Esto significa que cada elemento en un LinkedList está enlazado a su elemento
    anterior y siguiente en la lista.*/

    /* LinkedList es una elección apropiada cuando necesitas realizar muchas inserciones y eliminaciones en la lista,
    pero no necesitas un acceso aleatorio rápido a los elementos. Si necesitas un acceso rápido por índice,
    ArrayList puede ser una mejor opción.*/

    /*Algunas características clave de LinkedList incluyen:

    Inserción y eliminación eficiente: LinkedList es especialmente eficiente para la inserción y eliminación
    de elementos en cualquier posición de la lista. Esto se debe a que solo es necesario ajustar los enlaces
    en lugar de copiar elementos en un nuevo arreglo como en ArrayList.

    Acceso menos eficiente: El acceso a elementos por índice en un LinkedList es menos eficiente que en un ArrayList.
    Para acceder a un elemento en una posición específica, el LinkedList debe seguir los enlaces desde el principio
    o el final de la lista.

    Uso de memoria: LinkedList suele consumir más memoria que ArrayList debido a la sobrecarga de almacenar enlaces
    para cada elemento en la lista.

    Uso de CPU: Las operaciones de inserción y eliminación en un LinkedList son más eficientes en términos de CPU que
    en un ArrayList, pero el acceso a elementos puede ser más lento.

    Iteración: La iteración (recorrido) a través de un LinkedList se puede hacer de manera eficiente
    utilizando iteradores.*/

//----------------------------------------------------------------------------------------------------------------------

    //LinkedList VS ArrayList

    /*LinkedList y ArrayList son dos implementaciones comunes de la interfaz List en Java, pero difieren en la forma
    en que almacenan y acceden a los elementos. Aquí hay algunas diferencias clave entre LinkedList y ArrayList:

    --- Estructura de datos subyacente:

    -ArrayList utiliza un arreglo dinámico para almacenar elementos. Los elementos se almacenan en un arreglo,
    y cuando se llena, se crea un nuevo arreglo más grande y se copian los elementos anteriores al nuevo arreglo.

    -LinkedList utiliza una lista doblemente enlazada para almacenar elementos. Cada elemento tiene referencias al
    elemento anterior y al siguiente en la lista.

    --- Inserción y eliminación:

    -ArrayList es eficiente para acceder a elementos por índice, pero menos eficiente para la inserción y eliminación
    de elementos en el medio de la lista. Esto se debe a que, en el caso de inserciones o eliminaciones en el medio,
    los elementos deben moverse en el arreglo.

    -LinkedList es eficiente para la inserción y eliminación de elementos en cualquier posición de la lista,
    ya que solo se deben ajustar los enlaces. Sin embargo, el acceso por índice es menos eficiente porque se debe
    recorrer la lista desde el principio o el final para llegar a una posición específica.

    --- Acceso a elementos:

    -ArrayList permite un acceso rápido a elementos por índice, ya que los elementos están almacenados en un
    arreglo contiguo. El acceso a elementos por índice es de tiempo constante (O(1)).

    -LinkedList es menos eficiente para el acceso por índice, ya que debe seguir los enlaces desde el principio o
    el final de la lista hasta la posición deseada. El acceso a elementos por índice es de tiempo lineal (O(n)),
    donde "n" es la posición del elemento.

    --- Uso de memoria:

    -ArrayList generalmente utiliza menos memoria que LinkedList, ya que no requiere almacenar referencias adicionales
    a elementos anteriores y siguientes.

    -LinkedList consume más memoria debido a las referencias adicionales necesarias para mantener la estructura
    de lista doblemente enlazada.

    ---Iteración:

    Ambos ArrayList y LinkedList admiten la iteración, pero LinkedList es más eficiente para la eliminación de
    elementos durante la iteración, ya que no requiere reorganizar elementos como ArrayList.

    TIP:

    Si necesitas un acceso rápido por índice y no realizas muchas inserciones y eliminaciones en el medio de la lista,
    ArrayList suele ser una elección sólida. Por otro lado, si tu aplicación implica muchas inserciones y eliminaciones
    en el medio de la lista, LinkedList puede ser más eficiente. También puedes considerar ArrayList cuando el acceso
    por índice es fundamental y el costo de inserción/eliminación es ocasional, mientras que LinkedList es útil cuando
    las inserciones y eliminaciones frecuentes son una prioridad.*/

//----------------------------------------------------------------------------------------------------------------------

    //MAP

    /*En Java, un Map es una interfaz que representa una estructura de datos que almacena pares clave-valor.
    Cada elemento en un Map consiste en una clave única asociada a un valor correspondiente.
    En otras palabras, un Map es una colección de elementos donde cada elemento se almacena bajo una clave única
    y se puede acceder y recuperar utilizando esa clave.

    Algunos conceptos clave sobre los Map en Java incluyen:

    Pares clave-valor: Cada elemento en un Map consta de dos partes: una clave y un valor. La clave es un
    identificador único que se utiliza para acceder al valor correspondiente. Los valores pueden ser cualquier objeto,
    incluyendo números, cadenas, objetos personalizados, u otros Map.

    No permite claves duplicadas: Un Map no puede contener claves duplicadas; cada clave debe ser única.
    Si se intenta agregar una clave que ya existe en el Map, el valor existente asociado con esa clave
    se sobrescribirá con el nuevo valor.

    Implementaciones de Map: Java proporciona varias implementaciones de la interfaz Map.
    Algunas de las implementaciones más comunes incluyen HashMap, TreeMap, LinkedHashMap, Hashtable,
    y ConcurrentHashMap, cada una con características y comportamientos específicos.

    Operaciones comunes: Los Map admiten operaciones comunes como agregar un par clave-valor,
    eliminar un par clave-valor, buscar un valor por clave, verificar si una clave está presente,
    obtener todas las claves o todos los valores, y más.*/

//----------------------------------------------------------------------------------------------------------------------

    //HASHTABLE

    /*Hashtable en Java es una implementación de la interfaz Map que proporciona una estructura de datos de tabla hash.
    Al igual que otros Map, Hashtable almacena pares clave-valor, pero con algunas características específicas:

    Sincronización: Una de las características más importantes de Hashtable es que es sincronizada.
    Esto significa que es segura para su uso en entornos con múltiples hilos de ejecución.
    La sincronización garantiza que las operaciones en Hashtable sean atómicas y evita problemas de concurrencia
    cuando varios hilos intentan acceder o modificar el Hashtable simultáneamente.

    No admite claves nulas: A diferencia de algunas otras implementaciones de Map, como HashMap,
    Hashtable no admite claves nulas ni valores nulos. Si intentas agregar una clave o valor nulo a un Hashtable,
    lanzará una excepción NullPointerException.

    Orden no garantizado: Aunque las implementaciones de Hashtable (Hashtable en sí y Properties) mantienen el orden
    de inserción, no proporcionan garantías sobre el orden de sus elementos en relación con otras operaciones,
    como get o remove.

    Eficiencia: Hashtable es eficiente para la mayoría de las operaciones, incluyendo la inserción, búsqueda y
    eliminación de elementos, gracias a su estructura de tabla hash. Sin embargo, en entornos con múltiples hilos,
    su sincronización puede afectar el rendimiento en comparación con otras implementaciones no sincronizadas en
    situaciones en las que la concurrencia no es un problema.

    Hashtable se utiliza a menudo cuando se necesita un Map en entornos con múltiples hilos y la sincronización
    es fundamental. Sin embargo, en aplicaciones más modernas, se recomienda utilizar ConcurrentHashMap en lugar
    de Hashtable, ya que proporciona mejor rendimiento en situaciones de concurrencia y ofrece características
    similares de sincronización.*/



}
