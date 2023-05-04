public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoFinal;
    private boolean asientosCuero, climatizador;


    /**
     * Esto es el método contructor (La base del coche, la plataforma).
     */
    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

    /**
     * Método Getter. Se encarga de informarnos de los datos generales de la plataforma.
     *
     * @return largo.
     */
    public String mostrarDatosGenerales() {
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas" + ".\n" +
                "Mide " + largo / 1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + pesoPlataforma + " Kg.";
    }

    /**
     * Método Setter. Se encarga de modificar el valor de una propiedad.
     */
    public void estableceColor(String colorCoche) {
        color = colorCoche;
    }

    /**
     * Método Getter. Se encarga de mostrarnos el valor de color en este caso.
     *
     * @return color.
     */
    public String mostrarColor() {
        return "El color del coche es " + color;
    }

    /**
     * Método setter. Para darle valor al (campo) asientosCuero.
     *
     * @param asientosCuero
     */
    public void configuraAsientos(String asientosCuero) {
        if (asientosCuero.equalsIgnoreCase("si")) {
            this.asientosCuero = true;
        } else {
            this.asientosCuero = false;
        }
    }

    /**
     * Método getter. Nos muestra el valor de asientosCuero.
     *
     * @return String.
     */
    public String mostrarAsientos() {
        if (asientosCuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }

    /**
     * Método setter.
     *
     * @param climatizador
     */
    public void configuraClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    /**
     * Método getter.
     *
     * @return String.
     */
    public String muestraClimatizador() {
        if (climatizador == true) {
            return "El coche incorpora climatizador";
        } else {
            return "El coche lleva aire acondicionado (no climatizado)";
        }
    }

    /**
     * Este método hace de getter y de setter. Porque estamos estableciendo el valor
     * de una variable (pesoFinal) y por otro lado estamos diciendo que nos devuelva un dato.
     *
     * @return String + pesoFinal.
     */
    public String muestraPesoCoche() {
        int pesoCarroceria = 500;
        pesoFinal = pesoPlataforma + pesoCarroceria;
        if (asientosCuero == true) {
            //Estos 50 kg son por los asientos de cuero que pesan mas
            pesoFinal += 50;
        }
        if (climatizador == true) {
            //Estos 20 kg es por el climatizador que pesa mas
            pesoFinal += 20;
        }
        return "El peso del coche es " + pesoFinal;
    }

    /**
     * Método getter. Nos devuelve el precio final del coche.
     * @return
     */
    public int precioCoche() {
        int precioFinal = 10000;
        if (asientosCuero == true) {
            precioFinal += 2000;
        }
        if (climatizador == true) {
            precioFinal += 1500;
        }
        return precioFinal;
    }
}