package BasicsExercises;

import javax.swing.*;

public class PedirEIntroducirPasswordVentanaEmergente {
    public static void main(String[] args) {


        /*Declaro una clase de tipo string la cual voy a llamar "clave" donde vamos a almacenar la contraseña
         * que nos va a dar acceso a esta "app". La contraseña en este caso va a ser mi nombre. */
        String clave = "Jose Antonio";

        /*Declaro una variable la cual voy a llamar "pass" y le voy a decir que es igual a una cadena de texto
         * vacia. */
        String pass = "";

        /*while lo podemos traducir como un "mientras". Entonces en este caso seria: Mientras el texto "clave"
         * sea diferente al texto "pass" (QUE NO LO ES. PORQUE LA CLAVE "JOSE ANTONIO", NO ES IGUAL A LA PASS ""),
         * pediremos por una ventana emergente que el usuario introduzca la contraseña. E a ser, como minimo
         * entraremos al while para que nos aparezca la ventana emergente. */
        while (clave.equals(pass) == false) {

            /*Lo que el usuario introduzca por la ventana emergente se almacenara en "pass".
             * En el caso de que introduzca la contraseña correcta seria clave y pass = true porque son iguales,
             * entonces la condicion del while deja de ser verdad con lo cual el programa continuara la ejecucion
             * a partir de la llave en la que acaba el while. */
            pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");

            /*Construimos un condicional if
             * Traduccion: Si la cadena de texto clave es diferente a la cadena de texto pass pediremos
             * al usuario que la contraseña es incorrecta. Y eso no dejara de repetirse hasta que introduzcamos la
             * contraseña correcta. */
            if (clave.equals(pass) == false) {
                System.out.println("Contraseña incorrecta");
            }
        }
        /*En el caso de que la contraseña sea correcta, el programa saldra del while y entonces imprimiremos que la
         * contraseña es correcta */
        System.out.print("Contraseña correcta. Acceso permitido");
    }
}