package controllers;

import models.Agenda;
import models.Task;

import java.time.LocalTime;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task t = crearTasca();
    }

    public void crearAgenda(){
        Agenda a = new Agenda(Year.now());
    }

    public static Task crearTasca(){
        Task t;
        LocalTime inici = LocalTime.now();
        int minutsTasca = inputIntMinMax("Quants minuts durarà la nova tasca: ","ERROR: Tipatge incorrecte",1,3600,"ERROR: Valor fora de rang");
        String descr = inputString("Escriu la descripció de la tasca: ");
        t = new Task(inici,inici.plusMinutes(minutsTasca),descr);
        System.out.println(t);
        return t;
    }

    public static String inputString(String text){
        Scanner input = new Scanner(System.in);

        System.out.print(text);
        String descrt = input.nextLine();

        return descrt;
    }

    public static int inputIntMinMax(String text, String error1,int min, int max, String error2){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextInt();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}