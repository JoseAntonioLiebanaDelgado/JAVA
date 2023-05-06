import java.io.*;
import java.util.Scanner;

/**
 * Clase que contiene el método main del programa.
 */
public class ReadingAndWritingAppend {
    /**
     * Método main del programa.
     *
     * @param args
     */
    public static void main(String[] args) {
        //Declarem la variable arxiu de tipus File perque la puguem utilitzar en tot el programa
        //"arxiu" contindrà el fitxer que escollim per teclat
        File arxiu;
        int opcio;

        do {
            System.out.printf("Benvingut/da al programa de lectura i escriptura de fitxers de text");
            System.out.println(" Escull una de les opcions següents: "
                    + "\n 1- Llegir arxiu per pantalla"
                    + "\n 2- Escriure al fitxer"
                    + "\n 3- Sortir");
            //Llamamos al método llegirInt() para leer un entero por teclado
            opcio = llegirInt();
            switch (opcio) {
                case 1:
                    //Llamamos al método escullArxiu() para escoger un archivo
                    arxiu = escullArxiu();
                    //Llamamos al método llegirArxiu() para leer el archivo
                    llegirArxiu(arxiu);
                    break;
                case 2:
                    //Llamamos al método escullArxiu() para escoger un archivo
                    arxiu = escullArxiu();
                    //Llamamos al método escriureArxiu() para escribir en el archivo
                    escriureArxiu(arxiu);
                    break;
                case 3:
                    System.out.printf("Sortint del programa...");
                    break;
            }
        } while (opcio != 3);
    }

    /**
     * Método que hace de controlador de errores para leer un entero por teclado.
     *
     * @return
     */
    private static int llegirInt() {
        //Crea un objeto de la clase Scanner para leer por teclado
        Scanner llegirTeclat = new Scanner(System.in);
        //Declaramos variables
        int valor = 0;
        boolean valorCorrecte = false;

        //Creamos un bucle do-while para controlar que el valor introducido por teclado sea un entero
        do {
            //Usamos el método hasNextInt() para comprobar si el valor introducido por teclado es un entero
            if (!llegirTeclat.hasNextInt()) {
                //Si no es un entero, mostramos un mensaje de error
                System.out.printf("ERROR: Valor no enter!");
                //Usamos el método nextLine() para leer la cadena hasta el primer salto de línea
                llegirTeclat.nextLine();
            } else {
                //Si es un entero, guardamos el valor en la variable valor
                valor = llegirTeclat.nextInt();
                //Usamos el método nextLine() para leer la cadena hasta el primer salto de línea
                llegirTeclat.nextLine();
                //Cambiamos el valor de la variable valorCorrecte a true para salir del bucle
                valorCorrecte = true;
            }
        } while (!valorCorrecte);
        return valor;
    }

    /**
     * Método que hace de controlador de errores para escoger un archivo.
     *
     * @return
     */
    private static File escullArxiu() {
        //Crea un objeto de la clase Scanner para leer por teclado
        Scanner objetoParaLeerPorTeclado = new Scanner(System.in);
        //Declaramos variables y objetos
        String nomArxiu = "";
        File arxiu;
        boolean fitxerCorrecte;

        //Creamos un bucle do-while para controlar que el archivo introducido por teclado exista
        do {
            //Inicializamos la variable a false porque no sabemos si el archivo existe o si es un archivo legible
            fitxerCorrecte = false;
            //Pedimos el nombre del archivo por teclado
            System.out.print("Escriu el nom del complet fitxer a buscar (inclou extensió): ");
            //Damos valor a la variable nomArxiu con el nombre del archivo introducido por teclado
            //Usamos el método next() para leer la cadena hasta el primer espacio en blanco ya que el nombre del archivo no puede contener espacios en blanco
            nomArxiu = objetoParaLeerPorTeclado.next();
            //Usamos el método nextLine() para leer la cadena hasta el salto de línea
            objetoParaLeerPorTeclado.nextLine();

            //Creamos un objeto de la clase File con el nombre del archivo introducido por teclado porque el método exists() de la clase File necesita un objeto de la clase File
            //No podemos poner nomArxiu = new File(nomArxiu) porque si el archivo no existe nos dará error
            arxiu = new File(nomArxiu);
            //Comprobamos si el archivo existe y si es un archivo legible
            if (arxiu.exists()) {
                //Comprobamos si el archivo es un archivo y si el nombre del archivo termina con .txt o .csv
                if (arxiu.isFile() && (arxiu.getName().endsWith(".txt") || arxiu.getName().endsWith(".csv"))) {
                    System.out.println("Arxiu correcte i existent.");
                    fitxerCorrecte = true;
                } else {
                    System.out.println("ERROR: L'arxiu existeix però no és un fitxer llegible.");
                }
            } else {
                System.out.println("ERROR: L'arxiu no existeix.");
            }
            //Si el archivo no existe o no es un archivo legible volvemos a pedir el nombre del archivo por teclado
        } while (!fitxerCorrecte);
        //Devolvemos el objeto de la clase File
        return arxiu;
    }

