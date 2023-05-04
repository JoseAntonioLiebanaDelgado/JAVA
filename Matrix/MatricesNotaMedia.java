package Matrix;

import java.util.Scanner;

public class MatricesNotaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[20][4];
        int i, j, promedio, mayor, menor;
        for (i = 0; i < 20; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1));
            for (j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        for (i = 0; i < 20; i++) {
            promedio = 0;
            mayor = 0;
            menor = 10;
            for (j = 0; j < 3; j++) {
                promedio = promedio + matriz[i][j];
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            matriz[i][3] = promedio / 3;
            matriz[i][4] = mayor;
            matriz[i][5] = menor;
        }
        System.out.println("\n\n");
        for (i = 0; i < 20; i++) {
            System.out.println("Alumno " + (i + 1));
            for (j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
        mayor = 0;
        menor = 10;
        for (i = 0; i < 20; i++) {
            if (matriz[i][3] > mayor) {
                mayor = matriz[i][3];
            }
            if (matriz[i][3] < menor) {
                menor = matriz[i][3];
            }
        }
        System.out.println("La mejor nota del curso es: " + mayor);
        System.out.println("La peor nota del curso es: " + menor);
    }
}