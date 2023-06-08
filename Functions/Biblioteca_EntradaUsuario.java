package Funciones_Corregidas;

import java.util.ArrayList;
import java.util.Scanner;

/* Este programa simula una biblioteca donde el usuario puede elegir varias opciones:
Consultar la biblioteca, consultar un título, insertar un libro, eliminar un libro,
modificar un libro, reiniciar la biblioteca y salir del programa.
*/

public class Biblioteca_EntradaUsuario {
    final static String MENU_PRINCIPAL = "\n\t1. Consultar Biblioteca\n\t2. Consultar títol\n\t3. Inserir llibre" +
            "\n\t4. Eliminar llibre\n\t5. Modificar llibre\n\t6. Reiniciar Biblioteca\n\t7. Sortir";

    public static void main(String[] args) {
        // Declaramos un ArrayList de tipo String para guardar los libros
        ArrayList<String> llibres;
        // Damos valor al ArrayList con el método bibliotecaInit()
        llibres = bibliotecaInit();
        int opcioMenuPrincipal = 0;
        System.out.println("Benvingut/da al programa");

        do {
            opcioMenuPrincipal = llegirEnter(MENU_PRINCIPAL, 1, 7);

            switch (opcioMenuPrincipal) {
                case 1:
                    imprimirBiblioteca(llibres);
                    break;
                case 2:
                    // titolConsultar es el título que el usuario quiere consultar (la variable que se pasa al método buscarLibro())
                    // llegirCadena() es un método que lee una cadena de texto por teclado
                    String titolConsultar = llegirCadena("Introdueix el títol a consultar:");
                    buscarLibro(llibres, titolConsultar);
                    break;
                case 3:
                    String titolInserir = llegirCadena("Introdueix el títol del nou llibre:");
                    insertarLibro(llibres, titolInserir);
                    break;
                case 4:
                    String titolEliminar = llegirCadena("Introdueix el títol del llibre a eliminar:");
                    eliminarLibro(llibres, titolEliminar);
                    break;
                case 5:
                    String titolModificar = llegirCadena("Introdueix el títol del llibre a modificar:");
                    String nouTitol = llegirCadena("Introdueix el nou títol:");
                    modificarLibro(llibres, titolModificar, nouTitol);
                    break;
                case 6:
                    llibres = reiniciarBiblioteca();
                    break;
                case 7:
                    System.out.println("Adéu");
                    break;
            }
        } while (opcioMenuPrincipal != 7);
    }

    /**
     * Éste metodo se encarga de imprimir la biblioteca.
     * Creamos el metodo privado, estatico, de tipo ArrayList(String) y como nombre bibliotecaInit.
     * Dentro del método creamos un ArrayList de tipo String llamado biblioteca, que lo utilizaremos
     * para guardar los libros.
     *
     * @return Biblioteca inicialitzada
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
     * Reiniciar biblioteca
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
     * Mètode per a imprimir tots els títols dels llibres per pantalla
     *
     * @param llibres
     */
    private static void imprimirBiblioteca(ArrayList<String> llibres) {
        for (String llibre : llibres) {
            System.out.println(llibre);
        }
    }

    /**
     * Mètode per trobar un llibre a la biblioteca
     *
     * @param biblioteca
     * @param titol
     * @return
     */
    private static void buscarLibro(ArrayList<String> biblioteca, String titol) {
        for (String llibres : biblioteca) {
            if (llibres.equalsIgnoreCase(titol)) {
                System.out.println("El llibre " + titol + " es troba a la biblioteca.");
                return;
            }
        }
        System.out.println("El llibre " + titol + " no es troba a la biblioteca.");
    }

    /**
     * Mètode per a insertar un llibre a la biblioteca
     *
     * @param llibres
     * @param nouLlibre
     */
    private static void insertarLibro(ArrayList<String> llibres, String nouLlibre) {
        llibres.add(nouLlibre);
        System.out.println("El llibre " + nouLlibre + " s'ha afegit a la biblioteca.");
    }

    /**
     * Mètode per a eliminar un llibre de la biblioteca
     *
     * @param llibres
     * @param llibreAEliminar
     */
    private static void eliminarLibro(ArrayList<String> llibres, String llibreAEliminar) {
        if (llibres.removeIf(llibre -> llibre.equalsIgnoreCase(llibreAEliminar))) {
            System.out.println("El llibre " + llibreAEliminar + " s'ha eliminat de la biblioteca.");
        } else {
            System.out.println("El llibre " + llibreAEliminar + " no es troba a la biblioteca.");
        }
    }

    /**
     * Mètode per a modificar el títol d'un llibre existent de la biblioteca
     *
     * @param llibres
     * @param titolActual
     * @param nouTitol
     */
    private static void modificarLibro(ArrayList<String> llibres, String titolActual, String nouTitol) {
        int index = llibres.indexOf(titolActual);
        if (index != -1) {
            llibres.set(index, nouTitol);
            System.out.println("El llibre " + titolActual + " ha estat modificat per " + nouTitol);
        } else {
            System.out.println("El llibre " + titolActual + " no es troba a la biblioteca.");
        }
    }

    /**
     * Mètode per a llegir un enter per consola amb un rang vàlid d'opcions
     *
     * @param missatge
     * @param minim
     * @param maxim
     * @return
     */
    private static int llegirEnter(String missatge, int minim, int maxim) {
        Scanner sc = new Scanner(System.in);
        int opcio = 0;
        boolean dadaCorrecte = false;

        do {
            System.out.println(missatge);
            try {
                opcio = Integer.parseInt(sc.nextLine());
                if (opcio >= minim && opcio <= maxim) {
                    dadaCorrecte = true;
                } else {
                    System.out.println("L'opció ha d'estar entre " + minim + " i " + maxim);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Ha d'introduir un número");
            }
        } while (!dadaCorrecte);

        return opcio;
    }

    /**
     * Mètode per a llegir una cadena per consola.
     * Creamos un metodo privado, estatico, de tipo String y como nombre llegirCadena.
     * <p>
     * Dentro de los parentesis le pasamos un parametro de tipo String llamado missatge,
     * este missatge lo escribiremos en el main, cuando llamemos al metodo.
     *
     * @param missatge
     * @return
     */
    private static String llegirCadena(String missatge) {
        //Creamos un objeto de tipo Scanner llamado input, que nos servirá para leer por teclado.
        Scanner input = new Scanner(System.in);
        //Imprimimos por pantalla el mensaje que nos llega por parámetro.
        System.out.println(missatge);
        //Leemos la cadena por teclado y la devolvemos.
        return input.nextLine();
    }
}
































