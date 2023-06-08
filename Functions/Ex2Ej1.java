package Funciones_Corregidas;

import java.util.Scanner;

public class Ex2Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "", cadena2 = "";
        int opcion = 0;

        do {
            System.out.println("1. Introduce la primera cadena");
            System.out.println("2. Introduce la segunda cadena");
            System.out.println("3. Comparar las cadenas");
            System.out.println("4. Salir");

            opcion = llegirEnter("Ingrese una opción: ", 1, 4, "Opción inválida. Inténtalo de nuevo.", "Opción inválida. Inténtalo de nuevo.");

            switch (opcion) {
                case 1:
                    cadena1 = introducirPrimeraCadena(scanner);
                    break;
                case 2:
                    cadena2 = introducirSegundaCadena(scanner);
                    break;
                case 3:
                    compararCadenas(cadena1, cadena2);
                    break;
                case 4:
                    System.out.println("Hasta pronto!");
                    return;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }

            System.out.println();
        } while (opcion != 4);
    }

    public static int llegirEnter(String mensaje, int min, int max, String mensaje_error, String opcion_invalida) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        boolean valorCorrecto = false;

        do {
            System.out.print(mensaje);
            valorCorrecto = scanner.hasNextInt();

            if (!valorCorrecto) {
                System.out.println(mensaje_error);
                scanner.nextLine();
            } else {
                x = scanner.nextInt();
                scanner.nextLine();
                if (x < min || x > max) {
                    System.out.println(opcion_invalida);
                    valorCorrecto = false;
                }
            }
        } while (!valorCorrecto);

        return x;
    }

    public static String introducirPrimeraCadena(Scanner scanner) {
        System.out.print("Introduce la primera cadena: ");
        return scanner.nextLine();
    }

    public static String introducirSegundaCadena(Scanner scanner) {
        System.out.print("Introduce la segunda cadena: ");
        return scanner.nextLine();
    }

    public static void compararCadenas(String cadena1, String cadena2) {
        if (cadena1 != null && cadena2 != null) {
            if (cadena1.equals(cadena2)) {
                System.out.println("Las cadenas son iguales.");
            } else {
                System.out.println("Las cadenas no son iguales.");
            }
        } else {
            System.out.println("Debes introducir ambas cadenas antes de compararlas.");
        }
    }
}





































