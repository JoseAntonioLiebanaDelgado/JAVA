package Arrays;

import java.util.Scanner;

public class Arrays6ForEach {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int[] matrizAleatorios = new int[150];

        for (int i = 0; i < matrizAleatorios.length; i++) {
            matrizAleatorios[i] = (int) Math.round(Math.random() * 100);
        }

        for (int numeros : matrizAleatorios) {
            System.out.print(numeros + " ");
        }
    }
}
