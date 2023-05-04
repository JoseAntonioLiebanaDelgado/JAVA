package MethodStringExercises;

import java.util.Scanner;

public class ContrarCifras {
    public static void main(String[] args) {

	/* Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo:
	si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.*/


        //Pedir un numero al Usuario
        //Comprobar si es positivo o negativo
        //Contar numero de cifras
        //Comprobar si tiene uno o mas digitos
        //Imprimir resultado

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        int number = 0;
        int resultado = 0;

        //Pedir un numero al Usuario
        System.out.println("Introduce un numero");
        number = entradaInt.nextInt();
        System.out.println();

        //Comprobar si es positivo o negativo
        if (number >= 0) {
            System.out.println("Positivo");
//			String numberInString = "";
//			numberInString = String.valueOf(number);
//			System.out.println(numberInString.length());


            //Esto sirve para parsear de Int a String
            resultado = String.valueOf(number).length();
            System.out.println(resultado);

            if (resultado == 1) {
                System.out.println("1 cifra");
            } else {
                System.out.println("Mas de 1 cifra");
            }
        } else {
            System.out.println("Negativo");
            resultado = String.valueOf(number).length() - 1;
            System.out.println(resultado);

            if ((resultado) == 1) {
                System.out.println("1 cifra");
            } else {
                System.out.println("Mas de 1 cifra");
            }
        }
    }
}