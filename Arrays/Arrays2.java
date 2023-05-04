package Arrays;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        /*int [] mi_Matriz = new int[5];

        mi_Matriz[0]=5;
        mi_Matriz[1]=38;
        mi_Matriz[2]=15;
        mi_Matriz[3]=92;
        mi_Matriz[4]=71;*/

        //Inicio y declaro una array

        int[] mi_Matriz = {5, 38, 15, 92, 71};

        for (int i = 0; i < mi_Matriz.length; i++) {
            System.out.println("El valor del indice " + i + " es " + mi_Matriz[i]);
        }
    }
}
