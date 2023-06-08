package Funciones_Corregidas.RepasoTeorico;

public class e3 {
    public static void main(String[] args) {
        String[][] alumnat = {{"Joan", "Costa", "Martinez"},  // Matriz con los nombres y apellidos de los alumnos
                {"Maria", "Lopez", "Gurrull"},
                {"Anna", "Gonzalez", "Serra"},
                {"Marc", "Garcia", "Martinez"}};  // 4 filas x 3 columnas

        int numAlumnes = mostrarAlumnat(alumnat);  // Llamada al método mostrarAlumnat y se guarda el resultado en numAlumnes
        System.out.println("Hi ha " + numAlumnes + " alumnes");  // Impresión del número de alumnos

    }

    private static int mostrarAlumnat(String[][] alumnat) {
        int countAlumnes = 0;  // Variable para contar el número de alumnos

        // Iteración a través de las filas de la matriz
        for (int i = 0; i < alumnat.length; i++) {
            // Iteración a través de las columnas de cada fila
            for (int j = 0; j < alumnat[i].length; j++) {
                System.out.print(alumnat[i][j] + " ");  // Impresión del valor en la posición [i][j] de la matriz
            }
            System.out.println();  // Salto de línea después de imprimir una fila completa
            countAlumnes++;  // Incremento del contador de alumnos
        }

        return countAlumnes;  // Retorno del número total de alumnos
    }
}







