package Enum;

import java.util.Scanner;

public class DiasSemanaENUM {
    public static void main(String[] args) {

        //Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no
        //QUE PASA SI EL USUARIO INTRODUCE ALGO QUE NO ESTE EN LA ENUM

        Scanner entradaString = new Scanner(System.in);
        String dia = "";

        System.out.println("Escribe un dia de la semana");
        dia = entradaString.nextLine();

        if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves") || dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")) {
            DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
            switch (diaS) {
                case LUNES:
                case MARTES:
                case MIERCOLES:
                case JUEVES:
                case VIERNES:
                    System.out.println("El dia " + diaS + " es laborable.");
                    break;

                case SABADO:
                case DOMINGO:
                    System.out.println("El dia " + diaS + " es festivo.");
                    break;
                default:
                    System.out.println("Entra default");
            }
        } else {
            System.out.println("No has introducido bien el dia");
        }
    }
}