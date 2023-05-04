package Matrix;

import java.util.Scanner;

public class RepasoMatrices6 {
    public static void main(String[] args) {
        
        /*
        PINTAR ESTA MATRIZ, PERO EL USUARIO INDICA EL NUMERO DE COLUMNAS Y FILAS

        TRUE  | FALSE | TRUE  | FALSE | TRUE
        FALSE | TRUE  | FALSE | TRUE  | FALSE
        TRUE  | FALSE | TRUE  | FALSE | TRUE
        FALSE | TRUE  | FALSE | TRUE  | FALSE
        TRUE  | FALSE | TRUE  | FALSE | TRUE
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
        //mismo tanto como para las filas como para las columnas.  --->"userNumberFilasyColumnas"<---)
        boolean[][] matriz = new boolean[userNumberFilasyColumnas][userNumberFilasyColumnas];

        //Declaramos e iniciamos una variable para rellenar
        boolean relleno = true;


        //matriz.lenght es igual a la primera dimension. (En este caso "filas") Osea al primer claudator "[]"
        //DAMOS VALOR CON LA VARIABLE "relleno"
        for (int i = 0; i < matriz.length; i++) {

            //matriz[i].lenght es igual a la segunda dimension. (En este caso "columnas") Osea al segundo claudator "[]"
            //DAMOS VALOR CON LA VARIABLE "relleno"
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = relleno;
                relleno = !relleno;
            }
        }

        //LAS MATRIZES SIEMPRE SE PINTAN ASI.
        //Con esta estructura de un for anidado dentro de otro creamos la estructura

        //matriz.lenght es igual a la primera dimension. (En este caso "filas") Osea al primer claudator "[]"
        for (int i = 0; i < matriz.length; i++) {

            //matriz[i].lenght es igual a la segunda dimension. (En este caso "columnas") Osea al segundo claudator "[]"
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            //Se imprime este espacio para saltar la linea
            System.out.println();
        }
    }
}