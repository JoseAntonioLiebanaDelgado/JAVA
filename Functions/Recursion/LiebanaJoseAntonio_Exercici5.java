//5. Programar un algoritmo recursivo que permita sumar los elementos de una matriz.

package Funciones_Corregidas.Recursion;

public class LiebanaJoseAntonio_Exercici5 {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int resultadoSumaMatriz = sumaMatriz(matriz, 0, 0);
        System.out.println("El resultado de la suma de los elementos de la matriz es: " + resultadoSumaMatriz);
        System.out.println();
    }

    /**
     * Función para sumar todos los números de una matriz
     *
     * @param matriz
     * @param fila
     * @param columna
     * @return Resultado de la suma de los números de la matriz
     */
    public static int sumaMatriz(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length - 1 && columna == matriz[0].length - 1) {
            return matriz[fila][columna];
        } else if (columna == matriz[0].length - 1) {
            return matriz[fila][columna] + sumaMatriz(matriz, fila + 1, 0);
        } else {
            return matriz[fila][columna] + sumaMatriz(matriz, fila, columna + 1);
        }
    }
}
