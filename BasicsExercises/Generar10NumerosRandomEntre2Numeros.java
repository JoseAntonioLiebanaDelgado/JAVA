package BasicsExercises;

import java.util.Scanner;

public class Generar10NumerosRandomEntre2Numeros {
    public static void main(String[] args) {

         /*Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método
         Math.random para generar un número entero aleatorio (recuerda el casting de double a int).*/

        //Pedir dos inputs al usuario
        //Hacemos 2 variables y las inicializamos a zero Double
        //Hacemos dos Math.random entre los números
        //Parseamos el resultado a INT
        //Mostrar resultado

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        //Hacemos 2 variables y las inicializamos a zero Double
        int firstNumberUser = 0;
        int secondNumberUser = 0;

        //Pedir dos inputs al usuario
        System.out.println("Introduce dos numeros");
        System.out.println();
        System.out.println("Introduce el primer numero");
        firstNumberUser = entradaInt.nextInt();
        System.out.println();
        System.out.println("Introduce el segundo numero");
        secondNumberUser = entradaInt.nextInt();
        System.out.println();

        //Parseamos el resultado a INT
        //Mostrar resultado
        for (int i = 0; i < 10; i++) {                                                            //Valor minimo
            System.out.println((int) (Math.random() * ((secondNumberUser) - (firstNumberUser))) + firstNumberUser);
        }
    }
}