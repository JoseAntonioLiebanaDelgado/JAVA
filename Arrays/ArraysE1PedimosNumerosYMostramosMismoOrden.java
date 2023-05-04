package Arrays;

import java.util.Scanner;

public class ArraysE1PedimosNumerosYMostramosMismoOrden {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        /*1. Leer 5 números por teclado, guardarlos en un vector y
        mostrarlos en el mismo orden introducido.
        (Utilizaremos un bucle para pedir los valores al usuario y guardarlos al vector;
        y otro bucle para mostrarlos).*/


        int cantidadValoresUsuario = 0;
        int userNumber;
        boolean tipatgeCorrecte = false;


        do {
            System.out.println("Quants valors vols escriure?");
            tipatgeCorrecte = llegir.hasNextInt();
            if (!tipatgeCorrecte) {
                System.out.println("ERROR: Eso no es un numero");
            } else {
                cantidadValoresUsuario = llegir.nextInt();
                // Control dominio de valores
                if (cantidadValoresUsuario < 1) {
                    System.out.println("ERROR: Valor elegido fuera de dominio. Prueba otra vez.");
                    tipatgeCorrecte = false;
                }
                // Fin control dominio de valores
            }
            llegir.nextLine();
        } while (!tipatgeCorrecte);


        int[] cajaNumeros = new int[cantidadValoresUsuario];

        for (int i = 0; i < cantidadValoresUsuario; i++) {
            do {
                System.out.println("Escriu el numero:");
                tipatgeCorrecte = llegir.hasNextInt();
                if (!tipatgeCorrecte) {
                    System.out.println("ERROR: No es un entero");
                } else {
                    cajaNumeros[i] = llegir.nextInt();
                    // Fin control dominio de valores
                }
                llegir.nextLine();
            } while (!tipatgeCorrecte);
            // Fin lectura de entero con control de errores
        }
        for (int i = 0; i < cajaNumeros.length; i++) {
            System.out.println(cajaNumeros[i]);
        }
    }
}
