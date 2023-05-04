package models;

public class LiebanaDelgado_Character {

    //name&chapter&episode&year&note

    private String name;
    private int chapter;
    private int episode;
    private int year;
    private String note;

    /**
     * Este es el constructor de la clase LiebanaDelgado_Character
     *
     * @param name
     * @param chapter
     * @param episode
     * @param year
     * @param note
     */

    public LiebanaDelgado_Character(String name, int chapter, int episode, int year, String note) {
        this.name = name;
        this.chapter = chapter;
        this.episode = episode;
        this.year = year;
        this.note = note;

    }

    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString() {
        return "LiebanaDelgado_Character{" +
                "name='" + name + '\'' +
                ", chapter=" + chapter +
                ", episode=" + episode +
                ", year=" + year +
                ", note='" + note + '\'' +
                '}';
    }
}
