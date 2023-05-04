package BasicsExercises;

import java.util.Scanner;

public class EscribirNombreXNumeroHastaFi {
    public static void main(String[] args) {

        /*Desenvolupa un programa en Java hon que demani a l’usuari el seu nom i un número enter més
        gran que 1. El programa ha d'escriure el seu nom tants cops com indiqui el número. Un cop
        fet això, ha de tornar a preguntar el nom i el número (i tornar a imprimir). El programa
        finalitzarà si l'usuari escriu fi en comptes del seu nom.

        Un exemple d'execució seria:
        Introdueix el teu nom: Nacho
        Introdueix un numero: 4
        Nacho Nacho Nacho Nacho

        Introdueix el teu nom: Joan
        Introdueix un numero: 0
        Número ha d'esser positiu

        Introdueix un numero: 1
        Joan
        Introdueix el teu nom: fi $ */

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        int number = 0;
        String userName = "";

        do {
            System.out.println("Introduce un nombre, por favor");
            userName = entradaString.nextLine();

            if (userName.equalsIgnoreCase("fi")) {
                System.out.println("Adios!");
                break;
            }
            System.out.println("Introduce un numero, por favor");
            number = entradaInt.nextInt();

            if (number <= 0) {
                System.out.println("El numero tiene que ser positivo y mas grande o igual a 1");
            } else if (number >= 1) {
                for (int i = 1; i <= number; i++) {
                    System.out.print(userName + " ");
                }
            }
            System.out.println();
        } while (!userName.equalsIgnoreCase("fi"));
    }
}