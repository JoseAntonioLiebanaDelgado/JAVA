package model;

/**
 * Clase que genera tableros de buscaminas en las que las columnas con indieces impares(1,3,5,...)
 */
public class GeneradorTableros {
    private int filas;
    private int columnas;
    private String desconocido = " ? ";
    private String mina = " * ";
    private String vacio = "   ";

    /**
     * Clase que genera tableros de buscaminas en las que las columnas con indieces impares(1,3,5,...)
     * estan siempre varicias, de este modo se pueden visualizar facilmente por consola.
     * De este modo un tablero de 5x5 realmente será jugable como de 3x3
     *
     * @param filas
     * @param columnas
     */
    public GeneradorTableros(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    /**
     * Retorna un tablero con la cantidad de minas indicada ubicadas de forma aleatoria en el tablero
     *
     * @param minas cantidad de minas a colocar en el tablero
     * @return tablero con minas
     */
    public String[][] generarTableroConMinas(int minas) {
        String[][] tablero = generarTableroVacio();
        generarMinas(tablero, minas);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        return tablero;
    }

    /**
     * Método que retorna un tablero vacio
     *
     * @return
     */
    public String[][] generarTableroVacio() {
        String[][] tablero = new String[filas][columnas];
        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero[0].length; y++) {
                if ((x == 0 || x == tablero.length - 1) || (y == 0 || y == tablero[0].length - 1)) {
                    tablero[x][y] = vacio; //añade un espacio entre columna y columna
                }
                //Añadir desconocidos
                else {
                    tablero[x][y] = desconocido;
                }
            }
        }
        //Mostrar tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        return tablero;
    }

    /**
     * Método que genera minas en el tablero de forma aleatoria
     *
     * @param tablero
     * @param n
     */
    private void generarMinas(String[][] tablero, int n) {
        for (int m = 0; m < n; m++) {
            while (true) {
                int x, y = 0;
                x = (int) (4 * Math.random());
                y = (int) (4 * Math.random());
                if (x >= 1 && x <= 4) {
                    if (y >= 1 && y <= 4) {
                        if (!tablero[x][y].equals(mina)) {
                            tablero[x][y] = mina;
                            break;
                        }
                    }
                }
            }
        }
    }
}
