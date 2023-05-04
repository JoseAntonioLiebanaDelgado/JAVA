package IfElse;

import java.util.Scanner;

public class EjercicioIf1MayoriaEdad {
    public static void main(String[] args) {

        /*Si ets adult llavors ets responsable
        Desenvolupa un programa que demani el nom i l’edat a l’usuari, i si és major de 18 anys li
        digui “Vostè ja pot anar a la presó!”. Finalment, sigui quina sigui l’edat de l’usuari el programa
        s’acomiadarà dient “Adéu «nom de l’usuari»!”.*/

        String nombre = "";
        int edad = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor");
        nombre = entrada.nextLine();
        System.out.println("Introduce tu edad, por favor");
        edad = entrada.nextInt();

        if (edad < 18) {
            System.out.println("Vostè encara no pot anar a la presó");
        } else if (edad >= 18) {
            System.out.println("Vostè ja pot anar a la presó!");
        }
        System.out.println("Adeu " + nombre + "!");
    }
}