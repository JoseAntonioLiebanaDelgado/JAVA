package ColorsAndASSCI;

import java.util.Scanner;

public class ASSCI_While {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        final int MIN = 97;
        final int MAX = 122;
        int valor = MIN;

        while (valor <= MAX) {
            System.out.println((char) valor);
            valor++;
        }
    }
}
