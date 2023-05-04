package models;

public class Portador {
    private String nom;
    private String pais;

    public Portador(String nom, String pais) {
        this.nom = nom;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nom + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    public String getNombre() {
        return nom;
    }
}
