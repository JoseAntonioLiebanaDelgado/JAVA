package MethodStringExercises;

public class RemplazarXporXMetodoReplace {
    public static void main(String[] args) {

        //Reemplaza todas las "A" del String “En Hawai Bombai es un paraiso y yo Manuel me compro una casa en la playa” por una "E"

        String cadena = ("En Hawai Bombai es un paraiso y yo Manuel me compro una casa en la playa");
        String newCadena = cadena.replace("a", "e");
        System.out.println(newCadena);
    }
}