package Funciones_Corregidas;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa de simulació de La Primitiva
 *
 * @version 1.0
 * @auhor LiebanaJoseAntonio
 * @date 31/01/2023
 */
public class LaPrimitiva {
    public static void main(String[] args) {
        int[] userVector = new int[7];
        int menu = 0;

        System.out.println("""
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                LA PRIMITIVA:
                COMO JUGAR?
                ⥤ Hay 6 numeros aleatorios del 1 al 49 y un numero de reintegro del 0 al 9

                ⥤ Si aciertas el numero y la posicion ganas 20€

                ⥤ Si aciertas el numero pero no la posicion ganas 10€

                ⥤ Si aciertas el reintegro ganas 6€

                ⥤ Cada partida el bono ganador se reinicia a otros numeros aleatorios
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━""");

        do {
            //i es 0 hasta que sea 6 sumandose de 1 en 1
            for (int i = 0; i < 7; i++) {
                //La posicion i del vector que hemos creado la igualamos a la funcion userResult que simplemente hace un control de errores
                //de los numeros que el usuario va a introducir para la apuesta.
                userVector[i] = userResult(i);
            }
            //Igualamos "IAvector" a "PrimitivaResult" que se utiliza para generar de forma aleatoria una combinación de números que representa el numero ganador de la lotería
            int[] IAvector = PrimitivaResult();
            //Igualamos la variable prize de tipo float a la funcion de "calculateResult" que nos devuelve el precio obtenido.
            float prize = calculateResult(userVector, IAvector);
            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            //ENSEÑAR BOLETOS: 
            System.out.println("Tu voleto es: ");
            for (int i = 0; i < 7; i++) {
                System.out.print(userVector[i] + " ");
            }

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.println("La apuesta de ganadora es:");
            for (int i = 0; i < 7; i++) {
                System.out.print(IAvector[i] + " ");
            }
            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

            System.out.println();
            menu = menu(prize);

        } while (menu == 1);
    }

    /**
     * La función menu muestra un menú al usuario para preguntar si desea volver a jugar o salir.
     * Si el usuario ha ganado un premio, se muestra un mensaje de felicitación y se muestra el premio ganado.
     * La función espera una entrada válida del usuario y devuelve la opción seleccionada.
     * Si el usuario ingresa una entrada no válida, se muestra un mensaje de error y se le solicita que ingrese una entrada válida.
     * La función utiliza un objeto Scanner para leer las entradas del usuario desde la consola.
     *
     * @param prize
     * @return inputusr
     */
    public static int menu(Float prize) {
        boolean loop = false, correct = true;
        Scanner read = new Scanner(System.in);
        int inputusr = 0;

        if (prize == 0.00f) {
            System.out.println("Lo siento no has acertado ninguno\n");
        } else {
            System.out.println("Felicidades has ganado " + prize + "€\n");
        }

        do {
            System.out.println("""
                    Quiere volver a jugar?
                    1 - Volver a jugar
                    2 - Salir""");
            correct = read.hasNextInt();
            if (!correct) {
                System.out.println("-- ERROR -- Esto no es un numero");
                read.nextLine();
            } else {
                inputusr = read.nextInt();
                if (inputusr >= 3 || inputusr <= 0) {
                    System.out.println("Opcion no valida");
                    correct = false;
                }
                read.nextLine();
            }
        } while (!correct);

        return inputusr;
    }

