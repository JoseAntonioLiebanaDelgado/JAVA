// Este programa crea una carpeta, mueve los archivos .png de la carpeta descargas
// a la carpeta creada y borra la carpeta creada


import java.io.File;

public class Main {
    /**
     * Clase principal del programa.
     * En esta clase se crea una carpeta, se mueven los archivos .png de la carpeta descargas
     *
     * @param args
     */
    public static void main(String[] args) {
        // Crear carpeta con el nombre "fotos"
        File fotos = new File("fotos");
        // File downloads es la carpeta de descargas del usuario, podria ser cualquier carpeta
        File downloads;
        // String home es la ruta del directorio home del usuario
        // System.getProperty("user.home") es una funcion que devuelve la ruta del directorio home del usuario
        String home = System.getProperty("user.home");
        // Si la carpeta fotos no existe, se crea
        if (fotos.mkdir() || fotos.exists()) {
            //Imprimimos por pantalla que se ha creado la carpeta con el nombre fotos
            System.out.println("S'ha creat la carpeta" + fotos.getName());
        } else {
            System.out.println("ERROR: No s'ha pogut crear la carpeta");
        }
        // downloads es la carpeta de descargas del usuario
        downloads = new File(home + File.separator + "downloads");

        try {
            // Llamamos al metodo moureFitxers con los parametros downloads y fotos que son las carpetas
            moureFitxers(downloads, fotos);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        // Llamamos al metodo esborrar con el parametro fotos que es la carpeta
        esborrar(fotos);
    }

    /**
     * Metodo que borra la carpeta fotos y todos los archivos que contiene
     *
     * @param fotos
     */
    public static void esborrar(File fotos) {
        // Si la carpeta fotos existe y es un directorio se procede a borrar todos los archivos que contiene,
        // despues se borra la carpeta
        if (fotos.exists() && fotos.isDirectory()) {
            File[] fitxersDirectori = fotos.listFiles();

            // Creamos un bucle for que recorre todos los archivos de la carpeta fotos y los borra
            for (int i = 0; i < fitxersDirectori.length; i++) {
                // Imprimimos por pantalla que se va a borrar el archivo
                System.out.println("WARNING! Es procedirà a esborrar l'arxiu: " + fitxersDirectori[i].getName());
                // Si el archivo se ha borrado correctamente se imprime por pantalla que se ha borrado correctamente
                if (fitxersDirectori[i].delete()) {
                    System.out.println("L'arxiu " + fitxersDirectori[i].getName() + " s'ha esborrat correctament");
                }
            }
            // Si la carpeta se ha borrado correctamente se imprime por pantalla que se ha borrado correctamente
            if (fotos.delete()) {
                System.out.println("La carpeta " + fotos.getAbsolutePath() + " s'ha esborrat correctament");
            }
        }
    }

    /**
     * Metodo que mueve los archivos .png de la carpeta descargas a la carpeta fotos
     *
     * @param downloads
     * @param fotos
     */
    public static void moureFitxers(File downloads, File fotos) {
        // Si la carpeta descargas y la carpeta fotos existen y son directorios se procede a mover los archivos .png
        if (downloads.isDirectory() && fotos.isDirectory()) {
            // Creamos un array de tipo File que contiene todos los archivos de la carpeta descargas
            // downloads.listFiles() devuelve un array de tipo File con todos los archivos de la carpeta descargas
            File[] fitxerDownloads = downloads.listFiles();

            // Creamos un bucle for que recorre todos los archivos de la carpeta descargas
            for (int i = 0; i < fitxerDownloads.length; i++) {
                // Si el archivo es un archivo y el nombre del archivo termina en .png se procede a mover el archivo
                if (fitxerDownloads[i].isFile() && fitxerDownloads[i].getName().endsWith(".png")) {
                    // Creamos un objeto de tipo File que contiene la ruta de destino del archivo, en este caso la carpeta fotos
                    File rutaDesti = new File(fotos.getAbsolutePath() + File.separator + fitxerDownloads[i].getName());
                    // Movemos el archivo a la carpeta fotos
                    fitxerDownloads[i].renameTo(rutaDesti);
                    // Imprimimos por pantalla que se ha movido el archivo
                    System.out.println("Movent el fitxer " + fitxerDownloads[i].getName() + " a la carpeta...");
                }
            }
        } else {
            System.out.println("No s'ha pogut esborrar");
        }
    }
}