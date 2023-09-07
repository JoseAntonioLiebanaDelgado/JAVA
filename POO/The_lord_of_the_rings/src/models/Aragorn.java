package models;

import java.time.LocalDate;

public class Aragorn extends Humans {

    public Aragorn(String name, LocalDate birthdate, int numberOfArms) {
        super(name, birthdate, numberOfArms);
    }

    public void forFrodo(){
        System.out.println("For frodo!");
    }

    public void forFrodo(String message){
        System.out.println(message);
    }


}
