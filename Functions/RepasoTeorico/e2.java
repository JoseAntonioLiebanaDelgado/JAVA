package Funciones_Corregidas.RepasoTeorico;

//Completa los espacios en blanco para que el programa compile y funcione correctamente.

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {

        float pes = 0, alcada = 0, ample = 0, fons = 0;

        System.out.println("Introdueix les dades de la maleta de ma");
        pes = llegirFloat("Pes: ", 0, 100, "ERROR: Valor no float.", "Valor no valid.");
        alcada = llegirFloat("Alcada: ", 0, 100, "ERROR: Valor no float.", "Valor no valid.");
        ample = llegirFloat("Ample: ", 0, 100, "ERROR: Valor no float.", "Valor no valid.");
        fons = llegirFloat("Fons: ", 0, 100, "ERROR: Valor no float.", "Valor no valid.");

        boolean esMaletaCabina = comprovarMaleta(pes, alcada, ample, fons);

        if (esMaletaCabina) {
            System.out.println("La maleta es pot portar a cabina");
        } else {
            System.out.println("La maleta no es pot portar a cabina");
        }
    }

    private static boolean comprovarMaleta(float pes, float alcada, float ample, float fons) {
        boolean esMaletaCabina = false;
        if (pes <= 10 && alcada <= 55 && ample <= 40 && fons <= 20) {
            esMaletaCabina = true;
        }
        return esMaletaCabina;
    }

    public static int llegirFloat(String missatge, int min, int max, String mensaje_error, String opcion_invalida) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte) {
                System.out.println(mensaje_error);
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println(opcion_invalida);
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);
        llegir.close();
        return x;
    }
}





