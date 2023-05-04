package Arrays;

import java.util.Scanner;

public class Arrays4SumaAiB {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {6, 8, 7, 1, 2, 3};
        int[] c = new int[a.length]; // c {0,0,0,0,0,0};

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] + " ");
        }
    }
}
