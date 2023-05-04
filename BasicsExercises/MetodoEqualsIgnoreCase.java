package BasicsExercises;

public class MetodoEqualsIgnoreCase {
    public static void main(String[] args) {

        //Declaro e inicio variable
        String alumno1 = "David";

        //Declaro e inicio variable
        String alumno2 = "david";

        /*Utilizo el metodo equals para comparar letras.
         * Este metodo nos devolvera por consola si es true o false
         * Este metodo no ignora las mayusculas
         */
        System.out.println(alumno1.equals(alumno2));

        //Declaro e inicio variable
        String alumno3 = "Juan";

        //Declaro e inicio variable
        String alumno4 = "juan";

        /*Utilizo el metodo equalsIgnoreCase para comparar letras.
         * Este metodo nos devolvera por consola si es true o false
         * Este metodo ignora las mayusculas
         */
        System.out.println(alumno3.equalsIgnoreCase(alumno4));
    }
}