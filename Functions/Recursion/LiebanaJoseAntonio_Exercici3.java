//3. Programar un algoritmo recursivo que permita sumar los elementos de un vector.

package Funciones_Corregidas.Recursion;

public class LiebanaJoseAntonio_Exercici3 {
    public static void main(String[] args) {
        
        int[] vector = {1, 2, 3, 4, 5};

        int resultadoSumaVector = sumaVector(vector, vector.length - 1);
        System.out.println("El resultado de la suma de los elementos del vector es: " + resultadoSumaVector);
        System.out.println();
    }

    /**
     * Función para hacer la suma de los elementos de un vector
     *
     * @param vector
     * @param n
     * @return Resultado de la suma de cada dígito
     */
    public static int sumaVector(int[] vector, int n) {
        if (n == 0) {
            return vector[0];
        } else {
            return vector[n] + sumaVector(vector, n - 1);
        }
    }
}
