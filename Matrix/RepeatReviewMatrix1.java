package Matrix;

import java.util.Scanner;

public class RepeatReviewMatrix1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         /*
        PINTAR ESTA MATRIZ, PERO EL USUARIO INDICA EL NUMERO DE COLUMNAS Y FILAS
        1 | 2 | 3 | 4 | 5
        1 | 2 | 3 | 4 | 5
        1 | 2 | 3 | 4 | 5
        1 | 2 | 3 | 4 | 5
        1 | 2 | 3 | 4 | 5
         */

        boolean tipatgeCorrecte = false;
        int userNumber = 1;

        do {
            System.out.println("Escriu un numero entre 2 y 20");
            tipatgeCorrecte = input.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Error. Caracter invalid");
            } else {
                userNumber = input.nextInt();
                if (userNumber < 2 || userNumber > 20) {
                    System.out.println("Error, el numero introducido debe esta entre el 2 y el 30");
                    tipatgeCorrecte = false;
                }
            }
            input.nextLine();
        } while (!tipatgeCorrecte);

        int[][] matrizMedida = new int[userNumber][userNumber];
        int valor = 1;

        for (int i = 0; i < matrizMedida.length; i++) {
            for (int j = 0; j < matrizMedida.length; j++) {
                matrizMedida[i][j] = valor;
                valor++;
            }
            valor = 1;
        }

        for (int i = 0; i < matrizMedida.length; i++) {
            for (int j = 0; j < matrizMedida.length; j++) {
                System.out.print(matrizMedida[i][j]);
            }
            System.out.println();
        }
    }
}











