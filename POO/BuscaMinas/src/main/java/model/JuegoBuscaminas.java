package model;

import java.util.Scanner;

/**
 * Clase que contiene el juego del buscaminas.
 *
 * @version 1.0
 * @since 1.0
 */
public class JuegoBuscaminas {

    /**
     * Método que inicia el juego del buscaminas.
     *
     * @param mostrarSolucion
     */
    public static void jugar(boolean mostrarSolucion) {
        System.out.println("*****Buscaminas*****");
        GeneradorTableros generadorTableros = new GeneradorTableros(5, 5);
        Buscaminas buscaminas = new Buscaminas(generadorTableros, 3);

        if (mostrarSolucion) buscaminas.mostrarSolucion();
        buscaminas.actualizar();

        int x = 0, y = 0;

        while (true) {
            if (buscaminas.esFinalizado() == true && buscaminas.terminadoConVictoria() == true) {
                System.out.println("Has ganado!");
                buscaminas.mostrarSolucion();
                break;
            } else if (buscaminas.esFinalizado() == true) {
                System.out.printf("Has perdido! has encontrado una mina en la casilla %dx%d\n", x, y);
                buscaminas.mostrarSolucion();
                break;
            } else if (buscaminas.esFinalizado() == false) {
                x = -1;
                y = -1;     //Resets values.
                x = leerCoordenada("Entra la cordenada x correspondiente a la fila:");
                y = leerCoordenada("Entra la cordenada y correspondiente a la columna:");
                if (!buscaminas.seleccionaCasilla(x, y)) {
                    System.out.println("Esta casilla no es seleccionable");
                } else {
                    buscaminas.hayGanador();
                    //buscaminas.detectarMinas();
                    int minasEncontradas = buscaminas.detectarMinas(x, y);
                    System.out.printf("Has encontrado %s minas alrededor de la casilla %dx%d. Sigue jungando!\n", minasEncontradas, x, y);
                    buscaminas.actualizar();
                }
            }
        }
    }


    /**
     * Método que lee una coordenada del tablero.
     *
     * @param frase
     * @return
     */
    public static int leerCoordenada(String frase) {
        Scanner scan = new Scanner(System.in);
        boolean valorCorrecto = false;
        int coordenada = 0;
        do {
            System.out.println(frase);
            valorCorrecto = scan.hasNextInt();

            if (valorCorrecto == false) {
                scan.nextLine();
                System.out.println("Escriba un valor entero!");
            } else {
                coordenada = scan.nextInt();
                scan.nextLine();

                if (coordenada < 1 && coordenada > 3) {
                    System.out.println("Escriba una coordenada entre 1 y 3");
                    valorCorrecto = false;
                } else {
                    valorCorrecto = true;
                }
            }
        } while (valorCorrecto == false);
        return coordenada;
    }
}
