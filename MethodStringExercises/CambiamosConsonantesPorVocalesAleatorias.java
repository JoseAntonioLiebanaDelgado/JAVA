package MethodStringExercises;

public class CambiamosConsonantesPorVocalesAleatorias {
    public static void main(String[] args) {

        // Del siguiente String “Llueve como truena en las cosas de los demás apóstoles” cambia todas las consonantes por vocales aleatorias.

        String oldPhrase = "Llueve como truena en las cosas de los demas apostoles";
        String newPhrase = "";

        for (int i = 0; i <= oldPhrase.length() - 1; i++) {
            String vcharAt = String.valueOf(oldPhrase.charAt(i));

            if (vcharAt.equalsIgnoreCase("a") || vcharAt.equalsIgnoreCase("e") || vcharAt.equalsIgnoreCase("i") || vcharAt.equalsIgnoreCase("o") || vcharAt.equalsIgnoreCase("u")) {
                newPhrase += vcharAt;
            } else {
                int randomNum = (int) (Math.random() * 5) + 1;

                switch (randomNum) {

                    case 1:
                        newPhrase += "a";
                        break;
                    case 2:
                        newPhrase += "e";
                        break;
                    case 3:
                        newPhrase += "i";
                        break;
                    case 4:
                        newPhrase += "o";
                        break;
                    case 5:
                        newPhrase += "u";
                        break;
                }
            }
        }
        System.out.println(newPhrase);
    }
}