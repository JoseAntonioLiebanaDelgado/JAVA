package For;

import java.util.Scanner;

public class EjercicioFor8FiguraRectangulo {
    public static void main(String[] args) {

        /*Un rectangle de nombres
        Escriu un programa que demani un dos enters positius més gran que 0 i "dibuixi" un rectangle
        com el que es mostra a continuació. Per exemple, si l'entrada és 5 i 3, dibuixarà:
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5*/

        int userNumberOne = 0;
        int userNumberTwo = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero, por favor");
        userNumberOne = entrada.nextInt();
        System.out.println("Introduce otro numero, por favor");
        userNumberTwo = entrada.nextInt();

        for (int i = 1; i <= userNumberTwo; i++) {
            for (int j = 1; j <= userNumberOne; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}