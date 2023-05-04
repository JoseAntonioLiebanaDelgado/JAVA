package MethodStringExercises;

import java.util.Scanner;

public class LiebanaJoseAntonio_StringsE_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*4. Escriviu un programa per afegir 'ing' al final d'una cadena determinada (la
        longitud ha de ser com a mínim 3). Si la cadena donada ja acaba amb 'ing',
        afegiu 'ly' al seu lloc. Si la longitud de la cadena donada és inferior a 3, deixeu-la
        sense canvis.
        Cadena de mostra: "abc"
        Resultat esperat: "abcing"
        Cadena de mostra: "string"
        Resultat esperat: "stringly"*/

        String userPhrase = "";

        System.out.println("Escribe un palabra por favor");
        userPhrase = input.nextLine();

        userPhrase = userPhrase + " ";

        if (userPhrase.length() > 3) {
            String newCadena = userPhrase.replace(" ", "ing");
            System.out.println(newCadena);
        } else if (userPhrase.substring(userPhrase.length() - 3, userPhrase.length()).equals("ing")) {
            System.out.println();
        } else {
            System.out.println(userPhrase.length() - 3 + "ly");
        }
    }
}
