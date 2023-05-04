package MethodStringExercises;

public class ContarVocales {
    public static void main(String[] args) {

        //Del siguiente String “Estos son mis primeros pasos como programador” cuenta cuantas vocales hay en total

        String rawFrase = "Estos son mis primeros pasos como programador";
        String newFrase = rawFrase.toLowerCase();

        boolean tieneVocales = false;
        int contadorVocales = 0;

        for (int i = 0; i <= newFrase.length() - 1; i++) {
            if (newFrase.charAt(i) == 'a' || newFrase.charAt(i) == 'e' || newFrase.charAt(i) == 'i' || newFrase.charAt(i) == 'o' || newFrase.charAt(i) == 'u') {
                contadorVocales++;
                tieneVocales = true;
            }
        }
        if (tieneVocales == true) {
            System.out.println("La frase tiene " + contadorVocales + " vocales");
        } else {
            System.out.println("La frase no tiene ninguna vocal");
        }
    }
}