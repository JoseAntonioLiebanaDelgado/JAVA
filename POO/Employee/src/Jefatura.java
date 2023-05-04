public class Jefatura extends Empleado {
    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }

    public void estableceIncentivo(double b) {
        incentivo = b;
    }

    /**
     * Éste método está sobreescribiendo, machacando o reemplazando para la clase jefatura el metodo que hereda de la clase empleado.
     * Es decir, por un lado estamos heredando un metodo "dameSueldo" de la clase Empleado, y por otro lado hemos declarado un metodo que se llama igual.
     * Cuando hacemos esto ocurre que el metodo que has declarado en la clase sobreescribe, reemplaza, invalida (solo para esta clase) el metodo de la clase padre.
     *
     * @return
     */
    public double dameSueldo() {
        //Almacenamos en "sueldoJefe", el valor que me devuelva el metodo "dameSueldo" de la clase padre (utilizando "super")
        //Osea almacenamos el sueldo del empleado para luego sumar el incentivo.
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }

    private double incentivo;
}