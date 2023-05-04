package IfElse;

import java.util.Scanner;

public class EjercicioIf4IsDigitoNo {
    public static void main(String[] args) {

        /*Programa que demani un símbol a l’usuari i li mostri un missatge quan sigui una representació
        d’un dígit.*/

        //Declaro una variable de tipo caracter
        char caracter;

        /*Creo una variable de tipo Scanner para leer lo que introduzca el usuario cuando invoquemos
         * el metodo entrada.next......()*/
        Scanner entrada = new Scanner(System.in);

        //Imprimimos por consola
        System.out.println("Introduce un caracter, por favor");

        /*Le decimos al programa que la variable caracter es igual al primer caracter ".charAt(0)"
         * de la linea, palabra o numero que introduzca el usuario*/
        caracter = entrada.nextLine().charAt(0);

        //Si la variable "caracter" es igual a un digito imprimimos que ha introducido un digito
        if (Character.isDigit(caracter)) {
            System.out.println("Has introducido un digito");
        }
        //Si no es asi, imprimimos que no es un digito
        else {
            System.out.println("Eso no es un digito");
        }
    }
}