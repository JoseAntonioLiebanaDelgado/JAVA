package models;

import java.util.ArrayList;

public abstract class Animales {
    private Portador portador;
    private String apodoAnimal;
    private ArrayList<Portador> colaboradores;
    private String especieAnimal;
    private float peso;

    public Animales(Portador portador, String apodoAnimal, ArrayList<Portador> portadors, String especieAnimal) {
        this.portador = portador;
        this.apodoAnimal = apodoAnimal;
        this.colaboradores = portadors;
        this.especieAnimal = especieAnimal;
    }

    public Portador getPortador() {
        return portador;
    }

    public void setPortador(Portador portador) {
        this.portador = portador;
    }

    public String getApodo() {
        return apodoAnimal;
    }

    public void setApodoAnimal(String apodoAnimal) {
        this.apodoAnimal = apodoAnimal;
    }

    public ArrayList<Portador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Portador> colaboradors) {
        this.colaboradores = colaboradors;
    }

    public String getEspecie() {
        return especieAnimal;
    }

    public void setEspecie(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }
}
