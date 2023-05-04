package controllers;

import models.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Pepe", "Lopez", "Ruiz");

        persona1.setDNI("00000000W");
        persona1.setGenere("Hombre");
        persona1.setAlçada(1.70f);
        persona1.setDataNaixement(1995, 01, 01);

        System.out.println(persona1.getDNI());
        System.out.println(persona1.getGenere());
        System.out.println(persona1.getAlçada());
        System.out.println(persona1.getDataNaixement());

        persona1.vacunar();
        persona1.dormir();
        persona1.parlar();
        persona1.dirNom();

        // Mètode mostrarEdat() que no retorni res però que calculi l’edat de la Persona i la mostri per pantalla.
        // Per a fer-ho, consulta els detalls de la classe LocalDate: https://www.w3schools.com/java/java_date.asp.
        //persona1.mostrarEdat();
    }
}