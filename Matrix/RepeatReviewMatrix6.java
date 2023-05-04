package Matrix;

import java.util.Scanner;

public class RepeatReviewMatrix6 {
    public static void main(String[] args) {

        /*
        PINTAR ESTA MATRIZ, PERO EL USUARIO INDICA EL NUMERO DE COLUMNAS Y FILAS

        TRUE  | FALSE | TRUE  | FALSE | TRUE
        FALSE | TRUE  | FALSE | TRUE  | FALSE
        TRUE  | FALSE | TRUE  | FALSE | TRUE
        FALSE | TRUE  | FALSE | TRUE  | FALSE
        TRUE  | FALSE | TRUE  | FALSE | TRUE
        */

        Scanner llegir = new Scanner(System.in);

        boolean tipatgeCorrecte = false;
        int userNumberFilas = 0;
        int userNumberColumnas = 0;

        do {
            System.out.println("Introduce un numero para la medida de las filas");
            tipatgeCorrecte = llegir.hasNextInt();
            if (!tipatgeCorrecte) {
                System.out.println("Valor no numerico");
            } else {
                userNumberFilas = llegir.nextInt();
                if (userNumberFilas < 2 || userNumberFilas > 20) {
                    System.out.println("Limite superado");
                    tipatgeCorrecte = false;
                }
            }
            llegir.nextLine();
        } while (!tipatgeCorrecte);

        do {
            System.out.println("Introduce un numero para la medida de las columnas");
            tipatgeCorrecte = llegir.hasNextInt();
            if (!tipatgeCorrecte) {
                System.out.println("Valor no numerico");
            } else {
                userNumberColumnas = llegir.nextInt();
                if (userNumberColumnas < 2 || userNumberColumnas > 20) {
                    System.out.println("Limite superado");
                    tipatgeCorrecte = false;
                }
            }
            llegir.nextLine();
        } while (!tipatgeCorrecte);

        boolean[][] matriu = new boolean[userNumberFilas][userNumberColumnas];
        boolean rellenaco = false;

        //NO FURULA, NO SE IMPRIMEN ALEATORIOS
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                matriu[i][j] = rellenaco;
                rellenaco = !rellenaco;
            }
        }

        for (int i = 0; i < userNumberFilas; i++) {
            for (int j = 0; j < userNumberColumnas; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }
    }
}