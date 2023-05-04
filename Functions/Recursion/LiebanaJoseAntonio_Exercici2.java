//2. Programar un algoritmo recursivo que permita sumar los dígitos de un número. Ejemplo: Entrada:123 Resultado:6

package Recursivitat;

public class LiebanaJoseAntonio_Exercici2 {
    public static void main(String[] args) {

        int resultadoSumaDigitos = sumaDigitos(123);
        System.out.println("El resultado de la suma de dígitos es: " + resultadoSumaDigitos);
        System.out.println();
    }

    /**
     * Función para hacer la sumar los dígitos de un número
     *
     * @param num
     * @return Resultado de la suma
     */
    public static int sumaDigitos(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + sumaDigitos(num / 10);
        }
    }
}
