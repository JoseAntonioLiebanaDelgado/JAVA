package BasicsExercises;

import java.util.Random;
import java.util.Scanner;

public class GenerarPassword {

    public static void main(String[] args) {

        /*Genera un programa que donat un nom i un cognom (demanats a l'usuari), generi un
        identificador d'usuari que és nom.cognom i una contrasenya de 3 números que es generaran
        aleatòriament.*/

        Random numeroRandom = new Random();
        String nombre = "";
        String apellido = "";

        Scanner entrada = new Scanner(System.in);

        int pass = numeroRandom.nextInt(900) + 100;
        System.out.println("Introduce tu nombre");
        nombre = entrada.nextLine();
        System.out.println("Introduce tu apellido");
        apellido = entrada.nextLine();

        System.out.println("Tu usuario es " + nombre + "." + apellido);
        System.out.println("Tu pass es " + pass);
    }
}