//Usant mètodes de la programació modular, desenvolupeu un programa en Java capaç de comprovar si donat un número enter, aquest és parell o senar.
//
//        Feu com a mínim els següents mètodes:
//
//        Un mètode per obtenir un int amb control d'errors
//        Un mètode que comprovi si el número introduït és parell (retorna True) o senar (retorna False)
//        El mètode del Main principal que crida i usa als dos mètodes anteriors

package Funciones_Corregidas;

import java.util.Scanner;

public class Functions2_EvenOrOdd {
    public static void main(String[] args) {

        int userNumber = controlBoolean("Introduce un numero por favor");
        System.out.println(parIOmpar(userNumber));
    }

    public static int controlBoolean(String mensaje) {
        Scanner input = new Scanner(System.in);

        boolean esInt = false;
        int num;

        do {
            System.out.println(mensaje);
            esInt = input.hasNextInt();
            if (esInt == true) {
                num = input.nextInt();
                return num;
            }
            System.out.println("Datos incorrectos");
            input.nextLine();
        } while (true);
    }

    private static boolean parIOmpar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
