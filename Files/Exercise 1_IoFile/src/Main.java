import java.io.File;

/**
 * Clase Main
 */
public class Main {

    /**
     * Metodo principal
     *
     * @param args
     */
    public static void main(String[] args) {

        Main programa = new Main();
        File fichero = new File("c:" + File.separator + "Users" + File.separator + "Jose Antonio" + File.separator + "Desktop" + File.separator
                + "DEVELOPER" + File.separator + "LiebanaJoseAntonio_AC02_x.java");
        programa.inicio();
        fitxerDirectori(fichero);
        listaDirectorio(new File("c:" + File.separator + "Users" + File.separator + "Jose Antonio" + File.separator + "Desktop" + File.separator
                + "E07_Concesionario"));
        sizeAndLastModification(fichero);
        moveFiles(fichero);
        deleteFiles(fichero);
    }

    /**
     * Metodo donde se crean las rutas de los archivos
     */
    public void inicio() {
        //String home = System.getProperty("user.home");
        File directoryAbsPath = new File("c:" + File.separator + "Users" + File.separator + "Jose Antonio" + File.separator
                + "Desktop" + File.separator + "DEVELOPER");

        File fileAbsPath = new File("c:" + File.separator + "Users" + File.separator + "Jose Antonio" + File.separator
                + "Desktop" + File.separator + "DEVELOPER" + File.separator + "M03-UF3-E06-scores.txt");

        File directoryRelativePath = new File("DEVELOPER");

        File fileRelativePath = new File("DEVELOPER" + File.separator + "M03-UF3-E06-scores.txt");

        showPaths(directoryAbsPath, false);
        showPaths(fileAbsPath, false);
        showPaths(directoryRelativePath, true);
        showPaths(fileRelativePath, true);
    }

    /**
     * Metodo que muestra las rutas de los archivos
     *
     * @param f
     * @param relativePath
     */
    public void showPaths(File f, boolean relativePath) {
        System.out.println("\n ********************************** \n");
        if (relativePath) System.out.println("La ruta es " + f.getAbsolutePath());
        System.out.println("Su padre es " + f.getParent());
        System.out.println("Su nombre es " + f.getName());
    }

    /**
     * Metodo que muestra si existe el archivo o directorio
     *
     * @param fichero
     */
    public static void fitxerDirectori(File fichero) {
        System.out.println(fichero.getAbsolutePath() + " existeix? " + fichero.exists());
        System.out.println(fichero.getAbsolutePath() + " es directori? " + fichero.isDirectory());
        System.out.println(fichero.getAbsolutePath() + " es arxiu? " + fichero.isFile());
    }

    /**
     * Metodo que lista los archivos y directorios de un directorio y nos dice si es un archivo o un directorio
     *
     * @param directorio
     */
    public static void listaDirectorio(File directorio) {
        // Crea un array de objetos "File" llamado "ficheros" con los archivos y subdirectorios del directorio especificado
        File[] ficheros = directorio.listFiles();
        // Inicia un bucle "for" que se ejecutará una vez para cada elemento en el array "ficheros"
        for (int i = 0; i < ficheros.length; i++) {
            // Imprime el nombre del archivo o subdirectorio actual en la consola
            System.out.println(ficheros[i].getName());
            // Comprueba si el archivo o subdirectorio actual es un directorio
            if (ficheros[i].isDirectory()) {
                // Si es un directorio, imprime "Es un directorio" en la consola
                System.out.println("Es un directorio");
            } else {
                // Si no es un directorio, imprime "Es un fichero" en la consola
                System.out.println("Es un fichero");
            }
        }
    }

    /**
     * Metodo que muestra el tamaño de los archivos y la ultima fecha de modificacion
     *
     * @param directorio
     */
    public static void sizeAndLastModification(File directorio) {
        // Crea un array de objetos "File" llamado "ficheros" con los archivos y subdirectorios del directorio especificado
        File[] ficheros = directorio.listFiles();
        // Inicia un bucle "for" que se ejecutará una vez para cada elemento en el array "ficheros"
        for (int i = 0; i < ficheros.length; i++) {
            // Imprime el nombre del archivo o subdirectorio actual en la consola
            System.out.println(ficheros[i].getName());
            // Imprime el tamaño del archivo o subdirectorio actual en la consola
            System.out.println("Tamaño: " + ficheros[i].length() + " bytes");
            // Imprime la ultima fecha de modificacion del archivo o subdirectorio actual en la consola
            System.out.println("Ultima fecha de modificacion: " + ficheros[i].lastModified());
        }
    }

    /**
     * Metodo que mueve los archivos con extension .png a la carpeta fotos
     *
     * @param directorio
     */
    public static void moveFiles(File directorio) {
        File[] ficheros = directorio.listFiles();
        for (int i = 0; i < ficheros.length; i++) {
            // Comprueba si el nombre del archivo actual termina en ".png"
            if (ficheros[i].getName().endsWith(".png")) {
                // Si el archivo actual es un archivo PNG, lo mueve a una nueva ubicación
                // La nueva ubicación se especifica como una ruta de archivo absoluta que incluye el nombre del archivo actual
                // El archivo se mueve utilizando el método "renameTo()" del objeto "File"
                ficheros[i].renameTo(new File("c:" + File.separator + "Users" + File.separator + "Jose Antonio" + File.separator
                        + "Desktop" + File.separator + "DEVELOPER" + File.separator + "LiebanaJoseAntonio_AC02_x.java" + File.separator + "fotos" + File.separator + ficheros[i].getName()));
            }
        }
    }

    /**
     * Metodo que borra la carpeta fotos y su contenido
     *
     * @param directorio
     */
    public static void deleteFiles(File directorio) {
        // Crea un array de objetos "File" llamado "ficheros" con los archivos y subdirectorios del directorio especificado
        File[] ficheros = directorio.listFiles();
        // Inicia un bucle "for" que se ejecutará una vez para cada elemento en el array "ficheros"
        for (int i = 0; i < ficheros.length; i++) {
            // Comprueba si el nombre del archivo actual termina en ".png"
            if (ficheros[i].getName().endsWith(".png")) {
                // Si el archivo actual es un archivo PNG, lo borra
                ficheros[i].delete();
            }
        }
    }
}
