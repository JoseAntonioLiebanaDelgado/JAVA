package models;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nom;
    private String cognom1;
    private String cognom2;
    private LocalDate dataNaixement;
    private String dni;
    private String genere;
    private float alcada;
    private int pes;
    private boolean vacunatCovid;
    private boolean majorEdat;
    private boolean carnetConduir;
    private int codiPostal;
    private static int personesCreades;

    public Persona(String nom, String cognom1, String cognom2, LocalDate dataNaixement) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.dataNaixement = dataNaixement;
        incrementarPersonesCreades();
    }

    public Persona(String nom, String cognom1, String cognom2, LocalDate dataNaixement, String dni, String genere, float alcada, boolean vacunatCovid, boolean majorEdat, boolean carnetConduir, int codiPostal) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.dataNaixement = dataNaixement;
        this.dni = dni;
        this.genere = genere;
        this.alcada = alcada;
        this.vacunatCovid = vacunatCovid;
        this.majorEdat = majorEdat;
        this.carnetConduir = carnetConduir;
        this.codiPostal = codiPostal;
        incrementarPersonesCreades();
    }

    public void incrementarPersonesCreades() {
        Persona.personesCreades++;
    }

    public static void decrementarPersonesCreades() {
        Persona.personesCreades--;
    }

    /**
     * Mètode per a mostrar el recompte de persones creades
     *
     * @return
     */
    public static int getPersonesCreades() {
        return Persona.personesCreades;
    }

    /**
     * Mètode per a mostrar l'edat d'una Persona
     */
    public void calcularEdat() {
        System.out.println(Period.between(this.dataNaixement, LocalDate.now()));
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom1='" + cognom1 + '\'' +
                ", cognom2='" + cognom2 + '\'' +
                ", dataNaixement=" + dataNaixement +
                ", dni='" + dni + '\'' +
                ", genere='" + genere + '\'' +
                ", alcada=" + alcada +
                ", vacunatCovid=" + vacunatCovid +
                ", majorEdat=" + majorEdat +
                ", carnetConduir=" + carnetConduir +
                ", codiPostal=" + codiPostal +
                '}';
    }
}
