package Funciones_Corregidas.RepasoTeorico;

//Donada la seguent sequencia de crides a metodes, escriu la capcalera de la definicio dels metodes cridats:


public class e4 {
    public static void main(String[] args) {

        String nom = "Andy";
        int x = 2, numLletres;
        boolean trobada = false;

        char[] lletres = obtenirLletres(nom, x, 3);
        numLletres = comptarLletres(lletres);
        imprimirLletres(lletres);
        trobada = buscarLletra(lletres, 'a');
        System.out.println(trobada);
    }

    private static char[] obtenirLletres(String nom, int x, int num) {
        return new char[0];
    }

    private static int comptarLletres(char[] lletres) {
        return 0;
    }

    private static void imprimirLletres(char[] lletra) {
    }

    private static boolean buscarLletra(char[] lletres, char lletra) {
        return false;
    }
}


