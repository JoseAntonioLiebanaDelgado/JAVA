//Lo que conseguimos con esta primera linea es que esta clase furgoneta sea heredera de la clase coche.
//La clase coche ahora seria una super clase y la clase furgoneta seria una subclase.
public class Furgoneta extends Coche {

    private int capacidadDeCarga;
    private int plazasExtra;

    public Furgoneta(int plazasExtra, int capacidadDeCarga) {
        //"super" lo que hace es llamar al constructor de la clase padre.
        super();
        //"this.capacidadDeCarga" se refiere a la variable de clase.
        //"capacidadDeCarga" se refiere al argumento o parametro del metodo constructor.
        this.capacidadDeCarga = capacidadDeCarga;
        this.plazasExtra = plazasExtra;
    }

    public String dimeDatosFurgoneta() {
        return "La capacidad de carga es: " + capacidadDeCarga + ". Y las plazas son: " + plazasExtra;
    }
}
