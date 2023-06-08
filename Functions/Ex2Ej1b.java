package Funciones_Corregidas;

/*Ejercicio 1: Manipulación y comparación de cadenas
Escribe un programa en Java que permita al usuario realizar las siguientes acciones:
Introducir la primera cadena: El programa solicitará al usuario que ingrese una cadena de texto y la almacenará.
Introducir la segunda cadena: El programa solicitará al usuario que ingrese otra cadena de texto y la almacenará.
Comparar las cadenas: El programa comparará las dos cadenas ingresadas por el usuario y determinará si son iguales o no. Mostrará un mensaje indicando el resultado de la comparación.
Salir: El programa finalizará su ejecución.
El programa validará las opciones ingresadas por el usuario y mostrará mensajes de error en caso de que se introduzcan valores incorrectos. El menú se repetirá hasta que el usuario elija la opción de salida.package Funciones_Corregidas;
*/

import java.util.Scanner;

public class Ex2Ej1b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cadena1 = "", cadena2 = "";
        int opcion = 0;

        do {
            opcion = llegirInt("Selecciona una de las siguientes opciones:", 1, 4,
                    "Error, seleccione una opcion de nuevo", "Valor fuera de rango");

            System.out.println("1. Introduce la primera cadena");
            System.out.println("2. Introduce la segunda cadena");
            System.out.println("3. Comparar las cadenas");
            System.out.println("4. Salir");


            switch (opcion) {
                case 1:
                    cadena1 = introduirPrimeraCadena(input);
                    break;
                case 2:
                    cadena2 = introduirSegonaCadena(input);
                    break;
                case 3:
                    compararCadenas(cadena1, cadena2);
                    break;
                case 4:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 4);
    }

    private static String introduirPrimeraCadena(Scanner abc) {
        System.out.print("Introduce la primera cadena: ");
        return abc.nextLine();
    }

    private static String introduirSegonaCadena(Scanner hhh) {
        System.out.println("Introduce la segunda cadena: ");
        return hhh.nextLine();
    }

    private static void compararCadenas(String cadena1, String cadena2) {
        if (cadena1 != null && cadena2 != null) {
            if (cadena1.equalsIgnoreCase(cadena2)) {
                System.out.println("Las cadenas son iguales");
            } else {
                System.out.println("Las cadenas son distintas");
            }
        } else {
            System.out.println("Las cadenas no tienen valor");
        }
    }

    public static int llegirInt(String missatge, int min, int max, String mensaje_error, String opcion_invalida) {
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

