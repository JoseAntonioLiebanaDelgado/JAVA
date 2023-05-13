import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programa que lee un fichero de texto llamado scores.txt y escribe en un fichero de texto
 * llamado AverageGradeFile.txt la media de las notas de cada alumno.
 * Un resumen del paso a paso seria el siguiente:
 * <p>
 * 1. Creamos un objeto llamado inputFile de tipo File, este inputFile es la ruta del fichero scores.txt
 * 2. Creamos un objeto llamado outputFile de tipoFile, este outFile es la ruta del fichero AverageGradeFile.txt
 * 3. Creamos un objeto llamado objetoLector de tipo Scanner, este objetoLector es el que va a leer los datos del fichero scores.txt
 * 4. Creamos un objeto llamado objetoEscritor de tipo FileWriter, este objetoEscritor es el que va a escribir los datos en el fichero AverageGradeFile.txt
 * 5. Iniciamos el objeto objetoLector a null porque no sabemos si puede lanzar una excepción
 * 6. Iniciamos el objeto objetoEscritor a null porque no sabemos si puede lanzar una excepción
 * 7. Iniciamos el objeto objetoLector con el fichero scores.txt
 * 8. Iniciamos el objeto objetoEscritor con el fichero AverageGradeFile.txt
 * 9. Hacemos un try-catch para controlar las excepciones y dentro del try hacemos un bucle while que se ejecutará mientras haya una línea en el fichero scores.txt
 * 10. Dentro del bucle while, igualamos la variable line a la línea actual del fichero scores.txt
 * 11. Dividimos la línea en un array de String con el método split() y el separador ";" y lo guardamos en la variable elements
 * 12. Creamos una variable de tipo float para guardar la suma de las notas
 * 13. Recorremos el array elements desde la posición 3 porque las notas empiezan en la posición 3 y vamos sumando las notas
 * 14. Creamos una variable de tipo float para guardar la media de las notas
 * 15. Calculamos la media de las notas dividiendo la suma de las notas entre el número de notas
 * 16. Escribimos en el fichero AverageGradeFile.txt el nombre del alumno y la media de sus notas
 * 17. Cerramos el objeto objetoLector
 * 18. Cerramos el objeto objetoEscritor
 */
public class Main {

    /**
     * Método main
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) {

        // Creamos un objeto llamado inputFile de tipo File, este inputFile es la ruta del fichero scores.txt
        // Podriamos decir que inputFile es el propio fichero scores.txt
        // De este fichero scores.txt vamos a leer los datos
        File archivoASerLeido = new File("scores.txt");

        // Creamos un objeto llamado outputFile de tipoFile, este outFile es la ruta del fichero AverageGradeFile.txt
        // Podriamos decir que outputFile es el propio fichero AverageGradeFile.txt
        // En este fichero AverageGradeFile.txt vamos a escribir los datos
        File archivoASerEscrito = new File("AverageGradeFile.txt");


        // Creamos un objeto llamado objetoLector de tipo Scanner, este objetoLector es el que va a leer los datos del fichero scores.txt
        // Lo iniciamos a null porque no sabemos si puede lanzar una excepción
        Scanner objetoLector = null;
        // Creamos un objeto llamado objetoEscritor de tipo FileWriter, este objetoEscritor es el que va a escribir los datos en el fichero AverageGradeFile.txt
        // Lo iniciamos a null porque no sabemos si puede lanzar una excepción
        FileWriter objetoEscritor = null;


        // Creamos un bloque try-catch para controlar las excepciones
        try {

            // Iniciamos el objeto objetoLector con el fichero scores.txt
            objetoLector = new Scanner(archivoASerLeido);
            // Iniciamos el objeto objetoEscritor con el fichero AverageGradeFile.txt
            objetoEscritor = new FileWriter(archivoASerEscrito);

            // Mientras haya una línea en el fichero scores.txt, se ejecuta el bucle
            // hasNextLine() es un método de la clase Scanner que devuelve true si hay una línea en el fichero scores.txt
            while (objetoLector.hasNextLine()) {

                // Igualamos la variable lineaPuntero a la línea actual del fichero scores.txt
                // No podemos hacer lineaPuntero.nextLine() porque no hemos iniciado el objeto lineaPuntero
                // Por eso usamos objetoLector.nextLine().
                String lineaPuntero = objetoLector.nextLine();
                // Creamos un array de String llamado notas que en este caso contiene las notas de cada alumno,
                // para ello usamos el método split() que separa un String en un array de String
                String[] notas = lineaPuntero.split(";");

                // Creamos una variable de tipo float llamada sum que va a contener la suma de las notas de cada alumno
                float sum = 0;

                // Recorremos el array de String notas y sumamos cada nota de cada alumno,
                // para ello usamos el método Float.parseFloat() que convierte un String a float
                for (int i = 0; i < notas.length; i++) {
                    sum += Float.parseFloat(notas[i]);
                }
                // Esto hace la media de las notas de cada alumno, porque notas es un array de String que contiene las notas de cada alumno
                float media = sum / notas.length;

                // Utilizamos el método write() de la clase FileWriter para escribir en el fichero AverageGradeFile.txt
                objetoEscritor.write(notas[0] + ";" + notas[1] + ";" + notas[2] + ";" + media + "\n");
            }

            // Lanazamos una excepción si no encuentra el fichero scores.txt
        } catch (IOException fnfe) {
            System.out.println("Error, " + fnfe.getMessage());

        } catch (Exception e) {
            System.out.println("Error, " + e.getMessage());

        } finally {
            // Cerramos el objetoLector
            if (objetoLector != null) {
                try {
                    objetoLector.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                objetoLector.close();
            }

            // Cerramos el objetoEscritor
            if (objetoEscritor != null) {
                // Empleamos un bloque try-catch para controlar las excepciones
                try {
                    objetoEscritor.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}