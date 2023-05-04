package For;

import java.util.Scanner;

public class EjercicioFor9FiguraMedioTrianguloDerechas {
    public static void main(String[] args) {

        /*Un triangle de nombres
        Desenvolupa un programa que demani a l’usuari un nombre positiu més gran que 0. El
        programa escriurà una línia per nombre entre el 1 i el nombre introduït (es a dir, creixentment).
        A cada línia escriurà un asterisc. Ex. si l’entrada és 5 la sortida serà

        *
        **
        ***
        ****
        *****        */

        Scanner entrada = new Scanner(System.in);
        int userNumber = 0;

        System.out.println("Introduce un numero, por favor");
        userNumber = entrada.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}