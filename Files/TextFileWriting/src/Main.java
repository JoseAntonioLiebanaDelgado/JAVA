import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Programa que escribe en un fichero de texto llamado numbers.txt
 * los números que el usuario introduzca por teclado.
 * El programa termina cuando el usuario escribe "fi".
 * El fichero numbers.txt se encuentra en la carpeta "fitxers".
 * El fichero numbers.txt se crea si no existe.
 */
public class Main {

    /**
     * Método main que recibe un array de String como parámetro
     *
     * @param args
     */
    public static void main(String[] args) {
        //Llamamos al método iniciaPrograma
        iniciaPrograma();
    }

    /**
     * Método iniciaPrograma que no recibe ningún parámetro y no devuelve nada (void)
     */
    private static void iniciaPrograma() {
        //Creamos un objeto de tipo File para el directorio donde se encuentran el fichero numbers.txt
        File numbers = new File("fitxers" + File.separator + "numbers.txt");
        //Creamos un objeto de tipo PrintStream para escribir en el fichero numbers.txt
        // "ps" es el objeto que nos permite escribir en el fichero numbers.txt
        PrintStream ps = null;

        //Creamos un bloque try-catch-finally para controlar las excepciones
        try {
            //Per sobre escriure:
            //ps = new PrintStream(numbers);
            //Per escriure a continuació: ps = new PrintStream(new FileOutputStream(numbers, true));

            //Aqui igualamos el objeto ps a un nuevo objeto de tipo PrintStream porque si no,
            //no nos deja escribir en el fichero numbers.txt, ya que el objeto ps está igualado a null
            ps = new PrintStream(new FileOutputStream(numbers, true));
            //Llamamos al método escriureFitxer
            escriureFitxer(ps);
            //Si se produce una excepción de tipo FileNotFoundException, se ejecuta el bloque catch y se muestra un mensaje de error
        } catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: " + fnfe.getMessage());
            //Si no se produce ninguna excepción, se ejecuta el bloque finally
        } finally {
            //Si el objeto ps es distinto de null, se cierra el objeto ps
            if (ps != null) {
                ps.close();
            }
        }
    }

    /**
     * Método escriureFitxer que recibe un objeto de tipo PrintStream como parámetro y no devuelve nada (void)
     * porque solo escribe en el fichero numbers.txt
     *
     * @param ps
     */
    private static void escriureFitxer(PrintStream ps) {
        //Creamos un objeto de tipo Scanner para leer por teclado y escribir en el fichero numbers.txt
        String linia = "hola";
        //Mientras la variable linia sea distinta de "fi", se ejecuta el bucle
        while (!linia.equalsIgnoreCase("fi")) {
            //Llamamos al método llegirLinia y guardamos el valor que devuelve en la variable linia
            linia = llegirLinia("Escriure una nova línia o 'fi' per acabar: ");
            //Si la variable linia es distinta de "fi", se escribe en el fichero numbers.txt
            if (!linia.equalsIgnoreCase("fi")) {
                //Escribimos en el fichero numbers.txt la variable linia y un salto de línea
                ps.println(linia);
            }
        }
    }

    /**
     * Método llegirLinia que recibe un String como parámetro y devuelve un String
     *
     * @param s
     * @return
     */
    private static String llegirLinia(String s) {
        //Creamos un objeto de tipo Scanner para leer por teclado
        Scanner llegir = new Scanner(System.in);
        //Mostramos por pantalla el mensaje que recibe el método llegirLinia
        System.out.print(s);
        //Devolvemos lo que el usuario ha escrito por teclado
        return llegir.nextLine();
    }
}