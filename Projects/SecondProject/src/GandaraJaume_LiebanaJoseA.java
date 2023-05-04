import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

/**
 * Programa llista de la compra
 * @author Jaume Gàndara i Jose Antonio Liebana
 * @version 2.0.0
 * @date 25/02/2023
 */
public class GandaraJaume_LiebanaJoseA {
    /**
     * Mètode main que crida al mètode menuPrincipal()
     * @param args de tipus String[]
     * @since 1.4.105
     */
    public static void main(String[] args) {
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Boolean> esComprat = new ArrayList<>();

        menuPrincipal(inputIntMinMax(menu(),"Tipatge incorrecte",1,5,"Valor fora de rang"), index, esComprat);
    }

    /**
     * Mètode amb el menú principal que crida a la resta de mètodes
     * @param opcio de tipus int, que és l'opció de l'usuari de què vol fer
     * @param index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     * @param esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     * @since 1.9.110
     */
    private static void menuPrincipal(int opcio, ArrayList<Integer> index, ArrayList<Boolean> esComprat){
        switch (opcio){
            case 1:
                System.out.println("\n-----Veure llista-----");

                veureLlista(index, esComprat);

                menuPrincipal(inputIntMinMax(menu(),"Tipatge incorrecte",1,5,"Valor fora de rang"), index, esComprat);
                break;
            case 2:
                System.out.println("\n-----Afegir productes a la llista-----\n");

                index = crearLlista(index);
                esComprat = esComprat(index, esComprat);

                menuPrincipal(inputIntMinMax(menu(),"Tipatge incorrecte",1,5,"Valor fora de rang"), index, esComprat);
                break;
            case 3:
                System.out.println("\n-----Editar llista-----");
                int opcio2 = 0;

                int numProductes = mostrarLlista(index, esComprat);
                if (index.size() > 0){
                    int opcio3 = inputIntMinMax("\n\nSeleccioni un producte pel seu número: ","ERROR: Tipatge incorrecte",1,numProductes,"ERROR: Valor fora de rang")-1;
                    opcio2 = inputIntMinMax("Introdueixi que vol fer amb aquell producte:\n\t1. Intercanviar\n\t2. Esborrar\n\t3. Des-ratllar\n\t4. Tornar al menú principal\n\n\t > ","ERROR: Tipatge incorrecte",1,4,"ERROR: Valor fora de rang");

                    if (opcio3 < numProductes){
                        switch (opcio2){
                            case 1:
                                index = intercanviarProducte(index, opcio3);
                                esComprat = desRatllarProducte(esComprat, opcio3);
                                mostrarLlista(index, esComprat);
                                System.out.println("\n");

                                menuPrincipal(inputIntMinMax(menu(),"Tipatge incorrecte",1,5,"Valor fora de rang"), index, esComprat);
                                break;
                            case 2:
                                index = esborrarProducte(index, opcio3);
                                esComprat = esborrarRatllatProducte(esComprat, opcio3);
                                mostrarLlista(index, esComprat);
                                System.out.println("\n");

                                menuPrincipal(inputIntMinMax(menu(),"Tipatge incorrecte",1,5,"Valor fora de rang"), index, esComprat);
                                break;
                            case 3:
                                esComprat = desRatllarProducte(esComprat, opcio3);
                                mostrarLlista(index, esComprat);
                                System.out.println("\n");

                                menuPrincipal(inputIntMinMax(menu(),"Tipatge incorrecte",1,5,"Valor fora de rang"), index, esComprat);
                                break;
                            case 4:
                                System.out.println("Tornant al menú principal...");
                                break;
                        }
                    }else{
                        System.out.println("Tornant al menú principal");
                    }
                }

                menuPrincipal(inputIntMinMax(menu(),"Tipatge incorrecte",1,5,"Valor fora de rang"), index, esComprat);
                break;
            case 4:
                System.out.println("-----Esborrar llista-----\n");

                if (index.size() > 0){
                    esborrarLlistaProductes(index);
                    esborrarLlistaEsComprat(esComprat);
                    System.out.println("Llista esborrada\n");
                }else {
                    System.out.println("No hi han productes a la llista\n");
                }

                menuPrincipal(inputIntMinMax(menu(),"Tipatge incorrecte",1,5,"Valor fora de rang"), index, esComprat);
                break;
            case 5:
                System.out.println("Sortint del programa...");
                break;
        }
    }

    /**
     * Mètode per mostrar el menú principal
     * @since 1.4.103
     * @return menu de tipus String, que és el menú principal
     */
    private static String menu(){
        String menu = "-----Llista de la compra-----\n" +
                "\n\t1. Veure llista" +
                "\n\t2. Crear llista" +
                "\n\t3. Editar llista" +
                "\n\t4. Esborrar llista" +
                "\n\t5. Sortir" +
                "\n\n\t> ";

        return menu;
    }

