package Matrix;

import java.util.Scanner;

public class RepasoMatrices1 {
    public static void main(String[] args) {


        /*
        PINTAR ESTA MATRIZ, PERO EL USUARIO INDICA EL NUMERO DE COLUMNAS Y FILAS
        1 | 2 | 3 | 4 | 5
        1 | 2 | 3 | 4 | 5
        1 | 2 | 3 | 4 | 5
        1 | 2 | 3 | 4 | 5
        1 | 2 | 3 | 4 | 5
         */

        Scanner llegir = new Scanner(System.in);

        boolean tipatgeCorrecte = false;
        int userNumberFilasyColumnas = 0;

        do {
            System.out.println("Introduce un numero para la medida de las filas y columnas");
            tipatgeCorrecte = llegir.hasNextInt();
            if (!tipatgeCorrecte) {
                System.out.println("Valor no numerico");
            } else {
                userNumberFilasyColumnas = llegir.nextInt();
            }
            llegir.nextLine();
        } while (!tipatgeCorrecte);


        //Creamos la matriz con el numero que ha introducido el usuario (En este caso el numero es el
        //mismo tanto como para las filas como para las columnas.  --->"userNumberFilasyColumnas<---")
        int[][] matriz = new int[userNumberFilasyColumnas][userNumberFilasyColumnas];
        //Declaramos e iniciamos una variable para rellenar
        int relleno = 1;


        //matriz.lenght es igual a la primera dimension. (En este caso "filas") Osea al primer claudator "[]"
        //DAMOS VALOR CON LA VARIABLE "relleno", que en este caso va del 1 al 5
        for (int i = 0; i < matriz.length; i++) {

            //matriz[i].lenght es igual a la segunda dimension. (En este caso "columnas") Osea al segundo claudator "[]"
            //DAMOS VALOR CON LA VARIABLE "relleno", que en este caso va tambien del 1 al 5
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = relleno;
                relleno++;
            }
            //Reiniciamos el valor de la variable "relleno" a 1, para que en la siguiente fila empieze con el mismo valor
            //(En este caso, 1)
            relleno = 1;
        }

        //LAS MATRIZES SIEMPRE SE PINTAN ASI.
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