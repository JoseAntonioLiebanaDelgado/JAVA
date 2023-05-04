package Arrays;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        //int miMatriz [] = new int [5];
        /*int [] miMatriz = new int [5];

        miMatriz [0] = 5;
        miMatriz [1] = 38;
        miMatriz [2] = -15;
        miMatriz [3] = 92;
        miMatriz [4] = 71;

        /*System.out.println(miMatriz[0]);
        System.out.println(miMatriz[1]);
        System.out.println(miMatriz[2]);
        System.out.println(miMatriz[3]);
        System.out.println(miMatriz[4]);*/

        //Esta linea hace lo mismo que las lineas 9, 10, 11, 12 y 13
        int[] miMatriz = {5, 38, -15, 92, 71};

        /*for (int i = 0; i < 5; i++) {
            System.out.println("Valor del indice " + i + " = " + miMatriz[i]);
        }*/

        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println("Valor del indice " + i + " = " + miMatriz[i]);
        }
    }
}
