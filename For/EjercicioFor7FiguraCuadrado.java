package For;

import java.util.Scanner;

public class EjercicioFor7FiguraCuadrado {
    public static void main(String[] args) {

        /*Un quadrat de nombres
        Escriu un programa que demani un enter positiu més gran que 0 i "dibuixi" un quadrat amb els
        nombres del 1 fins el valor de l'entrada. Per exemple, si l'entrada és 5, dibuixarà:
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5*/

        int userNumber = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero, por favor");
        userNumber = entrada.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            for (int j = 1; j <= userNumber; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}