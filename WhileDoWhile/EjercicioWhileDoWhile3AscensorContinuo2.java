package WhileDoWhile;

import java.util.Scanner;

public class EjercicioWhileDoWhile3AscensorContinuo2 {
    public static void main(String[] args) {

        /*Exercici 4: L'ascensor continu
        Tornem a considerar l'ascensor d'un exercici anterior.
        Recordem que l'ascensor dóna servei a un edifici amb planta baixa i dos pisos, i disposa dels
        següents botons: ‘pujar 1’, ‘pujar 2’, ‘baixar 1’ i ‘baixar 2’. L’ascensor es comporta, a partir dels
        botons esmentats, segons el següent diagrama de transició d’estats:

        En aquesta ocasió, haurem de desenvolupar una nova versió del programa que simulava el
        funcionament de l'ascensor.
        Aquest cop, però, el programa escriu el següent menú:
        Es troba a <pis actual>
        Seleccioni una opció:
        a: pujar un pis
        b: pujar dos pisos
        c: baixar un pis
        d: baixar dos pisos
        x: sortir de l’ascensor

        En cas que l’usuari demani una opció correcta, el programa calcula el nou pis. Si l’opció és
        incorrecta, escriurà un missatge d’error adequat. En ambdós casos tornarà a escriure el menú
        anterior, fins que l’usuari teclegi x. Moment en que acabarà el programa.*/


        final int plantaBaja = 0;
        final int primeraPlanta = 1;
        final int segundaPlanta = 2;

        final String botonSubirUno = "a";
        final String botonSubirDos = "b";
        final String botonBajarUno = "c";
        final String botonBajarDos = "d";
        final String botonExit = "x";

        int plantaRaw = 0;
        int planta = 0;
        String boton = "";

        Scanner entradaPlanta = new Scanner(System.in);
        Scanner entradaBoton = new Scanner(System.in);

        do {

            System.out.println("En que planta estas? (0=plantaBaja | 1=primeraPlanta | 2=segundaPlanta)");
            plantaRaw = entradaPlanta.nextInt();
            System.out.println("Pulsa un boton. (x=botonExit | a=botonSubirUno | b=botonSubirDos | c=botonBajarUno | d=botonBajarDos)");
            boton = entradaBoton.nextLine();

            if (plantaRaw == plantaBaja) {
                if (boton.equalsIgnoreCase("a")) {
                    System.out.println("Estas en la planta " + plantaBaja + 1);
                } else if (boton.equalsIgnoreCase("b")) {
                    System.out.println("Estas en la planta " + plantaBaja + 2);
                } else if (boton.equalsIgnoreCase("c")) {
                    System.out.println("No puedes bajar 1 piso, ya estas en la 0 y no hay ninguna planta mas a bajo");
                } else if (boton.equalsIgnoreCase("d")) {
                    System.out.println("No puedes bajar 2 pisos, ya estas en la 0 y no hay ninguna planta mas a bajo");
                } else if (boton.equalsIgnoreCase("x")) {
                    System.out.println("Planta Baja");
                } else {
                    System.out.println("Disculpe las molestias, ha habido un error");
                }
            }

            if (plantaRaw == primeraPlanta) {
                if (boton.equalsIgnoreCase("a")) {
                    System.out.println("Estas en la planta " + (primeraPlanta + 1));
                } else if (boton.equalsIgnoreCase("b")) {
                    System.out.println("No puedes subir dos pisos, ya estas en la 1 y solo hay uno una planta mas para subir");
                } else if (boton.equalsIgnoreCase("c")) {
                    System.out.println("Estas en la planta " + (primeraPlanta - 1));
                } else if (boton.equalsIgnoreCase("d")) {
                    System.out.println("No puedes bajar 2 pisos, ya estas en la 1 y solo hay una planta mas para bajar");
                } else if (boton.equalsIgnoreCase("x")) {
                    System.out.println("Primera Panta");
                } else {
                    System.out.println("Disculpe las molestias, ha habido un error");
                }
            }

            if (plantaRaw == segundaPlanta) {
                if (boton.equalsIgnoreCase("a")) {
                    System.out.println("No puedes subir un piso, estas en la planta 2, y no hay mas plantas arriba");
                } else if (boton.equalsIgnoreCase("b")) {
                    System.out.println("No puedes subir dos pisos, estas en la planta 2, y no hay mas plantas arriba");
                } else if (boton.equalsIgnoreCase("c")) {
                    System.out.println("Estas en la planta " + (segundaPlanta - 1));
                } else if (boton.equalsIgnoreCase("d")) {
                    System.out.println("Estas en la planta " + (segundaPlanta - 2));
                } else if (boton.equalsIgnoreCase("x")) {
                    System.out.println("Segunda Planta");
                } else {
                    System.out.println("Disculpe las molestias, ha habido un error");
                }
            }
        } while (boton.equalsIgnoreCase("a") || boton.equalsIgnoreCase("b") || boton.equalsIgnoreCase("c") || boton.equalsIgnoreCase("d"));

        if (boton.equalsIgnoreCase("x")) {
            System.out.println("Puertas abiertas, hasta pronto!");
        }
    }
}