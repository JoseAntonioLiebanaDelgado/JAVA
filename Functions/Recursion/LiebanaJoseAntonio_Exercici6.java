//6. Programar un algoritmo recursivo que muestre el número menor de un vector.

package Funciones_Corregidas.Recursion;

public class LiebanaJoseAntonio_Exercici6 {
    public static void main(String[] args) {

        int[] vector = {1, 2, 3, 4, 5};

        int resultadoMinVector = minVector(vector, 0, vector[0]);
        System.out.println("El número mínimo del vector es: " + resultadoMinVector);
        System.out.println();
    }

    /**
     * Función para mostrar el número menor del vector
     *
     * @param vector
     * @param posicionActual
     * @param minActual
     * @return Resultado del número menor
     */
    public static int minVector(int[] vector, int posicionActual, int minActual) {
        if (posicionActual == vector.length) {
            return minActual;
        }
        int nuevoMin;
        if (vector[posicionActual] < minActual) {
            nuevoMin = vector[posicionActual];
        } else {
            nuevoMin = minActual;
        }
        return minVector(vector, posicionActual + 1, nuevoMin);
    }
}
