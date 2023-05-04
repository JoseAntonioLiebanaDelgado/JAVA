import java.util.Arrays;

public class UsoEmpleado {
    public static void main(String[] args) {

        //A continuacion creamos 3 objetos de tipo Empleado.
        /*Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        Empleado empleado2 = new Empleado("Anna Lopez", 95000, 1995, 06, 02);
        Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 03, 15);


        //Utilizamos el metodo subeSueldo de la clase Empleado.
        //Nombre objeto + metodo.
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre : " + empleado1.dameNombre() + " Sueldo : " + empleado1.dameSueldo()
                + " Fecha de alta : " + empleado1.dameFechaContrato());

        System.out.println("Nombre : " + empleado2.dameNombre() + " Sueldo : " + empleado2.dameSueldo()
                + " Fecha de alta : " + empleado2.dameFechaContrato());

        System.out.println("Nombre : " + empleado3.dameNombre() + " Sueldo : " + empleado3.dameSueldo()
                + " Fecha de alta : " + empleado3.dameFechaContrato());*/

        //Vamos a hacer lo mismo que acabamos de hacer pero de otra forma
        //-----------------------------------------------------------------------------
        //Guardamos a nuestros empleados en un Array de tipo Empleado de 3 posiciones.

        /*Empleado[] misEmpleados = new Empleado[3];
        misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Anna Lopez", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);

        //Para subirles a todos el sueldo podemos hacerlo con un for para dar valor,
        //y otro for para imprimir (Ambos seran fors tradicionales)

        for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].subeSueldo(5);
        }

        for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + "."
                    + " Sueldo: " + misEmpleados[i].dameSueldo() + "."
                    + " Fecha de alta: " + misEmpleados[i].dameFechaContrato() + ".");
        }*/

        //-----

        //A continuacion hacemos lo mismo pero en vez de dar valor e imprimir con
        //dos for tradicionales, lo haremos con dos for each (mejorado).

        /*for (Empleado e: misEmpleados) {
            e.subeSueldo(5);
        }

        for (Empleado e: misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre() + "."
                    + " Sueldo: " + e.dameSueldo() + "."
                    + " Fecha de alta: " + e.dameFechaContrato() + ".");
        }*/

    //------------------------------------------------------------------------------

        //Creamos instancia. Es lo mismo que crear un objeto. En este caso "jefeRRHH" es el objeto.
        Jefatura jefeRRHH = new Jefatura("Juan", 55000, 2006, 9, 25);

        //Establecemos un incentivo para el jefe
        jefeRRHH.estableceIncentivo(2570);


        //Hacemos una array para los objetos
        Empleado[] misEmpleados = new Empleado[6];

        //El programa detecta que estamos utilizando el primer constructor que hemos echo (el de los 5 parametros).
        misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        //El programa detecta que estamos utilizando el primer constructor que hemos echo (el de los 5 parametros).
        misEmpleados[1] = new Empleado("Anna Lopez", 95000, 1995, 06, 2);
        //El programa detecta que estamos utilizando el primer constructor que hemos echo (el de los 5 parametros).
        misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);

        //Al llegar a este objeto a ver que solo le estamos pasando 1 parametro, detecta que solo estamos utilizando el 2 constructor,
        //con lo cual el codigo se dirige al 2 constructor. Recibe el "nombre" por parametro y almacenarlo en "nom", a continuacion llega la linea
        //del "this", y una vez que llega al "this" lo que hace es llamar al otro constructor. Y por ultimo una vez que
        //llama al otro constructor le da los parametros necesarios y ya hace su trabajo.
        //Esto sirve para tener 2 metodos constructores diferentes, ya que en algunos objetos "empleadoX" no querremos o podremos
        //hacer servir un constructor con tantos parametros.
        //En este ejemplo, lo que hacemos es que "Antonio Fernandez", tenga algunos parametros por defecto.
        misEmpleados[3] = new Empleado("Antonio Fernandez");

        //POLIMORFISMO EN ACCION. Principio de sustitucion.
        //Almacenamos dentro de la posicion de la array un objeto de tipo empleado.
        //-Podemos utilizar un objeto de la subclase cuando el programa espere un objeto de la super clase-
        misEmpleados[4] = jefeRRHH;

        //Instanciamos un nuevo objeto directamente en la array.
        // "jefeRRHH" lo hemos instanciado antes del array, pero tambien podemos instanciar un objeto aqui directamente.
        misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);

        //Así hariamos un casteo para convertir un objeto de un tipo a otro
        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
        //Ahora si me apareceria la opcion de "establaceIncentivo"
        jefaFinanzas.estableceIncentivo(55000);

        Empleado directorComercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
        Comparable ejemplo = new Empleado("Elishabeth", 95000, 2011, 06, 07);

        if (directorComercial instanceof Empleado) {
            System.out.println("Es de tipo Jefatura");
        }
        if (ejemplo instanceof Comparable) {
            System.out.println("Implementa la interfaz comparable");
        }


        for (Empleado e : misEmpleados) {
            e.subeSueldo(5);
        }

        //Utilizamos el metodo static "Arrays.sort" para ordenar los objetos (empleados)
        Arrays.sort(misEmpleados);

        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre() + "."
                    + " Sueldo: " + e.dameSueldo() + "."
                    + " Fecha de alta: " + e.dameFechaContrato() + ".");
        }

    }
}



