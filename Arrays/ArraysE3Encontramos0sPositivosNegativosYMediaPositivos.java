package Arrays;

import java.util.Scanner;

public class ArraysE3Encontramos0sPositivosNegativosYMediaPositivos {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);


        /*3. Leer 5 números por teclado y a continuación realizar la media
        de los números positivos, la media de los números negativos y
        contar el número de ceros.*/


        int quantitatPositius = 0;
        int quantitatNegatius = 0;
        int quantitatCeros = 0;
        int sumatoriPositius = 0;
        boolean tipatgeCorrecte = false;

        int[] numeros = new int[5];
        int cont = 0;


        do {
            System.out.println("Escriu el valor de la posicio " + cont + " :");
            //Si el tipo de valor es correcto, tipatge correcte devuelve un true
            tipatgeCorrecte = llegir.hasNextInt();

            if (tipatgeCorrecte == false) {
                System.out.println("Error: Valor no numeric");
            } else {
                numeros[cont] = llegir.nextInt();
                tipatgeCorrecte = false;
                cont++;
            }
            llegir.nextLine();
        } while (cont < numeros.length);


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                quantitatCeros++;
            } else if (numeros[i] < 0) {
                quantitatNegatius++;
            } else {
                quantitatPositius++;
                sumatoriPositius = sumatoriPositius + numeros[i];
            }
        }

        System.out.println("Al vector hi ha " + quantitatCeros + " 0's");
        System.out.println("Al vector hi ha " + quantitatPositius + " positius");
        System.out.println("Al vector hi ha " + quantitatNegatius + " negatius");
        System.out.println("La mitjana dels valors positius es: " + (sumatoriPositius / (float) quantitatPositius));
    }
}
