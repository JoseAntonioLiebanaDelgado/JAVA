package Matrix;

import java.util.Scanner;

public class RepeatReviewMatrix5 {
    public static void main(String[] args) {

        /*
        PINTAR ESTA MATRIZ, PERO EL USUARIO INDICA EL NUMERO DE COLUMNAS Y FILAS
        25 | 24 | 23 | 22 | 21
        20 | 19 | 18 | 17 | 16
        15 | 14 | 13 | 12 | 11
        10 | 9  | 8  | 7  | 6
        5  | 4  | 3  | 2  | 1
         */

        Scanner llegir = new Scanner(System.in);

        boolean tipatgeCorrecte = false;
        int userNumberFilas = 0;
        int userNumberColumnas = 0;

        do {
            System.out.println("Introduce un 5 para la medida de las filas");
            tipatgeCorrecte = llegir.hasNextInt();
            if (!tipatgeCorrecte) {
                System.out.println("Valor no numerico");
            } else {
                userNumberFilas = llegir.nextInt();
                if (userNumberFilas != 5) {
                    System.out.println("Solo puede ser 5");
                    tipatgeCorrecte = false;
                }
            }
            llegir.nextLine();
        } while (!tipatgeCorrecte);

        do {
            System.out.println("Introduce un 5 para la medida de las columnas");
            tipatgeCorrecte = llegir.hasNextInt();
            if (!tipatgeCorrecte) {
                System.out.println("Valor no numerico");
            } else {
                userNumberColumnas = llegir.nextInt();
                if (userNumberColumnas != 5) {
                    System.out.println("Solo puede ser 5");
                    tipatgeCorrecte = false;
                }
            }
            llegir.nextLine();
        } while (!tipatgeCorrecte);

        int[][] matriz = new int[userNumberFilas][userNumberColumnas];
        int valor = 25;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = valor;
                valor--;
            }
        }

        for (int i = 0; i < userNumberFilas; i++) {
            for (int j = 0; j < userNumberColumnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}