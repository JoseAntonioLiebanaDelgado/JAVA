package BasicsExercises;

import java.util.Scanner;

public class ConversorDeEurosAPesetas {
    public static void main(String[] args) {

	/*Programa que demani una quantitat en euros i determini quin era el seu valor amb les antigues
	“pessetes”.*/

        double peseta = 166.386;
        int euros = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una cantidad de euros, por favor");
        euros = entrada.nextInt();
        System.out.println("Esto serian " + (euros * peseta) + " pesetas");
    }
}