package BasicsExercises;

import java.util.Scanner;

public class MostrarUltimoDigito {
    public static void main(String[] args) {

        /*Programa que demani un nombre sencer i mostri l’últim dígit.*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un nombre, por favor");
        String nombre = entrada.nextLine();
        int ultima_letra = nombre.length();
        System.out.println("La ultima letra del nombre es la " + nombre.charAt(ultima_letra - 1));

        System.out.println("Introduce un numero del 1 al 1000000, por favor");
        String numero = entrada.nextLine();
        int ultimo_numero = numero.length();
        System.out.println("El ultimo numero es " + numero.charAt(ultimo_numero - 1));
    }
}