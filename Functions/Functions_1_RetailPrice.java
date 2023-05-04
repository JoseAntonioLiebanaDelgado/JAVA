//Desenvolupeu un programa java usant mètodes en programació modular que llegeixi un valor float (preu de cost) per
//teclat i que en retorni el preu de venda al públic incrementant el cost llegit en un +21%.
//
//        Feu com a mínim els següents mètodes:
//
//        -Un mètode per llegir un float de teclat amb control d'errors
//        -Un mètode per demanar el cost del producte a l'usuari
//        -Un mètode per calcular el preu de venda amb l'increment d'IVA +21%.


package Funciones_Corregidas;

import java.util.Scanner;

public class Functions_1_RetailPrice {
    public static void main(String[] args) {

        //Iniciamos y declaramos una variable de tipo float llamada numDadoUser y la igualamos a la funcion que se encarga
        //de hacer el control de errores que se llamara controlErroresFloat
        float numDadoUser = controlErroresFloat();
        System.out.println(calculoPrecioPVP(numDadoUser));
    }

    /**
     * Éste método hace un control de errores de tipo float sobre el numero introducido por el usuario.
     *
     * @return En este caso (numDadoUser).
     */
    private static float controlErroresFloat() {
        Scanner input = new Scanner(System.in);
        float numDadoUser = 0;
        boolean correctTyping = false;
        do {
            //Iniciamos la funcion "pedimosPrecioAlUsuario();" que simplemente nos imprime un texto pidiendo el precio al usuario.
            pedimosPrecioAlUsuario();
            correctTyping = input.hasNextFloat();
            if (!correctTyping) {
                System.out.println("Error. Introduce un numero por favor");
            } else {
                numDadoUser = input.nextFloat();
                if (numDadoUser < 0) {
                    System.out.println("Error. Escribe un numero positivo");
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);
        input.close();
        return numDadoUser;
    }

    /**
     * Éste método simplemente imprime un string.
     */
    private static void pedimosPrecioAlUsuario() {
        System.out.println("Introduzca un precio por favor. Le devolveremos ese precio mas el 21% (PVP)");
    }

    /**
     * (Precio + IVA) Éste método se encarga de hacer la suma del precio que ha introducido el usuario mas el IVA (PVP).
     *
     * @param numero
     * @return
     */
    private static float calculoPrecioPVP(float numero) {
        float precioPVP = numero * 1.21f;
        return precioPVP;
    }
}
