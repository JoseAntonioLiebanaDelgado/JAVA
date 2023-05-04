package For;

import java.util.Scanner;

public class EjercicioFor5FactorialDeX {
    public static void main(String[] args) {

        /*El factorial d’un nombre sencer
        Dissenyeu un programa que calculi el factorial d’un nombre sencer, demanat a l’usuari pel
        teclat, i li mostri el resultat del càlcul per la pantalla. Fes servir el while!*/

        Scanner entrada = new Scanner(System.in);
        int resultado = 1;
        int userNumber = 0;
        int question = 0;

        do {
            System.out.println("Introduce un numero, por favor");
            userNumber = entrada.nextInt();

            for (int i = userNumber; i > 0; i--) {
                resultado = resultado * i;
            }

            System.out.println("El factorial de " + userNumber + " es " + resultado);
            System.out.println("Quieres hacer otra operacion? (1=si -- 2=no)");
            question = entrada.nextInt();

        } while (question == 1);
        if (question != 1) {
            System.out.println("De acuerdo, hasta pronto!");
        }
    }
}

