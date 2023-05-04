//Usant mètodes, desenvolupeu amb programació modular la màquina de venda de bitllets de metro segons els requeriments que trobareu descrits a l'enunciat del pdf adjunt d'aquesta tasca.

//        Demanar tipus de bitllet
//        Demanar zona
//        Calcular preu
//        Cobrar

package Funciones_Corregidas;

import java.util.Scanner;

public class billetesTrenComentado {
    public static void main(String[] args) {

        //Creamos un vector con los precios bases de cada billete.
        float[] precios = {2.40f, 11.35f, 40.00f, 10.00f, 80.00f};

        System.out.println();
        System.out.println("Bienvenido!");
        System.out.println();
        String MENU_PRINCIPAL = "Seleccione un billete por favor:\n" +
                "1. Billete sencillo\n" +
                "2. TCasual\n" +
                "3. TUsual\n" +
                "4. TFamiliar\n" +
                "5. TJoven";

        //Creamos e igualamos la variable int numeroIntroducidoUsuario a la funcion que nos devuelve el billete que elige el usuario.
        int numeroIntroducidoUsuario = controlInputInt(MENU_PRINCIPAL, "Valor no numérico", "Valor fuera de rango", 1, 5);

        //Declaro variables
        int billete, zona = 0;
        float precioFinal, dineroPersona, cambio = 0;
        boolean estaBienElDinero;

        //Creamos funcion Scanner
        Scanner llegir = new Scanner(System.in);

        //Creamos un menu para mostrar la informacion que pertenezca en cada caso (a cada billete).
        switch (numeroIntroducidoUsuario) {
            case 1:
                System.out.println("Ha escogido usted billete sencillo");
                //Igualamos la variable entera "billete" a "numeroIntroducidoUsuario" que nos devuelve el numero del billete.
                billete = numeroIntroducidoUsuario;
                //Igualamos la variable entera "zona" a la funcio "numeroZonas" que nos devuelve el numero de la zona.
                zona = numeroZonas(numeroIntroducidoUsuario);
                //Igualamos la variable "precioFinal" a la funcion "calcularPrecio" que nos calcula el precio.
                precioFinal = calcularPrecio(zona, precios, billete);
                System.out.println("El precio final es de: " + precioFinal + " €");
                System.out.println("Introduce el dinero:");
                dineroPersona = llegir.nextFloat();
                estaBienElDinero = comprovarMoneda(dineroPersona);


                while (!estaBienElDinero || dineroPersona < precioFinal) {
                    if (dineroPersona < precioFinal) {
                        System.out.println("No hay suficiente dinero, te falta " + (precioFinal - dineroPersona) + " €");
                    }
                    System.out.println("Introduce el dinero de nuevo:");
                    dineroPersona = llegir.nextFloat();
                    estaBienElDinero = comprovarMoneda(dineroPersona);
                }

                cambio = cobrar(dineroPersona, precioFinal);
                System.out.println("Su cambio es de: " + cambio + " €");
                break;
            case 2:
                System.out.println("Ha escogido usted billete TCasual");
                billete = numeroIntroducidoUsuario;
                zona = numeroZonas(numeroIntroducidoUsuario);
                precioFinal = calcularPrecio(zona, precios, billete);
                System.out.println("El precio final es de: " + precioFinal + " €");
                System.out.println("Introduce el dinero:");
                dineroPersona = llegir.nextFloat();
                estaBienElDinero = comprovarMoneda(dineroPersona);

                while (!estaBienElDinero || dineroPersona < precioFinal) {
                    if (dineroPersona < precioFinal) {
                        System.out.println("No hay suficiente dinero, te falta " + (precioFinal - dineroPersona) + " €");
                    }
                    System.out.println("Introduce el dinero de nuevo:");
                    dineroPersona = llegir.nextFloat();
                    estaBienElDinero = comprovarMoneda(dineroPersona);
                }

                cambio = cobrar(dineroPersona, precioFinal);
                System.out.println("Su cambio es de: " + cambio + " €");
                break;
            case 3:
                System.out.println("Ha escogido usted billete TUsual");
                billete = numeroIntroducidoUsuario;
                zona = numeroZonas(numeroIntroducidoUsuario);
                precioFinal = calcularPrecio(zona, precios, billete);
                System.out.println("El precio final es de: " + precioFinal + " €");
                System.out.println("Introduce el dinero:");
                dineroPersona = llegir.nextFloat();
                estaBienElDinero = comprovarMoneda(dineroPersona);

                while (!estaBienElDinero || dineroPersona < precioFinal) {
                    if (dineroPersona < precioFinal) {
                        System.out.println("No hay suficiente dinero, te falta " + (precioFinal - dineroPersona) + " €");
                    }
                    System.out.println("Introduce el dinero de nuevo:");
                    dineroPersona = llegir.nextFloat();
                    estaBienElDinero = comprovarMoneda(dineroPersona);
                }

                cambio = cobrar(dineroPersona, precioFinal);
                System.out.println("Su cambio es de: " + cambio + " €");
                break;

            case 4:
                System.out.println("Ha escogido usted billete TFamiliar");
                billete = numeroIntroducidoUsuario;
                zona = numeroZonas(numeroIntroducidoUsuario);
                precioFinal = calcularPrecio(zona, precios, billete);
                System.out.println("El precio final es de: " + precioFinal + " €");
                System.out.println("Introduce el dinero:");
                dineroPersona = llegir.nextFloat();
                estaBienElDinero = comprovarMoneda(dineroPersona);

                while (!estaBienElDinero || dineroPersona < precioFinal) {
                    if (dineroPersona < precioFinal) {
                        System.out.println("No hay suficiente dinero, te falta " + (precioFinal - dineroPersona) + " €");
                    }
                    System.out.println("Introduce el dinero de nuevo:");
                    dineroPersona = llegir.nextFloat();
                    estaBienElDinero = comprovarMoneda(dineroPersona);
                }

                cambio = cobrar(dineroPersona, precioFinal);
                System.out.println("Su cambio es de: " + cambio + " €");
                break;
            case 5:
                System.out.println("Ha escogido usted billete TJove");
                billete = numeroIntroducidoUsuario;
                zona = numeroZonas(numeroIntroducidoUsuario);
                precioFinal = calcularPrecio(zona, precios, billete);
                System.out.println("El precio final es de: " + precioFinal + " €");
                System.out.println("Introduce el dinero:");
                dineroPersona = llegir.nextFloat();
                estaBienElDinero = comprovarMoneda(dineroPersona);

                while (!estaBienElDinero || dineroPersona < precioFinal) {
                    if (dineroPersona < precioFinal) {
                        System.out.println("No hay suficiente dinero, te falta " + (precioFinal - dineroPersona) + " €");
                    }
                    System.out.println("Introduce el dinero de nuevo:");
                    dineroPersona = llegir.nextFloat();
                    estaBienElDinero = comprovarMoneda(dineroPersona);
                }
                cambio = cobrar(dineroPersona, precioFinal);
                System.out.println("Su cambio es de: " + cambio + " €");
                break;
        }
    }

