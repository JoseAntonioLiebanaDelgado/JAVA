package BasicsExercises;

public class MetodoLengthYCharAt {
    public static void main(String[] args) {

        //Declaro e inicio variable de tipo string
        String nombre = "Jose Antonio";

        //Imprimo y concateno con una variable de tipo string
        System.out.println("Mi nombre es " + nombre);

        /*Imprimo y concateno
         * Utilizo el metodo (length) para saber cuantos caracteres tiene la variable (nombre)
         * Este metodo comienza a contar desde "0".
         */
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");

        /*Imprimo y concateno
         * Utilizo el metodo (charAt(x)) para imprimir el caracter indicado dentro del
         * parentesis que esta dentro del metodo (x). El primer caracter por el que comenzaremos
         * a contar sera el "0". Ej: Juan = (J=0), (u=1), (a=2), (n=3). Y los espacios cuentan
         * como 1 caracter.
         */
        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

        //Declaro variable
        int ultima_letra;

        /*Inicio variable y le digo que la variable (ultima_letra) es igual a (nombre.length)
         * Este nos devolvia los caracteres que tenia la variable nombre.
         * Entonces en la variable (ultima_letra) estamos almacenando el numerp de caracteres
         * que tenga la variable (nombre).
         */
        ultima_letra = nombre.length();

        /*Imprimimos y concatenamos
         * El metodo (charAt) nos devuelve un caracter en una posicion y la posicion que le estamos
         * indicando a (charAt) es la ultima-1 ya que el metodo (length) comienza a contar desde 0.
         */
        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra - 1));
    }
}