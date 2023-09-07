package models;

import java.time.LocalDate;

/**
 * Classe Humans heredada de la clase anstracta Characters.
 */
public class Humans extends Characters{
    private char gender;
    public Humans(String name, LocalDate birthdate, int numberOfArms) {
        super(name, birthdate, numberOfArms);
    }


}
