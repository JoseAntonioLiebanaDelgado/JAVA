package Funciones_Corregidas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * En aquesta clase tenim un exemple de com fer un menú amb un ArrayList.
 */
public class Exercise1_review {

    final static String MENU_PRINCIPAL = "\n\t1.Consultar biblioteca\n\t2.Consultar titol\n\t3.Inserir llibre\n\t4.Eliminar llibre\n\t5.Modificar llibre\n\t6.Reiniciar biblioteca\n\t7.Sortir";

    /**
     * En el metode main tenim el menú principal amb les opcions que es poden fer a la biblioteca.
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> llibres;
        llibres = bibliotecaInit();
        int opcioMenuPrincipal = 0;

        do {
            System.out.println("Benvingut al programa");
            opcioMenuPrincipal = llegirEnter(MENU_PRINCIPAL, 1, 7);

            switch (opcioMenuPrincipal) {
                case 1:
                    imprimirLlibres(llibres);
                    break;
                case 2:
                    buscarLlibre(llibres, "El Quixot");
                    break;
                case 3:
                    inserirLlibre(llibres, "La comunidad del anillo");
                    break;
                case 4:
                    eliminarLlibre(llibres, "La comunidad del anillo");
                    break;
                case 5:
                    modificarLlibre(llibres, "El Quixot", "El nou Quixot 2.0");
                    break;
                case 6:
                    llibres = reiniciarBiblioteca();
                    break;
                case 7:
                    System.out.println("Fins aviat!");
                    break;
            }
        } while (opcioMenuPrincipal != 7);
    }

    /**
     * Aquest metode imprimeix els llibres que hi ha a la arraylist.
     * Aquesta part del codi es un for each que recorre tota la arraylist i imprimeix els llibres que hi ha.
     * <p>
     * "for (String llibre : llibres) {
     * System.out.println(llibre);
     * }"
     *
     * @param llibres
     */
    private static void imprimirLlibres(ArrayList<String> llibres) {
        for (String llibre : llibres) {
            System.out.println(llibre);
        }
    }

    /**
     * Aquest metode busca un llibre a la arraylist.
     *
     * @param biblioteca
     * @param titol
     */
    private static void buscarLlibre(ArrayList<String> biblioteca, String titol) {
        for (String llibres : biblioteca) {
            if (llibres.equalsIgnoreCase(titol)) {
                System.out.println("El llibre " + titol + " es troba a la biblioteca.");
                return;
            }
        }
        System.out.println("El llibre " + titol + " no es troba a la biblioteca.");
    }

    /**
     * Aquest metode afegeix un llibre a la arraylist.
     *
     * @param llibres
     * @param nouLLibre
     */
    private static void inserirLlibre(ArrayList<String> llibres, String nouLLibre) {
        llibres.add(nouLLibre);
        System.out.println("El llibre " + nouLLibre + "s'ha afegit a la biblioteca.");
    }

    /**
     * Aquest metode elimina un llibre de la arraylist.
     *
     * @param llibres
     * @param llibreAEliminar
     */
    private static void eliminarLlibre(ArrayList<String> llibres, String llibreAEliminar) {
        if (llibres.removeIf(llibre -> llibre.equalsIgnoreCase(llibreAEliminar))) {
            System.out.println("El llibre " + llibreAEliminar + " s'ha eliminat correctament de la biblioteca");
        } else {
            System.out.println("El llibre " + llibreAEliminar + " no es troba a la biblioteca");
        }
    }

    /**
     * Aquest metode modifica un llibre de la arraylist.
     *
     * @param llibres
     * @param titolActual
     * @param nouTitol
     */
    private static void modificarLlibre(ArrayList<String> llibres, String titolActual, String nouTitol) {
        int index = llibres.indexOf(titolActual);
        if (index != -1) {
            llibres.set(index, nouTitol);
            System.out.println("El llibre " + titolActual + " ha estat modificat per " + nouTitol);
        } else {
            System.out.println("El llibre " + titolActual + " no es troba a la biblioteca");
        }
    }

    /**
     * Aquest metode llegeix un enter i el retorna.
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
     * Aquest metode inicialitza la arraylist amb els llibres que hi ha a la biblioteca.
     *
     * @return
     */
    private static ArrayList<String> bibliotecaInit() {
        ArrayList<String> biblioteca = new ArrayList<>();
        biblioteca.add("Tirant Lo Blanc");
        biblioteca.add("Solitud");
        biblioteca.add("EL Quixot");
        biblioteca.add("Sapiens");
        biblioteca.add("Teo va a l'escola");
        biblioteca.add("Jumanji");
        biblioteca.add("Spiderman: No way home");
        biblioteca.add("Harry Potter i el calze de foc");
        return biblioteca;
    }

    /**
     * Aquest metode fa un control d'errors per a que l'usuari introdueixi un enter.
     *
     * @param missatgePrincipal
     * @param minim
     * @param maxim
     * @return
     */
    private static int llegirEnter(String missatgePrincipal, int minim, int maxim) {
        Scanner input = new Scanner(System.in);
        int opcio = 0;
        boolean dadaCorrecte = false;

        do {
            System.out.println(missatgePrincipal);
            try {
                opcio = Integer.parseInt(input.nextLine());
                if (opcio >= minim && opcio <= maxim) {
                    dadaCorrecte = true;
                } else {
                    System.out.println("L'opcio ha d'estar entre " + minim + " i " + maxim);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Ha d'introduir un número");
            }
        } while (!dadaCorrecte);
        return opcio;
    }
}































