import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programa que lee un fichero de texto llamado scores.txt y escribe en un fichero de texto
 * llamado AverageGradeFile.txt la media de las notas de cada alumno.
 */
public class Main {
    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // Creamos un objeto de tipo File para el directorio donde se encuentran el fichero scores.txt
        File inputFile = new File("scores.txt");
        // Creamos un objeto de tipo File para el directorio donde se creará el fichero AverageGradeFile.txt
        File outputFile = new File("AverageGradeFile.txt");

        // Empelamos un bloque try-catch para controlar las excepciones
        Scanner scanner = null;
        FileWriter writer = null;
        try {
            // Creamos un objeto de tipo Scanner para leer el fichero scores.txt
            scanner = new Scanner(inputFile);
            // Creamos un objeto de tipo FileWriter para escribir en el fichero AverageGradeFile.txt
            writer = new FileWriter(outputFile);

            // Mientras haya una línea en el fichero scores.txt, se ejecuta el bucle
            while (scanner.hasNextLine()) {
                // Igualamos la variable line a la línea actual del fichero scores.txt
                String cursorLine = scanner.nextLine();
                // Dividimos la línea en un array de String con el método split() y el separador ";" y lo guardamos en la variable elements
                String[] elements = cursorLine.split(";");

                // Extraer las notas y calcular la media
                // Creamos una variable de tipo float para guardar la suma de las notas
                float sum = 0;
                // Recorremos el array elements desde la posición 3 hasta la longitud del array
                for (int i = 3; i < elements.length; i++) {
                    // Sumamos las notas y las guardamos en la variable sum
                    sum += Float.parseFloat(elements[i]);
                }
                // Calculamos la media
                float average = sum / 4;
                // Escribimos en el fichero AverageGradeFile.txt los datos de la línea actual del fichero scores.txt y la media de las notas
                writer.write(elements[0] + ";" + elements[1] + ";" + elements[2] + ";" + average + "\n");
            }
        } catch (IOException fnfe) {
            System.out.println("ERROR: " + fnfe.getMessage());
        } finally {
            // Si el objeto scanner es distinto de null, se cierra el objeto scanner
            if (scanner != null) {
                scanner.close();
            }
            // Si el objeto writer es distinto de null, se cierra el objeto writer
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException fnfe) {
                    System.out.println("ERROR: " + fnfe.getMessage());
                }
            }
        }
    }
}