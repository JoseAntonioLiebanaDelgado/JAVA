import java.util.Scanner;

public class usoTallas {
    public static void main(String[] args) {

        /*
        //Las enum son como una clase, pero con un conjunto de constantes.
        //Las constantes se declaran con mayusculas, constantes, publicas, estaticas y finales.
        // public static final TALLA = "S";
        // public static final TALLA = "M";
        // public static final TALLA = "L";
        // public static final TALLA = "XL";


        // "mini" es una variable objeto
        Tallas mini = Tallas.XS;
        Tallas mediana = Tallas.M;
        Tallas grande = Tallas.XL;
        Tallas muyGrande = Tallas.XXXL;

         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUYGRANDE");

        //Con el método toUpperCase de la clase String hacemos que lo que escriba el usuario se transforme el mayusculas.
        String entradaDatos = entrada.next().toUpperCase();

        //Declaramos una variable de tipo "Tallas", la cual va a ser "laTalla".
        //Le decimos que esa variable va a ser igual a enum -Metodo Static-
        //Dentro del valueOf: (Por un lado la clase a la que pertenece en este caso "Tallas"
        //y por otro lado nos pide la entrada que ha introducido el usuario "entradaDatos").
        //El metodo "valueOf" que lo hace es devolvernos el nombre de la constante enumerada a la
        //que pertenece el texto introducido, que lo hemos almacenado en "entradaDatos".
        //En resumen, lo que almacenamos en la variable "laTalla" es la opcion de ENUM que haya
        //introducido el usuario.
        Tallas laTalla = Enum.valueOf(Tallas.class, entradaDatos);

        //Esto que acabamos de hacer nos permite utilizar la variable "laTalla" para llamar al metodo getter.
        System.out.println("Talla: " + laTalla);

        System.out.println("Abreviatura: " + laTalla.dameAbreviatura());

    }
}