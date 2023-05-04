package BasicsExercises;

import java.util.Scanner;

public class CambiarValorABC {
    public static void main(String[] args) {

	/*Donades dos variables A y B, que l’usuari ha d’introduir, es demana un programa que
	intercanviï el valor de les variables.*/


        String a;
        String b;
        String c;
        Scanner escaner = new Scanner(System.in);


        System.out.println("Introduce un numero para la variable A");
        a = escaner.nextLine();

        System.out.println("Introduce un numero para la variable B");
        b = escaner.nextLine();

        /*El contenido del vaso "b" lo pongo en el vaso "c" (entonces me queda el baso "c" lleno del
         * contenido del "b" y el vaso "b" me queda vacio).
         */
        c = b;

        /*El contenido del vaso "a" lo pongo en el vaso "b" que esta vacio ya que el contenido
         * del "b" lo he metido en el vaso "c".
         */
        b = a;

        /*Y el contenido del vaso "c" que tenia dentro el contenido del vaso "b" lo pongo en el vaso
         * "a" que estaba vacio porque habia introducido su contenido en el "b".
         */
        a = c;

        System.out.println("Este sera el resultado de cambiar las variables: A sera igual a " + a +
                " y B sera igual a " + b);
    }
}