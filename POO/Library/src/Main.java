/*Crea una aplicació modular en Java usant ArrayList<String> per a gestionar una Biblioteca.
El programa guardarà el títol dels llibres en un llistat dinàmic.
El programa ha de tenir un menú principal amb:
Consultar tota la biblioteca i que imprimeixi tots els títols per consola.
Consultar si existeix un títol en concret especificat per l'usuari.
Inserir nous llibres.
Eliminar un llibre (si existeix). Aquest mètode usarà el mètode creat a l'apatat 2.
Modificar el títol d'un llibre actual (si existeix). Aquest mètode usarà el mètode creat a l'apatat 2.
Eliminar tots els llibres (reiniciar l'ArrayList)
Sortir.
Entregueu la solució per a l'exercici de gestionar la Biblioteca.
EXTRA: Usa un ArrayList d'estructura més complexe que permeti guardar Títol de Llibre, Autor, Editoria, etc*/

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

public class Main {
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
                    consultarLlibre(llibres);
                    break;
                case 3:
                    inserirLlibre(llibres);
                    break;
                case 4:
                    eliminarLlibre(llibres);
                    break;
                case 5:
                    modificarLlibre(llibres);
                    break;
                case 6:
                    llibres = reiniciarBiblioteca(llibres);
                    break;
                case 7:
                    llibres = reiniciarBiblioteca(llibres);
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
     * Mètode per comprobar si existeix un títol en concret especificat per l'usuari
     *
     * @param llibres
     */
    private static void consultarLlibre(ArrayList<String> llibres) {
        Scanner llegir = new Scanner(System.in);
        String userAnswer;

        System.out.println("Introdueix el nom del llibre que vols consultar: ");
        userAnswer = llegir.nextLine();

        if (llibres.contains(userAnswer)) {
            System.out.println("Aquest llibre si que existeix");
        } else {
            System.out.println("Aquest llibre no existeix");
        }
    }

    /**
     * Mètode per a inserir nous llibres
     *
     * @param llibres
     */
    private static void inserirLlibre(ArrayList<String> llibres) {
        Scanner llegir = new Scanner(System.in);
        String userAnswer;

        System.out.println("Introdueix el nom del llibre que vols inserir: ");
        userAnswer = llegir.nextLine();

        if (llibres.contains(userAnswer)) {
            System.out.println("Aquest llibre ja existeix");
        } else {
            llibres.add(userAnswer);
            System.out.println("Llibre inserit correctament");
        }
    }

    /**
     * Mètode per a eliminar un llibre (si existeix)
     *
     * @param llibres
     */
    private static void eliminarLlibre(ArrayList<String> llibres) {
        Scanner llegir = new Scanner(System.in);
        String userAnswer;

        System.out.println("Introdueix el nom del llibre que vols eliminar: ");
        userAnswer = llegir.nextLine();

        if (llibres.contains(userAnswer)) {
            llibres.remove(userAnswer);
            System.out.println("Llibre eliminat correctament");
        } else {
            System.out.println("Aquest llibre no existeix");
        }
    }

    /**
     * Mètode per a modificar el títol d'un llibre actual (si existeix)
     *
     * @param llibres
     */
    private static void modificarLlibre(ArrayList<String> llibres) {
        Scanner llegir = new Scanner(System.in);
        String userName;
        String userAnswer;

        System.out.println("Introdueix el nom del llibre que vols modificar: ");
        userName = llegir.nextLine();

        if (llibres.contains(userName)) {
            System.out.println("Introdueix el nou nom del llibre: ");
            userAnswer = llegir.nextLine();

//      "llibres": es el nombre del ArrayList en el que se almacenan los nombres de los libros.
//      ".set": es un método de ArrayList que permite reemplazar un elemento en una posición específica del ArrayList.
//      "(llibres.indexOf(userName)": es el índice del libro que se desea modificar en el ArrayList. Utilizamos el método "indexOf" de ArrayList para encontrar la posición del libro en la lista.
//      ", userAnswer)": es el nuevo valor que se asignará en la posición especificada. En este caso, se reemplaza el nombre antiguo del libro con el nuevo nombre proporcionado por el usuario en la variable "userAnswer".
//      - Por lo tanto, la línea de código completa se traduce en: "Reemplaza el nombre del libro en la posición correspondiente del ArrayList con el nuevo nombre proporcionado por el usuario".

            llibres.set(llibres.indexOf(userName), userAnswer);
            System.out.println("Llibre modificat correctament");
        } else {
            System.out.println("Aquest llibre no existeix");
        }
    }

    /**
     * Reiniciar biblioteca
     *
     * @param llibres
     * @return
     */
    private static ArrayList<String> reiniciarBiblioteca(ArrayList<String> llibres) {
        llibres.clear();
        return llibres;
    }

    /**
     * Aquest mètode serveix per llegir un enter de teclat amb control d'errors.
     *
     * @param menuPrincipal: Serveix per passar-li el text a mostrar del menú.
     * @param min:           Valor mínim acceptat
     * @param max:           Valor màxim acceptat
     * @return : retorna un enter dins del domini de valors
     */
    public static int llegirEnter(String menuPrincipal, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int opcio = 0;
        boolean valorCorrecte = false;

        do {
            System.out.println(menuPrincipal);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte) {
                System.out.println("ERROR: No has introduït un enter");
                llegir.nextLine();
            } else {
                opcio = llegir.nextInt();
                llegir.nextLine();
                if (opcio < min || opcio > max) {
                    System.out.println("ERROR: Opció no correcte");
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);
        return opcio;
    }
}
