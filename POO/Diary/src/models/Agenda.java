package models;

import utils.Utilities;

import java.time.LocalTime;
import java.time.Year;
import java.util.Arrays;

/**
 * Classe Agenda
 */
public class Agenda {
    // Creamos un atributo de tipo Year llamado year, el cual será el año de la agenda
    private Year year;
    
    private Page[] pages;

    public Agenda(Year year){
        this.year = year;
        this.pages = new Page[year.length()];
    }

    private Task createTask(){
        Task task;
        LocalTime start = LocalTime.now();
        int taskMinuts = Utilities.inputIntMinMax("Escriu la descripció de la tasca: ","ERROR: Tipatge incorrecte",1,3600,"ERROR: Valor fora de rang");
        task = new Task(start, start.plusMinutes(taskMinuts), "Tasca de prova");

        return task;
    }

    public boolean addTaskPage(int day, Task task){
        if (day < 0 || day >= this.pages.length){
            return false;
        }else {
            if (this.pages[day] == null){
                this.pages[day] = new Page(Year.now().atDay(day));
            }
            this.pages[day].addTask(task);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "year=" + year +
                ", pages=" + Arrays.toString(pages) +
                '}';
    }
}
