package Matrix;

import java.util.Scanner;

public class MatricesAjedrez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        /*Usant un array bidimensional de tipus char, crea el taulell d'escacs en Java per tal de que es mostri a la consola.

        Per a fer-ho, has de saber:

        El taulell d'escacs té 8 files i 8 columnes. Un total de 64 caselles.
        Té cel·les blanques i negres de forma alterna.
        La primera casella és blanca i la simbolitzarem amb una 'O'.
        Les caselles negres les les representarem amb la 'X'.
        Les caselles seràn blanques quan la suma dels índex de la seva fila i la seva columna sigui múltiple de 2.
        Els taulells tenen les files numerades de 8 al 1 de dalt a baix.
        Té les columnes numerades de la A a la H d'esquerra a dreta.
        Com que numerarem les files i columnes, necessitarem una fila i una columna extra.
        La declaració i inicialització del vector serà: char[][] escacs = new char[9][9];

            O X O X O X O X 8
            X O X O X O X O 7
            O X O X O X O X 6
            X O X O X O X O 5
            O X O X O X O X 4
            X O X O X O X O 3
            O X O X O X O X 2
            X O X O X O X O 1
            A B C D E F G H          */


        //Creamos la matriz
        char[][] matriz = new char[9][9];
        //Creamos un array para darle valor a la ultima fila
        final char[] letrasArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', ' '};

        //Declaramos e iniciamos una variable para rellenar (relleno)
        //Otra para situarnos en la ultima posicion de cada fila (ultimaPosicion)
        //Y otra para rellenar la ultima columna (rellenoUltimaColumna)
        char relleno;
        int ultimaPosicion = 9 - 1;
        int rellenoUltimaColumna = 8;


        //matriz.lenght es igual a la primera dimension. Osea al primer claudator "[]" DAMOS VALOR
        for (int i = 0; i < matriz.length; i++) {

            //matriz[i].lenght es igual a la segunda dimension.Osea al segundo claudator "[]" DAMOS VALOR
            for (int j = 0; j < matriz[i].length; j++) {

                //Si la "i" es igual a la ultima posicion es que estamos en la ultima fila
                if (i == ultimaPosicion) {
                    //[j] porque queremos que lo introduzca el valor que toca donde toca
                    relleno = letrasArray[j];
                    //Si "j" es igual a ultima posicion. El relleno sera numerico por eso haremos lo siguiente:
                    //Pasamos de int a char con metodo "forDigit".
                } else if (j == ultimaPosicion) {
                    relleno = Character.forDigit(rellenoUltimaColumna, 16);
                    //Si "j+i" tienen un residuo de 0, relleno sera par y le daremos el valor de "o"
                } else if ((j + i) % 2 == 0) {
                    relleno = 'o';
                }
                // Si "j+i" no tienen un residuo de 0, relleno sera impar y le daremos valor de "x"
                else {
                    relleno = 'x';
                }
                //Con esto damos valor o rellenamos todas las posiciones que no son especiales
                matriz[i][j] = relleno;
            }

            //Restamos un numero por cada vez que salgamos del for de j (cuando acabamos una fila),
            //para que la variable vaya descenciendo su valor de 1 en 1
            rellenoUltimaColumna--;
        }

        //LAS MATRIZES SISIEMPRE SE PINTAN ASI.
        //Con esta estructura de un for anidado dentro de otro creamos la estructura

        //matriz.lenght es igual a la primera dimension. (En este caso "filas") Osea al primer claudator "[]"
        for (int i = 0; i < matriz.length; i++) {

            //matriz[i].lenght es igual a la segunda dimension. (En este caso "columnas") Osea al segundo claudator "[]"
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            //Se imprime este espacio para saltar la linea
            System.out.println();
        }
    }
}