package Matrix;

import java.util.Scanner;

public class RepeatReviewMatrix3A {
    public static void main(String[] args) {

        /*
        PINTAR ESTA MATRIZ, PERO EL USUARIO INDICA EL NUMERO DE COLUMNAS Y FILAS

        FALSE | FALSE | FALSE | FALSE | TRUE
        FALSE | FALSE | FALSE | TRUE  | FALSE
        FALSE | FALSE | TRUE  | FALSE | FALSE
        FALSE | TRUE  | FALSE | FALSE | FALSE
        TRUE  | FALSE | FALSE | FALSE | FALSE
        */

        Scanner input = new Scanner(System.in);
        boolean tipatgeCorrecte = false;
        int userNumberFilas = 0;
        int userNumberColumnas = 0;


        do {
            System.out.println("Introdueix un numero per a les files");
            tipatgeCorrecte = input.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Cacarter invalid");
            } else {
                userNumberFilas = input.nextInt();
                if (userNumberFilas < 2) {
                    System.out.println("T'has quedat curt");
                    tipatgeCorrecte = false;
                } else if (userNumberFilas > 20) {
                    System.out.println("T'has pasat de llarg");
                    tipatgeCorrecte = false;
                }
            }
            input.nextLine();
        } while (!tipatgeCorrecte);

        do {
            System.out.println("Introdueix un numero per a les columnes");
            tipatgeCorrecte = input.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Cacarter invalid");
            } else {
                userNumberColumnas = input.nextInt();
                if (userNumberColumnas < 2) {
                    System.out.println("T'has quedat curt");
                    tipatgeCorrecte = false;
                } else if (userNumberColumnas > 20) {
                    System.out.println("T'has pasat de llarg");
                    tipatgeCorrecte = false;
                }
            }
            input.nextLine();
        } while (!tipatgeCorrecte);

        boolean[][] matriu = new boolean[userNumberFilas][userNumberColumnas];
        boolean relleno;
        int posicionFinal = userNumberColumnas - 1;

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                if (j == posicionFinal) {
                    matriu[i][j] = true;
                } else {
                    matriu[i][j] = false;
                }
            }
            posicionFinal--;
        }

        for (int i = 0; i < userNumberFilas; i++) {
            for (int j = 0; j < userNumberColumnas; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
