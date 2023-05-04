package For;

import java.util.Scanner;

public class EjercicioFor4YearAndAge {
    public static void main(String[] args) {

        /*Històric d'edats
        Desenvolupa un programa que demani el nom de l’usuari, l’edat i l’any actual. El programa
        escriurà l’edat que tenia l’usuari a cada any des del seu naixement i s’acomiadarà. Per
        exemple, si l’entrada és
        Anna
        5
        2015
        El programa escriurà
        El 2010 va nàixer
        El 2011 tenia 1 any
        El 2012 tenia 2 anys
        El 2013 tenia 3 anys
        El 2014 tenia 4 anys
        Adéu Anna
        L'aplicació no li dirà l'edat que té l'usuàri en l'any actual, donat que aquesta dada forma part de
        l'entrada. Per exemple, si la usuària ha nascut aquest any, simplement s'acomiadarà, i si ho va
        fer l'any passat, només dirà quan va néixer i s'acomiadarà.
        Les comprovacions necessàries són: que el nom no estigui buit, que l'edat i l'any actual siguin
        positius (es pressuposa que seran enters), i que l'any actual sigui un valor més alt que el de
        l'edat.*/


        String userName = "";
        int currentYear = 0;
        int userAge = 0;
        int bornYear = 0;

        Scanner entradaLine = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);


        System.out.println("Introduce tu nombre, por favor");
        userName = entradaLine.nextLine();
        System.out.println("Introduce tu edad, por favor");
        userAge = entradaInt.nextInt();
        System.out.println("Introduce el año actual, por favor");
        currentYear = entradaInt.nextInt();
        bornYear = (currentYear - userAge);

        // if (bornYear >= 0
        if (userAge < currentYear) {
            for (int i = 0; i <= userAge; i++) {
                if (i == 0) {
                    System.out.println("El " + bornYear + " va neixer");
                } else if (i == 1) {
                    bornYear++;
                    System.out.println("El " + bornYear + " tenia " + i + " any");
                } else {
                    bornYear++;
                    System.out.println("El " + bornYear + " tenia " + i + " anys");
                }
            }
            System.out.println("Adeu " + userName);
        } else if (userAge == currentYear) {
            System.out.println("El " + currentYear + " va neixer");
        } else {
            System.out.println("No puedes tener mas años que el año en el que estamos");
        }
    }
}