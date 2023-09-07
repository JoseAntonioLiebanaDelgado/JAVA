package models;

import java.time.LocalDate;

public abstract class Characters {

    protected String name;
    private LocalDate birthdate;
    protected int numberOfArms;
    private static int countCharacters = 1;

    public Characters(String name, LocalDate birthdate, int numberOfArms) {
        this.name = name;
        this.birthdate = birthdate;
        this.numberOfArms = numberOfArms;
    }
}
