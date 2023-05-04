package MethodStringExercises;

import java.util.Scanner;

public class LiebanaJoseAntonio_StringsE_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Escriu un programa per comptar el nombre de caràcters (freqüència de
                caràcters) en una cadena.
                Cadena de mostra: " google.com "
        Resultat esperat: {'g': 2, 'o': 3, 'l': 1, 'e': 1, '.': 1, 'c': 1, 'm': 1}*/


        String userPhrase = "";
        int contadorA = 0;

        char[] chars = new char[userPhrase.length()];
        int[] count = new int[userPhrase.length()];

        System.out.println("Bienvenido, escriba una frase cualquiera, por favor");
        userPhrase = input.nextLine();

        for (int i = 0; i < userPhrase.length(); i++) {
            if (i == 0) {
                chars[0] = userPhrase.charAt(0);
            } else {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == userPhrase.charAt(i)) ;
                }
            }
        }
    }
}
