package For;

public class EjercicioFor1De100a1 {
    public static void main(String[] args) {

	/*Primers cent naturals amb poques línies de codi
	Desenvolupa un programa que escrigui els primers 100 nombres naturals en ordre decreixent
	(un número per línia)*/

        int numero = 100;

        for (int i = numero; i > 0; i--) {
            System.out.println(numero--);
        }
    }
}