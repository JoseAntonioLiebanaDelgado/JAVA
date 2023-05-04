package Arrays;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        //Creamos una array y le damos valor aleatorio
        int[] matriz_Aleatorios = new int[50];

        //Damos valor
        for (int i = 0; i < matriz_Aleatorios.length; i++) {
            matriz_Aleatorios[i] = (int) Math.round(Math.random() * 100);
        }

        //Imprimimos
        for (int i = 0; i < matriz_Aleatorios.length; i++) {
            System.out.print(matriz_Aleatorios[i] + " ");
        }
    }
}
