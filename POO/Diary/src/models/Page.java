package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Page {
    private LocalDate date;
    private boolean isHoliday;
    private ArrayList<Task> tasks;

    /**
     *
     * @param date of type LocalDate
     */
    public Page(LocalDate date) {
        this.date = date;
        this.isHoliday = false;
        tasks = new ArrayList<>();
    }

    public Page(LocalDate date, boolean isHoliday) {
        this.date = date;
        this.isHoliday = isHoliday;
        tasks = new ArrayList<>();

    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public void getTasks(){
        for (Task t : this.tasks) {
            System.out.println(t);
        }
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
    }

    public void removeAllTask(){
        this.tasks.clear();
    }

    @Override
    public String toString() {
        return "page{" +
                "date=" + date +
                ", isHoliday=" + isHoliday +
                ", tasks=" + tasks +
                '}';
    }
}
