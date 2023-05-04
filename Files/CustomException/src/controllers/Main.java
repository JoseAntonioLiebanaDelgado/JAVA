package controllers;

import utils.Utilities;

/**
 * Clase principal
 */
public class Main {
    /**
     * Método principal
     *
     * @param args
     */
    public static void main(String[] args) {
        int num1 = Utilities.llegirInt("Introduce el primer número: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int num2 = Utilities.llegirInt("Introduce el segundo número: ", Integer.MIN_VALUE, Integer.MAX_VALUE);

        try {
            int resultado = dividir(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        } finally {
            System.out.println("El programa ha finalizado");
        }
    }

    /**
     * Método que lanza la excepción personalizada
     *
     * @param num1
     * @param num2
     * @return
     * @throws IllegalArgumentException
     */
    public static int dividir(int num1, int num2) throws IllegalArgumentException {
        if (num2 < 0) {
            throw new IllegalArgumentException("El segundo número no puede ser negativo");
        }
        return num1 / num2;
    }
}
