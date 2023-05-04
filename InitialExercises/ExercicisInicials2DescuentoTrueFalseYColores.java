package InitialExercises;

import java.util.Scanner;

public class ExercicisInicials2DescuentoTrueFalseYColores {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        /* A la botiga The bike house es fa un descompte del 20% als clients que son VIP i també
        als clients que facin una compra de més de 200 €. Pensa un algoritme que implementi
        aquesta lògica.*/


        final float DESCOMPTE = 0.80f;
        float importVenta, costCompraFinal;
        boolean esVip;
        final String BLACK = "\033[30m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String PURPLE = "\033[35m";
        final String CYAN = "\033[36m";
        final String WHITE = "\033[37m";
        final String RESET = "\u001B[0m";


        System.out.println("Benvingut a la tenda.");

        System.out.println("Escriu l'import de la venta");
        importVenta = llegir.nextFloat();

        System.out.println("Ets vip? (true | false)?");
        esVip = llegir.nextBoolean();

        if (importVenta > 200.0f || esVip) {
            System.out.println("Aplicarem descompte");
            costCompraFinal = importVenta * DESCOMPTE;
        } else {
            System.out.println("No s'aplicara el descompte");
            costCompraFinal = importVenta;
        }
        System.out.println("El cost final de la compra sera de " + GREEN + costCompraFinal + RESET);
    }
}