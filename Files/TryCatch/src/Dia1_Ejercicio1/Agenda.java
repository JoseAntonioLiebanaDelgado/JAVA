package Dia1_Ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Agenda {
    static Scanner sc = new Scanner(System.in);
    HashSet<Persona> listaPersonas = new HashSet<>();

    public Agenda() {
        // Constructor
    }

    public void init() {
        int opcion;
        do {
            menu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    listarPersonas();
                    break;
                case 2:
                    aniadirPersona();
                    break;
                case 3:
                    eliminarPersona();
                    break;
                case 4:
                    eliminarTodas();
                    break;
                default:
                    System.out.println("Opción no válida. Introduzca una opción válida, por favor.");
            }
        } while (opcion != 0);
        sc.close();
    }

    public static void menu() {
        System.out.println("AGENDA DE CONTACTOS");
        System.out.println("===================");
        System.out.println("1. Listar todos los contactos");
        System.out.println("2. Añadir un contacto");
        System.out.println("3. Eliminar un contacto");
        System.out.println("4. Eliminar todos los contactos");
        System.out.println("0. Salir del programa\n\n");
        System.out.print("Introduzca una opción: ");
    }

    public void listarPersonas() {
        if (listaPersonas.isEmpty()) {
            System.out.println("La agenda no tiene contactos\n");
        } else {
            for (Persona p : listaPersonas) {
                System.out.println(p);
            }
        }
    }

    public void aniadirPersona() {
        System.out.print("Introduzca el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca los apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Introduzca su número de teléfono: ");
        String telefono = sc.nextLine();
        Persona nuevaPersona = new Persona(nombre, apellidos, telefono);
        if (!listaPersonas.add(nuevaPersona)) {
            System.out.println("El contacto ya existe en la agenda");
        }
    }

    public void aniadirPersona(Persona persona) {
        if (!listaPersonas.add(persona)) {
            System.out.println("El contacto ya existe en la agenda");
        }
    }

    public void eliminarPersona() {
        System.out.print("Introduzca el nombre del contacto a eliminar: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca los apellidos del contacto a eliminar: ");
        String apellidos = sc.nextLine();
        Iterator<Persona> iterator = listaPersonas.iterator();
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (persona.getNombre().equals(nombre) && persona.getApellidos().equals(apellidos)) {
                iterator.remove();
                System.out.println("Contacto eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void eliminarTodas() {
        System.out.print("¿Está usted seguro de querer eliminar todos los contactos? (S/N): ");
        String siono = sc.nextLine();
        if (siono.equalsIgnoreCase("S")) {
            listaPersonas.clear();
            System.out.println("Todos los contactos fueron eliminados.");
        }
    }
}
