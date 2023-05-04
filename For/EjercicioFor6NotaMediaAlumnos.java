package For;

import java.util.Scanner;

public class EjercicioFor6NotaMediaAlumnos {
    public static void main(String[] args) {

        /*Dissenya un programa que, en cada pas, li demani a l'usuari el nom i la nota de cadascun dels
        10 alumnes d'una classe. Al final li mostrarà la mitjana de totes les notes i l'alumne amb la
        pitjor nota obtinguda.*/

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaDouble = new Scanner(System.in);
        String userName = "";
        String userNoteMin = "";
        double userNota = 0;
        int allNotes = 0;
        double media = 0;
        double sumaNotas = 0;
        double notaMin = 10;


        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Escribe tu nombre");
            userName = entradaString.nextLine();

            System.out.println(i + ". Escribe tu nota");
            userNota = entradaDouble.nextDouble();

            allNotes = i;
            System.out.println(allNotes);

            sumaNotas = sumaNotas + userNota;

            if (notaMin >= userNota) {

                notaMin = userNota;
                userNoteMin = userName;
            }
        }

        media = (sumaNotas / allNotes);
        System.out.println("La media de todas las notas es un " + media);
        System.out.println("El alumno con nota mas baja es " + userNoteMin);
    }
}