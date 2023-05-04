package Arrays;

import java.util.Scanner;

public class Arrays5PositionRAM {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int[] vectorA = {1, 2, 3};
        int[] vectorB = vectorA;
        int[] vectorC = new int[vectorA.length];


        System.out.println("Posicio Ram vector A" + vectorA);
        System.out.println("Posicio Ram vector B" + vectorB);
        

        System.out.println("");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("A la posicio A hi ha valor: " + vectorA[i]);
        }

        System.out.println("");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("A la posicio B hi ha valor: " + vectorB[i]);
        }

        System.out.println("");
        vectorA[0] = 4;
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("A la posicio B hi ha valor: " + vectorB[i]);
        }

        System.out.println("");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("A la posicio C hi ha valor : " + vectorC[i]);
        }
    }
}
