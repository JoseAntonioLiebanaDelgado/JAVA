//4. Programar un algoritmo recursivo que permita multiplicar los elementos de un vector

package Recursivitat;

public class LiebanaJoseAntonio_Exercici4 {
    public static void main(String[] args) {

        int[] vector = {1, 2, 3, 4, 5};

        int resultadoMultiplicarVector = multiplicacionVector(vector, vector.length - 1);
        System.out.println("El resultado de la multiplicación de los elementos del vector es: " + resultadoMultiplicarVector);
        System.out.println();
    }

    /**
     * Función para hacer la multiplicación de todos los números del vector
     *
     * @param vector
     * @param n
     * @return Resutlado de la suma del vector
     */
    public static int multiplicacionVector(int[] vector, int n) {
        if (n == 0) {
            return vector[0];
        } else {
            return vector[n] * multiplicacionVector(vector, n - 1);
        }
    }
}