    /**
     * Mètode per mostrar la llista de la compra i poder ratllar o no productes de la llista (per marcar si estan comprats o no)
     * @param index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     * @param esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     * @since 1.9.110
     * @return esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     */
    private static ArrayList<Boolean> veureLlista(ArrayList<Integer> index, ArrayList<Boolean> esComprat){
        Scanner input = new Scanner(System.in);
        String[][] matriuProductes = matriuProductes();
        int numProductes;
        int opcio = 0;
        float preuTotal;

        do {
            numProductes = mostrarLlista(index, esComprat);

            if (index.size() == 0){
                opcio = numProductes;
            }else {
                preuTotal = sumarPreu(index);

                System.out.println("\n"+numProductes+". Sortir\t\t\t\t\t|\tPreu total\t\t\t\t\t|\t"+preuTotal+"€\t|\tSense IVA\n");

                opcio = inputIntMinMax("Introdueixi el número del producte a ratllar de la llista: ","ERROR: Tipatge incorrecte",1,numProductes,"ERROR: Valor fora de rang");
                if (opcio < (numProductes)){
                    esComprat.set(opcio-1, true);
                }else {
                    break;
                }
            }
        }while(opcio < numProductes);

        if (index.size() > 0){
            System.out.println();
        }
        return esComprat;
    }

    /**
     * Mètode per sumar el preu de tots els productes de la llista de la compra
     * @param index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     * @since 1.9.110
     * @return preuTotal de tipus float, que és la suma del preu de tots els productes de la llista de la compra
     */
    private static float sumarPreu(ArrayList<Integer> index) {
        String[][] productes = matriuProductes();

        int id;
        float preuTotal = 0.0f;

        for (int i = 0; i < index.size(); i++) {
            id = (int)index.get(i);
            float preu = parseFloat(productes[id][2]);
            preuTotal += preu;
        }

        return preuTotal;
    }

    /**
     * Mètode per mostrar tots els productes de la llista
     * @param index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     * @param esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     * @since 1.6.107
     * @return numProductes de tipus int, que és el recompte de productes que hi han
     */
    private static int mostrarLlista(ArrayList<Integer> index, ArrayList<Boolean> esComprat){
        String[][] productes = matriuProductes();
        int numProductes = 1;

        if (index.size() == 0){
            System.out.println("\nNo hi han productes a la llista\n");
        }else {
            for (int i = 0; i < index.size(); i++) {
                System.out.print("\n"+numProductes+":\t");
                int id = (int)index.get(i);
                boolean comprat = esComprat.get(i);
                for (int j = 0; j < index.size(); j++) {
                    switch (j){
                        case 0:
                            if (productes[id][0] == "Verdures-Hortalisses "){
                                System.out.print(productes[id][j] + "\t|\t");
                            }else if (productes[id][0] != "Verdures-Hortalisses ") {
                                System.out.print(productes[id][j] + "\t\t\t\t\t|\t");
                            }
                            break;
                        case 1:
                            if (productes[id][1].length() >= 24){
                                System.out.print(productes[id][j] + "\t|\t");
                            }else if (productes[id][1].length() >= 20) {
                                System.out.print(productes[id][j] + "\t\t|\t");
                            }else if (productes[id][1].length() >= 16) {
                                System.out.print(productes[id][j] + "\t\t\t|\t");
                            }else if (productes[id][1].length() >= 12) {
                                System.out.print(productes[id][j] + "\t\t\t\t|\t");
                            }else if (productes[id][1] == "Manta ") {
                                System.out.print(productes[id][j] + "\t\t\t\t\t\t|\t");
                            }else {
                                System.out.print(productes[id][j] + "\t\t\t\t\t|\t");
                            }
                            break;
                        case 2:
                            System.out.print(productes[id][j]+"€");
                            break;
                    }
                }

                if (!comprat){
                    System.out.print("\t|\tNo comprat");
                }else {
                    System.out.print("\t|\tComprat");
                }

                numProductes++;
            }
        }
        return numProductes;
    }

