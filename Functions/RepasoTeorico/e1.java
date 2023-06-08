package Funciones_Corregidas.RepasoTeorico;

public class e1 {

    public static void main(String[] args) {
        int[] vector1;  // Declaración de la variable "vector1" de tipo arreglo de enteros.
        int a = 5;      // Declaración y asignación de la variable "a" con el valor 5.
        float b = 30.0f;  // Declaración y asignación de la variable "b" con el valor 30.0f.

        vector1 = initVector(a, b);  // Asignación de "vector1" llamando al método "initVector" con los valores de "a" y "b".
    }

    private static int[] initVector(int x, float y) {
        int[] vector = new int[x];  // Declaración de un arreglo de enteros llamado "vector" con tamaño "x".

        for (int i = 0; i < vector.length - 2; i++) {
            vector[i] = (int) y;  // Asignación de la posición "i" del arreglo "vector" con el valor de "y" convertido a entero.
            y -= x;  // Resta de "x" a "y".
        }

        return vector;  // Retorno del arreglo "vector".
    }
}


//1. Quin tipus de variable de retorn te el metode initVector? Te un retorn de tipus array de int.
//2. Quins parametres d'entrada te i de quin tipus de dades son? int x, float y.
//3. La crida al metode es correcte? Justifica-ho i escriu-ho correctament si cal.
//4. Dibuida el vector amb els valors.
//|  0  |  1  |  2  |  3  |  4  |
//| 30  | 25  | 20  |  0  |  0  |