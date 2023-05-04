package models;

import interfaces.Interactuar;

import java.util.ArrayList;

public class Herbivoro extends Animales implements Interactuar {


    public Herbivoro(Portador portador, String apodoAnimal, ArrayList<Portador> colaboradores, String especie) {
        super(portador, apodoAnimal, colaboradores, especie);
    }

    public Herbivoro(Portador portador, String apodoAnimal, ArrayList<Portador> colaboradores, String especie, int anyPublicacio, int duracio, int mida) {
        super(portador, apodoAnimal, colaboradores, especie);
    }

    @Override
    public void alimentar() {
        System.out.println("Al ser herbivoro alimentas a " + this.getApodo() + " directamente de tu mano");
    }

    @Override
    public void jugar() {
        System.out.println("Al ser herbivoro juegas con " + this.getApodo() + " acariciandolo y con juguetes");
    }

    @Override
    public void dormir() {
        System.out.println("Al ser herbivoro duermes con " + this.getApodo() + " dormis juntos en el suelo");
    }
}



