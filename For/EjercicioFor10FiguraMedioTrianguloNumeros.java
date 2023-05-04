package For;

import java.util.Scanner;

public class EjercicioFor10FiguraMedioTrianguloNumeros {
    public static void main(String[] args) {

        /*Un triangle de nombres
        Desenvolupa un programa que demani a l’usuari un nombre positiu més gran que 0. El
        programa escriurà una línia per nombre entre el 1 i el nombre introduït (es a dir, creixentment).
        A cada línia escriurà tots els nombres des del nombre corresponent a la línia fins al 1. Ex. si
        l’entrada és 5 la sortida serà

        1
        2, 1
        3, 2, 1
        4, 3, 2, 1
        5, 4, 3, 2, 1*/

        /*
        "j" es igual a "i" porque en cada vuelta suma 1
        j >= 1 porque la piramide acaba siempre en 1
        j -- porque vamos restando de 1 en 1
        */

        Scanner entrada = new Scanner(System.in);
        int userNumber = 0;

        System.out.println("Introduce un numero, por favor");
        userNumber = entrada.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            System.out.println("");
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
        }
    }
}