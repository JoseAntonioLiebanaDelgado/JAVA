package MethodStringExercises;

import java.util.Scanner;

public class Extraer4y5CaracterMetodoSubstring {
    public static void main(String[] args) {

        //Dada una String, extraer la cuarta y quinta letra usando el método substring
        //El motodo substring se utiliza para coger trozos de frases

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        String phrase = "Comprobamos que todo este correcto";

        System.out.print(phrase.substring(0, 3));
        System.out.print(phrase.substring(5, 34));
    }
}