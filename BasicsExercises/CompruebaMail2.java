package BasicsExercises;

import javax.swing.JOptionPane;

public class CompruebaMail2 {
    public static void main(String[] args) {

        /*Hacemos un refactor del ejercicio anterior. En este programa, el mail introducido por la ventana emergente,
        podrá ser valido si solamente tiene 1 '@' y contiene un '.' o mas.*/

        //Declaramos variable de tipo entero en 0.
        int arroba = 0;
        //Declaramos variable de tipo boolean en false.
        boolean punto = false;

        String mail = JOptionPane.showInputDialog("Introduce tu email, por favor");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                //Le decimos que si encuentra una '@' incremente el valor de (arroba) de 1 en 1 (++)
                //Esto ocasionara que si la dirección de email tiene una '@', la variable (arroba) pasará a valer 1.
                arroba++;
            }
            /*Construimos otro if para valuar si se encuentra con un punto
             *	Si no hay ningun punto, jamas entrará en éste if porque no se cumple la condición con lo cual (punto)
             *  valdrá (false).
             *  Si encuentra un '.' o mas, la variable (punto) valdrá (true) y esto nos permitirá evaluar en el if
             *  que tenemos mas a bajo*/
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }
        //Evaluamos si la dirección de email tiene un arroba y uno o mas puntos.
        if (arroba == 1 && punto == true) {
            System.out.println("El email es correcto");
        } else {
            System.out.println("El email no es correcto");
        }
    }
}