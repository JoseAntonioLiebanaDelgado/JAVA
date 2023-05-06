import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Classe Main
 */
public class Main {

    /**
     * Mètode main
     *
     * @param args
     */
    public static void main(String[] args) {
        iniciaPrograma();
    }

    /**
     * Mètode que inicia el programa
     */
    private static void iniciaPrograma() {
        File numbers = new File("fitxers" + File.separator + "numbers.txt");
        PrintStream ps = null;

        try {
            //Per sobre escriure
            //ps = new PrintStream(numbers);
            //Per escriure a continuació
            ps = new PrintStream(new FileOutputStream(numbers, true));
            escriureFitxer(ps);
        } catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: " + fnfe.getMessage());
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    /**
     * Mètode que escriu al fitxer
     *
     * @param ps
     */
    private static void escriureFitxer(PrintStream ps) {
        String linia = "hola";
        while (!linia.equalsIgnoreCase("fi")) {
            linia = llegirLinia("Escriure una nova línia o 'fi' per acabar: ");
            if (!linia.equalsIgnoreCase("fi")) {
                ps.println(linia);
            }
        }
    }

    /**
     * Mètode que llegeix una línia
     *
     * @param s
     * @return
     */
    private static String llegirLinia(String s) {
        Scanner llegir = new Scanner(System.in);
        System.out.print(s);
        return llegir.nextLine();
    }
}