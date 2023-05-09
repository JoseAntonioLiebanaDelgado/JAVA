package org.example;

import model.JuegoBuscaminas;

/**
 * Esta clase contiene el método main que ejecuta el juego.
 */
public class Main {

    /**
     * Método main que ejecuta el juego.
     *
     * @param args
     */
    public static void main(String[] args) {
        boolean mostrarSolucion = true;
        JuegoBuscaminas.jugar(mostrarSolucion);
    }
}