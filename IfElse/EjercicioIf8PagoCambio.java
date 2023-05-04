package IfElse;

import java.util.Scanner;

public class EjercicioIf8PagoCambio {
    public static void main(String[] args) {


	/*Pagaments
	Desenvolupa un programa que demani a l’usuari que introdueixi un preu en € i la quantitat de €
	que paga. El programa compararà les dues quantitats i escriurà els € que li falten per pagar o
	bé els que li han de tornar. Ex. Si l’usuari introdueix preu=102€ i paga=150€, el programa li
	dirà “Sobren 48€”. Si l’usuari introdueix preu=102€ i paga=100€, el programa li dirà “Falten 2€”*/


        double precioProducto = 0;
        double cantidadDada = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto vale el producto?");
        precioProducto = entrada.nextDouble();
        System.out.println("Cuando dinero vas a dar?");
        cantidadDada = entrada.nextDouble();

        if (precioProducto > cantidadDada) {
            System.out.println("Te faltan por pagar " + (precioProducto - cantidadDada) + " euros");
        } else if (precioProducto < cantidadDada) {
            System.out.println("Te tienen que devolver " + (cantidadDada - precioProducto) + " euros");
        } else if (precioProducto == cantidadDada) {
            System.out.println("Has pagado el precio justo");
        } else {
            System.out.println("Empezemos de nuevo, hay un error");
        }
    }
}