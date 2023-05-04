package FirstJavaProject;

import java.util.*;

public class TeamBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //TODO: EXPLICACION DEL FLUJO DEL PROYECTO:
        //TODO: Al iniciar el programa imprimirá un menú con 4 opciones disponibles para que el usuario pueda elegir.
        //   -
        // 1 - Jugar:
        //     El juego principal empezará.
        //     El juego consiste en crear un equipo Pokémon y obtener la máxima puntuación posible. Puedes intentar superarte
        //     a ti mismo/a o puedes competir con quien te apetezca para ver a quien se le ocurre la mejor estrategia y
        //     forma el mejor equipo para obtener la mayor puntuación junto con la victoria.
        //     El usuario podrá seleccionar el mismo Pokémon de la misma lista para que crear su equipo (Siempre que las
        //     monedas y las vacantes se lo permiten) ya que realmente puedes crear tu equipo con 6 Pokémon iguales.
        //     Importante: Al no estar visible el poder del Pokémon en partida el resultado no se va a poder trampear.
        //     -
        // 2 - Ver los resultados de las 10 últimas partidas:
        //     Ésta opción mostrará los 10 últimos resultados obtenidos en las 10 últimas partidas jugadas.
        //     -
        // 3 - Ver la lista de Pokemon:
        //     Ésta opción se encargará de mostrar la lista de Pokémon.
        //     El usuario decidirá a través de un submenú como desea visualizar la lista:
        //     (Con sólo los nombres) o (Con los nombre y poder).
        //     -
        // 4 - Salir:
        //     Cuándo el usuario seleccione la opción de "Salir" el programa finalizará y el resultado de las partidas guardadas
        //     se reseteará.
        //     -*/


        //TODO: COSAS A MEJORAR (NO INFLUYEN EN LA PARTIDA)
        // -
        // 1. Cuando llega el momento de que el usuario tiene que elegir Pokemon, el programa puede mostrar el mismo Pokémon
        //    mas de una vez en la misma lista.
        //    Importante: Al no estar visible el poder del Pokémon en partida el resultado no se va a poder trampear.
        // -


        //TODO: Creamos 5 matrices, cada una con un valor diferente de monedas (1-5) y 30 Pokemon con su respectivo poder dentro de ellas.
        String[][] matrixPokemonUnaMoneda = {{"Pancham ", "3"}, {"Yungoos ", "2"}, {"Rookidee ", "3"}, {"Pidgey ", "3"}, {"Ratata ", "2"}, {"Caterpie ", "1"}, {"Weedle ", "1"}, {"Igglybuff ", "1"}, {"Diglet ", "2"}, {"Abra ", "2"}, {"Bellesprout ", "3"}, {"Geoodude ", "3"}, {"Magnemite ", "4"}, {"Gible ", "4"}, {"Horsea ", "2"}, {"Shroomish ", "4"}, {"Starly ", "1"}, {"Bidoof ", "1"}, {"Poochyena ", "2"}, {"Sentret ", "1"}, {"Togepi ", "2"}, {"Pichu ", "2"}, {"zubat ", "2"}, {"Gastly ", "5"}, {"Cleffa ", "1"}, {"Azurill ", "2"}, {"Mudbray ", "5"}, {"Seedot ", "1"}, {"Wurmple ", "1"}, {"Zidzagon ", "2"}};
        String[][] matrixPokemonDosMonedas = {{"Nidoran-H ", "5"}, {"Nidoran-M ", "5"}, {"Growlithe ", "7"}, {"Cubone ", "5"}, {"Toxel ", "4"}, {"Phanphy ", "3"}, {"Elekid ", "8"}, {"Magby ", "8"}, {"Ralts ", "4"}, {"Marill ", "4"}, {"Nosepass ", "4"}, {"Pulse ", "3"}, {"Minum ", "3"}, {"Gulpin ", "3"}, {"Trapinch ", "3"}, {"Beldum ", "6"}, {"Bagon ", "6"}, {"Larvitar ", "6"}, {"Shinx ", "5"}, {"Combee ", "5"}, {"Buizel ", "6"}, {"Buneary ", "3"}, {"Riolu ", "7"}, {"Pansaje-P ", "5"}, {"Pansaje-F ", "5"}, {"Pansaje_A ", "5"}, {"Roggenrola ", "4"}, {"Dribur ", "6"}, {"Timbur ", "6"}, {"Darumaka ", "6"}};
        String[][] matrixPokemonTresMonedas = {{"Raticate ", "5"}, {"Golbat ", "5"}, {"Parasect ", "6"}, {"Kadabra ", "6"}, {"Glaveler ", "6"}, {"Hitmonlee ", "8"}, {"Hitmonchan ", "8"}, {"Seaking ", "8"}, {"Pinsir ", "8"}, {"Mr.Mime ", "7"}, {"Scyther ", "9"}, {"Starmie ", "10"}, {"Tauros ", "8"}, {"Sawk ", "8"}, {"Ariados ", "5"}, {"Sudowoodo ", "6"}, {"Simisage ", "7"}, {"Simisear ", "7"}, {"Simipour ", "7"}, {"Torkoal ", "8"}, {"Wishcash ", "8"}, {"Greedent ", "5"}, {"Hawlucha ", "11"}, {"Gabite ", "10"}, {"Gurdur ", "10"}, {"Morgrem ", "9"}, {"Drakloak ", "9"}, {"Drednaw ", "9"}, {"Dubwool ", "5"}, {"Corvisquire ", "9"}};
        String[][] matrixPokemonCuatroMonedas = {{"Nidoqueen ", "13"}, {"Nidoking ", "13"}, {"Slowbro ", "8"}, {"Villeplume ", "7"}, {"Ductrio ", "8"}, {"Magneton ", "10"}, {"Kangaskhan ", "11"}, {"Lapras ", "12"}, {"Snorlax ", "12"}, {"Pitgeot ", "13"}, {"Mightyena ", "10"}, {"Altaria ", "10"}, {"Walrein ", "8"}, {"Krokorok ", "7"}, {"Darmanitan ", "9"}, {"Zoroark ", "8"}, {"Haxorus ", "10"}, {"Golurk ", "9"}, {"Pyroar ", "8"}, {"Nolvern ", "7"}, {"Musdale ", "14"}, {"Bewear ", "13"}, {"Golisopod ", "11"}, {"Ursaluna ", "10"}, {"Basculegion ", "9"}, {"Kleavor ", "10"}, {"Zeraora ", "8"}, {"Trevenant ", "7"}, {"Gyarados ", "13"}, {"Barabacle ", "8"}};
        String[][] matrixPokemonCincoMonedas = {{"Arcanine ", "16"}, {"Alakazam ", "11"}, {"Machamp ", "9"}, {"Slowking ", "12"}, {"Stelix ", "17"}, {"Corviniknight ", "13"}, {"Dragonite ", "11"}, {"Gengar ", "14"}, {"Scizor ", "15"}, {"Kindra ", "10"}, {"Tiranitar ", "13"}, {"Metagross ", "9"}, {"Salamance ", "15"}, {"Lucario ", "12"}, {"Magnezon ", "14"}, {"Rhyperior ", "17"}, {"Electrivite ", "14"}, {"Magmortar ", "14"}, {"Gallade ", "10"}, {"Excadrill ", "16"}, {"Conkeldurr ", "15"}, {"Hydrelgon ", "9"}, {"Crobat ", "13"}, {"Grimmsnarl ", "14"}, {"Dragapult ", "17"}, {"Dusknoir ", "13"}, {"Garchomp ", "14"}, {"Raikou ", "15"}, {"Entei ", "16"}, {"Suicune ", "15"}};

        //TODO: Declaramos/Iniciamos variables
        final String tresSaltosDeLinea = "\n" +
                "\n" +
                "\n";

        boolean tipatgeCorrecte = false;
        boolean debeVolverAElegir = true;

        int opcionMenuPrincipal = 0;
        int opcionJugar = 0;
        int opcionlistas = 0;
        int numRandom = 0;
        int opcionListasValores = 0;
        int saldoParaComprar = 15;
        int vacantesDisponibles = 6;
        int sumaPuntosDePartida = 0;
        int[] listaPuntuacionesDePartidas = new int[10];
        int numeroPartida = 0;

        System.out.println(tresSaltosDeLinea);
        System.out.println("=================================");
        System.out.println("| Bienvenido a --Team Builder-- |");
        System.out.println("=================================");
        System.out.println();


        //TODO: Empezamos menu principal
        do {
            do {
                System.out.println("Seleccione una opcion por favor: \n" +
                        "\n" +
                        " 1. Jugar\n" +
                        " 2. Ver resultados de las ultimas 10 partidas\n" +
                        " 3. Ver lista de Pokemon\n" +
                        " 4. Salir");
                tipatgeCorrecte = input.hasNextInt();
                if (!tipatgeCorrecte) {
                    System.out.println("Error, valor no numeric, selecione una opcion entre 1 y 4 por favor");
                } else {
                    opcionMenuPrincipal = input.nextInt();
                    if (opcionMenuPrincipal < 1 || opcionMenuPrincipal > 4) {
                        System.out.println("Error, selecione una opcion entre 1 y 4 por favor");
                        tipatgeCorrecte = false;
                    }
                }
                input.nextLine();
            } while (tipatgeCorrecte == false);

            //TODO: Opcion 1 (Jugar)
            switch (opcionMenuPrincipal) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("Bienvenido, selecione si desea prodecer a la eleccion o volver hacia el menu principal: \n" +
                                "\n" +
                                "1. Elegir Pokemon (Si selecciona esta opcion no podra volver al menu principal hasta que haya " +
                                "creado almenos un equipo Pokemon). \n" +
                                "2. Volver al menu principal \n");
                        tipatgeCorrecte = input.hasNextInt();
                        if (!tipatgeCorrecte) {
                            System.out.println("Error, valor no numeric, selecione una opcion entre 1 y 2 por favor");
                        } else {
                            opcionJugar = input.nextInt();
                            if (opcionJugar < 1 || opcionJugar > 2) {
                                System.out.println("Error, selecione una opcion entre 1 y 2 por favor");
                                tipatgeCorrecte = false;
                            }
                        }
                        input.nextLine();
                    } while (tipatgeCorrecte == false);

                    if (opcionJugar == 1) {
                        numeroPartida++;
                        System.out.println("A continuacion le mostramos las opciones disponibles.\n" +
                                "Dispone de 6 vacantes y 15 monedas para crear su equipo y conseguir la maxima puntuacion posible, elija sabiamente su estrategia");
                        System.out.println();

                        //TODO: Mostramos todas las listas (1, 2, 3, 4 y 5 monedas)
                        //TODO: Mostrar lista 1 moneda
                        String[][] matrizPartidaValor1 = new String[5][2];

                        for (int i = 0; i < 5; i++) {
                            numRandom = (int) Math.round(Math.random() * 29);
                            for (int j = 0; j < 2; j++) {
                                matrizPartidaValor1[i][j] = matrixPokemonUnaMoneda[numRandom][j];
                            }
                        }
                        System.out.println("LISTA POKEMON VALOR 1");
                        System.out.println("-------------------------");

                        for (int i = 0; i < matrizPartidaValor1.length; i++) {
                            System.out.println(matrizPartidaValor1[i][0]);
                        }
                        //TODO: Mostrar lista 2 moneda
                        String[][] matrizPartidaValor2 = new String[5][2];

                        for (int i = 0; i < 5; i++) {
                            numRandom = (int) Math.round(Math.random() * 29);
                            for (int j = 0; j < 2; j++) {
                                matrizPartidaValor2[i][j] = matrixPokemonDosMonedas[numRandom][j];
                            }
                        }
                        System.out.println();
                        System.out.println("LISTA POKEMON VALOR 2");
                        System.out.println("-------------------------");

                        for (int i = 0; i < matrizPartidaValor2.length; i++) {
                            System.out.println(matrizPartidaValor2[i][0]);
                        }
                        //TODO: Mostrar lista 3 moneda
                        String[][] matrizPartidaValor3 = new String[5][2];

                        for (int i = 0; i < 5; i++) {
                            numRandom = (int) Math.round(Math.random() * 29);
                            for (int j = 0; j < 2; j++) {
                                matrizPartidaValor3[i][j] = matrixPokemonTresMonedas[numRandom][j];
                            }
                        }
                        System.out.println();
                        System.out.println("LISTA POKEMON VALOR 3");
                        System.out.println("-------------------------");

                        for (int i = 0; i < matrizPartidaValor3.length; i++) {
                            System.out.println(matrizPartidaValor3[i][0]);
                        }
                        //TODO: Mostrar lista 4 monedas
                        String[][] matrizPartidaValor4 = new String[5][2];

                        for (int i = 0; i < 5; i++) {
                            numRandom = (int) Math.round(Math.random() * 29);
                            for (int j = 0; j < 2; j++) {
                                matrizPartidaValor4[i][j] = matrixPokemonCuatroMonedas[numRandom][j];
                            }
                        }
                        System.out.println();
                        System.out.println("LISTA POKEMON VALOR 4");
                        System.out.println("-------------------------");

                        for (int i = 0; i < matrizPartidaValor4.length; i++) {
                            System.out.println(matrizPartidaValor4[i][0]);
                        }
                        System.out.println();
                        //TODO: Mostrar lista 5 monedas
                        String[][] matrizPartidaValor5 = new String[5][2];

                        for (int i = 0; i < 5; i++) {
                            numRandom = (int) Math.round(Math.random() * 29);
                            for (int j = 0; j < 2; j++) {
                                matrizPartidaValor5[i][j] = matrixPokemonCincoMonedas[numRandom][j];
                            }
                        }
                        System.out.println("LISTA POKEMON VALOR 5");
                        System.out.println("-------------------------");

                        for (int i = 0; i < matrizPartidaValor5.length; i++) {
                            System.out.println(matrizPartidaValor5[i][0]);
                        }

                        do {
                            //TODO: Creamos un switch case para que el usuario pueda acceder a la lista que desee libremente
                            System.out.println();
                            do {
                                System.out.println("Seleccione una opcion para elegir la lista a la que desea acceder. \n" +
                                        "\n" +
                                        "Pulse -1- para acceder a la lista de pokemons de coste (1 moneda). \n" +
                                        "Pulse -2- para acceder a la lista de pokemons de coste (2 moneda). \n" +
                                        "Pulse -3- para acceder a la lista de pokemons de coste (3 moneda). \n" +
                                        "Pulse -4- para acceder a la lista de pokemons de coste (4 moneda). \n" +
                                        "Pulse -5- para acceder a la lista de pokemons de coste (5 moneda). \n" +
                                        "-----------------------------------------------------------------------\n" +
                                        "Una vez dentro de una lista, puede volver hacia atras introduciendo -6-\n" +
                                        "-----------------------------------------------------------------------\n");

                                tipatgeCorrecte = input.hasNextInt();
                                if (!tipatgeCorrecte) {
                                    System.out.println("Error, valor no numerico, selecione una opcion entre 1 y 4 por favor");
                                } else {
                                    opcionListasValores = input.nextInt();
                                    if (opcionListasValores < 1 || opcionListasValores > 5) {
                                        System.out.println("Error, selecione una opcion entre 1 y 5 por favor");
                                        tipatgeCorrecte = false;
                                    } else if ((saldoParaComprar - opcionListasValores) < 0) {
                                        System.out.println("Error, no dispone de suficientes monedas para elegir un Pokemon de la lista " + opcionListasValores + " monedas");
                                        tipatgeCorrecte = false;
                                    }
                                }
                                input.nextLine();
                            } while (tipatgeCorrecte == false);
                            switch (opcionListasValores) {

                                case 1:
                                    int numeradorLista1 = 0;
                                    //TODO: Case 1- Mostrar lista 1 moneda
                                    System.out.println();
                                    for (int i = 0; i < matrizPartidaValor1.length; i++) {
                                        numeradorLista1++;
                                        System.out.println(numeradorLista1 + ". " + matrizPartidaValor1[i][0]);
                                    }
                                    System.out.println("6. Volver hacia atras");
                                    //TODO: Elegir Pokemon de la lista 1 moneda
                                    int opcionPosicionPokemonListaCosteUno = 0;

                                    //TODO: Control de errores opcionPosicionPokemonListaCosteUno
                                    do {
                                        System.out.println();
                                        System.out.println("Elija una de las 6 opciones por favor");
                                        tipatgeCorrecte = input.hasNextInt();

                                        if (!tipatgeCorrecte) {
                                            System.out.println("ERROR: Valor incorrecto! Introduzca un numero por favor");
                                            System.out.println();
                                            for (int i = 0; i < matrizPartidaValor1.length; i++) {
                                                System.out.println(matrizPartidaValor1[i][0]);
                                            }
                                        } else {
                                            opcionPosicionPokemonListaCosteUno = input.nextInt();
                                            if (opcionPosicionPokemonListaCosteUno < 1 || opcionPosicionPokemonListaCosteUno > 6) {
                                                System.out.println("ERROR: Valor incorrecto! Introduzca un valor del 1 al 6 por favor");
                                                System.out.println();
                                                for (int i = 0; i < matrizPartidaValor1.length; i++) {
                                                    System.out.println(matrizPartidaValor1[i][0]);
                                                }
                                                tipatgeCorrecte = false;
                                            }
                                        }
                                        input.nextLine();
                                    } while (!tipatgeCorrecte);

                                    switch (opcionPosicionPokemonListaCosteUno) {
                                        case 1:
                                            System.out.print(matrizPartidaValor1[0][0]);
                                            System.out.println();
                                            int safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor1[0][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 2:
                                            System.out.print(matrizPartidaValor1[1][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor1[1][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 3:
                                            System.out.print(matrizPartidaValor1[2][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor1[2][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 4:
                                            System.out.print(matrizPartidaValor1[3][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor1[3][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 5:
                                            System.out.print(matrizPartidaValor1[4][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor1[4][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 6:
                                            System.out.println("De acuerdo, volvemos a la eleccion de las listas");
                                            saldoParaComprar++;
                                            vacantesDisponibles++;
                                            break;
                                        default:
                                            System.out.println("Entra Default");
                                            break;
                                    }
                                    System.out.println();
                                    //TODO: Restamos 1 moneda por ronda y una vacante disponible en el equipo
                                    saldoParaComprar--;
                                    vacantesDisponibles--;
                                    break;

                                case 2:
                                    int numeradorLista2 = 0;
                                    //TODO: CASE 2 - Mostrar lista 2 monedas
                                    System.out.println();
                                    for (int i = 0; i < matrizPartidaValor2.length; i++) {
                                        numeradorLista2++;
                                        System.out.println(numeradorLista2 + ". " + matrizPartidaValor2[i][0]);
                                    }
                                    System.out.println("6. Volver hacia atras");
                                    //TODO: Elegir pokemon de lista 2 monedas
                                    int opcionPosicionPokemonListaCosteDos = 0;
                                    //TODO: Control de errores opcionPosicionPokemonListaCosteDos
                                    do {
                                        System.out.println();
                                        System.out.println("Elija una de las 6 opciones por favor");
                                        tipatgeCorrecte = input.hasNextInt();

                                        if (!tipatgeCorrecte) {
                                            System.out.println("ERROR: Valor incorrecto! Introduzca un numero por favor");
                                            System.out.println();
                                            for (int i = 0; i < matrizPartidaValor2.length; i++) {
                                                System.out.println(matrizPartidaValor2[i][0]);
                                            }
                                        } else {
                                            opcionPosicionPokemonListaCosteDos = input.nextInt();
                                            if (opcionPosicionPokemonListaCosteDos < 1 || opcionPosicionPokemonListaCosteDos > 6) {
                                                System.out.println("ERROR: Valor incorrecto! Introduzca un valor del 1 al 6 por favor");
                                                System.out.println();
                                                for (int i = 0; i < matrizPartidaValor2.length; i++) {
                                                    System.out.println(matrizPartidaValor2[i][0]);
                                                }
                                                tipatgeCorrecte = false;
                                            }
                                        }
                                        input.nextLine();
                                    } while (!tipatgeCorrecte);

                                    switch (opcionPosicionPokemonListaCosteDos) {
                                        case 1:
                                            System.out.print(matrizPartidaValor2[0][0]);
                                            System.out.println();
                                            int safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor2[0][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 2:
                                            System.out.print(matrizPartidaValor2[1][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor2[1][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 3:
                                            System.out.print(matrizPartidaValor2[2][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor2[2][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 4:
                                            System.out.print(matrizPartidaValor2[3][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor2[3][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 5:
                                            System.out.print(matrizPartidaValor2[4][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor2[4][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 6:
                                            System.out.println("De acuerdo, volvemos a la eleccion de las listas");
                                            saldoParaComprar += 2;
                                            vacantesDisponibles++;
                                            break;
                                        default:
                                            System.out.println("Entra Default");
                                            break;
                                    }
                                    System.out.println();
                                    //TODO: Restamos 2 monedas por ronda y una vacante disponible en el equipo
                                    saldoParaComprar -= 2;
                                    vacantesDisponibles--;
                                    break;
                                case 3:
                                    int numeradorLista3 = 0;
                                    //TODO: CASE 3 - Mostrar lista 3 monedas
                                    System.out.println();
                                    for (int i = 0; i < matrizPartidaValor3.length; i++) {
                                        numeradorLista3++;
                                        System.out.println(numeradorLista3 + ". " + matrizPartidaValor3[i][0]);
                                    }
                                    System.out.println("6. Volver hacia atras");
                                    //TODO: Elegir pokemon de lista 3 monedas
                                    int opcionPosicionPokemonListaCosteTres = 0;
                                    //TODO: Control de errores opcionPosicionPokemonListaCosteTres
                                    do {
                                        System.out.println();
                                        System.out.println("Elija una de las 6 opciones por favor");
                                        tipatgeCorrecte = input.hasNextInt();

                                        if (!tipatgeCorrecte) {
                                            System.out.println("ERROR: Valor incorrecto! Introduzca un numero por favor");
                                            System.out.println();
                                            for (int i = 0; i < matrizPartidaValor3.length; i++) {
                                                System.out.println(matrizPartidaValor3[i][0]);
                                            }
                                        } else {
                                            opcionPosicionPokemonListaCosteTres = input.nextInt();
                                            if (opcionPosicionPokemonListaCosteTres < 1 || opcionPosicionPokemonListaCosteTres > 6) {
                                                System.out.println("ERROR: Valor incorrecto! Introduzca un valor del 1 al 6 por favor");
                                                System.out.println();
                                                for (int i = 0; i < matrizPartidaValor3.length; i++) {
                                                    System.out.println(matrizPartidaValor3[i][0]);
                                                }
                                                tipatgeCorrecte = false;
                                            }
                                        }
                                        input.nextLine();
                                    } while (!tipatgeCorrecte);

                                    switch (opcionPosicionPokemonListaCosteTres) {
                                        case 1:
                                            System.out.print(matrizPartidaValor3[0][0]);
                                            System.out.println();
                                            int safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor3[0][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 2:
                                            System.out.print(matrizPartidaValor3[1][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor3[1][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 3:
                                            System.out.print(matrizPartidaValor3[2][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor3[2][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 4:
                                            System.out.print(matrizPartidaValor3[3][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor3[3][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 5:
                                            System.out.print(matrizPartidaValor3[4][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor3[4][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 6:
                                            System.out.println("De acuerdo, volvemos a la eleccion de las listas");
                                            saldoParaComprar += 3;
                                            vacantesDisponibles++;
                                            break;
                                        default:
                                            System.out.println("Entra Default");
                                            break;
                                    }
                                    System.out.println();
                                    //TODO: Restamos 3 monedas por ronda y una vacante disponible en el equipo
                                    saldoParaComprar -= 3;
                                    vacantesDisponibles--;
                                    break;
                                case 4:
                                    int numeradorLista4 = 0;
                                    //TODO: CASE 4 - Mostrar lista 4 monedas
                                    System.out.println();
                                    for (int i = 0; i < matrizPartidaValor4.length; i++) {
                                        numeradorLista4++;
                                        System.out.println(numeradorLista4 + ". " + matrizPartidaValor4[i][0]);
                                    }
                                    System.out.println("6. Volver hacia atras");
                                    //TODO: Elegir pokemon de lista 4 monedas
                                    int opcionPosicionPokemonListaCosteCuatro = 0;
                                    //TODO: Control de errores opcionPosicionPokemonListaCosteCuatro
                                    do {
                                        System.out.println();
                                        System.out.println("Elija una de las 6 opciones por favor");
                                        tipatgeCorrecte = input.hasNextInt();

                                        if (!tipatgeCorrecte) {
                                            System.out.println("ERROR: Valor incorrecto! Introduzca un numero por favor");
                                            System.out.println();
                                            for (int i = 0; i < matrizPartidaValor4.length; i++) {
                                                System.out.println(matrizPartidaValor4[i][0]);
                                            }
                                        } else {
                                            opcionPosicionPokemonListaCosteCuatro = input.nextInt();
                                            if (opcionPosicionPokemonListaCosteCuatro < 1 || opcionPosicionPokemonListaCosteCuatro > 6) {
                                                System.out.println("ERROR: Valor incorrecto! Introduzca un valor del 1 al 6 por favor");
                                                System.out.println();
                                                for (int i = 0; i < matrizPartidaValor4.length; i++) {
                                                    System.out.println(matrizPartidaValor4[i][0]);
                                                }
                                                tipatgeCorrecte = false;
                                            }
                                        }
                                        input.nextLine();
                                    } while (!tipatgeCorrecte);

                                    switch (opcionPosicionPokemonListaCosteCuatro) {
                                        case 1:
                                            System.out.print(matrizPartidaValor4[0][0]);
                                            System.out.println();
                                            int safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor4[0][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 2:
                                            System.out.print(matrizPartidaValor4[1][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor4[1][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 3:
                                            System.out.print(matrizPartidaValor4[2][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor4[2][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 4:
                                            System.out.print(matrizPartidaValor4[3][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor4[3][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 5:
                                            System.out.print(matrizPartidaValor4[4][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor4[4][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 6:
                                            System.out.println("De acuerdo, volvemos a la eleccion de las listas");
                                            saldoParaComprar += 4;
                                            vacantesDisponibles++;
                                            break;
                                        default:
                                            System.out.println("Entra Default");
                                            break;
                                    }
                                    System.out.println();
                                    //TODO: Restamos 4 monedas por ronda y una vacante disponible en el equipo
                                    saldoParaComprar -= 4;
                                    vacantesDisponibles--;
                                    break;
                                case 5:
                                    int numeradorLista5 = 0;
                                    //TODO: CASE 5 - Mostrar lista 5 monedas
                                    System.out.println();
                                    for (int i = 0; i < matrizPartidaValor5.length; i++) {
                                        numeradorLista5++;
                                        System.out.println(numeradorLista5 + ". " + matrizPartidaValor5[i][0]);
                                    }
                                    System.out.println("6. Volver hacia atras");
                                    //TODO: Elegir pokemon de lista 5 monedas
                                    int opcionPosicionPokemonListaCosteCinco = 0;
                                    //TODO: Control de errores opcionPosicionPokemonListaCosteCinco
                                    do {
                                        System.out.println();
                                        System.out.println("Elija una de las 6 opciones por favor");
                                        tipatgeCorrecte = input.hasNextInt();

                                        if (!tipatgeCorrecte) {
                                            System.out.println("ERROR: Valor incorrecto! Introduzca un numero por favor");
                                            System.out.println();
                                            for (int i = 0; i < matrizPartidaValor5.length; i++) {
                                                System.out.println(matrizPartidaValor5[i][0]);
                                            }
                                        } else {
                                            opcionPosicionPokemonListaCosteCinco = input.nextInt();
                                            if (opcionPosicionPokemonListaCosteCinco < 1 || opcionPosicionPokemonListaCosteCinco > 6) {
                                                System.out.println("ERROR: Valor incorrecto! Introduzca un valor del 1 al 6 por favor");
                                                System.out.println();
                                                for (int i = 0; i < matrizPartidaValor5.length; i++) {
                                                    System.out.println(matrizPartidaValor5[i][0]);
                                                }
                                                tipatgeCorrecte = false;
                                            }
                                        }
                                        input.nextLine();
                                    } while (!tipatgeCorrecte);

                                    switch (opcionPosicionPokemonListaCosteCinco) {
                                        case 1:
                                            System.out.print(matrizPartidaValor5[0][0]);
                                            System.out.println();
                                            int safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor5[0][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 2:
                                            System.out.print(matrizPartidaValor5[1][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor5[1][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 3:
                                            System.out.print(matrizPartidaValor5[2][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor5[2][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 4:
                                            System.out.print(matrizPartidaValor5[3][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor5[3][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 5:
                                            System.out.print(matrizPartidaValor5[4][0]);
                                            System.out.println();
                                            safePuntosDePokemonElegido = Integer.parseInt(matrizPartidaValor5[4][1]);
                                            sumaPuntosDePartida += safePuntosDePokemonElegido;
                                            break;
                                        case 6:
                                            System.out.println("De acuerdo, volvemos a la eleccion de las listas");
                                            saldoParaComprar += 5;
                                            vacantesDisponibles++;
                                            break;
                                        default:
                                            System.out.println("Entra Default");
                                            break;
                                    }
                                    System.out.println();
                                    //TODO: Restamos 5 monedas por ronda y una vacante disponible en el equipo
                                    saldoParaComprar -= 5;
                                    vacantesDisponibles--;
                                    break;
                                default:
                                    System.out.println("Valor no correcto");
                                    break;
                            }

                            System.out.println("Saldo disponible: " + saldoParaComprar + " monedas");
                            System.out.println("Vacantes disponibles: " + vacantesDisponibles);

                            if (saldoParaComprar <= 0 || vacantesDisponibles <= 0) {
                                debeVolverAElegir = false;
                            }
                        } while (debeVolverAElegir);

                        if (saldoParaComprar == 0) {
                            System.out.println("Ha agotado todas sus monedas, procedemos a la suma de poderes");
                            System.out.println();
                            System.out.println("El poder global de tu equipo es: " + sumaPuntosDePartida + " puntos");
                            System.out.println();
                            System.out.println("====================== FIN DE PARTIDA ======================");
                            System.out.println();
                            listaPuntuacionesDePartidas[numeroPartida - 1] = sumaPuntosDePartida;
                            //TODO: Reseteamos saldo, vacantes y puntos de partida para la siguiente ronda
                            saldoParaComprar = 15;
                            vacantesDisponibles = 6;
                            sumaPuntosDePartida = 0;
                            debeVolverAElegir = true;
                            break;
                        } else if (vacantesDisponibles == 0) {
                            System.out.println("Ha agotado todas sus vacantes para el equipo");
                            System.out.println();
                            System.out.println("El poder global de tu equipo es de: " + sumaPuntosDePartida + " puntos");
                            System.out.println();
                            System.out.println("====================== FIN DE PARTIDA ======================");
                            System.out.println();
                            listaPuntuacionesDePartidas[numeroPartida - 1] = sumaPuntosDePartida;
                            //TODO: Reseteamos saldo, vacantes y puntos de partida para la siguiente ronda
                            saldoParaComprar = 15;
                            vacantesDisponibles = 6;
                            sumaPuntosDePartida = 0;
                            debeVolverAElegir = true;
                            break;
                        }
                        // TODO: Volver al menu principal
                    } else if (opcionJugar == 2) {
                        System.out.println("De acuerdo, volvemos al menu principal");
                        System.out.println();
                    }
                    break;

                case 2:
                    int numeracionPartidas = 0;
                    System.out.println();
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Los resultados de las ultimas 10 partidas son los siguientes :");
                    System.out.println("--------------------------------------------------------------");

                    for (int i = 0; i < listaPuntuacionesDePartidas.length; i++) {
                        numeracionPartidas++;
                        if (listaPuntuacionesDePartidas[i] != 0) {
                            System.out.println(numeracionPartidas + " partida :  " + listaPuntuacionesDePartidas[i] + " puntos");
                        }
                    }
                    System.out.println("--------------------------------------------------------------");
                    System.out.println();
                    break;
                case 3:

                    System.out.println("Ha seleccionado usted Ver lista de Pokemon, seleccione el modo de visualizacion o volver hacia el menu principal:");
                    System.out.println();
                    do {
                        System.out.println(
                                "1. Ver lista de Pokémon sin poder (Nombre) \n" +
                                        "2. Ver lista de Pokémon con poder (Nombre y poder) \n" +
                                        "3. Volver hacia el menu principal");
                        tipatgeCorrecte = input.hasNextInt();
                        if (!tipatgeCorrecte) {
                            System.out.println("Error, valor no numeric, selecione una opcion entre 1 y 3 por favor");
                        } else {
                            opcionlistas = input.nextInt();
                            if (opcionlistas < 1 || opcionlistas > 3) {
                                System.out.println("Error, selecione una opcion entre 1 y 3 por favor");
                                tipatgeCorrecte = false;
                            }
                        }
                        input.nextLine();
                    } while (tipatgeCorrecte == false);

                    // TODO: Mostrar lista de Pokemon (Nombre)
                    if (opcionlistas == 1) {
                        for (int i = 0; i < matrixPokemonUnaMoneda.length; i++) {
                            System.out.print(matrixPokemonUnaMoneda[i][0]);
                            System.out.println();
                        }
                        System.out.println(tresSaltosDeLinea);
                        for (int i = 0; i < matrixPokemonDosMonedas.length; i++) {
                            System.out.print(matrixPokemonDosMonedas[i][0]);
                            System.out.println();
                        }
                        System.out.println(tresSaltosDeLinea);
                        for (int i = 0; i < matrixPokemonTresMonedas.length; i++) {
                            System.out.print(matrixPokemonTresMonedas[i][0]);
                            System.out.println();
                        }
                        System.out.println(tresSaltosDeLinea);
                        for (int i = 0; i < matrixPokemonCuatroMonedas.length; i++) {
                            System.out.print(matrixPokemonCuatroMonedas[i][0]);
                            System.out.println();
                        }
                        System.out.println(tresSaltosDeLinea);
                        for (int i = 0; i < matrixPokemonCincoMonedas.length; i++) {
                            System.out.print(matrixPokemonCincoMonedas[i][0]);
                            System.out.println();
                        }
                        System.out.println();
                        break;

                        // TODO: Mostrar lista de Pokemon (Nombre y poder)
                    } else if (opcionlistas == 2) {
                        for (int i = 0; i < matrixPokemonUnaMoneda.length; i++) {
                            for (int j = 0; j < matrixPokemonUnaMoneda[i].length; j++) {
                                System.out.print(matrixPokemonUnaMoneda[i][j]);
                            }
                            System.out.println();
                        }
                        System.out.println(tresSaltosDeLinea);
                        for (int i = 0; i < matrixPokemonDosMonedas.length; i++) {
                            for (int j = 0; j < matrixPokemonDosMonedas[i].length; j++) {
                                System.out.print(matrixPokemonDosMonedas[i][j]);
                            }
                            System.out.println();
                        }
                        System.out.println(tresSaltosDeLinea);
                        for (int i = 0; i < matrixPokemonTresMonedas.length; i++) {
                            for (int j = 0; j < matrixPokemonTresMonedas[i].length; j++) {
                                System.out.print(matrixPokemonTresMonedas[i][j]);
                            }
                            System.out.println();
                        }
                        System.out.println(tresSaltosDeLinea);
                        for (int i = 0; i < matrixPokemonCuatroMonedas.length; i++) {
                            for (int j = 0; j < matrixPokemonCuatroMonedas[i].length; j++) {
                                System.out.print(matrixPokemonCuatroMonedas[i][j]);
                            }
                            System.out.println();
                        }
                        System.out.println(tresSaltosDeLinea);
                        for (int i = 0; i < matrixPokemonCincoMonedas.length; i++) {
                            for (int j = 0; j < matrixPokemonCincoMonedas[i].length; j++) {
                                System.out.print(matrixPokemonCincoMonedas[i][j]);
                            }
                            System.out.println();
                        }
                        System.out.println();
                        break;

                        // TODO: Volver al menu principal
                    } else if (opcionlistas == 3) {
                        System.out.println("De acuerdo, volvemos al menu principal");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Error");
                        break;
                    }

                    //TODO: Salir del programa
                case 4:
                    System.out.println("Ha elegido usted salir");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (opcionMenuPrincipal != 4);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("Hasta Pronto!");
        System.out.println("-------------------------------------------------------");
    }
}