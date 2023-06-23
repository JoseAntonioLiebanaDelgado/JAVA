package Matrix;

import java.util.Scanner;

public class MatricesNotasUsuarios {
    public static void main(String[] args) {
        final int filas = 5;
        final int columnas = 3;
        Scanner input = new Scanner(System.in);
        int numAlumne = 0; 

        int[][] notas; // Declarar una matriz de int de dos dimensiones
        String[] alumnes = {"Ferran", "Chris", "Montoya", "Brian", "Lluis"};
        notas = new int[filas][columnas]; // 5 filas y 3 columnas

        System.out.println("La matriz notas tiene " + notas.length + " filas");
        System.out.println("La matriz notas tiene " + notas[0].length + " columnas");

        for (int row = 0; row < notas.length; row++) {
            for (int col = 0; col < notas[row].length; col++) {
                System.out.print("Escribe el valor de la posicion [" + row + "][" + col + "]: ");
                System.out.println();
                notas[row][col] = input.nextInt();
                input.nextLine();
            }
            System.out.println();
        }

        for (int i = 0; i < alumnes.length; i++) {
            System.out.println("Alumno " + i + ": " + alumnes[i]);
        }

        System.out.println("Elige un alumno");
        numAlumne = input.nextInt();
        input.nextLine();

        for (int col = 0; col < notas[numAlumne].length; col++) {
            System.out.println(notas[numAlumne][col]);
        }

        System.out.println("A continuación verás las notas de tod@s");

        // Inicio: Imprime toda la matriz
        System.out.println("  0   1   2");
        for (int i = 0; i < notas.length; i++) { // filas
            System.out.print(i + " ");
            for (int j = 0; j < notas[i].length; j++) { // columnas
                System.out.print("[" + notas[i][j] + "] ");
            }
            System.out.println();
        }
        // Fin: Imprime toda la matriz
    }
}
