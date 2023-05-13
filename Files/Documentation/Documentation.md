# LECTURA NO BINARIA DE ARCHIVOS

### File
Es una clase que representa un archivo o directorio en el sistema de archivos. Permite crear, eliminar, renombrar archivos y directorios. También permite obtener información del archivo o directorio, como por ejemplo: el nombre, la ruta absoluta, el tamaño, la fecha de modificación, etc.

### java.util.Scanner
Es una clase que permite leer datos de diferentes tipos de fuentes de entrada, como por ejemplo: archivos, cadenas de texto, etc. 


_______________________________________________________________


# ESCRITURA NO BINARIA DE ARCHIVOS

File PrintStream (Flujo de salida de datos formateados)
Es una clase que permite escribir datos formateados en un flujo de salida. Se utiliza para escribir datos en un archivo.
Hereda de OutputStream.


_______________________________________________________________


# LECTURA BINARIA DE ARCHIVOS

### FileInputStream 
Es una clase que permite leer bytes de un archivo. 
Se utiliza para leer datos binarios primitivos. 
Hereda de InputStream.

### DataInputStream (Datos binarios primitivos) 
Es una clase que permite leer datos primitivos de un flujo de entrada.
Se utiliza para leer datos binarios primitivos.
Hereda de FilterInputStream.

### ObjectInputStream (Objetos binarios complejos)
Es una clase que permite leer objetos de un flujo de entrada.
Se utiliza para leer objetos de un flujo de entrada.
Hereda de InputStream.

- Siempre hay que utilizar FileInputStream y DataInputStream juntos, para leer datos primitivos.

- Siempre hay que utilizar FileInputStream y ObjectInputStream juntos, para leer objetos.
  
- Siempre hay que utilizar FileInputStream, DataInputStream y ObjectInputStream juntos, para leer datos primitivos y objetos.
  
- Siempre hay que cerrar el flujo de entrada, para que se liberen los recursos.


_______________________________________________________________


# ESCRITURA BINARIA DE ARCHIVOS

### FileOutputStream
Es una clase que permite escribir bytes en un archivo.
Se utiliza para escribir datos binarios primitivos.
Hereda de OutputStream.

### DataOutputStream (Datos binarios primitivos)
Es una clase que permite escribir datos primitivos en un flujo de salida.
Se utiliza para escribir datos binarios primitivos.
Hereda de FilterOutputStream.

### ObjectOutputStream (Objetos binarios complejos)
Es una clase que permite escribir objetos en un flujo de salida.
Se utiliza para escribir objetos en un flujo de salida.
Hereda de OutputStream.

- Siempre hay que utilizar FileOutputStream y DataOutputStream juntos, para escribir datos primitivos.
  
- Siempre hay que utilizar FileOutputStream y ObjectOutputStream juntos, para escribir objetos.
  
- Siempre hay que utilizar FileOutputStream, DataOutputStream y ObjectOutputStream juntos, para escribir datos primitivos y objetos.
  
- Siempre hay que cerrar el flujo de salida, para que se liberen los recursos.
