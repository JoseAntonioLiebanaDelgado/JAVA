package BasicsExercises;

import java.util.Scanner;

public class AreaYPerimetroCircunferencia {
    public static void main(String[] args) {

	/*Realitza un programa que calculi el àrea i el perímetre d’una circumferència. L’usuari haurà
	d’introduir el radi de la circumferència. ( A = π * r^2) ( P=2*π*r).*/

        double radio = 0;
        double diametro = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el radio del circulo, por favor");
        radio = entrada.nextDouble();
        System.out.printf("El area del circulo es " + "%1.2f", (Math.PI * Math.pow(radio, 2)));
        System.out.println("");
        diametro = (radio * 2);
        System.out.printf("El perimetro del circulo es " + "%1.2f", (Math.PI * diametro));
    }
}