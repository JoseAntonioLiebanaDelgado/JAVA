package MethodStringExercises;

import java.util.Scanner;

public class LiebanaJoseAntonio_StringsE_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Escriu un programa per calcular la longitud d'una cadena i que ho mostri per
        pantalla.*/

        String userPhrase = "";

        System.out.println("Bienvenido, escriba una frase cualquiera, por favor");
        userPhrase = input.nextLine();

        System.out.println("La frase tiene " + userPhrase.length() + " caracteres contando los espacios");
    }
}
