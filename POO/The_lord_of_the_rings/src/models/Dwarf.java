package models;

import java.time.LocalDate;

public class Dwarf extends Characters {
    private char gender;
    public Dwarf(String name, LocalDate birthdate, int numberOfArms) {
        super(name, birthdate, numberOfArms);
    }
}
