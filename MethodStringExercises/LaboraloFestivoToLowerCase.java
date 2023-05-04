package MethodStringExercises;

import java.util.Scanner;

public class LaboraloFestivoToLowerCase {
    public static void main(String[] args) {

        //1) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.

        Scanner entradaString = new Scanner(System.in);
        String day = "";
        String userAnswer = "";

        do {
            System.out.println("Introduce un dia de la semana y te diremos si es laboral o festivo");
            //Transformar tod0 lo que introduce el usuario a minuscula toLowerCase
            day = entradaString.nextLine().toLowerCase();

            day.equalsIgnoreCase("lunes");
            day.equalsIgnoreCase("martes");
            day.equalsIgnoreCase("miercoles");
            day.equalsIgnoreCase("jueves");
            day.equalsIgnoreCase("viernes");
            day.equalsIgnoreCase("sabado");
            day.equalsIgnoreCase("domingo");

            switch (day) {

                //Todo minuscula
                case "lunes":
                    System.out.println("El lunes es dia laboral");
                    break;
                case "martes":
                    System.out.println("El martes es dia laboral");
                    break;
                case "miercoles":
                    System.out.println("El miercoles es dia laboral");
                    break;
                case "jueves":
                    System.out.println("El jueves es dia laboral");
                    break;
                case "viernes":
                    System.out.println("El viernes es dia laboral");
                    break;
                case "sabado":
                    System.out.println("El sabado es dia festivo");
                    break;
                case "domingo":
                    System.out.println("El domingo es dia festivo");
                    break;
            }
            System.out.println("Quieres saber algun otro dia? ");
            System.out.println("Responde con  -si-   o   -no- ");

            userAnswer = entradaString.nextLine();

        } while (userAnswer.equalsIgnoreCase("si"));
    }
}