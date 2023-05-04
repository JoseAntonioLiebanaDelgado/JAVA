package Matrix;

import java.util.Scanner;

public class RepeatReviewMatrix4 {
    public static void main(String[] args) {
        
        /*
        PINTAR ESTA MATRIZ, PERO EL USUARIO INDICA EL NUMERO DE COLUMNAS Y FILAS
        A | B | A | B | A
        A | B | A | B | A
        A | B | A | B | A
        A | B | A | B | A
        A | B | A | B | A
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
                    System.out.println("Limites superados");
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
                    System.out.println("Limites superados");
                    tipatgeCorrecte = false;
                }
            }
            llegir.nextLine();
        } while (!tipatgeCorrecte);

        char[][] matriu = new char[userNumberFilas][userNumberColumnas];
        char valor;

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if (j % 2 == 0 || j == 0) {
                    valor = 'A';
                } else {
                    valor = 'B';
                }
                matriu[i][j] = valor;
            }
        }

        for (int i = 0; i < userNumberFilas; i++) {
            for (int j = 0; j < userNumberColumnas; j++) {
                System.out.print(matriu[i][j]);
            }
            System.out.println();
        }
    }
}
