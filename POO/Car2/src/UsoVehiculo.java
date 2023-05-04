public class UsoVehiculo {
    public static void main(String[] args) {

/*
        //Instanciar una clase.
        //Renault es una instancia de la clase Coche.
        //El operador new llama al constructor de la clase a la que pertenece el objeto.
        Coche Renault = new Coche();
        System.out.println(Renault.mostrarLargo());
*/

        /*
        //Nombre de la clase, nombre del objeto, =, operador new y metodo constructor.

        Coche miCoche = new Coche();
        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce un color"));
        System.out.println(miCoche.mostrarDatosGenerales());
        System.out.println(miCoche.mostrarColor());
        miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(miCoche.mostrarAsientos());
        miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(miCoche.muestraClimatizador());
        System.out.println(miCoche.muestraPesoCoche());
        System.out.println("El precio final deo coche es: " + miCoche.precioCoche());*/

// El estado inicial de estos 2 objetos sera el del constructor de la clase coche,
// y el objeto de la clase furgoneta ademas de iniciarse con los valores del contructor de coche
// tiene dos parametros mas creados en su clase, los cuales hay que indicar aqui.

        //Creamos instancia u objeto perteneciente a la clase coche
        //NombreClase, nombreObjeto, new, NombreClase

        Coche micoche1 = new Coche();

        //Damos color con el metodo de la clase coche (estableceColor)
        micoche1.estableceColor("Rojo");


        //Todo: Creamos nuestro objeto o instancia de la clase furgoneta
        //NombreClase, nombreObjeto, new, NombreClase, y tenemos que añadir
        //obligatoriamente los parametros que estan en la clase furgoneta.
        Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

        //Establecemos color, configuramos asientos y climatizador a la furgoneta.
        //Acabamos de utilizar 3 metodos heredados de coche sin haberlos picado en la clase Furgoneta.
        miFurgoneta1.estableceColor("Azul");
        miFurgoneta1.configuraAsientos("Si");
        miFurgoneta1.configuraClimatizador("Si");

        System.out.println(micoche1.mostrarDatosGenerales() + " " + micoche1.mostrarColor());
        System.out.println(miFurgoneta1.mostrarDatosGenerales() + " " + miFurgoneta1.dimeDatosFurgoneta());
    }
}
