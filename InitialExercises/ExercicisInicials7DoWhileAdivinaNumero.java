package InitialExercises;

import java.util.Scanner;

public class ExercicisInicials7DoWhileAdivinaNumero {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        final int MIN = 1;
        final int MAX = 10;
        int valorUsuario = 0;
        int valorCPU = 0;

        boolean tipatgeCorrecte = false;

        do {
            System.out.println("Introduce un valor entero entre " + MIN + " y " + MAX);
            tipatgeCorrecte = llegir.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Error, valor no numeric enter");
            } else {
                valorUsuario = llegir.nextInt();
            }
            if (valorUsuario < MIN || valorUsuario > MAX) {
                System.out.println("Valor fora de rang");
                tipatgeCorrecte = false;
                llegir.nextLine();
            }
        } while (tipatgeCorrecte == false);

        System.out.println(valorUsuario);

        do {
            valorCPU = (int) (Math.random() * MAX);
        } while (valorCPU < MIN || valorCPU > MAX);


        if (valorUsuario == valorCPU) {
            System.out.println("Correcto");
        } else {
            System.out.println("La CPU ha triat: " + valorCPU + " i tu has triat " + valorUsuario);
        }
    }
}
