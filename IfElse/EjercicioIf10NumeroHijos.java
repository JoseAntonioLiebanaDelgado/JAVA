package IfElse;

import java.util.Scanner;

public class EjercicioIf10NumeroHijos {
    public static void main(String[] args) {


        /*El nombre de fills
        Desenvolupa un programa que demani el nombre de fills de l'usuari i respongui tal i com indica
        el següent fragment de codi:
        Cas nombredefills sigui
        < 0: escriu "error, no pots tenir menys que 0 fills!"
        0: escriu "tot el que t'has estalviat en bolquers!"
        1: escriu "compte de no mimar-lo massa!"
        >1 AND <5: escriu "no t'avorreixes a casa eh?"
        > 4: escriu "tu si fas pais!"*/


        int numeroHijos = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos hijos tienes");
        numeroHijos = entrada.nextInt();

        if (numeroHijos < 0) {
            System.out.println("Error, no pots tenir menys que 0 fills!");
        } else if (numeroHijos == 0) {
            System.out.println("Tot el que t'has estalviat en bolquers!");
        } else if (numeroHijos == 1) {
            System.out.println("Compte de no mimar-lo massa!");
        } else if (numeroHijos > 1 && numeroHijos < 5) {
            System.out.println("No t'avorreixes a casa eh?");
        } else if (numeroHijos > 4) {
            System.out.println("Tu sí fas país!");
        } else {
            System.out.println("Error");
        }
    }
}