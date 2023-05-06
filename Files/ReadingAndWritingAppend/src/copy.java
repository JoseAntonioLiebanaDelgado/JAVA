import java.util.Scanner;
import java.io.*;

public class copy {
    public static void main(String[] args) {

        File archivo;
        int opcion;

        do {
            System.out.println("Bienvenido al programa, selecciona una de laa tres opciones: " +
                    "\n1-Leer archivo \n2-Escribir en el archivo \n3-Salir");
            opcion = leerEntero();
            switch (opcion) {
                case 1:
                    archivo = escogeArchivo();
                    leerArchivo(archivo);
                    break;
                case 2:
                    archivo = escogeArchivo();
                    escribirEnElArchivo(archivo);
                    break;
                case 3:
                    System.out.println("Hasta pronto!");
                    break;
            }
        } while (opcion != 3);
    }

    private static File escogeArchivo() {
        Scanner objetoParaLeerPorTeclado = new Scanner(System.in);
        String nombreArchivo;
        File archivo;
        boolean ficheroCorrecto;

        do {
            ficheroCorrecto = false;
            System.out.println("Escribe el nombre completo del fichero incluida la extension");
            nombreArchivo = objetoParaLeerPorTeclado.next();
            objetoParaLeerPorTeclado.nextLine();
            archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                if (archivo.isFile() && (archivo.getName().endsWith(".txt") || archivo.getName().endsWith(".csv"))) {
                    System.out.println("Archivo correcto y existente");
                    ficheroCorrecto = true;
                } else {
                    System.out.println("Error: El archivo existe pero no se puede leer");
                }
            } else {
                System.out.println("Error: El archivo no existe");
            }
            return archivo;
        } while (!ficheroCorrecto);
    }


    private static void leerArchivo(File archivo) {
        Scanner inputFichero = null;

        try {
            inputFichero = new Scanner(archivo);
            while (inputFichero.hasNext()) {
                System.out.println(inputFichero.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (inputFichero != null) {
                inputFichero.close();
            }
        }
    }


    private static void escribirEnElArchivo(File archivo) {
        PrintStream objetoParaEscribirEnElFichero = null;
        Scanner objLeerTecl = new Scanner(System.in);
        String frase = "";

        try {
            objetoParaEscribirEnElFichero = new PrintStream(new BufferedOutputStream(new FileOutputStream(archivo, true)));
            do {
                System.out.printf("Escribe lo que quieras, cuando quieras salir escribe (exit)");
                frase = objLeerTecl.nextLine();
                if (!frase.equalsIgnoreCase("exit")) {
                    objetoParaEscribirEnElFichero.println(frase);
                } else {
                    System.out.println("Dejamos de escribir");
                }
            } while (!frase.equalsIgnoreCase("exit"));
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } finally {
            if (objetoParaEscribirEnElFichero != null) {
                objetoParaEscribirEnElFichero.close();
            }
        }
    }


    private static int leerEntero() {
        //Crea un objeto de la clase Scanner para leer por teclado
        Scanner leerTeclado = new Scanner(System.in);
        //Declaramos variables
        int valor = 0;
        boolean valorCorrecte = false;

        //Creamos un bucle do-while para controlar que el valor introducido por teclado sea un entero
        do {
            //Usamos el método hasNextInt() para comprobar si el valor introducido por teclado es un entero
            if (!leerTeclado.hasNextInt()) {
                //Si no es un entero, mostramos un mensaje de error
                System.out.printf("ERROR: Valor no enter!");
                //Usamos el método nextLine() para leer la cadena hasta el primer salto de línea
                leerTeclado.nextLine();
            } else {
                //Si es un entero, guardamos el valor en la variable valor
                valor = leerTeclado.nextInt();
                //Usamos el método nextLine() para leer la cadena hasta el primer salto de línea
                leerTeclado.nextLine();
                //Cambiamos el valor de la variable valorCorrecte a true para salir del bucle
                valorCorrecte = true;
            }
        } while (!valorCorrecte);
        return valor;
    }
}