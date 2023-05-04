package models;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task {
    private LocalTime hourStart;
    private LocalTime hourEnd;
    private String description;
    private boolean isDone;

    /**
     *
     * @param hourStart of type LocalTime
     * @param hourEnd of type LocalTime
     * @param description of type String
     */
    public Task(LocalTime hourStart, LocalTime hourEnd, String description) {
        this.hourStart = hourStart;
        this.hourEnd = hourEnd;
        this.description = description;
        this.isDone = false;
    }

    /**
     *
     * @param hourStart of type LocalTime
     */
    public void setHourStart(LocalTime hourStart) {
        this.hourStart = hourStart;
    }

    /**
     *
     * @param hourEnd of type LocalTime
     */
    public void setHourEnd(LocalTime hourEnd) {
        this.hourEnd = hourEnd;
    }

    /**
     *
     * @param description of type String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @param isDone of type boolean
     */
    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    /**
     *
     * @return hourStart of type LocalTime
     */
    public LocalTime getHourStart() {
        return hourStart;
    }

    /**
     *
     * @return hourEnd of type LocalTime
     */
    public LocalTime getHourEnd() {
        return hourEnd;
    }

    /**
     *
     * @return description of type String
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @return isDone of type boolean
     */
    public boolean getIsDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return "task{" +
                "hourStart=" + this.hourStart.truncatedTo(ChronoUnit.MINUTES) +
                ", hourEnd=" + this.hourEnd.truncatedTo(ChronoUnit.MINUTES) +
                ", description='" + this.description + '\'' +
                ", isDone=" + this.isDone +
                '}';
    }
}
