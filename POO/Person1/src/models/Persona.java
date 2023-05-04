package models;

import java.time.LocalDate;

public class Persona {

    private String nom;
    private String cognom1;
    private String cognom2;
    private LocalDate dataNaixement;
    private String DNI;
    private String genere;
    private float alçada;
    private boolean vacunatCovid;
    private boolean majorEdat;
    private boolean carnetConduir;
    private int codiPostal;


    public Persona(String nom, String cognom1, String cognom2) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public float getAlçada() {
        return alçada;
    }

    public void setAlçada(float alçada) {
        this.alçada = alçada;
    }

    public boolean isVacunatCovid() {
        return vacunatCovid;
    }

    public void setVacunatCovid(boolean vacunatCovid) {
        this.vacunatCovid = vacunatCovid;
    }

    public boolean isMajorEdat() {
        return majorEdat;
    }

    public void setMajorEdat(boolean majorEdat) {
        this.majorEdat = majorEdat;
    }

    public boolean isCarnetConduir() {
        return carnetConduir;
    }

    public void setCarnetConduir(boolean carnetConduir) {
        this.carnetConduir = carnetConduir;
    }

    public int getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(int codiPostal) {
        this.codiPostal = codiPostal;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom1='" + cognom1 + '\'' +
                ", cognom2='" + cognom2 + '\'' +
                ", dataNaixement=" + dataNaixement +
                ", DNI='" + DNI + '\'' +
                ", genere='" + genere + '\'' +
                ", alçada=" + alçada +
                ", vacunatCovid=" + vacunatCovid +
                ", majorEdat=" + majorEdat +
                ", carnetConduir=" + carnetConduir +
                ", codiPostal=" + codiPostal +
                '}';
    }

    public void vacunar() {
        vacunatCovid = true;
        System.out.println("AstraZeneca, Physer, Moderna...");
    }

    public void dormir() {
        System.out.println("zzzzzzzzzz...");
    }

    public void parlar() {
        System.out.println("bla bla bla...");
    }

    public void dirNom() {
        System.out.println("El nom de la persona es " + this.nom + " " + this.cognom1 + " " + this.cognom2);
    }


    public void setDataNaixement(int year, int month, int day) {
    }

    public void mostrarEdat() {
        LocalDate dataActual = LocalDate.now();
        int anys = dataActual.getYear() - dataNaixement.getYear();
        System.out.println("La persona té " + anys + " anys");
    }


}
