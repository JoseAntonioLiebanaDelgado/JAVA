package For;

import javax.swing.JOptionPane;

public class EjercicioFor2NombreRepetido {
    public static void main(String[] args) {

        /* Desenvolupa un programa que demani a l’usuari el seu nom i un número enter més gran que
        1, i escrigui el seu nom tants cops com indiqui el número. Ex. si l’entrada és
        Truman
        3
        La sortida serà
        Truman Truman Truman*/

        String nomUsuari = JOptionPane.showInputDialog("Introduce un nombre, por favor");
        int numeroUsuari = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero por favor"));

        for (int i = 0; i < numeroUsuari; i++) {
            System.out.println(nomUsuari);
        }
    }
}