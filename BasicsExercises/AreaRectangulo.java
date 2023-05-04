package BasicsExercises;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {

	/*Donades la base i l’altura d’un rectangle per part de l’usuari, crea un programa que calculi el
	àrea (Àrea = Base * Altura).*/


        int base = 0;
        int altura = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base de un rectangulo, por favor");
        base = entrada.nextInt();
        System.out.println("Introduce la altura de un rectangulo, por favor");
        altura = entrada.nextInt();
        System.out.println("El area del rectangulo es de " + (base * altura));
    }
}