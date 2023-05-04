package BasicsExercises;

import java.util.Scanner;

public class FiguraCuadradoHueco {
    public static void main(String[] args) {

        /*Desenvolupa un programa que demani un enter > 0 i < 20 (ho heu de validar) i dibuixi un
        quadrat. Per exemple:
        Amb 1:
        +
        Amb 2:
        ++
        ++
        Amb 3:
        +-+
        | |
        +-+
        Amb 4:
        +--+
        | |
        | |
        +--+*/

        Scanner entradaInt = new Scanner(System.in);
        System.out.println("Introduce un numero, por favor:");

        int number = entradaInt.nextInt();
        int i, j;

        // Este es para las filas
        for (i = 1; i <= number; i++) {
            // Este es para las columnas
            for (j = 1; j <= number; j++) {
                //Aqui comprobamos si estamos en la primera columna o en la ultima columna
                if (j == 1 || j == number)
                    //Aqui miramos si estamos en la primera fila, o en la ultima fila
                    if (i == 1 || i == number)
                        System.out.print("+");
                        // Este else cubre si NO estamos en la priemra o ultima fila
                    else
                        System.out.print("|");
                    // Si estamos en la primera o ultima fila, PERO NO estamos en la primera o ultima columna, entramos aqui para pintar los guiones de +----+
                else if (i == 1 || i == number)
                    System.out.print("-");
                    //Esto pinta los huecos en los recuadros que quedan que no son "+-|"
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}