    /**
     * Aquest mètode crea un ArrayList amb els productes que l'usuari ha escollit i els mostra per pantalla.
     * @since 1.4.104
     * @return opcionesElegidas de tipus ArrayList<String>, que és la llista de la compra de l'usuari
     */
    private static ArrayList<Integer> crearLlista(ArrayList<Integer> indexLlista) {
        Scanner scanner = new Scanner(System.in);

        String[][] llistaProductes = matriuProductes();
        ArrayList<Integer> opcionesElegidas = indexLlista;

        int numProductes;
        int index = -1;

        String ratlla = "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

        do {
            numProductes = mostrarMatriu(matriuProductes());
            index = inputIntMinMax("\nSeleccioni un producte pel seu número: ","ERROR: Tipatge incorrecte",1,numProductes,"ERROR: Valor fora de rang")-1;

            if (index < (numProductes-1)){
                opcionesElegidas.add(index);
            }
        }while (index != (numProductes - 1));
        return opcionesElegidas;
    }

    /**
     * Mètode per ficar tots els productes com no comprats
     * @param indexLlista de tipus ArrayList<Integer>, que surt la id dels productes de la llista
     * @param esComprat de tipus ArrayList<Boolean>, que surt si el producte està comprat o no
     * @since 1.5.107
     * @return esComprat de tipus ArrayList<Boolean>, que surt si el producte està comprat o no
     */
    private static ArrayList<Boolean> esComprat(ArrayList<Integer> indexLlista, ArrayList<Boolean> esComprat){
        String ratlla = "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n";

        for (int i = 0; i < indexLlista.size(); i++) {
            esComprat.add(false);
        }

        System.out.println("\nLlista de la compra:");

        mostrarLlista(indexLlista, esComprat);

        System.out.println("\n\n"+ratlla);

        return esComprat;
    }

    /**
     * Mètode per intercanviar un producte de la llista per un altre
     * @param index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     * @param opcio opcio de tipus int, que és la posició en la llista del producte que es vol intercanviar per un altre
     * @since 2.0.0
     * @return index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     */
    private static ArrayList<Integer> intercanviarProducte(ArrayList<Integer> index, int opcio) {
        String[][] llistaProductes = matriuProductes();
        int numProductes = mostrarMatriu(matriuProductes());
        int opcio2 = inputIntMinMax("\nSeleccioni un producte pel seu número: ","ERROR: Tipatge incorrecte",1,numProductes,"ERROR: Valor fora de rang")-1;

        if (opcio2 < (numProductes-1)){
            index.set(opcio,opcio2);
        }

        return index;
    }

    /**
     * Mètode per de's-ratllar un producte de la llista
     * @paramesComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     * @param opcio de tipus int, que és la posició en la llista del producte que es vol de's-ratllar
     * @return esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     */
    private static ArrayList<Boolean> desRatllarProducte(ArrayList<Boolean> esComprat, int opcio){
        esComprat.set(opcio, false);
        return esComprat;
    }

    /**
     * Mètode per esborrar una posició en específic de l'ArrayList index
     * @param index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     * @param opcio de tipus int, que és la posició en la llista del producte que es vol esborrar
     * @since 2.0.0
     * @return index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     */
    private static ArrayList<Integer> esborrarProducte(ArrayList<Integer> index, int opcio) {
        index.remove(opcio);
        return index;
    }

    /**
     * Mètode per esborrar una posició en específic de l'ArrayList esComprat
     * @param esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     * @param opcio de tipus int, que és la posició en la llista del producte que es vol esborrar
     * @since 2.0.0
     * @return esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     */
    private static ArrayList<Boolean> esborrarRatllatProducte(ArrayList<Boolean> esComprat, int opcio) {
        esComprat.remove(opcio);
        return esComprat;
    }

    /**
     * Un mètode per esborrar tot l'ArrayList index
     * @param index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     * @since 2.0.0
     * @return index de tipus ArrayList<Integer>, que són les id dels productes que hi ha a la llista de la compra
     */
    private static ArrayList<Integer> esborrarLlistaProductes(ArrayList<Integer> index) {
        do {
            index.remove(0);
        }while (index.size() != 0);
        return index;
    }

    /**
     * Un mètode per esborrar tot l'ArrayList esComprat
     * @param esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     * @since 2.0.0
     * @return esComprat de tipus ArrayList<Boolean>, que marca si el producte està comprat o no (ratllat de la llista)
     */
    private static ArrayList<Boolean> esborrarLlistaEsComprat(ArrayList<Boolean> esComprat) {
        do {
            esComprat.remove(0);
        }while (esComprat.size() != 0);
        return esComprat;
    }

