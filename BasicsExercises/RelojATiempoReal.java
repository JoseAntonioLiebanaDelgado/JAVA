package BasicsExercises;

import java.util.Scanner;

public class RelojATiempoReal {
    public static void main(String[] args) throws InterruptedException {

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        int year = 0;
        int meses = 0;
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        System.out.println("Ajustamos la fecha");

        do {
            System.out.println("En que año vivimos?");
            year = entradaInt.nextInt();

            if (year < 2022 || year > 2022) {
                System.out.println("Asegurate del año en el que estamos");
            }
        } while (year < 2022 || year > 2022);


        do {
            System.out.println("En que mes estamos?");
            meses = entradaInt.nextInt();
            if (meses < 1 || meses > 12) {
                System.out.println("Usa numeros entre 1 y 12");
            }
        } while (meses < 1 || meses > 12);

        do {
            System.out.println("Que dia es hoy?");
            dias = entradaInt.nextInt();
            if (dias < 1 || dias > 31) {
                System.out.println("Usa numeros entre 1 y 31");
            }
        } while (dias < 1 || dias > 31);

        do {
            System.out.println("Que hora es?");
            horas = entradaInt.nextInt();
            if (horas < 0 || horas > 23) {
                System.out.println("Usa numeros entre 0 y 23.");
            }
        } while (horas < 0 || horas > 23);


        do {
            System.out.println("Cuantos minutos?");
            minutos = entradaInt.nextInt();
            if (minutos < 0 || minutos > 59) {
                System.out.println("Usa numeros entre 0 y 59.");
            }
        } while (minutos < 0 || minutos > 59);

        do {
            System.out.println("Y cuantos segundos");
            segundos = entradaInt.nextInt();

            if (segundos < 0 || segundos > 59) {
                System.out.println("Usa numeros entra 0 y 59");
            }
        } while (segundos < 0 || segundos > 59);

        while (true) {

            if (year < 10) {
                System.out.print("0");
            }
            System.out.print(year + ".");

            if (meses < 10) {
                System.out.print("0");
            }
            System.out.print(meses + ".");

            if (dias < 10) {
                System.out.print("0");
            }
            System.out.print(dias + ".");

            if (horas < 10) {
                System.out.print("0");
            }
            System.out.print(horas + ":");

            if (minutos < 10) {
                System.out.print("0");
            }
            System.out.print(minutos + ":");

            if (segundos < 10) {
                System.out.print("0");
            }
            System.out.println(segundos);
            segundos++;


            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    horas++;

                    if (horas == 24) {
                        horas = 0;
                        dias++;

                        if (dias == 32) {
                            dias = 1;
                            meses++;

                            if (meses == 13) {
                                meses = 1;
                                year++;
                            }
                        }
                    }
                }
            }
            Thread.sleep(1000);
        }
    }
}