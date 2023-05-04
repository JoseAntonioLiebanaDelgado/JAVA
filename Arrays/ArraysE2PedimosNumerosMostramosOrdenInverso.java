package Arrays;/*
2. Leer 5 números por teclado, guardarlos en un vector y
mostrarlos en orden inverso al introducido.
*/

import java.util.Scanner;

public class ArraysE2PedimosNumerosMostramosOrdenInverso {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        //Declaro array con el nombre de "numeros"
        int[] numeros;
        //Declaro e inicio en 0 una variable de tipo byte con nombre "longitudVector"
        byte longitudVector = 0;
        //Declaro variable boleana y se inicia el true por defecto
        boolean valorCorrecte;

        System.out.println("Benvingut/da al programa...");

        do {
            System.out.println("Quants números vols guardar?");
            valorCorrecte = llegir.hasNextByte();

            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no correcte! (escriu un numero enter)");
            } else {
                longitudVector = llegir.nextByte();
                if (longitudVector < 2 || longitudVector > 10) {
                    System.out.println("ERROR: Valor incorrecte! (escriu un valor del 2 al 10)");
                    valorCorrecte = false;
                }
            }
            llegir.nextLine();
        } while (!valorCorrecte);

        numeros = new int[longitudVector];


        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Escriu el valor " + (i + 1) + ": ");
                valorCorrecte = llegir.hasNextInt();
                if (!valorCorrecte) {
                    System.out.println("Error. Caracter no correcte");
                } else {
                    numeros[i] = llegir.nextInt();
                    if (numeros[i] <= 0) {
                        System.out.println("valor fuera de rango (No puede ser menor o igual 0)");
                        valorCorrecte = false;
                    }
                }
                llegir.nextLine();
            } while (!valorCorrecte);
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("[" + numeros[i] + "]");
        }
    }
}