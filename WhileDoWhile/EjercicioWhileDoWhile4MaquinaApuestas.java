package WhileDoWhile;

import java.util.Scanner;

public class EjercicioWhileDoWhile4MaquinaApuestas {
    public static void main(String[] args) {


        /*Exercici 6: màquina d'apostes (opcional)
        Volem simular el funcionament d'una partida (sense introducció de crèdits o monedes) d'una
        màquina d'apostes que segueix el següent esquema:
        1. Genera tres nombres (valor entre 0 i 9) en cadascun de les seves finestres i els mostri
        a l'usuari
        2. Genera avanços (valor entre 0 i 5) i els mostra a l'usuari
        Nota: Part de l'exercici consisteix en trobar la funció per generar un número aleatori.
        3. Calcula coincidències (excloents en ordre decreixent) de tres tipus:
        Tipus 3 : Els tres nombres iguals: guanya 250 €
        Tipus 2 : Dos nombres iguals (1-2 o 2-3) : guanya 20€
        Tipus 1 : Un 7 a l'inici i/o al final: guanya 1€
        4. Indica guanys
        5. Permet avanços en les tres finestres, utilitzant botons per cada finestra (els avanços
        es gestionen cíclicament a elecció de l'usuari)
        Nota 2: Gestió d'avanços:
        polsa ‘1’: avanç al botó 1
        polsa ‘2’: avanç al botó 2
        polsa ‘3’: avanç al botó 3
        polsa ‘0’: no desitja més avanços*/


        String respuestaFinal = "";

        int numeroAleatorio1 = 0;
        int numeroAleatorio2 = 0;
        int numeroAleatorio3 = 0;

        int avances = 0;

        int boton1 = 0;
        int boton2 = 0;
        int boton3 = 0;
        int boton0 = 0;

        int respuestaJugador = 0;

        do {
            numeroAleatorio1 = (int) ((Math.random() * 10));
            numeroAleatorio2 = (int) ((Math.random() * 10));
            numeroAleatorio3 = (int) ((Math.random() * 10));

            System.out.println("|-----------------------------------|");
            System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
            System.out.println("|-----------------------------------|");
            System.out.println("");

            if (numeroAleatorio1 == numeroAleatorio2 && numeroAleatorio1 == numeroAleatorio3) {
                System.out.println("Primer premio! 250€");
            } else if (numeroAleatorio1 == numeroAleatorio2 || numeroAleatorio2 == numeroAleatorio3) {
                System.out.println("Segundo premio! 200€");
            } else if (numeroAleatorio1 == 7 || numeroAleatorio3 == 7) {
                System.out.println("Tercer premio! 7€");
            } else {
                System.out.println("No hay premio");
            }
            System.out.println("");

            avances = (int) ((Math.random() * 5));
            System.out.println("Avances: " + avances);
            System.out.println("");

            System.out.println("");
            System.out.println("Elija un boton por favor:");
            System.out.println("Para utilizar los avances en la primera columna pulse el boton: 1.");
            System.out.println("Para utilizar los avances en la segunda columna pulse el boton: 2.");
            System.out.println("Para utilizar los avances en la tercera columna pulse el boton: 3.");
            System.out.println("Para no utilizar los avances pulse: 0.");

            Scanner entrada = new Scanner(System.in);
            respuestaJugador = 0;
            respuestaJugador = entrada.nextInt();


            if (respuestaJugador == 1) {
                System.out.println(numeroAleatorio1 + avances);
                if ((numeroAleatorio1 + avances) >= 10) {
                    numeroAleatorio1 = (numeroAleatorio1 + avances) - 10;
                } else {
                    numeroAleatorio1 = (numeroAleatorio1 + avances);
                }

                if (numeroAleatorio1 == numeroAleatorio2 && numeroAleatorio1 == numeroAleatorio3) {
                    System.out.println("Primer premio! 250€");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                } else if (numeroAleatorio1 == numeroAleatorio2) {
                    System.out.println("Segundo premio! 200€");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                } else if (numeroAleatorio1 == 7) {
                    System.out.println("Tercer premio! 1€ ");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                } else {
                    System.out.println("No hay premio");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                }
            } else if (respuestaJugador == 2) {
                if ((numeroAleatorio2 + avances) >= 10) {
                    numeroAleatorio2 = (numeroAleatorio2 + avances) - 10;
                } else {
                    numeroAleatorio2 = (numeroAleatorio2 + avances);
                }

                if (numeroAleatorio2 == numeroAleatorio1 && numeroAleatorio2 == numeroAleatorio3) {
                    System.out.println("Primer premio! 250€");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                } else if (numeroAleatorio2 == numeroAleatorio1 || numeroAleatorio2 == numeroAleatorio3) {
                    System.out.println("Segundo premio! 200 €");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                } else {
                    System.out.println("No hay premio");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                }
            } else if (respuestaJugador == 3) {
                if ((numeroAleatorio3 + avances) >= 10) {
                    numeroAleatorio3 = (numeroAleatorio3 + avances) - 10;
                } else {
                    numeroAleatorio3 = (numeroAleatorio3 + avances);
                }

                if (numeroAleatorio3 == numeroAleatorio1 && numeroAleatorio3 == numeroAleatorio2) {
                    System.out.println("Primer premio! 250€");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                } else if ((numeroAleatorio3) == numeroAleatorio2) {
                    System.out.println("Segundo premio! 200€");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                } else if ((numeroAleatorio3) == 7) {
                    System.out.println("Tercer premio! 1€ ");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                } else {
                    System.out.println("No hay premio");
                    System.out.println("|-----------------------------------|");
                    System.out.println("|     " + numeroAleatorio1 + "     |     " + numeroAleatorio2 + "     |     " + numeroAleatorio3 + "     |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("");
                }
            }

            Scanner entradaFinal = new Scanner(System.in);
            System.out.println("");
            System.out.println("Desea probar suerte de nuevo?");
            System.out.println("");
            System.out.println("Introduzca -si- para continuar la partida");
            System.out.println("");
            System.out.println("Introduzca -no- para finalizar la partida");
            respuestaFinal = entradaFinal.nextLine();
            System.out.println("");

        } while (respuestaFinal.equalsIgnoreCase("si"));

        if (respuestaFinal.equalsIgnoreCase("no")) {
            System.out.println("De acuerdo, hasta pronto!");
        }
    }
}