    /**
     * La función calculateResult calcula el premio que un usuario ha ganado en la lotería Primitiva, comparando los números
     * que ha elegido con los números generados aleatoriamente por la computadora.
     * Primero, se inicializa el premio a 0. Luego, se recorre el arreglo userResult (los números elegidos por el usuario)
     * y IAresult (los números generados aleatoriamente por la computadora) en un bucle, para encontrar si hay algún número que coincide en la misma posición de ambos arreglos.
     * Si se encuentra un número en la misma posición, se agrega un premio de 20 euros.
     * Luego, se usa otro bucle anidado para comparar cada número elegido por el usuario con los números generados por la computadora en todas las posiciones.
     * Si se encuentra un número coincidente en cualquier posición, se agrega un premio de 10 euros.
     * Finalmente, se compara el número de reintegro elegido por el usuario con el número de reintegro generado por la computadora.
     * Si son iguales, se agrega un premio adicional de 6 euros.
     * La función devuelve la cantidad total de premios ganados por el usuario.
     * Dicho de otra manera: La función calculateResult recibe dos vectores de enteros que representan los números elegidos por el usuario y los números generados por el sistema de la lotería.
     * La función compara los números y cuenta los aciertos del usuario. Luego, la función asigna una cantidad de dinero en función de la cantidad de aciertos.
     * Finalmente, devuelve la cantidad total de dinero que el usuario ha ganado
     *
     * @param userResult
     * @param IAresult
     * @return prize
     */
    public static float calculateResult(int userResult[], int IAresult[]) {
        float prize = 0.00f;

        // SI EL NUMERO DE USUARIO ES EL MISMO
        for (int i = 0; i < 5; i++) {
            if (userResult[i] == IAresult[i]) {
                System.out.println("El numero " + userResult[i] + " esta en la misma posicion de la primitiva +20€");
                prize = prize + 20.00f;
            }
        }

        // SI EL NUMERO DEL USUARIO ESTA EN LA PRIMITIVA PERO NO EN LA MISMA POSICION
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (userResult[i] == IAresult[j]) {
                    System.out.println("El numero " + userResult[i] + " esta en la posicion " + (j + 1) + " +10€");
                    prize = prize + 10.00f;
                }
            }
        }

        // SI EL NUMERO DE REINTEGRO ES EL MISMO
        if (userResult[6] == IAresult[6]) {
            System.out.println("El numero de reintegro es el mismo +6€");
            prize = prize + 6.00f;
        }

        return prize;
    }

    /**
     * Esta función, llamada "userResult", se utiliza para solicitar al usuario que introduzca un número entero que representa un número de la lotería "La Primitiva".
     * La función acepta un argumento de índice ("Index"), que se utiliza para indicar al usuario la posición del número que se está solicitando. Si el índice es 6,
     * entonces se le pide al usuario que introduzca un número de reintegro.
     * Dentro de la función, se crea una instancia de la clase Scanner para leer la entrada de datos del usuario.
     * Se inicializa la variable "inputusr" con un valor de cero y la variable "valorCorrecte" con un valor de falso.
     * Luego, se utiliza un bucle "do-while" para solicitar la entrada de datos del usuario. La función "read.hasNextInt()"
     * se utiliza para verificar si la entrada de datos actual es un número entero válido. Si la entrada es válida, se almacena en la variable "inputusr" y
     * se verifica que esté dentro de los límites permitidos. Si la entrada no es válida, se le indica al usuario que vuelva a introducir una entrada de datos válida.
     * Finalmente, cuando se obtiene una entrada de datos válida, la función devuelve el valor de "inputusr".
     * En resumen, esta función se utiliza para solicitar y validar la entrada de datos del usuario para los números de la lotería "La Primitiva".
     *
     * @param Index
     * @return inputusr
     */
    public static int userResult(int Index) {
        Scanner read = new Scanner(System.in);
        int inputusr = 0;
        boolean valorCorrecte = false;
        do {
            //Si index es diferente a 6
            if (Index != 6) {
                //sumame 1 a index (que sera la (i) del primer for)
                System.out.println("Posicion " + (Index + 1) + " de la primitiva: ");
            } else {
                //Si index es 6 (Osea que la (i) del primer for ha llegado a 6.
                //Que el usuario ya ha elegido los 6 numeros) imprime...
                System.out.println("Dime el numero de reintegro: ");
            }

//          La función "read.hasNextInt()" es utilizada para verificar si la entrada de datos actual es un número entero.
//          La variable "valorCorrecte" se inicializa con el resultado de la función "read.hasNextInt()". Si la entrada es un número entero, entonces "valorCorrecte" será "true".
//          Si la entrada no es un número entero, entonces "valorCorrecte" será "false".En resumen, esta línea de código se utiliza para comprobar
//          si la entrada actual es un número entero válido y almacenar el resultado en la variable "valorCorrecte".
            valorCorrecte = read.hasNextInt();

            //Si es falso..
            if (!valorCorrecte) {
//              Imprime..
                System.out.println("-- ERROR -- Esto no es un numero");

//              La función "read.nextLine()" se utiliza para avanzar al siguiente renglón de entrada en la entrada de datos.
//              En otras palabras, lee y descarta cualquier entrada de datos presente en la línea actual y se mueve a la siguiente línea disponible.
//              Esto se hace para asegurarse de que la próxima entrada de datos que se va a leer comience en una nueva línea.
                read.nextLine();

                //Si es True..
            } else { // Tinc un enter

                //Esta línea de código se utiliza para leer un número entero de la entrada estándar del usuario y almacenarlo en la variable "inputusr".
                inputusr = read.nextInt();
                //Si index es diferente a 6 (Que el usuario aun no ha añadido los 6 numeros)
                if (Index != 6) {
                    //Controlamos rango, si esta fuera de el imprimimos y le damos valor false a la variable booleana "valorCorrecte".
                    if (inputusr >= 50 || inputusr <= 0) {
                        System.out.println("Opcion no valida");
                        valorCorrecte = false;
                    }
                } else {
                    //Si input es mas grande o igual a 10 o mas pequeño que 0 imprimos y le damos valor false a la variable booleana "valorCorrecte".
                    if (inputusr >= 10 || inputusr < 0) {
                        System.out.println("Opcion no valida");
                        valorCorrecte = false;
                    }
                }
                read.nextLine();
            }
        } while (!valorCorrecte);
        return inputusr;
    }

    /**
     * @param min The minimum accepted value
     * @param max The max accepted value
     * @return int The random value which matches the provided interval
     */
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * La función "PrimitivaResult" se utiliza para generar de forma aleatoria una combinación de números que representa el numero ganador de la lotería.
     *
     * @return randomResult
     */
    public static int[] PrimitivaResult() {
        int[] randomResult = new int[7];

        for (int i = 0; i <= 5; i++) {
            int random = getRandomNumberUsingNextInt(1, 49);
            randomResult[i] = random;
            random = 0;
        }
        randomResult[6] = getRandomNumberUsingNextInt(1, 9);
        return randomResult;
    }
}