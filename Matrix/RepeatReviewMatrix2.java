package Matrix;

import java.util.Scanner;

public class RepeatReviewMatrix2 {
    public static void main(String[] args) {

        /*
        PINTAR ESTA MATRIZ, PERO EL USUARIO INDICA EL NUMERO DE COLUMNAS Y FILAS
        1  | 2  | 3  | 4  | 5
        6  | 7  | 8  | 9  | 10
        11 | 12 | 13 | 14 | 15
        16 | 17 | 18 | 19 | 20
        21 | 22 | 23 | 24 | 25
         */

        Scanner input = new Scanner(System.in);
        boolean tipatgeCorrecte = false;
        int userNumberFiles = 0;
        int userNumberColumnes = 0;

        do {
            System.out.println("Escriu un numero per utilitzarlo en les files de la matriu, si un plau");
            tipatgeCorrecte = input.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Error. Caracter invalid.");
            } else {
                userNumberFiles = input.nextInt();
                if (userNumberFiles < 2 || userNumberFiles > 20) {
                    System.out.println("El numero te que estar entre 2 y 20");
                    tipatgeCorrecte = false;
                }
            }
            input.nextLine();
        } while (!tipatgeCorrecte);

        do {
            System.out.println("Escriu un numero per utilitzarlo en les columnes de la matriu, si un plau");
            tipatgeCorrecte = input.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Error. Caracter invalid.");
            } else {
                userNumberColumnes = input.nextInt();
                if (userNumberColumnes < 2 || userNumberColumnes > 20) {
                    System.out.println("El numero te que estar entre 2 y 20");
                    tipatgeCorrecte = false;
                }
            }
            input.nextLine();
        } while (!tipatgeCorrecte);

        int[][] matriuMida = new int[userNumberFiles][userNumberColumnes];
        int valor = 1;

        for (int i = 0; i < matriuMida.length; i++) {
            for (int j = 0; j < matriuMida[i].length; j++) {
                matriuMida[i][j] = valor;
                valor++;
            }
        }

        for (int i = 0; i < userNumberFiles; i++) {
            for (int j = 0; j < userNumberColumnes; j++) {
                System.out.print(matriuMida[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
