package Matrix;

import java.util.Scanner;

public class MatrizPDF1SumaColumnas {
    public static void main(String[] args) {

        /* Crear una matriz de nxm de números enteros //ingresados por el
        usuario//, realizar la suma de cada columna y almacenarla en un
        vector de dimensión m.*/

        Scanner input = new Scanner(System.in);
        int valor = 0;
        boolean tipatgeCorrecte = false;
        int userNumberFilas = 0;
        int userNumberColumnas = 0;

        do {
            System.out.println("Escriu un numero per utilitzarlo en les files de la matriu, si un plau");
            tipatgeCorrecte = input.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Error. Caracter invalid.");
            } else {
                userNumberFilas = input.nextInt();
                if (userNumberFilas < 2 || userNumberFilas > 20) {
                    System.out.println("El numero te que estar entre 2 y 20");
                    tipatgeCorrecte = false;
                }
            }
            input.nextLine();
        } while (!tipatgeCorrecte);

        do {
            System.out.println("Escriu un numero per utilitzarlo en les columnas de la matriu, si un plau");
            tipatgeCorrecte = input.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Error. Caracter invalid.");
            } else {
                userNumberColumnas = input.nextInt();
                if (userNumberColumnas < 2 || userNumberColumnas > 20) {
                    System.out.println("El numero te que estar entre 2 y 20");
                    tipatgeCorrecte = false;
                }
            }
            input.nextLine();
        } while (!tipatgeCorrecte);

        int[][] matriz = new int[userNumberFilas][userNumberColumnas];

        //Multiplicamos las filas y las columnas para saber el numero total de casillas dentro de la matriz
        int[] numeros = new int[userNumberFilas * userNumberColumnas];

        //Creamos una array para almacenar cada posicion de las sumas de cada columna,
        // por ejemplo en la posicion 0 de la array guardaremos la suma de la columna 0 de la matriz
        int[] sumaColumnas = new int[userNumberColumnas];

        //Creamos una variable contador para poder recorrer el array "numeros" hasta el final pasando por cada casilla de la matriz
        int contador = 0;

        //Pedimos al usuario un numero para cada casilla, de ahi que el for vaya hasta el "numeros.length",
        // por ejemplo si tenemos una matriz de 2x2, preguntaremos 4 veces al usuario.
        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.println("Introduce 1 numero");
                tipatgeCorrecte = input.hasNextInt();

                if (!tipatgeCorrecte) {
                    System.out.println("Error: Valor no numeric");
                } else {
                    numeros[i] = input.nextInt();
                }
            } while (tipatgeCorrecte == false);
        }

        //Aqui damos valor a la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                //Señalamos posicion de (fila o "i") y de (columna o "j"). Necesitamos las 2 cordenadas como en el hundir la flota
                //En este caso podriamos substituir "contador" por "j" ya que suman de uno en uno en este caso y empiezan en cero ambos
                matriz[i][j] = numeros[contador];

                //Almacenamos todos loa valores de cada columna en una posicion de un array.
                //Por ejemplo todos los valores de la columna 0 se irian sumando y guardando en la posicion 0 de la array
                sumaColumnas[j] = sumaColumnas[j] + matriz[i][j];

                // Asignamos cada casilla (de 1 en 1) de la matriz con el numero que le corresponde del array "numeros"
                // (array de valores que nos ha dado el usuario)
                contador++;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println("El valor de la suma de la columna " + i + " es igual a = " + sumaColumnas[i]);
        }
    }
}
