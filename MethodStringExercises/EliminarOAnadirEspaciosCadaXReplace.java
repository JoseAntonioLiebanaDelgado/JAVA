package MethodStringExercises;

import java.util.Scanner;

public class EliminarOAnadirEspaciosCadaXReplace {
    public static void main(String[] args) {

        // Pide una frase al usuario y elimina los espacios, en caso de que NO tenga espacios, introduce un espacio cada 3 caracteres
        //Utilizar metodo charAt, for y lenght

        Scanner entradaString = new Scanner(System.in);
        String phraseUser = "";
        String finalResult = "";
        boolean hayEspacio = false;
        char espacio = ' ';

        System.out.println("Escribe una frase");
        phraseUser = entradaString.nextLine();

        if (phraseUser.contains(" ")) {
            hayEspacio = true;
            System.out.println(phraseUser.replace(" ", ""));
        } else {
            for (int i = 1; i <= phraseUser.length() - 1; i++) {
                //Si la "i" la podemos dividir entre 3 con resuduo 0 (que se puede dividir y da resultado entero)
                if (i % 3 == 0) {
                    finalResult = finalResult + phraseUser.charAt(i) + " ";
                } else {
                    finalResult = finalResult + phraseUser.charAt(i);
                }
            }
            System.out.println(finalResult);
        }
    }
}