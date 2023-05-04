package Matrix;

import java.util.Scanner;

public class MatricesNombreEncriptado {
    public static void main(String[] args) {

        /*Encripta el teu nom (escollit per l'usuari) en la diagonal principal d'una matriu.
        Calcula tu mateix de quina mida necessites la matriu segons la llargada del teu nom.
        Encripta la matriu utilitzant per a cada lletra del teu nom el seu valor en ASCII i omple la resta de cel·les de la matriu amb nombres enters aleatoris
        que representin el valor duna lletra en ASCII.
        Quins són els valors del codi ASCII que representen lletres en majúscula? Revisa la taula.
        Mostra primer la matriu amb els nombres enters:
        I després torna a mostrar la matriu amb la traducció de tots els nombres a la lletra corresponent segons la taula ASCII.
        Així doncs el seguent codi mostrarà una A per consola:
        System.out.println((char) 65);
        Ja que a la taula ASCCI el valor de la lletra A es 65:*/

        Scanner input = new Scanner(System.in);

        String userName;
        int longitud;
        int[][] matriz;

        System.out.println("Bienvenido/a, introduzca su nombre por favor ");
        userName = input.nextLine();
        longitud = userName.length();
        matriz = new int[longitud][longitud];

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                matriz[i][j] = (int) (65 + (Math.random() * 110));
            }
        }

        for (int i = 0; i < longitud; i++) {
            matriz[i][i] = userName.charAt(i);
        }

        System.out.println();
        System.out.println("Primera fase:");
        for (int i = 0; i < longitud; i++) {
            System.out.println();
            for (int j = 0; j < longitud; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Segona fase:");
        System.out.println();
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                System.out.print((char) (matriz[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}