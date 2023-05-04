package InitialExercises;


import java.util.Scanner;

public class ExercicisInicials5ValorFurgoKm {
    public static void main(String[] args) {

        /*El preu d’una Volkswagen Grand California és de 73490€, com que és una gran
        inversió, en volem calcular el valor de mercat per si un dia la volem vendre de segona
        mà. Sabem que perd un 0.00001% de valor pera cada quilòmetre que recorre.
        Extra: Si la Volkswagen és la versió Camper Full Equip val 20000€ més. Modifica el
        teu algoritme per tal de que permeti fer el càlcul amb les dues opcions.*/

        Scanner llegir = new Scanner(System.in);

        int preuFurgo = 73490, numKm;
        final float DESCOMPTE = 0.0001f;
        boolean esFE;

        System.out.println("Benvingut. Ara calcularem el descompte de la furgo. Avans de res.. La furgo " +
                "es full equip? (true | false)");
        esFE = llegir.nextBoolean();

        if (esFE) {
            preuFurgo += 20000;
        } else {
            preuFurgo = preuFurgo;
        }
        System.out.println("D'acord, el preu de la furgo es de " + preuFurgo);

        System.out.println("Quants kilometres porta rodats la furgo?");
        numKm = llegir.nextInt();

        System.out.println("Segons els km fets el valor de la furgo actualment sera de " +
                (preuFurgo - (numKm * DESCOMPTE)));
    }
}