    /*do {
        try {
            // Inicializamos la variable a false porque no sabemos si el archivo existe o si es un archivo legible
            fitxerCorrecte = false;
            // Pedimos el nombre del archivo por teclado
            System.out.print("Escriu el nom del complet fitxer a buscar (inclou extensió): ");
            // Damos valor a la variable nomArxiu con el nombre del archivo introducido por teclado
            // Usamos el método next() para leer la cadena hasta el primer espacio en blanco ya que el nombre del archivo no puede contener espacios en blanco
            nomArxiu = objetoParaLeerPorTeclado.next();
            // Usamos el método nextLine() para leer la cadena hasta el salto de línea
            objetoParaLeerPorTeclado.nextLine();

            // Creamos un objeto de la clase File con el nombre del archivo introducido por teclado porque el método exists() de la clase File necesita un objeto de la clase File
            // No podemos poner nomArxiu = new File(nomArxiu) porque si el archivo no existe nos dará error
            arxiu = new File(nomArxiu);
            // Comprobamos si el archivo existe y si es un archivo legible
            if (arxiu.exists()) {
                // Comprobamos si el archivo es un archivo y si el nombre del archivo termina con .txt o .csv
                if (arxiu.isFile() && (arxiu.getName().endsWith(".txt") || arxiu.getName().endsWith(".csv"))) {
                    System.out.println("Arxiu correcte i existent.");
                    fitxerCorrecte = true;
                } else {
                    System.out.println("ERROR: L'arxiu existeix però no és un fitxer llegible.");
                }
            } else {
                System.out.println("ERROR: L'arxiu no existeix.");
            }
        } catch (Exception e) {
            // Manejamos la excepción en caso de que ocurra
            System.out.println("S'ha produït un error: " + e.getMessage());
        }
        // Si el archivo no existe o no es un archivo legible volvemos a pedir el nombre del archivo por teclado
    } while (!fitxerCorrecte);
// Devolvemos el objeto de la clase File
return arxiu;*/

    /**
     * Método que lee un archivo.
     *
     * @param arxiu
     */
    public static void llegirArxiu(File arxiu) {
        //Creamos un objeto de la clase Scanner con valor null para poder cerrar el objeto Scanner en el bloque finally
        Scanner inputFitxer = null;

        //Creamos un bloque try-catch-finally para controlar los errores
        try {
            //Igualamos el objeto Scanner al archivo que hemos escogido
            inputFitxer = new Scanner(arxiu); // Somrient
            //Creamos un bucle while para leer el archivo hasta que no haya más líneas
            while (inputFitxer.hasNext()) {
                //Imprimimos por pantalla la línea del archivo
                System.out.println(inputFitxer.nextLine());
            }
            //Capturamos la excepción FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! El fitxer no existeix");
            //Capturamos la excepción Exception
        } catch (Exception e) {
            System.out.println("ERROR!: " + e);
            //Cerramos el objeto Scanner
        } finally {
            // Tanco l'objecte Scanner vinculat al fitxer per tal de que no quedi bloquejat
            if (inputFitxer != null) {
                inputFitxer.close();
            }
        }
    }

    /**
     * Método que escribe en un archivo.
     *
     * @param arxiu
     */
    private static void escriureArxiu(File arxiu) {
        //Creamos un objeto de la clase PrintStream con valor null para poder cerrar el objeto PrintStream en el bloque finally
        PrintStream escriureFitxer = null;
        //Creamos un objeto de la clase Scanner para leer por teclado
        Scanner llegirTeclat = new Scanner(System.in);
        //Declaramos variables y objetos
        String frase = "";
        try {
            // Usem les classes BufferedOutputStream i FileOutputStream per tal de poder inicialitzar el PrintStream amb append 'true' i escriure a continuació:
            escriureFitxer = new PrintStream(new BufferedOutputStream(new FileOutputStream(arxiu, true)));

            // Si usem el constructor directament amb l'objecte File, ens sobre-escriu el contingut:
            // escriureFitxer = new PrintStream(arxiu);

            do {
                System.out.printf("Escriu la frase que vols escriure al fitxer (per sortir escriu 'exit'): ");
                //Usamos el método nextLine() para leer la cadena hasta el salto de línea
                frase = llegirTeclat.nextLine();

                //Si la frase es diferente de exit la escribimos en el archivo
                if (!frase.equalsIgnoreCase("exit")) {
                    //Utilizamos el método println() para escribir la frase en el archivo
                    escriureFitxer.println(frase);
                } else {
                    //Si la frase es igual a exit salimos del bucle
                    System.out.printf("Deixem d'escriure.");
                }
                //El bucle se repite mientras la frase sea diferente de exit
            } while (!frase.equalsIgnoreCase("exit"));
            //Capturamos la excepción FileNotFoundException
        } catch (Exception fnfe) {
            System.out.printf("ERROR: " + fnfe.getMessage());
        } finally {
            // Tanco l'objecte PrintStream vinculat al fitxer per tal de que no quedi bloquejat
            if (escriureFitxer != null) {
                escriureFitxer.close();
            }
        }
    }
}






