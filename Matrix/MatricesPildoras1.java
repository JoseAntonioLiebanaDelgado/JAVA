package Matrix;

import java.util.Scanner;

public class MatricesPildoras1 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][5];

        matrix[0][0] = 15;
        matrix[0][1] = 45;
        matrix[0][2] = 12;
        matrix[0][3] = 548;
        matrix[0][4] = 28;

        matrix[1][0] = 78;
        matrix[1][1] = 2;
        matrix[1][2] = 17;
        matrix[1][3] = 14;
        matrix[1][4] = 15;

        matrix[2][0] = 175;
        matrix[2][1] = 5;
        matrix[2][2] = 88;
        matrix[2][3] = 8;
        matrix[2][4] = 165;

        matrix[3][0] = 25;
        matrix[3][1] = 45;
        matrix[3][2] = 36;
        matrix[3][3] = 8;
        matrix[3][4] = 5;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
