package m3uf5_pou01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class AgendaHashSet {

    /**
     * @param args
     */

    //Declaramos estas dos referencias como estáticas, para poder usarlas en todos los métodos
    static Scanner sc;
    HashSet<Persona> listaPersonas;

    public AgendaHashSet(HashSet<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void init() {
        sc = new Scanner(System.in);
        int opcion;

        do {
            //Al inicio de cada iteración mostramos el menú, y recogemos la opción
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

    /*
     * MÉTODO QUE IMPRIME EL MENÚ
     */
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

    /*
     * MÉTODO QUE LISTA TODOS LOS CONTACTOS DE LA AGENDA
     * O MUESTRA UN MENSAJE SI NO HAY NINGUNO QUE MOSTRAR
     */
    public void listarPersonas() {
        if (listaPersonas.isEmpty()) {
            System.out.println("La agenda no tiene contactos\n");
        } else {
            int i = 0;
            for (Persona p :listaPersonas ) {
                System.out.printf("%d %s %s (%s) %n", i, p.getNombre(), p.getApellidos(), p.getTelefono());
                i++;
            }
            System.out.println("");
        }
    }

    /*
     * MÉTODO QUE RECOGE LOS DATOS DEL USUARIO
     * PARA AÑADIR UNA NUEVA PERSONA, Y LA INSERTA EN LA LISTA
     */
    public void aniadirPersona() {
        System.out.println("\n\nAÑADIR NUEVO CONTACTO");
        System.out.print("Introduzca el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca los apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Introduzca su número de teléfono: ");
        String telefono = sc.nextLine();

        listaPersonas.add(new Persona(nombre, apellidos, telefono));

        System.out.println("");

    }

    /*
     * MÉTODO QUE ELIMINA UNA PERSONA DE LA AGENDA
     * EN FUNCIÓN DE UNA POSICIÓN RECOGIDA DEL TECLADO
     */
    public void eliminarPersona() {
        System.out.println("\n\nELIMINAR CONTACTO");
        System.out.print("Introduzca la posición del contacto: ");
        int posicion = Integer.parseInt(sc.nextLine());
        if (posicion < 0 || posicion >= listaPersonas.size()) {
            System.out.println("Posición erronea");
        } else {
            System.out.print("¿Está usted seguro de querer eliminar el contacto? (S/N): ");
            String siono = sc.nextLine();
            if (siono.equalsIgnoreCase("S")) {
                listaPersonas.remove(posicion);
            }
        }
        System.out.println("");


    }

    /*
     * MÉTODO QUE ELIMINA TODOS LOS CONTACTOS DE LA AGENDA
     * PREVIA CONFIRMACIÓN DE LA OPERACIÓN
     */
    public void eliminarTodas() {
        System.out.println("\n\nELIMINAR CONTACTO");
        System.out.print("¿Está usted seguro de querer eliminar el contacto? (S/N): ");
        String siono = sc.nextLine();
        if (siono.equalsIgnoreCase("S")) {
            listaPersonas.clear();
        }
        System.out.println("");

    }

}