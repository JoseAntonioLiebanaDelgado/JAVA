package Matrix;

import java.util.Scanner;

public class MatricesPedimosNotasSacamosMedia {
    public static void main(String[] args) {

        int[][] notes = new int[20][3];
        Scanner llegir = new Scanner(System.in);
        int[] suma = new int[20];
        int[] promedio = new int[20];

        int max = 11;
        int min = 0;

        System.out.println("Escriu les notes de cada alumne");

        for (int Alumnes = 0; Alumnes < 20; Alumnes++) {
            for (int Notes = 0; Notes < 3; Notes++) {
                System.out.println("Escriu la nota " + (Notes + 1) + " de l'alumne " + (Alumnes + 1) + "");
                notes[Alumnes][Notes] = (int) ((Math.random() * (max - min)) + min);
            }
        }
        for (int Alumnes = 0; Alumnes < 20; Alumnes++) {
            for (int Notes = 0; Notes < 3; Notes++) {
                suma[Alumnes] += notes[Alumnes][Notes];
            }
            promedio[Alumnes] = suma[Alumnes] / 3;
        }

        int[] numeroMayor = new int[20];
        int[] numeroMenor = new int[20];

        for (int Alumnes = 0; Alumnes < 20; Alumnes++) {
            numeroMenor[Alumnes] = 10;
            for (int Notes = 0; Notes < 3; Notes++) {


                if (notes[Alumnes][Notes] < numeroMenor[Alumnes]) {
                    numeroMenor[Alumnes] = notes[Alumnes][Notes];
                }
                if (notes[Alumnes][Notes] > numeroMayor[Alumnes]) {
                    numeroMayor[Alumnes] = notes[Alumnes][Notes];
                }
            }
        }

        int[][] notesFinals = new int[20][6];

        for (int Alumnes = 0; Alumnes < 20; Alumnes++) {

            for (int Notes = 0; Notes < 6; Notes++) {
                notesFinals[Alumnes][0] = notes[Alumnes][0];
                notesFinals[Alumnes][1] = notes[Alumnes][1];
                notesFinals[Alumnes][2] = notes[Alumnes][2];
                notesFinals[Alumnes][3] = numeroMenor[Alumnes];
                notesFinals[Alumnes][4] = numeroMayor[Alumnes];
                notesFinals[Alumnes][5] = promedio[Alumnes];

                System.out.print(notesFinals[Alumnes][Notes] + "\t");
            }
            System.out.println(" ");
        }
        int mejorNota = 0;
        int peorNota = 10;

        for (int Alumnes = 0; Alumnes < 20; Alumnes++) {

            if (promedio[Alumnes] < peorNota) {
                peorNota = promedio[Alumnes];
            }
            if (promedio[Alumnes] > mejorNota) {
                mejorNota = promedio[Alumnes];
            }
        }
        System.out.println("La peor nota ha sido: " + peorNota);
        System.out.println("La mejor nota ha sido :" + mejorNota);
    }
}