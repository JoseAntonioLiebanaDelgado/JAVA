package MethodStringExercises;

import java.util.Scanner;

public class MayusculaoMinusculaToUpperCaseToLowerCase {
    public static void main(String[] args) {

        /* Convertir una frase a mayúsculas o minúsculas, lo decide el usuario pulsando un numero par para
         * mayusculas o impar para minúsculas*/

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);
        String frase = "Esta es dicha frase";


        System.out.println(frase);
        System.out.println("Introduce un numero impar para transformar la frase toda a Minuscula");
        System.out.println("Introduce un numero par para transformar la frase toda a Mayuscula");
        int userAnswer = entradaInt.nextInt();


        //Hay manera de empezar diciendo "si es impar" o tengo que empezar siempre con par y hacer algun boolean?
        //Divide el numero que ha introducido el usuario entre 2 y si el residuo es 0 es par.
        if (userAnswer % 2 == 0) {
            System.out.println(frase.toUpperCase());

            if (userAnswer == 0) {
                System.out.println("Considero que el '0' es par");
            }
        } else {
            System.out.println(frase.toLowerCase());
        }
    }
}