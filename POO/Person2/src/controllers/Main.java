package controllers;

import models.Persona;
import utils.Utilities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcio = 0;
        ArrayList<Persona> persones = new ArrayList<>();

        do {
            opcio = Utilities.llegirInt("Escull una opció\n1. Mostrar Persones\n2. Crear Persona\n3. Eliminar Persona\n4. Mostrar nombre de persones creades\n5. Mostrar edat d'una Persona \n6. Sortir", 1, 6);
            switch (opcio) {
                case 1:
                    llistarPersones(persones);
                    break;
                case 2:
                    persones.add(crearPersona());
                    break;
                case 3:
                    persones.remove(eliminarPersona(persones));
                    break;
                case 4:
                    System.out.println(Persona.getPersonesCreades());
                    break;
                case 5:
                    mostrarEdat(persones);
                    break;
                case 6:
                    System.out.println("adeu");
                    break;
            }
        } while (opcio != 6);
    }

    /**
     * Mètode per a escollir una Persona i mostrar-li la seva edat
     *
     * @param persones
     */
    private static void mostrarEdat(ArrayList<Persona> persones) {
        llistarPersones(persones);
        int indexMostrar = Utilities.llegirInt("Escull l'id de la persona a qui calcular l'edat: ", 0, persones.size() - 1);
        persones.get(indexMostrar).calcularEdat();
    }

    /**
     * Mètode per a escollir l'index de la Persona a eliminar dins de l'ArrayList
     *
     * @param persones AL <Persona>
     * @return un int
     */
    private static int eliminarPersona(ArrayList<Persona> persones) {
        llistarPersones(persones);
        int indexEliminar = Utilities.llegirInt("Escull l'id de la persona a eliminar: ", 0, persones.size() - 1);
        Persona.decrementarPersonesCreades();
        return indexEliminar;
    }

    /**
     * Mètode per a crear Persones
     *
     * @return retorna una Persona
     */
    private static Persona crearPersona() {
        String nom = Utilities.llegirFrase("Escriu el teu nom: ");
        String cognom1 = Utilities.llegirFrase("Escriu el teu cognom1: ");
        String cognom2 = Utilities.llegirFrase("Escriu el teu cognom2: ");
        int any = Utilities.llegirInt("Escriu el teu any de naixement: ", 1940, LocalDate.now().getYear());
        int mes = Utilities.llegirInt("Escriu el teu mes de naixement: ", 1, 12);
        int dia = Utilities.llegirInt("Escriu el dia del mes", 1, 30);

        Persona personaAux = new Persona(nom, cognom1, cognom2, LocalDate.of(any, mes, dia));
        return personaAux;
    }

    /**
     * Imprimeix totes les persones dins de l'arraylist de persones a través del toString
     *
     * @param persones
     */
    private static void llistarPersones(ArrayList<Persona> persones) {
        if (persones.size() == 0) {
            System.out.println("No hi ha persones creades encara...");
        } else {
            for (int i = 0; i < persones.size(); i++) {
                System.out.println("[" + i + "]: " + persones.get(i));
            }
        }
    }

}
