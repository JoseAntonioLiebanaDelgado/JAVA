package Funciones_Corregidas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * En esta clase tenemos un ejemplo de cómo hacer un menú con un ArrayList.
 */
public class Exercise1_review {

    final static String MENU_PRINCIPAL = "\n\t1.Consultar biblioteca\n\t2.Consultar título\n\t3.Insertar libro\n\t4.Eliminar libro\n\t5.Modificar libro\n\t6.Reiniciar biblioteca\n\t7.Salir\n";


    /**
     * En el método main tenemos el menú principal con las opciones que se pueden hacer en la biblioteca.
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> llibres;
        llibres = bibliotecaInit();
        int opcioMenuPrincipal = 0;

        do {
            System.out.println("Bienvenido al programa");
            opcioMenuPrincipal = llegirEnter(MENU_PRINCIPAL, 1, 7);

            switch (opcioMenuPrincipal) {
                case 1:
                    imprimirLlibres(llibres);
                    break;
                case 2:
                    String titol = llegirCadena("Introduce el título del libro: ");
                    buscarLlibre(llibres, titol);
                    break;
                case 3:
                    String nouLlibre = llegirCadena("Introduce el nombre del nuevo libro: ");
                    inserirLlibre(llibres, nouLlibre);
                    break;
                case 4:
                    String llibreAEliminar = llegirCadena("Introduce el título del libro a eliminar: ");
                    eliminarLlibre(llibres, llibreAEliminar);
                    break;
                case 5:
                    String titolActual = llegirCadena("Introduce el título del libro a modificar: ");
                    String nouTitol = llegirCadena("Introduce el nuevo título del libro: ");
                    modificarLlibre(llibres, titolActual, nouTitol);
                    break;
                case 6:
                    llibres = reiniciarBiblioteca();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
            }
        } while (opcioMenuPrincipal != 7);
    }

    /**
     * Este método imprime los libros que hay en el ArrayList.
     * Esta parte del código es un for each que recorre tod0 el ArrayList e imprime los libros que hay.
     *
     * @param llibres
     */
    private static void imprimirLlibres(ArrayList<String> llibres) {
        for (String llibre : llibres) {
            System.out.println(llibre);
        }
    }

    /**
     * Este método busca un libro en el ArrayList.
     *
     * @param biblioteca
     * @param titol
     */
    private static void buscarLlibre(ArrayList<String> biblioteca, String titol) {
        for (String llibre : biblioteca) {
            if (llibre.equalsIgnoreCase(titol)) {
                System.out.println("El libro " + titol + " se encuentra en la biblioteca.");
                return;
            }
        }
        System.out.println("El libro " + titol + " no se encuentra en la biblioteca.");
    }

    /**
     * Este método agrega un libro al ArrayList.
     *
     * @param llibres
     * @param nouLlibre
     */
    private static void inserirLlibre(ArrayList<String> llibres, String nouLlibre) {
        llibres.add(nouLlibre);
        System.out.println("El libro " + nouLlibre + " se ha agregado a la biblioteca.");
    }

    /**
     * Este método elimina un libro del ArrayList.
     *
     * @param llibres
     * @param llibreAEliminar
     */
    private static void eliminarLlibre(ArrayList<String> llibres, String llibreAEliminar) {
        if (llibres.removeIf(llibre -> llibre.equalsIgnoreCase(llibreAEliminar))) {
            System.out.println("El libro " + llibreAEliminar + " se ha eliminado correctamente de la biblioteca.");
        } else {
            System.out.println("El libro " + llibreAEliminar + " no se encuentra en la biblioteca.");
        }
    }

    /**
     * Este método modifica un libro del ArrayList.
     *
     * @param llibres
     * @param titolActual
     * @param nouTitol
     */
    private static void modificarLlibre(ArrayList<String> llibres, String titolActual, String nouTitol) {
        int index = llibres.indexOf(titolActual);
        if (index != -1) {
            llibres.set(index, nouTitol);
            System.out.println("El libro " + titolActual + " ha sido modificado por " + nouTitol + ".");
        } else {
            System.out.println("El libro " + titolActual + " no se encuentra en la biblioteca.");
        }
    }

    /**
     * Este método lee una cadena de texto introducida por el usuario y la retorna.
     *
     * @param mensaje
     * @return
     */
    private static String llegirCadena(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje);
        return input.nextLine();
    }

    /**
     * Este método reinicia la biblioteca y retorna un ArrayList con los libros iniciales.
     *
     * @return
     */
    private static ArrayList<String> reiniciarBiblioteca() {
        ArrayList<String> llibres = new ArrayList<>();
        llibres.add("Tirant Lo Blanc");
        llibres.add("Solitud");
        llibres.add("El Quixot");
        llibres.add("Sapiens");
        llibres.add("Teo va a l'escola");
        llibres.add("Jumanji");
        llibres.add("Spiderman: No way home");
        llibres.add("Harry Potter i el calze de foc");
        return llibres;
    }

    /**
     * Este método inicializa el ArrayList con los libros que hay en la biblioteca.
     *
     * @return
     */
    private static ArrayList<String> bibliotecaInit() {
        ArrayList<String> biblioteca = new ArrayList<>();
        biblioteca.add("Tirant Lo Blanc");
        biblioteca.add("Solitud");
        biblioteca.add("El Quixot");
        biblioteca.add("Sapiens");
        biblioteca.add("Teo va a l'escola");
        biblioteca.add("Jumanji");
        biblioteca.add("Spiderman: No way home");
        biblioteca.add("Harry Potter i el calze de foc");
        return biblioteca;
    }

    /**
     * Este método muestra un mensaje en pantalla y lee un número entero introducido por el usuario.
     * El número debe estar dentro de un rango válido especificado.
     *
     * @param mensaje
     * @param rangoInicial
     * @param rangoFinal
     * @return
     */
    private static int llegirEnter(String mensaje, int rangoInicial, int rangoFinal) {
        Scanner input = new Scanner(System.in);
        int valor;
        do {
            System.out.print(mensaje + ": ");
            while (!input.hasNextInt()) {
                System.out.println("¡Error! Debes introducir un número entero.");
                System.out.print(mensaje + ": ");
                input.next();
            }
            valor = input.nextInt();
            if (valor < rangoInicial || valor > rangoFinal) {
                System.out.println("¡Error! Debes introducir un número entre " + rangoInicial + " y " + rangoFinal + ".");
            }
        } while (valor < rangoInicial || valor > rangoFinal);
        return valor;
    }
}

