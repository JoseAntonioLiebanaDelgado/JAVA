package Matrix;

import java.util.Scanner;

public class MatricesHorarioEscolar {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        final String BLACK = "\033[40m";
        final String RED = "\033[41m";
        final String GREEN = "\033[42m";
        final String YELLOW = "\033[43m";
        final String BLUE = "\033[44m";
        final String PURPLE = "\033[45m";
        final String CYAN = "\033[46m";
        final String GREY = "\033[47m";
        final String RESET = "\u001B[0m";

        final String[] dia = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres"};
        final String[] torn = {"Matí", "Tarda"};
        int opcioPrincipal = 0;
        int opcioSubmenu = 0;
        boolean tipatgeCorrecte = false;

        String[][] horari = new String[2][5];

        horari[0][0] = RED + "Mates" + RESET;
        horari[0][1] = CYAN + "Català" + RESET;
        horari[0][2] = GREY + "Castellà" + RESET;
        horari[0][3] = YELLOW + "Anglès" + RESET;
        horari[0][4] = GREEN + "Ed. Física" + RESET;
        horari[1][0] = BLUE + "Sociales" + RESET;
        horari[1][1] = GREEN + "Naturales" + RESET;
        horari[1][2] = BLACK + "Tecno" + RESET;
        horari[1][3] = PURPLE + "Ed. Plàstica" + RESET;
        horari[1][4] = RESET + "";

        System.out.print("\t");
        for (int i = 0; i < dia.length; i++) {
            System.out.print(GREY + "\t" + dia[i] + " ");
        }

        System.out.println(RESET + "");

        for (int i = 0; i < horari.length; i++) {
            System.out.print(BLUE + torn[i] + "\t" + RESET);
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + horari[i][j] + "]\t");
            }
            System.out.println("");
        }

        do {
            do {
                System.out.println("");
                System.out.println("Que vols veure? (0) Mostra-ho tot (1) Matí (2) Tarda (3) Escull dia a mostrar (4) Sortir");
                //TODO: Control d'errors de tipus de dades (de domini no cal) (ECHO)
                tipatgeCorrecte = llegir.hasNextInt();
                if (tipatgeCorrecte == false) {
                    System.out.println("Error, tipus de dades incorrectes");
                } else {
                    opcioPrincipal = llegir.nextInt();
                }
                llegir.nextLine();
            } while (tipatgeCorrecte == false);


            switch (opcioPrincipal) {
                case 0:
                    //TODO: Fer que mostri tot l'horari (ECHO)
                    System.out.print("\t");
                    for (int i = 0; i < dia.length; i++) {
                        System.out.print(GREY + "\t" + dia[i] + " ");
                    }
                    System.out.println("");
                    for (int i = 0; i < horari.length; i++) {
                        System.out.print(BLUE + torn[i] + "\t" + RESET);
                        for (int j = 0; j < 5; j++) {
                            System.out.print("[" + horari[i][j] + "]\t");
                        }
                        System.out.println("");
                    }
                    break;
                case 1:
                    System.out.println("Tiene escollit matí");
                    for (int i = 0; i < horari[0].length; i++) {
                        System.out.print(horari[0][i] + "\t");
                    }
                    break;
                case 2:
                    System.out.println("Tiene escollit tarda");
                    for (int i = 0; i < horari[1].length; i++) {
                        System.out.print(horari[1][i] + "\t");
                    }
                    break;
                case 3:
                    //TODO: Desenvolupar submenú per escollir dia concret i mostrar-lo (ECHO)
                    do {
                        System.out.println("Escull una opció:" +
                                "\n\t 1)Dilluns" +
                                "\n\t 2)Dimarts" +
                                "\n\t 3)Dimecres" +
                                "\n\t 4)Dijous" +
                                "\n\t 5)Divendres");

                        tipatgeCorrecte = llegir.hasNextInt();
                        if (!tipatgeCorrecte) {
                            System.out.println("Error, valor no numeric");
                        } else {
                            opcioSubmenu = llegir.nextInt();
                            switch (opcioSubmenu) {
                                case 1:
                                    System.out.println(horari[0][0]);
                                    System.out.println(horari[1][0]);
                                    break;
                                case 2:
                                    System.out.println(horari[0][1]);
                                    System.out.println(horari[1][1]);
                                    break;
                                case 3:
                                    System.out.println(horari[0][2]);
                                    System.out.println(horari[1][2]);
                                    break;
                                case 4:
                                    System.out.println(horari[0][3]);
                                    System.out.println(horari[1][3]);
                                    break;
                                case 5:
                                    System.out.println(horari[0][4]);
                                    System.out.println(horari[1][4]);
                                    break;
                                default:
                                    System.out.println("Valor no correcte");
                                    break;
                            }
                        }
                        llegir.nextLine();
                    } while (!tipatgeCorrecte);

                    break;
                case 4:
                    System.out.println("Has escollit sortir");
                    break;
                default:
                    System.out.println("Opción no válida, torna-ho a intentar");
                    break;
            }
        } while (opcioPrincipal != 4);
    }
}
