package MethodStringExercises;

import java.util.Scanner;

public class IntroduccionInfinitaHastaCadenaVacia {
    public static void main(String[] args) {

	/*Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia “”.
	Mostrar la cadena resultante de tod0 lo que ha escrito por consola*/

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);
        String phraseUser = "";
        String contadorString = "";

        System.out.println("Introduce las frases que quieras, cuando quieras parar pulsa enter sin escribir nada ");

        do {
            phraseUser = entradaString.nextLine();
            contadorString = contadorString + phraseUser;
        } while (!phraseUser.equals(""));

        if (phraseUser.equals("")) {
            System.out.println(contadorString);
        }
    }
}