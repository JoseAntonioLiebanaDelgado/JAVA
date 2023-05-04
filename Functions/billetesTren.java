//Usant mètodes, desenvolupeu amb programació modular la màquina de venda de bitllets de metro segons els requeriments que trobareu descrits a l'enunciat del pdf adjunt d'aquesta tasca.

//        Demanar tipus de bitllet
//        Demanar zona
//        Calcular preu
//        Cobrar

package Funciones_Corregidas;

import java.util.Scanner;

public class billetesTren {
    public static void main(String[] args) {

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

        int numeroIntroducidoUsuario = controlInputInt(MENU_PRINCIPAL, "Valor no numérico", "Valor fuera de rango", 1, 5);
        int billete = 0;
        int zona = 0;
        float precioFinal = 0;
        float dineroPersona = 0;
        boolean estaBienElDinero;
        float cambio = 0;
        Scanner llegir = new Scanner(System.in);

        switch (numeroIntroducidoUsuario) {
            case 1:
                System.out.println("Ha escogido usted billete sencillo");
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

    private static float cobrar(float moneda, float precio) {
        float devolucion = moneda - precio;
        return devolucion;
    }
}















