package InitialExercises;

import java.util.Scanner;

public class ExercicisInicials8MaquinaCafeSwitchCase {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        /*13. Desenvolupa un programa pseudocodi que serveixi per gestionar la màquina de cafè
        de la 4rta planta de l’escola. Al començar, la màquina preguntarà al usuari quin
        producte vol i li oferirà les possibilitats de:
        1.Cafè
        2.Tallat
        3.Cafè amb llet
        4.Sortir.
        Si l'usuari escull qualsevol altre valor, li hem de tornar a mostrar el menú i tornar a
        demanar una opció. Un cop la màquina sap quin tipus de cafè vol l'usuari, li
        demanarà que introdueixi una moneda. Els tres tipus de cafè valen 0,50€. Si l'usuari
        introdueix un import igual o major a 0,50€, li prepararem el cafè, li tornarem el canvi
        que correspongui mostrant-li per pantalla i acabarà. En cas de que l'usuari introdueixi
        un import menor al preu del cafè, li mostrarà un missatge d'error i el programa
        acabarà.*/

        final float PREU_CAFE = 0.40f;
        final float PREU_TALLAT = 0.50f;
        final float PREU_CAFEAMBLLET = 0.60f;

        int opcio = 0;
        float dinersIntroduits = 0;


        System.out.println("Benvingut al programa");
        do {
            System.out.println("Selecciona una opcio \n\t" +
                    "1. Cafe\n\t" +
                    "2. Tallat\n\t" +
                    "3. Cafe amb llet\n\t" +
                    "4. Sortir");

            opcio = llegir.nextInt();

            if (opcio < 1 || opcio > 4) {
                System.out.println("Error, selecciona una de les 4 opcions si us plau");
            }
        } while (opcio < 1 || opcio > 4);


        switch (opcio) {
            case 1:
                System.out.println("Ha escollit vosté cafe");
                System.out.println("Introdueixi els diners si us plau");
                dinersIntroduits = llegir.nextFloat();
                if (dinersIntroduits == PREU_CAFE) {
                    System.out.println("Moltes Gracies!");
                } else if (dinersIntroduits > PREU_CAFE) {
                    System.out.printf("El teu canvi es de %.2f € ", (dinersIntroduits - PREU_CAFE));
                } else {
                    System.out.println("No has introduit suficients diners");
                }
                break;
            case 2:
                System.out.println("Ha escollit vosté tallat");
                System.out.println("Introdueixi els diners si us plau");
                dinersIntroduits = llegir.nextFloat();
                if (dinersIntroduits == PREU_TALLAT) {
                    System.out.println("Moltes Gracies!");
                } else if (dinersIntroduits > PREU_TALLAT) {
                    System.out.printf("El teu canvi es de %.2f € ", (dinersIntroduits - PREU_TALLAT));
                } else {
                    System.out.println("No has introduit suficients diners");
                }
                break;
            case 3:
                System.out.println("Ha escollit vosté cafe amb llet");
                System.out.println("Introdueixi els diners si us plau");
                dinersIntroduits = llegir.nextFloat();
                if (dinersIntroduits == PREU_CAFEAMBLLET) {
                    System.out.println("Moltes Gracies!");
                } else if (dinersIntroduits > PREU_CAFEAMBLLET) {
                    System.out.printf("El teu canvi es de %.2f € ", (dinersIntroduits - PREU_CAFEAMBLLET));
                } else {
                    System.out.println("No has introduit suficients diners");
                }
                break;
            case 4:
                System.out.println("Ha escollit vosté sortir");
                System.out.println("Fins aviat!");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
