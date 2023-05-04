import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Empleado necesita implementar el metodo abtracto comparable.compareTo()
 */
public class Empleado implements Comparable {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        //Almacenamos dentro de "altaContrato" la fecha
        altaContrato = calendario.getTime();
    }

    public Empleado(String nom) {
        //Cuando utilizamos el "this" dentro de un constructor, procede a llamar al otro constructor de la clase.
        //LLama al otro constructor y le passa los parametros correspondientes. E a ser, lo que se almacena dentro de "nom"
        //de este constructor pasaria a almacenarse dentro del parametro nom del otro constructor
        this(nom, 3000, 2000, 01, 01);
    }

    public String dameNombre() { //Getter
        return nombre;
    } //Getter

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

    /**
     * Creamos el metodo "compare".
     * Obligatoriamente tenemos que sobreescribir este metodo (compareTo), de la interfaz "Comparable".
     *
     * @param miObjeto the object to be compared.
     * @return
     */
    public int compareTo(Object miObjeto) {
        //Este metodo va a recibir un parametro de tipo objeto "miObjeto".
        //Hacemos un casteo para transformar el parametro "miObjeto" en un objeto de de tipo "Empleado",
        //para poder comparar el sueldo de los empleados

        //Con esto ya tenemos una variable objeto "otroEmpleado" de tipo "Empleado" y esto me va apoder permitir comparar.
        Empleado otroEmpleado = (Empleado) miObjeto;

        if (this.sueldo < otroEmpleado.sueldo) {
            return -1;
        } else if (this.sueldo > otroEmpleado.sueldo) {
            return 1;
        } else {
            return 0;
        }
    }

    private String nombre;

    private double sueldo;

    private Date altaContrato;

    private static int IdSiguiente;

    private int Id;
}