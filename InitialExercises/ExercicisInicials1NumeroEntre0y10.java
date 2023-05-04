package InitialExercises;

import java.util.Scanner;

public class ExercicisInicials1NumeroEntre0y10 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        /* Dissenya un programa que demani a l’usuari un valor no negatiu per teclat. Si l’usuari
        insereix un valor negatiu, el programa li haurà de demanar de nou el valor fins que
        sigui positiu.
        Extra: Modifica el teu algoritme per a què només accepti valors entre 0 i 10.*/


        int valorUsuari = 0;
        boolean tipatgeCorrecte;

        System.out.println("Benvingut al programa");

        do {
            do {
                System.out.println("Escriu un numero positiu entre el 0 i el 10, ambdos inclosos");
                tipatgeCorrecte = llegir.hasNextInt();
                if (!tipatgeCorrecte) {
                    System.out.println("Error, caracter no correcte");
                } else {
                    valorUsuari = llegir.nextInt();
                }
                llegir.nextLine();

            } while (tipatgeCorrecte == false);
        } while (valorUsuari <= 0 || valorUsuari > 10);

        System.out.println("Correcto");
    }
}
