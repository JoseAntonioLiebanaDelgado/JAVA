package Arrays;

import java.util.Scanner;

public class ArraysE7MostrarNumerosCreadosPorRandom {
    public static void main(String[] args) {

        /* 7. Leer 10 enteros. Leer un número
        entero N y buscarlo en el vector. Se tiene que mostrar la
        posición en que se encuentra. Si no está, indicarlo con un
        mensaje. */

        // Declaración de valores
        Scanner llegir = new Scanner(System.in);
        int[] vector = new int[10];
        int valorBuscar;
        boolean valorCorrecto, valorEncontrado;

        do {
            valorEncontrado = false;
            valorBuscar = 0;
            System.out.println(" ");

            for (int i = 0; i < vector.length; i++) {
                vector[i] = (int) (Math.random() * 10);
                System.out.print("[" + vector[i] + "]");
            }
            System.out.println(" ");

            // Leemos valor entero con control de errores
            do {
                System.out.print("Escribe un valor entero a buscar del 0 al 10: ");
                valorCorrecto = llegir.hasNextInt();

                if (!valorCorrecto) {
                    System.out.println("ERROR: No es un entero");
                } else {
                    valorBuscar = llegir.nextInt();
                    // Control dominio de valores
                    if (valorBuscar < 0 || valorBuscar > 10) {
                        System.out.println("ERROR: Valor elegido fuera de dominio. Prueba otra vez.");
                        valorCorrecto = false;
                    }
                    // Fin control dominio de valores
                }
                llegir.nextLine();
            } while (!valorCorrecto);
            // Fin lectura de entero con control de errores

            // Vamos a buscar el 'valorBuscar' dentro del 'vector'
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == valorBuscar) {
                    System.out.println("EUREKA! Valor encontrado en la posición " + i);
                    valorEncontrado = true;
                    //break;
                }
            }

            if (!valorEncontrado) {
                System.out.println("Lo siento, no has ganado hoy! Prueba otra vez mañana.");
            }
        } while (true);
    }
}