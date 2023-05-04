package BasicsExercises;

import java.util.*;

public class AdivinaElNumero {
    public static void main(String[] args) {

        /*Declaramos una variable de tipo entero a la cual vamos a llamar numero_aleatorio, y le decimos que esta
        variable de tipo entero va a ser igual Math.random().
        Math.random nos devuelve un numero decimal aleatorio mas alto o igual a 0 y menor que 1.
        -Pero como queremos que el programa cree un numero entre 0 y 100 correremos la coma dos sitios hacia la
        derecha, y esto lo hacemos multiplicando por cien.
        -Y como tenemos que convertir el numero decimal que nos devuelve math.round() a entero, tendemos que recurrir
        al concepto de refundicion para convertir un tipo de dato a otro. De ahi viene el (int) justo antes del
        (Math.random())
        -Ponemos un +1 al final porque en el caso de que casualmente el programa crease un 0 ganariamos sin haber
        echo falta probar ninguna vez*/

        int numero_aleatorio = (int) ((Math.random() * 100) + 1);

        /*Pedimos al usuario que introduzca un valor de tipo entero por consola creando un objeto de tipo Scanner,
         * y le decimos que esto es igual a new Scanner(System.in).
         */
        Scanner entrada = new Scanner(System.in);

        //Declaro una variable de tipo entero la cual llamo numero y le doy valor = 0
        int numero = 0;

        //Declaro una variable de tipo entero la cual voy a llamar intentos
        int intentos = 0;

        //Traduccion:Mientras numero sea diferente a numero_aleatorio..
        while (numero != numero_aleatorio) {

            //Incrementamos en +1 la variable "intentos" cada vez que el while comienze
            intentos++;

            //Imprimimos por consola
            System.out.println("Introduce un numero, por favor");

            /*Le decimos al proograma que la variable numero va a ser igual a lo que el usuario introduzca por consola.
             * Numero tiene que ser igual al proximo numero entero que el usuario introduzca por consola*/
            numero = entrada.nextInt();

            /*Si el numero que ha generado el programa es menor que el que hemos introducido nosotros, el programa nos
             * tiene que responder "Mas bajo"*/
            if (numero_aleatorio < numero) {
                System.out.println("Mas bajo");
            }

            /*Si el numero que ha generado el programa es mayor que el que hemos introducido nosotros, el programa nos
             * tiene que responder "Mas alto"*/
            else if (numero_aleatorio > numero) {
                System.out.println("Mas alto");
            }
        }
        //Imprimimos por consola
        System.out.println("Correcto. Enhorabuena!!");
    }
}