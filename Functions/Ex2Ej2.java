package Funciones_Corregidas;

//L'encarregada d'una botiga de reparacio de smartphones vol un programa per a poder
//gestionar les reparacions de movils dels seus clients.

//Aquest programa ha de tenir les seguents funcionalitats:

//1.Menu principal amb opcio de sortir.

//2.Donar d'alta una nova reparacio de movil (el programa ha de poder de guardar mes d'una reparacio,
//amb la seguent informacio: numero de reparacio, numero de serie del movil y dni del client(sense lletres)).

//3.Donar d'alta un nou treballador (el programa ha de poder de guardar mes d'un treballador,
//amb la seguent informacio: numero d'empleat, numero de reparacio assignat.(Pot ser null o 0 en cas de que no
//hi hagi cap reparacio pendent en el sistema. Pero en el cas de ser null el numero de reparacio ha d'existir
// dins de la llista de reparacions)).

//4.El recompte de reparacions i treballadors maxims que pot gestionar l'aplicacio l'heu de decicir vosaltres.

//5.S'ha d'implementar un minim de 3 metodes i ha d'incloure controls d'errors.

//6.EL menu principal s'ha d'implementar amb recursivitat.



import java.util.Scanner;

public class Ex2Ej2 {
    /**
     * Mètode main que crida al mètode menuPrincipal()
     * @param args de tipus String[]
     */
    public static void main(String[] args) {
        int[][] informReparacio = new int[9999][3];
        int[][] informTreballador = new int[10][2];
        menuPrincipal(inputIntMinMax("Escull l'opció:\n\t" +
                                "1.- Nova reparació\n\t" +
                                "2.- Nou treballador\n\t" +
                                "3.- Sortir\n\t" +
                                " > ",
                        "ERROR: Tipatge incorrecte",
                        1,
                        3,
                        "ERROR: Valor fora de rang"),
                informTreballador,
                informReparacio);
    }

    /**
     * Mètode amb un menú que crida a la resta de mètodes
     * @param opcio de tipus int, que és l'olpció del menú
     * @param informReparacio de tipus int[], que és l'informació de reparació
     * @param informTreballador de tipus int[], que és l'informació del treballador
     */
    private static void menuPrincipal(int opcio, int[][] informReparacio, int[][] informTreballador) {
        switch (opcio){
            case 1:
                informReparacio = novaReparacio(informReparacio);

                menuPrincipal(inputIntMinMax("Escull l'opció:\n\t" +
                                        "1.- Nova reparació\n\t" +
                                        "2.- Nou treballador\n\t" +
                                        "3.- Sortir\n\t" +
                                        " > ",
                                "ERROR: Tipatge incorrecte",
                                1,
                                3,
                                "ERROR: Valor fora de rang"),
                        informTreballador,
                        informReparacio);
                break;
            case 2:
                informTreballador = nouTreballador(informTreballador);

                menuPrincipal(inputIntMinMax("Escull l'opció:\n\t" +
                                        "1.- Nova reparació\n\t" +
                                        "2.- Nou treballador\n\t" +
                                        "3.- Sortir\n\t" +
                                        " > ",
                                "ERROR: Tipatge incorrecte",
                                1,
                                3,
                                "ERROR: Valor fora de rang"),
                        informTreballador,
                        informReparacio);
                break;
            case 3:
                System.out.println("Sortint del programa");
                break;
        }
    }

    /**
     * Mètode que ompla la matriu informReparacio
     * @param informReparacio de tipus int[], que és l'informació de reparació
     * @return informReparacio de tipus int[], que és l'informació de reparació
     */
    private static int[][] novaReparacio(int[][] informReparacio) {
        for (int i = 0; i < informReparacio.length; i++) {
            System.out.println();
            for (int j = 0; j < informReparacio[i].length; j++) {
                if (informReparacio[i][j] == 0){
                    switch (j){
                        case 0:
                            informReparacio[i][0] = (i+1)*(j+1);
                            break;
                        case 1:
                            informReparacio[i][1] = inputInt("Introdueix el IMEI del mòbil a reparar: ","ERROR: Tipatge incorrecte");
                            break;
                        case 2:
                            informReparacio[i][2] = inputInt("Introdueix el DNI del client: ","ERROR: Tipatge incorrecte");
                            break;
                    }
                }
            }

        }
        return informReparacio;
    }

    /**
     * Mètode que ompla la matriu informEmpleat
     * @param informTreballador de tipus int[], que és l'informació del treballador
     * @return informTreballador  de tipus int[], que és l'informació del treballador
     */
    private static int[][] nouTreballador(int[][] informTreballador) {
        for (int i = 0; i < informTreballador.length; i++) {
            System.out.println();
            for (int j = 0; j < informTreballador[i].length; j++) {
                if (informTreballador[i][j] == 0) {
                    if (j == 0){
                        informTreballador[i][j] = inputInt("Introdueixi el número del treballador","ERROR: Tipatge incorrecte");
                    }else if (j == 1){

                    }
                }
            }
        }
        return informTreballador;
    }

    /**
     * Mètode amb control d'errors de variables int
     * @param text de tipus String, missatge que demana valor
     * @param error de tipus String, missatge d'error per si el valor no té un tipatge correcte
     * @return value de tipus int, que és el valor que ja a passat pel control d'errors
     */
    public static int inputInt(String text, String error){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextInt();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode amb control d'errors de variables int amb màxims i mínims
     * @param text de tipus String, missatge que demana valor
     * @param error1 de tipus String, missatge d'error per si el valor no té un tipatge correcte
     * @param min de tipus int, valor mínim
     * @param max de tipus int, valor màxim
     * @param error2 de tipus String, missatge d'error per si el valor té un valor fora de rang
     * @return value de tipus int, que és el valor que ja a passat pel control d'errors
     */
    private static int inputIntMinMax(String text, String error1,int min, int max, String error2){
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextInt();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}
