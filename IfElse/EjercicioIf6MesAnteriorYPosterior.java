package IfElse;

import java.util.Scanner;

public class EjercicioIf6MesAnteriorYPosterior {
    public static void main(String[] args) {

	/*Exercici 6.
	Desenvolupa un programa que demani un mes i un any, i escrigui el mes anterior i el mes
	següent.
	Nota: no facis servir el tipus de dades data.
	Ex. Si l’usuari introdueix mes:10 i any 2003, el resultat serà anterior:9/2003 i posterior 11/2003.
	Però amb mes:12 i any 2003, el resultat serà anterior:11/2003 i posterior 1/2004 (passa el
	mateix amb el mes anterior a gener).*/

        int mes = 0;
        int year = 0;
        int mesDoce = 1;
        int mesUno = 12;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un mes (por numero), por favor");
        mes = entrada.nextInt();
        System.out.println("Introduce un año, por favor");
        year = entrada.nextInt();

        if (mes == 12) {
            System.out.println("Un mes antes seria el mes " + (mes - 1) + " del año " + year + " y un mes mas tarde seria el mes " + (mesDoce) + " del año " + (year + 1));
        } else if (mes == 1) {
            System.out.println("Un mes antes seria el mes " + mesUno + " del año " + (year - 1) + " y un mes mas tarde seria el mes " + (mes + 1) + " del año " + year);
        } else if (mes > 1 && mes < 12) {
            System.out.println("Un mes antes seria el mes " + (mes - 1) + " del año " + (year) + " y un mes mas tarde seria el mes " + (mes + 1) + " del año " + year);
        } else if (mes > 12) {
            System.out.println("Introduce un mes del 1 al 12, por favor");
        } else if (mes < 1) {
            System.out.println("Introduce un mes del 1 al 12, por favor");
        } else {
            System.out.println("Introduce un mes del 1 al 12, por favor");
        }
    }
}