package models;

import java.time.LocalDate;

public class Elf extends Characters {
    private char gender;
    public Elf(String name, LocalDate birthdate, int numberOfArms) {
        super(name, birthdate, numberOfArms);
    }
}
