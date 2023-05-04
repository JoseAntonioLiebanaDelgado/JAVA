import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        super(nom);

        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        //Almacenamos dentro de "altaContrato" la fecha
        altaContrato = calendario.getTime();
    }

    public double dameSueldo() { //Getter
        return sueldo;
    } //Getter

//  public final double dameSueldo()
//  Si añadimos el "final" a este metodo, no podremos sobreescribirlo en las clases hijas.
//  Es decir, no podremos crear un metodo con el mismo nombre.
//  Si añadiesemos el final a este metodo deberiamos cambiarle el nombre al otro metodo "dameSueldo" de la clase Jefatura.


    public Date dameFechaContrato() { //Getter
        return altaContrato;
    } //Getter

    public void subeSueldo(double porcentaje) { //Setter
        double aumento = (sueldo * (porcentaje / 100));
        sueldo += aumento;
    }


    public String dameDescripcion(){
        return "Este emnpleado tiene un un id igual a " + Id +  " con un sueldo igual a " + sueldo;
    }


    private double sueldo;

    private Date altaContrato;

    private static int IdSiguiente;

    private int Id;
}