package Funciones_Corregidas;

import java.util.Scanner;
import java.lang.Math;

public class LiebanaJoseAntonio_TA01 {

    /**
     * Metode main on fem el menu amb un switch case porque l'usuari pugui escollir una opcio.
     *
     * @param args
     */
    public static void main(String[] args) {

        final String Tres_Salts_Linia = "\n \n \n";
        final String MENU_PRINCIPAL = "1- Calcular l'area d'un quadrat\n" +
                "2- Calcular l'area d'un rectangle\n" +
                "3- Calcular l'area d'un triangle\n" +
                "4- Calcular l'area d'una circunferencia\n" +
                "5- Sortir";

        int opcioMenu = 0;

        System.out.println(Tres_Salts_Linia);
        System.out.println("Benvingut al programa!\n" + "Selecciona una de les seguents opcions si us plau.");

        System.out.println();

        do {
            opcioMenu = llegirEnter(MENU_PRINCIPAL, 1, 5, "ERROR: Valor no enter.\n", "Opcion no valida.\n");
            switch (opcioMenu) {
                case 1:
                    double costat = llegirDouble("Escriu la mida d'un costat del quadrat\n");
                    double resultatAreaQuadrat = areaCuadrat(costat);
                    System.out.println("L'area del quadrat és: " + String.format("%.2f", resultatAreaQuadrat) + "\n");
                    break;
                case 2:
                    double baseRectangle = llegirDouble("Escriu la base del rectangle\n");
                    double alturaRectangle = llegirDouble("Escriu l'altura del rectangle\n");
                    double resultatAreaRectangle = areaRectangle(baseRectangle, alturaRectangle);
                    System.out.println("L'area del rectangle és: " + String.format("%.2f", resultatAreaRectangle) + "\n");
                    break;
                case 3:
                    double baseTriangle = llegirDouble("Escriu la base del triangle\n");
                    double alturaTriangle = llegirDouble("Escriu l'altura del triangle\n");
                    double resultatAreaTriangle = areaTriangle(baseTriangle, alturaTriangle);
                    System.out.println("L'area del triangle és: " + String.format("%.2f", resultatAreaTriangle) + "\n");
                    break;
                case 4:
                    double diametre = llegirDouble("Escriu el diametre de la circunferencia\n");
                    double resultatAreaCircunferencia = areaCircunferencia(diametre);
                    System.out.println("L'area de la circunferencia és: " + String.format("%.2f", resultatAreaCircunferencia) + "\n");
                    break;
                case 5:
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("Opció no vàlida\n");
                    break;
            }
        } while (opcioMenu != 5);
    }

    /**
     * Aquest metode ens serveis per calcular l'area d'un quadrat.
     *
     * @param numero
     * @return area
     */
    public static double areaCuadrat(double numero) {
        double area = Math.pow(numero, 2);
        return area;
    }

    /**
     * Aquest metode ens serveis per calcular l'area d'un rectangle.
     *
     * @param base
     * @param altura
     * @return
     */
    public static double areaRectangle(double base, double altura) {
        double area = (base * altura);
        return area;
    }

    /**
     * Aquest metode ens serveis per calcular l'area d'un triangle.
     *
     * @param base
     * @param altura
     * @return
     */
    public static double areaTriangle(double base, double altura) {
        double area = ((base * altura) / 2);
        return area;
    }

    /**
     * Aquest metode ens serveis per calcular l'area d'una circunferencia.
     *
     * @param numDiametre
     * @return
     */
    public static double areaCircunferencia(double numDiametre) {
        double radio = (numDiametre / 2);
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    /**
     * Aquest metode ens serveix per fer un control de errors de tipus Int.
     *
     * @param missatge
     * @param min
     * @param max
     * @param mensaje_error
     * @param opcion_invalida
     * @return
     */
    public static int llegirEnter(String missatge, int min, int max, String mensaje_error, String opcion_invalida) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte) {
                System.out.println(mensaje_error);
                llegir.nextLine();
            } else {
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println(opcion_invalida);
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);
        return x;
    }

    /**
     * Aquest metode ens serveix per fer un control de errors de tipus Double.
     *
     * @param missatge
     * @return
     */
    public static double llegirDouble(String missatge) {
        Scanner llegir = new Scanner(System.in);
        double x = 0;
        boolean valorCorrecte = false;
        do {
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextDouble();
            if (valorCorrecte) {
                x = llegir.nextDouble();
                llegir.nextLine();
                if (x < 0) {
                    System.out.println("ERROR: El valor ha de ser superior a 0.\n");
                    valorCorrecte = false;
                }
            } else {
                llegir.nextLine();
                System.out.println("ERROR: Valor no numeric.\n");
            }
        } while (!valorCorrecte);
        return x;
    }
}

