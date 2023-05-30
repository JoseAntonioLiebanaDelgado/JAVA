package Funciones_Corregidas;
/*
Consultar tota la biblioteca i que imprimeixi tots els títols per consola.
Consultar si existeix un títol en concret especificat per l'usuari.
Inserir nous llibres.
Eliminar un llibre (si existeix). Aquest mètode usarà el mètode creat a l'apatat 2.
Modificar el títol d'un llibre actual (si existeix). Aquest mètode usarà el mètode creat a l'apatat 2.
Eliminar tots els llibres (reiniciar l'ArrayList)
Sortir.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    final static String MENU_PRINCIPAL = "\n\t1. Consultar Biblioteca\n\t2. Consultar títol\n\t3. Inserir llibre\n\t4. Eliminar llibre\n\t5. Modificar llibre\n\t6. Reiniciar Biblioteca\n\t7. Sortir";

    public static void main(String[] args) {
        ArrayList<String> llibres;
        llibres = bibliotecaInit();

        int opcioMenuPrincipal = 0;

        do {
            System.out.println("Benvingut/da al programa");
            opcioMenuPrincipal = llegirEnter(MENU_PRINCIPAL, 1, 7);

            switch (opcioMenuPrincipal) {
                case 1:
                    imprimirBiblioteca(llibres);
                    break;
                case 2:
                    buscarLibro(llibres, "Tirant Lo Blanc");
                    break;
                case 3:
                    insertarLibro(llibres, "El señor de los anillos");
                    break;
                case 4:
                    eliminarLibro(llibres, "El señor de los anillos");
                    break;
                case 5:
                    modificarLibro(llibres, "El Quixot", "El nou Quixot 2.0");
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
     * Mètode per inserir alguns llibres dins de la Biblio
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
}
