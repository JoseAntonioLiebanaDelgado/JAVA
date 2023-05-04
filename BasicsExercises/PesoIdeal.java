package BasicsExercises;

import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {

        /*Declaro e iniciamos una variable de tipo string la cual voy a llamar genero y la cual
         * va a ser igual a una cadena de texto vacia. */
        String genero = "";

        /*Construimos un bucle do para que en el caso de esta pregunta (que sexo es el nuestro),
         * introduzcamos algo que no sea la respuesta correcta una ventana emergente aparecera
         * una vez tras otra hasta que el usuario introduzca una respuesta correcta. */
        do {
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");

            /*El do va a repetir esa condicion para que aparezca la ventana emergente hasta que
             * el usuario introduzca una respueta correcta y el while dice que eso lo hara mientras
             * la que respuesta del usuario sea diferente de "H" y ademas de "M".
             * -Utilizamos equals.IgnoreCase para que sea indiferente si el usuario introduce una
             * de las dos letras tanto en mayuscula como en minuscula.
             * -Con el operador logico && nos aseguramos de que tenga cumplir las dos condiciones
             * a la vez para que la condicion del while sea cierta.
             */
        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        /*Despues de haber almacenado dentro de la variable genero, el genero de la persona
         * en cuestion declaramos una variable de tipo entero la cual vamos a llamar "altura".
         * En esta variable se almacenara lo que el usuario introduzca por una ventana emergente,
         * pero JOptionPane.showInputDialog devuelve un string aunque introduzcamos un numero,
         * y como queremos almacenar este resultado en una variable de tipo int debemos de hacer
         * un parseo de string a int con Integer.parseInt. */
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));

        //*Declaro e inicio una variable "pesoideal" con resultado "0".
        int pesoideal = 0;

        /*Creamos un if para decir que si genero es igual a "H", almacene un resultado utilizando
         * la operacion generica que tenemos para saber nuestro peso ideal que es en caso de un
         * hombre es restarle 110 a tu altura en cm. */
        if (genero.equalsIgnoreCase("H")) {
            pesoideal = altura - 110;
        }

        /*Creamos un if para decir que si genero es igual a "M", almacene un resultado utilizando
         * la operacion generica que tenemos para saber nuestro peso ideal que es en caso de una
         * mujer es restarle 120 a tu altura en cm. */
        else if (genero.equalsIgnoreCase("M")) {
            pesoideal = altura - 120;
        }

        //Imprimimos por consola resultado
        System.out.println("Tu peso ideal es de " + pesoideal + " kg.");
    }
}