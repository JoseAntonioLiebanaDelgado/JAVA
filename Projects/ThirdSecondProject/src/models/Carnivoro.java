package models;

import interfaces.Interactuar;

import java.util.ArrayList;

public class Carnivoro extends Animales implements Interactuar {


    public Carnivoro(Portador portador, String apodoAnimal, ArrayList<Portador> colaboradores, String nomDisc) {
        super(portador, apodoAnimal, colaboradores, nomDisc);

    }

    public Carnivoro(Portador portador, String apodoAnimal, ArrayList<Portador> colaboradores, String especie, int anyPublicacio, int rpm, int peso) {
        super(portador, apodoAnimal, colaboradores, especie);
    }

    public float getPeso() {
        return getPeso();
    }

    @Override
    public void alimentar() {
        System.out.println("Al ser carnivoro alimentas a " + this.getApodo() + "tirandole comida a distancia");
    }

    @Override
    public void jugar() {
        System.out.println("Al ser carnivoro juegas con " + this.getApodo() + " con juguetes a distancia");
    }

    @Override
    public void dormir() {
        System.out.println("Al ser carnivoro duermes a " + this.getApodo() + " en su jaula");
    }
}

