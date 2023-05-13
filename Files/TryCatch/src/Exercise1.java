
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    //Declaramos un array de enteros
    private static int[] anArray;

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String args[]) {
        //Creamos un objeto de tipo Random
        Random rand = new Random();
        // Igualamos el array llamado "anArray" a un array de enteros con una longitud aleatoria llamado "rand.nextInt(20)"
        // 20 es el número máximo de elementos que puede tener el array
        // rand.nextInt(20) es el número aleatorio que se genera para la longitud del array
        anArray = new int[rand.nextInt(20)]; //Get an array with a random length
        // Recorremos el array y le asignamos un valor aleatorio a cada elemento
        for (int j = 0; j < anArray.length; j++) {
            //Igualamos cada elemento del array a un número aleatorio entre 0 y 100
            anArray[j] = rand.nextInt(100);
        }
        // Creamos un objeto de tipo Scanner
        Scanner entry = new Scanner(System.in);
        // Creamos una variable booleana para controlar el bucle while
        boolean yn = true;
        // Creamos un bucle while para que el usuario pueda elegir el índice del array que quiere mostrar
        while (yn) {
            // Mostramos el array por pantalla diciendo que es un array de enteros
            System.out.println("Here is our Integer Array:");
            System.out.println(Arrays.toString(anArray));
            // Pedimos al usuario que introduzca el índice del array que quiere mostrar
            System.out.print("Enter the index you want to display: ");
            int selection = entry.nextInt();
            // Mostramos el elemento del array que el usuario ha elegido
            System.out.println("Your selection:[" + anArray[selection] + "]");
            System.out.println("Exit application?: yes or no");
            // Pedimos al usuario que introduzca si quiere salir o no
            String decision = entry.next();
            switch (decision) {
                case "yes":
                    yn = false;
                    break;
                case "no":
                    yn = true;
                    break;
                default:
                    System.out.println("please enter again ");
            }
        }
    }
}


