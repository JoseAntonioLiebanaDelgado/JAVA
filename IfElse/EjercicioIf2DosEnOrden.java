package IfElse;

import java.util.Scanner;

public class EjercicioIf2DosEnOrden {
    public static void main(String[] args) {

	/*Dos en ordre
	Desenvolupa un programa que demani dos números i escrigui els dos números ordenats
	creixentment (de menor a major). Ex. si els números són 3 i 2, el resultat serà 2 3
	Indica com a comentari, que passa si els dos números són iguals.*/


        int primerNumero = 0;
        int segundoNumero = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero, por favor");
        primerNumero = entrada.nextInt();
        System.out.println("Introduce otro numero, por favor");
        segundoNumero = entrada.nextInt();

        if (primerNumero > segundoNumero) {
            System.out.println(segundoNumero + " " + primerNumero);
        } else if (primerNumero < segundoNumero) {
            System.out.println(primerNumero + " " + segundoNumero);
        } else {
            System.out.println("Esos numeros son iguales.");
        }
    }
}