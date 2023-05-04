import java.io.File;

public class Main {
    public static void main(String[] args) {
        File fotos = new File("fotos");
        File downloads;
        String home = System.getProperty("user.home");

        if (fotos.mkdir() || fotos.exists()) {
            System.out.println("S'ha creat la carpeta" + fotos.getName());
        } else {
            System.out.println("ERROR: No s'ha pogut crear la carpeta");
        }

        downloads = new File(home + File.separator + "downloads");

        try {
            moureFitxers(downloads, fotos);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        esborrar(fotos);
    }

    public static void esborrar(File fotos) {
        if (fotos.exists() && fotos.isDirectory()) {
            File[] fitxersDirectori = fotos.listFiles();

            for (int i = 0; i < fitxersDirectori.length; i++) {
                System.out.println("WARNING! Es procedirà a esborrar l'arxiu: " + fitxersDirectori[i].getName());
                if (fitxersDirectori[i].delete()) {
                    System.out.println("L'arxiu " + fitxersDirectori[i].getName() + " s'ha esborrat correctament");
                }
            }
            if (fotos.delete()) {
                System.out.println("La carpeta " + fotos.getAbsolutePath() + " s'ha esborrat correctament");
            }
        }
    }

    public static void moureFitxers(File downloads, File fotos) {
        if (downloads.isDirectory() && fotos.isDirectory()) {
            File[] fitxerDownloads = downloads.listFiles();

            for (int i = 0; i < fitxerDownloads.length; i++) {
                if (fitxerDownloads[i].isFile() && fitxerDownloads[i].getName().endsWith(".png")) {
                    File rutaDesti = new File(fotos.getAbsolutePath() + File.separator + fitxerDownloads[i].getName());
                    fitxerDownloads[i].renameTo(rutaDesti);
                    System.out.println("Movent el fitxer " + fitxerDownloads[i].getName() + " a la carpeta...");
                }
            }
        } else {
            System.out.println("No s'ha pogut esborrar");
        }
    }
}