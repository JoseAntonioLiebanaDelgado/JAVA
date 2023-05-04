package BasicsExercises;

import javax.swing.JOptionPane;

public class CompruebaMail {
    public static void main(String[] args) {


        /* Evaluamos si una direccion de correo electronico es correcta o no lo es.
         * En este caso solamente vamos a evaluar si esta direccion de correo electronico
         * lleva "@" o no la lleva.
         *
         *  Vamos a necesitar un metodo que sea capaz de evaluar dentro de un string de que
         *  tipo es un caracter. Concretamente si un caracter es un "@" o no lo es. Para esto
         *  necesitaremos utilizar el metodo "charAt" de la clase String. Este metodo no es
         *  estatico, asi que crearemos un objeto de tipo string. Y este metodo nos dice que
         *  nos devuelve el caracter que estamos especificando en el indice, es decir que nos
         *  va a indicar la posicion donde se encuentre el caracter que le digamos.
         *
         *  Tambien vamos a necesitar el metodo length de la clase String. Este metodo nos idica
         *  la longitud de una cadena de caracteres.
         */


        /*Declaro una variable de tipo boolean la cual voy a llamar "arroba" y va a estar iniciada
         * en false
         */
        boolean arroba = false;

        /*Declaro una variable la cual voy a llamar "mail" y vamos a almacenar aqui lo que el
         * usuario introduzca por una ventana de JOptionPane.
         */
        String mail = JOptionPane.showInputDialog("Introduce tu email, por favor");

        /*Con un bucle for vamos a recorrer caracter a caracter esa direccion de email, tenga
         * la longitud que tenga en busca de la "@".
         *
         * Bloque 1: Le decimos que int "i" es igual a 0. Cuando la "i" vale 0 lo que esta haciendo
         * el for es evaluar el primer caracter del mail.
         *
         * Bloque 2: Como no sabemos los caracteres que puede tener el email que introduzca el
         * usuario por la ventana emergente utilizaremos el metodo length para saber la longitud
         * de este email.
         *
         * Bloque 3: Le diremos que incremente el valor de "i" en 1 para que vaya mirando letra por
         * letra.
         */

        for (int i = 0; i < mail.length(); i++) {


            /* Creamos un if para decir que si la posicion 0 es igual a "@" entonces "@" es igual
             * a true. Y este proceso se seguira repitiendo hasta que llegue a la longitud final
             * del mail.
             * Si nuestro email tiene un "@" al salir del bucle for "arroba "sera true.
             * Si nuestro email no tiene un "@" al salir del bucle for "arroba" sera false.
             * Los datos de tipo char van siempre en comillas simples.
             */

            if (mail.charAt(i) == '@') {

                arroba = true;
            }
        }

        //Si el mail es correcto imprime "El email es correcto".
        if (arroba == true) {
            System.out.println("El email es correcto");
        } else {
            //Y si no imprime que "El email no es correcto".
            System.out.println("El email no es correcto");
        }
    }
}