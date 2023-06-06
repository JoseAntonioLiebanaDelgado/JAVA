package Funciones_Corregidas;

import java.util.Scanner;

public class Ex2Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = null, cadena2 = null;

        while (true) {
            System.out.println("1. Introduce la primera cadena");
            System.out.println("2. Introduce la segunda cadena");
            System.out.println("3. Comparar las cadenas");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = llegirEnter("Ingrese una opción: ", 1, 4, "Opción inválida. Inténtalo de nuevo.", "Opción inválida. Inténtalo de nuevo.");

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la primera cadena: ");
                    cadena1 = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Introduce la segunda cadena: ");
                    cadena2 = scanner.nextLine();
                    break;
                case 3:
                    if (cadena1 != null && cadena2 != null) {
                        if (cadena1.equals(cadena2)) {
                            System.out.println("Las cadenas son iguales.");
                        } else {
                            System.out.println("Las cadenas no son iguales.");
                        }
                    } else {
                        System.out.println("Debes introducir ambas cadenas antes de compararlas.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }

            System.out.println();
        }
    }

    public static int llegirEnter(String missatge, int min, int max, String mensaje_error, String opcion_invalida) {
        Scanner llegir = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.print(missatge);
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

        return x;
    }
}
