package Funciones_Corregidas.RepasoTeorico;


/*Tu tarea consiste en completar las dos funciones que faltan:
La función multiplicarNumeros, que debe recibir dos números enteros, multiplicarlos y retornar el resultado como un entero.
La función esNumeroPar, que debe recibir un número entero y retornar true si es par o false si es impar.*/

public class x1 {

    public static void main(String[] args) {
        // Ejecutamos la función imprimirSaludo
        imprimirSaludo("Juan");

        // Llamamos a la función sumarNumeros y almacenamos el resultado en una variable
        int resultado = sumarNumeros(5, 7);

        // Imprimimos el resultado de la suma
        System.out.println("El resultado de la suma es: " + resultado);

        int resultadoMutiplicacion = multiplicarNumeros(3, 4);
        System.out.println(resultadoMutiplicacion);

        boolean esPar = esNumeroPar(5);
        System.out.println(esPar);
    }


    // Función que imprime un saludo personalizado
    public static void imprimirSaludo(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido.");
    }

    // Función que recibe dos números enteros y retorna su suma
    public static int sumarNumeros(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    // [Falta completar] Función que multiplica dos números enteros y retorna el resultado como un entero
    public static int multiplicarNumeros(int num1, int num2) {
        int producto = num1 * num2;
        return producto;
    }

    // [Falta completar] Función que recibe un número entero y retorna verdadero si es par, falso si es impar
    public static boolean esNumeroPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
