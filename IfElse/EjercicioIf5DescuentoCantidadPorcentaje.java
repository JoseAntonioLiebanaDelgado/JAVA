package IfElse;

import java.util.Scanner;

public class EjercicioIf5DescuentoCantidadPorcentaje {
    public static void main(String[] args) {

	/*Programa que obtingui el descompte (en quantitat i en percentatge) aplicat a un producte si
	l’usuari introdueix el preu original i el preu pagat.*/

        //Declaro variables
        double precioOriginal = 0;
        double precioTotal = 0;
        double descuentoCantidad = 0;
        double descuentoPorcentaje = 0;

        /*Creo una variable de tipo Scanner para leer lo que introduzca el usuario cuando invoquemos
         * el metodo entrada.next......()*/
        Scanner entrada = new Scanner(System.in);

        //Imprimimos por pantalla
        System.out.println("Introduce el precio original, por favor");

        /*Le decimos al programa que la variable precioOriginal es igual al numero que introduzca el
         * usuario*/
        precioOriginal = entrada.nextDouble();

        //Imprimimos por pantalla
        System.out.println("Introduce el precio rebajado que has pagado, por favor");

        /*Le decimos al programa que la variable precioTotal es igual al numero que introduzca el
         * usuario*/
        precioTotal = entrada.nextDouble();

        //Para obtener el descuento en euros restaremos el precioOriginal al precioTotal
        descuentoCantidad = (precioOriginal - precioTotal);

        /*Para obtener el descuento en porcentaje dividimos el descuentoCantidad entre el precioOriginal
         * y multiplicamos ese resultado por 100*/
        descuentoPorcentaje = ((descuentoCantidad / precioOriginal) * 100);

        //Imprimimos el descuentoCantidad y el descuentoPorcentaje que es lo que queriamos saber.
        System.out.println("Te has ahorrado " + descuentoCantidad + " euros y te han echo un " +
                descuentoPorcentaje + "% de descuento.");
    }
}