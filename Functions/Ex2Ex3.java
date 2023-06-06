package Funciones_Corregidas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2Ex3 {
    private static List<List<String>> reparaciones = new ArrayList<>();
    private static List<List<String>> treballadors = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1. Dar de alta una nueva reparación");
            System.out.println("2. Dar de alta un nuevo trabajador");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    darDeAltaReparacion(scanner);
                    break;
                case 2:
                    darDeAltaTrabajador(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }

            System.out.println();
        } while (opcion != 3);
    }

    private static void darDeAltaReparacion(Scanner scanner) {
        System.out.println("----- DAR DE ALTA REPARACIÓN -----");
        System.out.print("Ingrese el número de reparación: ");
        int numeroReparacion = leerEntero(scanner);

        System.out.print("Ingrese el número de serie del móvil: ");
        String numeroSerie = scanner.nextLine();

        System.out.print("Ingrese el DNI del cliente (sin letras): ");
        int dniCliente = leerEntero(scanner);

        List<String> reparacion = new ArrayList<>();
        reparacion.add(String.valueOf(numeroReparacion));
        reparacion.add(numeroSerie);
        reparacion.add(String.valueOf(dniCliente));

        reparaciones.add(reparacion);

        System.out.println("Reparación dada de alta correctamente.");
    }

    private static void darDeAltaTrabajador(Scanner scanner) {
        System.out.println("----- DAR DE ALTA TRABAJADOR -----");
        System.out.print("Ingrese el número de empleado: ");
        int numeroEmpleado = leerEntero(scanner);

        System.out.print("Ingrese el número de reparación asignada (0 si no hay ninguna): ");
        int numeroReparacionAsignada = leerEntero(scanner);

        // Verificar que el número de reparación exista en la lista de reparaciones
        boolean reparacionValida = reparaciones.stream()
                .anyMatch(reparacion -> reparacion.get(0).equals(String.valueOf(numeroReparacionAsignada)));

        if (numeroReparacionAsignada != 0 && !reparacionValida) {
            System.out.println("Número de reparación inválido. El número de reparación debe existir en la lista.");
            return;
        }

        List<String> trabajador = new ArrayList<>();
        trabajador.add(String.valueOf(numeroEmpleado));
        trabajador.add(String.valueOf(numeroReparacionAsignada));

        treballadors.add(trabajador);

        System.out.println("Trabajador dado de alta correctamente.");
    }

    private static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Error. Ingrese un número entero válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}