    /**
     * Mostra la llista de productes
     * @since 1.4.103
     * @param productes de tipus String[][], que és la matriu que li hem passat
     * @return numProductes de tipus int, que és el recompte de productes que hi ha
     */
    private static int mostrarMatriu(String[][] productes){
        int numProductes = 1;
        for (int i = 0; i < productes.length; i++) {
            System.out.print("\n"+numProductes+":\t");
            for (int j = 0; j < productes[i].length; j++) {
                switch (j){
                    case 0:
                        if (productes[i][0] == "Verdures-Hortalisses "){
                            System.out.print(productes[i][j] + "\t|\t");
                        }else if (productes[i][0] != "Verdures-Hortalisses ") {
                            System.out.print(productes[i][j] + "\t\t\t\t\t|\t");
                        }
                        break;
                    case 1:
                        if (productes[i][1].length() >= 24){
                            System.out.print(productes[i][j] + "\t|\t");
                        }else if (productes[i][1].length() >= 20) {
                            System.out.print(productes[i][j] + "\t\t|\t");
                        }else if (productes[i][1].length() >= 16) {
                            System.out.print(productes[i][j] + "\t\t\t|\t");
                        }else if (productes[i][1].length() >= 12) {
                            System.out.print(productes[i][j] + "\t\t\t\t|\t");
                        }else if (productes[i][1] == "Manta ") {
                            System.out.print(productes[i][j] + "\t\t\t\t\t\t|\t");
                        }else {
                            System.out.print(productes[i][j] + "\t\t\t\t\t|\t");
                        }
                        break;
                    case 2:
                        System.out.print(productes[i][j]+"€");
                        break;
                }
            }
            numProductes++;
        }
        System.out.println("\n"+numProductes + ". Sortir");
        return numProductes;
    }

    /**
     * Aquest mètode serveix per guardar la llista de productes.
     * @since 1.7.109
     * @return llistaProductes de tipus String[][], (Tipus, nom i preu dels productes).
     */
    private static String[][] matriuProductes(){
        String[][] llistaProductes = {
                {"Carn ", "Pit de pollastre 245g ", "4.73"},
                {"Carn ", "Churrasco 212g ", "5.68"},
                {"Carn ", "Secret Ibéric 348g ", "7.19"},
                {"Carn ", "LLom Ibéric 278g ", "4.25"},
                {"Carn ", "Filet de Vedella 289g ", "4.56"},

                {"Peix ", "Lluç 250g ", "6.80"},
                {"Peix ", "Panga 250g ", "5.75"},
                {"Peix ", "Pop 250g ", "7.95"},
                {"Peix ", "Escamarlans 250g ", "7.25"},
                {"Peix ", "Orada 250g ", "6.20"},

                {"Verdures-Hortalisses ", "Tomáquet 100g ", "2.58"},
                {"Verdures-Hortalisses ", "Cogombre 100g ", "2.12"},
                {"Verdures-Hortalisses ", "Enciam 100g ", "1.78"},
                {"Verdures-Hortalisses ", "Patates 100g ", "2.28"},
                {"Verdures-Hortalisses ", "Pastanaga 100g ", "1.25"},

                {"Fruita ", "Préssec 100g ", "2.12"},
                {"Fruita ", "Poma 100g ", "1.98"},
                {"Fruita ", "Pera 100g ", "1.78"},
                {"Fruita ", "Meló 100g ", "1.89"},
                {"Fruita ", "Sandía 100g ", "1.88"},

                {"Lactis ", "Iogurt de Llimona Pack-4 ", "3.68"},
                {"Lactis ", "Iogurt de Maduixa Pack-4 ", "3.68"},
                {"Lactis ", "Natilles Pack-4 ", "3.49"},
                {"Lactis ", "Flan d'ou Pack-4 ", "3.45"},
                {"Lactis ", "Mouse xocolata Pack-4 ", "3.25"},

                {"Beguda ", "Aigua Pack-6 ", "4.66"},
                {"Beguda ", "Suc de Piña 1L ", "2.99"},
                {"Beguda ", "Cervesa Pack-6 ", "5.20"},
                {"Beguda ", "Coca-Cola Vidre Pack-6 ", "6.89"},
                {"Beguda ", "Vi Negre Pata Negra 75 Cl ", "5.99"},

                {"Casa ", "Paper Cuina ", "3.90"},
                {"Casa ", "Tovallons ", "3.60"},
                {"Casa ", "Manta ", "14.95"},
                {"Casa ", "Escombra ", "4.95"},
                {"Casa ", "Pinces Pack-12 ", "5.99"}
        };
        return llistaProductes;
    }

    /**
     * Mètode per llegir un valor int amb control d'errors i amb màxims i mínims
     * @since 1.1.101
     * @param text de tipus String, és el text que se li mostra a l'usuari per demanar-li un valor
     * @param error1 de tipus String, és l'error de tipatge incorrecte
     * @param min de tipus int, és el valor mínim que pot ficar l'usuari
     * @param max de tipus int, és el valor màxim que pot ficar l'usuari
     * @param error2 de tipus String, és l'error de valor fora de rang
     * @return value de tipus int, és el valor que ja ha passat pel control d'errors
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
