package IfElse;

import java.util.Scanner;

public class EjercicioIf11Ascensor {
    public static void main(String[] args) {

        /*Considerem un ascensor d’un edifici amb planta baixa i dos pisos que tingui els següents
        botons: ‘pujar 1’, ‘pujar 2’, ‘baixar 1’ i ‘baixar 2’. L’ascensor es comporta, a partir dels botons
        esmentats, segons el següent diagrama de transició d’estats:

        Es demana desenvolupar un programa que simuli el funcionament d’aquest ascensor.
        El programa demanarà el pis en que es troba i el botó que es prem, i mostrarà el nou pis.
        Cal comprovar que els botons i les plantes siguin correctes. En cas que no ho siguin, el
        programa mostrarà un error informatiu en comptes del nou pis.*/

        // El edificio tiene 3 plantas
        // El programa tiene 4 botones (Sube 1, Sube 2, Baja 1, Baja 2)
//		int pisoActual = 0;
//		int botonUsuario = 0;
//		int sumatorioPiso = 0;
//
//		// TODO: - Pedimos el piso donde se encuentra al user
//		Scanner entradaDos = new Scanner(System.in);
//
//		System.out.println("En que planta estas? (0 = plantaBaja | 1 = primeraPlanta | 2 = segundaPlanta)");
//		pisoActual = entradaDos.nextInt();
//
//		// TODO: - Comprobamos si el piso donde esta existe
//		if (pisoActual < 0 || pisoActual > 2) {
//			System.out.println("Ese piso no existe");
//			System.exit(0);
//		}
//
//		// TODO: - Preguntamos que boton quiere usar
//		System.out.println("Pulsa un boton. (1 = botonSubirUno | 2 = botonSubirDos | 3 = botonBajarUno | 4 = botonBajarDos)");
//		botonUsuario = entradaDos.nextInt();
//
//		if (botonUsuario < 1 || botonUsuario > 4) {
//			System.out.println("Ese Boton no existe");
//			System.exit(0);
//		}
//
//		switch (botonUsuario) {
//		case 1:
//			sumatorioPiso = 1;
//			break;
//		case 2:
//			sumatorioPiso = 2;
//			break;
//		case 3:
//			sumatorioPiso = -1;
//			break;
//		case 4:
//			sumatorioPiso = -2;
//			break;
//		default:
//			sumatorioPiso = 0;
//			break;
//		}
//
//		// TODO: - Intentamos movernos al piso deseado
//		if ((pisoActual + sumatorioPiso) > 2 || (pisoActual + sumatorioPiso < 0)) {
//			System.out.println("La combinacion de pisos no existe");
//			System.exit(0);
//		} else {
//			// TODO: - Mostramos resultado
//			System.out.println("Genial, ahora estas en el piso " + (pisoActual + sumatorioPiso));
//		}


        final int plantaBaja = 0;
        final int primeraPlanta = 1;
        final int segundaPlanta = 2;

        final int botonSubirUno = 6;
        final int botonSubirDos = 7;
        final int botonBajarUno = 8;
        final int botonBajarDos = 9;

        int plantaRaw = 0;
        int planta = 0;
        int boton = 0;
        Scanner entrada = new Scanner(System.in);


        System.out.println("En que planta estas? (0=plantaBaja | 1=primeraPlanta | 2=segundaPlanta)");
        plantaRaw = entrada.nextInt();
        System.out.println("Pulsa un boton. (6=botonSubirUno | 7=botonSubirDos | 8=botonBajarUno | 9=botonBajarDos)");
        boton = entrada.nextInt();

        if (plantaRaw == plantaBaja) {
            if (boton == 6) {
                System.out.println("Estas en la planta " + plantaBaja + 1);
            } else if (boton == 7) {
                System.out.println("Estas en la planta " + plantaBaja + 2);
            } else if (boton == 8) {
                System.out.println("No puedes bajar 1 piso, ya estas en la 0 y no hay ninguna planta mas a bajo");
            } else if (boton == 9) {
                System.out.println("No puedes bajar 2 pisos, ya estas en la 0 y no hay ninguna planta mas a bajo");
            } else {
                System.out.println("Disculpe las molestias, ha habido un error");
            }
        }

        if (plantaRaw == primeraPlanta) {
            if (boton == 6) {
                System.out.println("Estas en la planta " + (primeraPlanta + 1));
            } else if (boton == 7) {
                System.out.println("No puedes subir dos pisos, ya estas en la 1 y solo hay uno una planta mas para subir");
            } else if (boton == 8) {
                System.out.println("Estas en la planta " + (primeraPlanta - 1));
            } else if (boton == 9) {
                System.out.println("No puedes bajar 2 pisos, ya estas en la 1 y solo hay una planta mas para bajar");
            } else {
                System.out.println("Disculpe las molestias, ha habido un error");
            }
        }

        if (plantaRaw == segundaPlanta) {
            if (boton == 6) {
                System.out.println("No puedes subir un piso, estas en la planta 2, y no hay mas plantas arriba");
            } else if (boton == 7) {
                System.out.println("No puedes subir dos pisos, estas en la planta 2, y no hay mas plantas arriba");
            } else if (boton == 8) {
                System.out.println("Estas en la planta " + (segundaPlanta - 1));
            } else if (boton == 9) {
                System.out.println("Estas en la planta " + (segundaPlanta - 2));
            } else {
                System.out.println("Disculpe las molestias, ha habido un error");
            }
        }
    }
}