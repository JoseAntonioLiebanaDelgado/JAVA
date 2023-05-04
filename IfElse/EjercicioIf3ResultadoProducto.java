package IfElse;

import java.util.Scanner;

public class EjercicioIf3ResultadoProducto {
    public static void main(String[] args) {

	/*Dissenya un programa que demani a l’usuari dos números (positius o negatius i l’indiqui si el
	seu producte es 0, mes gran que 0 o mes petit que 0.*/

        int primerNumero = 0;
        int segundoNumero = 0;
        int productoNumero = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero positivo o negativo, por favor");
        primerNumero = entrada.nextInt();
        System.out.println("Introduce otro numero positivo o negativo, por favor");
        segundoNumero = entrada.nextInt();
        productoNumero = (primerNumero * segundoNumero);

        if (productoNumero < 0) {
            System.out.println("El producto de estos 2 numeros es menor que 0");
        } else if (productoNumero > 0) {
            System.out.println("El producto de estos 2 numeros es mayor que 0");
        } else {
            System.out.println("El producto de estos 2 numeros es igual a 0");
        }
        System.out.println("El resultado del producto es " + productoNumero);
    }
}