//1. Programar un algoritmo recursivo que permita hacer la división por restas sucesivas.

package Funciones_Corregidas.Recursion;

public class LiebanaJoseAntonio_Exercici1 {
    public static void main(String[] args) {

        int resultdoDivision = divisionPorRestas(15, 3);
        System.out.println("El resultado de la división es: " + resultdoDivision);
        System.out.println();
    }

    /**
     * Función para hacer la división por restas sucesivas
     *
     * @param dividendo
     * @param divisor
     * @return Resultado de la división
     */
    public static int divisionPorRestas(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        } else {
            return 1 + divisionPorRestas(dividendo - divisor, divisor);
        }
    }
}
