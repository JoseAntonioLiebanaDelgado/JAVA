public class UsoPersona {
    public static void main(String[] args) {

        //En esta array de tipo "Persona" podemos meter dos objetos de tipos diferentes,  y esto es gracias a que
        // tanto empleado, como alumno son personas (Porque las 2 clases heredan de persona).
        Persona[] lasPersonas = new Persona[2];
        //Instanciamos en la primera posicion del array un objeto de tipo "Empleado"
        lasPersonas[0] = new Empleado("Luis Conde", 50000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("Ana Lopez", "Biologicas");

        for (Persona p : lasPersonas) {
            System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
        }
    }
}

//Una clase abstracta es una clase que no se puede instanciar.
// Es la que marca el diseño en la jerarquia de clases.