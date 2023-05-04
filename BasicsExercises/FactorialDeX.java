package BasicsExercises;

import javax.swing.*;

public class FactorialDeX {
    public static void main(String[] args) {


        /*Obtendremos el factorial de un numero que introducirá el usuario mediante el bucle for.
         *Un numero factorial se escribe; (4!) La operción para obtener el factorial de un numero es
         *multiplicar ese mismo numero por todos los que le preceden. El factorial de 6, sería
         *--6!= 6*5*4*3*2*1 = 720--*/

        //Declaramos variable de tipo entero en 0.
        int resultado = 1;

        /*Declaramos variable de tipo entero, parseando lo que el usuario introduzca por la ventana emergente, ya que
         * (JOptionPane.showInputDialog) nos devuelve un dato de tipo String*/
        //La variable (numero) valdrá lo que haya introducido el usuario
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero, por favor"));

        /*La variable (i) sera igual a la variable (numero), e a ser, (i) valdrá lo que haya introducido el usuario.
         * Mientras que la variable (i) sea mayor que 0, el bucle ira restando de 1 en 1 la variable (i)
         * ---Pongamos que el usuario ha introducido un 4---
         * resultado = resultado * i
         * resultado * i = 4
         * 4 * 3 = 12
         * 12 * 2 = 24
         * 24 * 1 = 24
         * El factorial de 4, seria 24*/
        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }

        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}