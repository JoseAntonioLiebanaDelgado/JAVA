package InitialExercises;

import java.util.Scanner;

public class ExercicisInicials4PorcentajeAlumnosDeClase {
    public static void main(String[] args) {


        /* El Departament d’Ensenyament de la Generalitat vol saber el percentatge nois i noies
        que hi ha a les aules. Dissenya un algoritme que pregunti quantes noies i nois hi ha a
        l’aula i aleshores en mostri els percentatges.*/


        Scanner llegir = new Scanner(System.in);

        int numNois, numNoies, numAlumnes;

        System.out.println("Quants nois hi ha a clase");
        numNois = llegir.nextInt();

        System.out.println("Quantes noies hi ha a clase");
        numNoies = llegir.nextInt();

        numAlumnes = numNois + numNoies;

        System.out.println("El percentatge de nois a clase es del " + numNois * 100 / numAlumnes + " %.");
        System.out.println("El percentatge de noies a clase es del " + numNoies * 100 / numAlumnes + " %.");
    }
}
