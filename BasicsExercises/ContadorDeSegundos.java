package BasicsExercises;

import java.util.Scanner;

public class ContadorDeSegundos {
    public static void main(String[] args) {

	/*Escriu un programa que demani a l’usuari la quantitat de segons i mostri per pantalla a
	quantes hores, minuts i segons corresponen (p.ex: 3661 segons corresponen a 1 hora + 1
	minut + 1 segon).*/

        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero de segundos, por favor ");
        segundos = entrada.nextInt();

        horas = (segundos / 3600);
        System.out.println(horas);

        minutos = (segundos / 60) - (horas * 60);
        System.out.println(minutos);

        segundos = (segundos - (minutos * 60)) - (horas * 3600);
        System.out.println(segundos);

        System.out.println((horas + " horas " + minutos + " minutos " + segundos + " segundos"));
    }
}