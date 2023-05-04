package For;

import java.util.Scanner;

public class EjercicioFor3Entre2Numeros {
    public static void main(String[] args) {

        /*Entre dos nombres
        Desenvolupa un programa que demani dos números a l’usuari i escrigui tots els números entre
        el primer i el segon. Tingues en compte els casos que el primer nombre sigui més gran, més
        petit o igual que el segon.*/

        Scanner entrada = new Scanner(System.in);

        int primerNumero = 0;
        int segundoNumero = 0;

        System.out.println("Introduce un numero, por favor");
        primerNumero = entrada.nextInt();
        System.out.println("Introduce otro numero, por favor");
        segundoNumero = entrada.nextInt();

        if (primerNumero < segundoNumero) {
            for (int i = primerNumero + 1; i < segundoNumero; i++) {
                System.out.println(i);
            }
        }
        if (primerNumero > segundoNumero) {
            for (int i = primerNumero - 1; i > segundoNumero; i--) {
                System.out.println(i);
            }
        }
        if (primerNumero == segundoNumero) {

            System.out.println("Estos numeros son iguales");
        }
    }
}

