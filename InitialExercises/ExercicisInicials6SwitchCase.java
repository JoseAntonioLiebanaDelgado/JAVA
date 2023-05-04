package InitialExercises;

import java.util.Scanner;

public class ExercicisInicials6SwitchCase {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        char opcio;
        String text;

        do {
            System.out.println("Escull una opció:" +
                    "\n\t a)Hola" +
                    "\n\t b)Adeu" +
                    "\n\t c)Error" +
                    "\n\t d)Sortir");

            text = llegir.next();
            opcio = text.charAt(0);

            switch (opcio) {
                case 'a':
                    System.out.println("Rojo");
                    break;
                case 'b':
                    System.out.println("Azul");
                    break;
                case 'c':
                    System.out.println("Verde");
                    break;
                case 'd':
                    System.out.println("Sortir");
                    break;
                default:
                    System.out.println("Valor no correcte");
                    break;
            }
        } while (opcio != 'd');
    }
}
