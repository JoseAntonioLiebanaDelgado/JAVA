package MethodStringExercises;

import java.util.Scanner;

public class SeparaFraseEnPalabras {
    public static void main(String[] args) {

        //Dada una frase que ponga el usuario, separa esa frase en palabras, imprime cada palabra por separado (en otra linea).

        Scanner entradaString = new Scanner(System.in);
        String phraseUser = "";
        String resultadoFinal = "";

        System.out.println("Escribe una frase");
        phraseUser = entradaString.nextLine();

        for (int i = 0; i <= phraseUser.length() - 1; i++) {
            String vCharPhraseUser = String.valueOf(phraseUser.charAt(i));
            resultadoFinal = resultadoFinal + phraseUser.charAt(i);

            if (vCharPhraseUser.equalsIgnoreCase(" ")) {
                System.out.println(resultadoFinal);
                //Volvemos a darle un valor a la variable para que no se vaya sumando de 1 en 1
                resultadoFinal = "";
            }
            if (i == phraseUser.length() - 1) {
                System.out.println(resultadoFinal);
            }
        }
    }
}