    /**
     * Éste método nos devuelve el numero del billete una vez ha pasado el control de errores.
     *
     * @param mensajeParaPedirDatosAlUser
     * @param mensajeDeErrorDeTipo
     * @param mensajeValorSuperado
     * @param min
     * @param max
     * @return x
     */
    private static int controlInputInt(String mensajeParaPedirDatosAlUser, String mensajeDeErrorDeTipo, String mensajeValorSuperado, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do {
            System.out.println(mensajeParaPedirDatosAlUser);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte) {
                System.out.println(mensajeDeErrorDeTipo);
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println(mensajeValorSuperado);
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);
        return x;
    }

    /**
     * Éste método nos devuelve el numero de zonas una vez ha pasado el control de errores.
     *
     * @param zonesNumber
     * @return zona
     */
    private static int numeroZonas(int zonesNumber) {
        Scanner input = new Scanner(System.in);
        int opcio = 0;
        System.out.println("Selecciona una opcion por favor: \n" +
                "1. 1 ZONA\n" +
                "2. 2 ZONAS\n" +
                "3. 3 ZONAS\n" +
                "4. SALIR\n");

        opcio = controlInputInt("De cuantas zonas?", "Tipo de dato erroneo", "Valor superado", 1, 4);
        int zona = 0;
        switch (opcio) {
            case 1:
                zona = 1;
                break;
            case 2:
                zona = 2;
                break;
            case 3:
                zona = 3;
                break;
            case 4:
                System.out.println("Sortir");
                break;
        }
        return zona;
    }

    /**
     * Éste método nos devuelve el cálculo del precio de cada billete con su respectiva zona.
     *
     * @param zonaBillete
     * @param precios
     * @param billete
     * @return precioFinal
     */
    private static float calcularPrecio(int zonaBillete, float[] precios, int billete) {
        float precioFinal = 0;
        switch (billete) {
            case 1:
                if (zonaBillete == 1) {
                    precioFinal = precios[0];
                } else if (zonaBillete == 2) {
                    precioFinal = precios[0] * 1.3125f;
                } else if (zonaBillete == 3) {
                    precioFinal = precios[0] * 1.8443f;
                }
                break;
            case 2:
                if (zonaBillete == 1) {
                    precioFinal = precios[1];
                } else if (zonaBillete == 2) {
                    precioFinal = precios[1] * 1.3125f;
                } else if (zonaBillete == 3) {
                    precioFinal = precios[1] * 1.8443f;
                }
                break;
            case 3:
                if (zonaBillete == 1) {
                    precioFinal = precios[2];
                } else if (zonaBillete == 2) {
                    precioFinal = precios[2] * 1.3125f;
                } else if (zonaBillete == 3) {
                    precioFinal = precios[2] * 1.8443f;
                }
                break;
            case 4:
                if (zonaBillete == 1) {
                    precioFinal = precios[3];
                } else if (zonaBillete == 2) {
                    precioFinal = precios[3] * 1.3125f;
                } else if (zonaBillete == 3) {
                    precioFinal = precios[3] * 1.8443f;
                }
                break;
            case 5:
                if (zonaBillete == 1) {
                    precioFinal = precios[4];
                } else if (zonaBillete == 2) {
                    precioFinal = precios[4] * 1.3125f;
                } else if (zonaBillete == 3) {
                    precioFinal = precios[4] * 1.8443f;
                }
                break;
        }
        return precioFinal;
    }

    /**
     * Éste método asegura si las monedas existen o no. Controla que las monedas con las que pagará el usuario sean las que hay en éste método.
     *
     * @param moneda
     * @return
     */
    private static boolean comprovarMoneda(float moneda) {
        final float[] monedaValida = {0.01f, 0.02f, 0.05f, 0.10f, 0.20f, 0.50f, 1.00f, 2.00f, 5.00f, 10.00f, 20.00f, 50.00f, 100.00f, 200.00f};
        //boolean monedaCorrecte = false;
        for (int i = 0; i < monedaValida.length; i++) {
            if (monedaValida[i] == moneda) {
                return true;
            }
        }
        return false;
    }

    /**
     * Éste método se utiliza para cobrar al usuario.
     *
     * @param moneda
     * @param precio
     * @return
     */
    private static float cobrar(float moneda, float precio) {
        float devolucion = moneda - precio;
        return devolucion;
    }
}















