package BasicsExercises;

import java.util.Scanner;

public class MachineCoffe3000 {
    public static void main(String[] args) {


        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaDouble = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        String resultadoTipoCafe = "";
        String size = "";

        int quiereHielo = 0;
        int sabePedidos = 0;
        int cantidadPedidos = 0;
        int otroPedido = 0;

        double hielo = 0.10;

        double precioCafeExpresoS = 0.40;
        double precioCafeExpresoM = 0.50;
        double precioCafeExpresoL = 0.60;

        double precioCortadoS = 0.45;
        double precioCortadoM = 0.55;
        double precioCortadoL = 0.65;

        double precioCafeLecheS = 0.60;
        double precioCafeLecheM = 0.70;
        double precioCafeLecheL = 0.80;

        double precioCapuchinoS = 0.70;
        double precioCapuchinoM = 0.80;
        double precioCapuchinoL = 0.90;

        double precioChocolateS = 0.75;
        double precioChocolateM = 0.85;
        double precioChocolateL = 0.95;


        System.out.println("Bienvenido/a a Machine-Coffe 3000");
        System.out.println("A continuación mostraré el menú.");
        System.out.println("Usted unicamente tiene que seleccionar la opción que mas desee, nada más.");

        System.out.println();

        System.out.println("Los precios de los cafes son los siguientes:");
        System.out.println();
        System.out.println("Cafe expreso S - 0.40 €");
        System.out.println("Cafe expreso M - 0.50 €");
        System.out.println("Cafe expreso L - 0.60 €");
        System.out.println();
        System.out.println("Cortado S - 0.45 €");
        System.out.println("Cortado M - 0.55 €");
        System.out.println("Cortado L - 0.65 €");
        System.out.println();
        System.out.println("Cafe con leche S - 0.60 €");
        System.out.println("Cafe con leche M - 0.70 €");
        System.out.println("Cafe con leche L - 0.80 €");
        System.out.println();
        System.out.println("Capuchino S - 0.70 €");
        System.out.println("Capuchino M - 0.80 €");
        System.out.println("Capuchino L - 0.90 €");
        System.out.println("");
        System.out.println("Chocolate S - 0.75 €");
        System.out.println("Chocolate M - 0.85 €");
        System.out.println("Chocolate L - 0.95 €");
        System.out.println("");

        System.out.println("Hielo + 0.10 €");
        System.out.println("");

        System.out.println("Antes de nada, sabe usted cuantos pedidos va a realizar?     1-Si     2-No");
        sabePedidos = entradaInt.nextInt();

        if (sabePedidos == 1) {
            System.out.println("Estupendo, cuantos serán?");
            cantidadPedidos = entradaInt.nextInt();


            for (int i = 1; i <= cantidadPedidos; i++) {

                System.out.println("Para extraer un cafe expreso pulse 1");
                System.out.println("Para extraer un cortado pulse 2");
                System.out.println("Para extraer un cafe con leche pulse 3");
                System.out.println("Para extraer un capuchino pulse 4");
                System.out.println("Para extraer un chocolate pulse 5");
                System.out.println("");
                resultadoTipoCafe = entradaString.nextLine();

                switch (resultadoTipoCafe) {

                    case "1":
                        System.out.println("Ha seleccionado usted: Cafe Expreso");
                        break;
                    case "2":
                        System.out.println("Ha seleccionado usted: Cortado");
                        break;
                    case "3":
                        System.out.println("Ha seleccionado usted: Cafe con leche");
                        break;
                    case "4":
                        System.out.println("Ha seleccionado usted: Capuchino");
                        break;
                    case "5":
                        System.out.println("Ha seleccionado usted: Chocolate");
                        break;
                }
                System.out.println("");


                //Opcion 1 (Cafe Expreso)
                if (resultadoTipoCafe.equalsIgnoreCase("1")) {

                    System.out.println("Que tamaño desea?        S - M - L?");
                    size = entradaString.nextLine();

                    if (size.equalsIgnoreCase("s")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCafeExpresoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCafeExpresoS + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoS / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("m")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCafeExpresoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCafeExpresoM + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoM / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("l")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCafeExpresoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCafeExpresoL + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoL / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    }
                }

                //Opcion 2 (Cortado)
                if (resultadoTipoCafe.equalsIgnoreCase("2")) {

                    System.out.println("Que tamaño desea?        S - M - L?");
                    size = entradaString.nextLine();

                    if (size.equalsIgnoreCase("s")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCortadoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCortadoS + " IVA incluido. El precio sin IVA será de " + (precioCortadoS / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("m")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCortadoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCortadoM + " IVA incluido. El precio sin IVA será de " + (precioCortadoM / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("l")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCortadoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCortadoL + " IVA incluido. El precio sin IVA será de " + (precioCortadoL / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    }
                }

                //Opcion 3 (Cafe con leche)
                if (resultadoTipoCafe.equalsIgnoreCase("3")) {

                    System.out.println("Que tamaño desea?        S - M - L?");
                    size = entradaString.nextLine();

                    if (size.equalsIgnoreCase("s")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCafeLecheS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCafeLecheS + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheS / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("m")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCafeLecheM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCafeLecheM + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheM / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("l")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCafeLecheL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCafeLecheL + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheL / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    }
                }

                //Opcion 4 (Capuchino)
                if (resultadoTipoCafe.equalsIgnoreCase("4")) {

                    System.out.println("Que tamaño desea?        S - M - L?");
                    size = entradaString.nextLine();

                    if (size.equalsIgnoreCase("s")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCapuchinoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCapuchinoS + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoS / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("m")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCapuchinoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCapuchinoM + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoM / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("l")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioCapuchinoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioCapuchinoL + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoL / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    }
                }

                //Opcion 5 (Chocolate)
                if (resultadoTipoCafe.equalsIgnoreCase("5")) {

                    System.out.println("Que tamaño desea?        S - M - L?");
                    size = entradaString.nextLine();

                    if (size.equalsIgnoreCase("s")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioChocolateS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioChocolateS + " IVA incluido. El precio sin IVA será de " + (precioChocolateS / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("m")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioChocolateM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioChocolateM + " IVA incluido. El precio sin IVA será de " + (precioChocolateM / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    } else if (size.equalsIgnoreCase("l")) {

                        System.out.println("Desea hielo?          1-Si          2-No");
                        quiereHielo = entradaInt.nextInt();

                        if (quiereHielo == 1) {
                            System.out.println("Serán " + (precioChocolateL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                        } else {
                            System.out.println("Serán " + precioChocolateL + " IVA incluido. El precio sin IVA será de " + (precioChocolateL / 1.21) + " €. Introduzca cantidad por favor");
                        }
                    }
                }

                System.out.println();

            }//cierre for
        }//cierre if
        else if (sabePedidos == 2) {

            System.out.println("De acuerdo, preguntaré cada vez que finalize un pedido.");
            System.out.println();

            System.out.println("Para extraer un cafe expreso pulse 1");
            System.out.println("Para extraer un cortado pulse 2");
            System.out.println("Para extraer un cafe con leche pulse 3");
            System.out.println("Para extraer un capuchino pulse 4");
            System.out.println("Para extraer un chocolate pulse 5");
            System.out.println("");
            resultadoTipoCafe = entradaString.nextLine();

            switch (resultadoTipoCafe) {

                case "1":
                    System.out.println("Ha seleccionado usted: Cafe Expreso");
                    break;
                case "2":
                    System.out.println("Ha seleccionado usted: Cortado");
                    break;
                case "3":
                    System.out.println("Ha seleccionado usted: Cafe con leche");
                    break;
                case "4":
                    System.out.println("Ha seleccionado usted: Capuchino");
                    break;
                case "5":
                    System.out.println("Ha seleccionado usted: Chocolate");
                    break;
            }
            System.out.println("");


            //Opcion 1 (Cafe Expreso)
            if (resultadoTipoCafe.equalsIgnoreCase("1")) {

                System.out.println("Que tamaño desea?        S - M - L?");
                size = entradaString.nextLine();

                if (size.equalsIgnoreCase("s")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCafeExpresoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCafeExpresoS + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoS / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("m")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCafeExpresoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCafeExpresoM + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoM / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("l")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCafeExpresoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCafeExpresoL + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoL / 1.21) + " €. Introduzca cantidad por favor");
                    }
                }
            }

            //Opcion 2 (Cortado)
            if (resultadoTipoCafe.equalsIgnoreCase("2")) {

                System.out.println("Que tamaño desea?        S - M - L?");
                size = entradaString.nextLine();

                if (size.equalsIgnoreCase("s")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCortadoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCortadoS + " IVA incluido. El precio sin IVA será de " + (precioCortadoS / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("m")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCortadoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCortadoM + " IVA incluido. El precio sin IVA será de " + (precioCortadoM / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("l")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCortadoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCortadoL + " IVA incluido. El precio sin IVA será de " + (precioCortadoL / 1.21) + " €. Introduzca cantidad por favor");
                    }
                }
            }

            //Opcion 3 (Cafe con leche)
            if (resultadoTipoCafe.equalsIgnoreCase("3")) {

                System.out.println("Que tamaño desea?        S - M - L?");
                size = entradaString.nextLine();

                if (size.equalsIgnoreCase("s")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCafeLecheS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCafeLecheS + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheS / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("m")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCafeLecheM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCafeLecheM + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheM / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("l")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCafeLecheL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCafeLecheL + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheL / 1.21) + " €. Introduzca cantidad por favor");
                    }
                }
            }

            //Opcion 4 (Capuchino)
            if (resultadoTipoCafe.equalsIgnoreCase("4")) {

                System.out.println("Que tamaño desea?        S - M - L?");
                size = entradaString.nextLine();

                if (size.equalsIgnoreCase("s")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCapuchinoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCapuchinoS + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoS / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("m")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCapuchinoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCapuchinoM + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoM / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("l")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioCapuchinoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioCapuchinoL + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoL / 1.21) + " €. Introduzca cantidad por favor");
                    }
                }
            }

            //Opcion 5 (Chocolate)
            if (resultadoTipoCafe.equalsIgnoreCase("5")) {

                System.out.println("Que tamaño desea?        S - M - L?");
                size = entradaString.nextLine();

                if (size.equalsIgnoreCase("s")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioChocolateS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioChocolateS + " IVA incluido. El precio sin IVA será de " + (precioChocolateS / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("m")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioChocolateM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioChocolateM + " IVA incluido. El precio sin IVA será de " + (precioChocolateM / 1.21) + " €. Introduzca cantidad por favor");
                    }
                } else if (size.equalsIgnoreCase("l")) {

                    System.out.println("Desea hielo?          1-Si          2-No");
                    quiereHielo = entradaInt.nextInt();

                    if (quiereHielo == 1) {
                        System.out.println("Serán " + (precioChocolateL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                    } else {
                        System.out.println("Serán " + precioChocolateL + " IVA incluido. El precio sin IVA será de " + (precioChocolateL / 1.21) + " €. Introduzca cantidad por favor");
                    }
                }
            }
            System.out.println();
            System.out.println("Desea usted hacer otro pedido?     1-Si     2-No");
            otroPedido = entradaInt.nextInt();


            if (otroPedido == 1) {

                while (otroPedido == 1) {

                    System.out.println();
                    System.out.println("Para extraer un cafe expreso pulse 1");
                    System.out.println("Para extraer un cortado pulse 2");
                    System.out.println("Para extraer un cafe con leche pulse 3");
                    System.out.println("Para extraer un capuchino pulse 4");
                    System.out.println("Para extraer un chocolate pulse 5");
                    System.out.println("");
                    resultadoTipoCafe = entradaString.nextLine();

                    switch (resultadoTipoCafe) {

                        case "1":
                            System.out.println("Ha seleccionado usted: Cafe Expreso");
                            break;
                        case "2":
                            System.out.println("Ha seleccionado usted: Cortado");
                            break;
                        case "3":
                            System.out.println("Ha seleccionado usted: Cafe con leche");
                            break;
                        case "4":
                            System.out.println("Ha seleccionado usted: Capuchino");
                            break;
                        case "5":
                            System.out.println("Ha seleccionado usted: Chocolate");
                            break;
                    }
                    System.out.println("");


                    //Opcion 1 (Cafe Expreso)
                    if (resultadoTipoCafe.equalsIgnoreCase("1")) {

                        System.out.println("Que tamaño desea?        S - M - L?");
                        size = entradaString.nextLine();

                        if (size.equalsIgnoreCase("s")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCafeExpresoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCafeExpresoS + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoS / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("m")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCafeExpresoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCafeExpresoM + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoM / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("l")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCafeExpresoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeExpresoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCafeExpresoL + " IVA incluido. El precio sin IVA será de " + (precioCafeExpresoL / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        }
                    }

                    //Opcion 2 (Cortado)
                    if (resultadoTipoCafe.equalsIgnoreCase("2")) {

                        System.out.println("Que tamaño desea?        S - M - L?");
                        size = entradaString.nextLine();

                        if (size.equalsIgnoreCase("s")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCortadoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCortadoS + " IVA incluido. El precio sin IVA será de " + (precioCortadoS / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("m")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCortadoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCortadoM + " IVA incluido. El precio sin IVA será de " + (precioCortadoM / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("l")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCortadoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCortadoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCortadoL + " IVA incluido. El precio sin IVA será de " + (precioCortadoL / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        }
                    }

                    //Opcion 3 (Cafe con leche)
                    if (resultadoTipoCafe.equalsIgnoreCase("3")) {

                        System.out.println("Que tamaño desea?        S - M - L?");
                        size = entradaString.nextLine();

                        if (size.equalsIgnoreCase("s")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCafeLecheS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCafeLecheS + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheS / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("m")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCafeLecheM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCafeLecheM + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheM / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("l")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCafeLecheL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCafeLecheL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCafeLecheL + " IVA incluido. El precio sin IVA será de " + (precioCafeLecheL / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        }
                    }

                    //Opcion 4 (Capuchino)
                    if (resultadoTipoCafe.equalsIgnoreCase("4")) {

                        System.out.println("Que tamaño desea?        S - M - L?");
                        size = entradaString.nextLine();

                        if (size.equalsIgnoreCase("s")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCapuchinoS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCapuchinoS + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoS / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("m")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCapuchinoM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCapuchinoM + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoM / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("l")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioCapuchinoL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioCapuchinoL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioCapuchinoL + " IVA incluido. El precio sin IVA será de " + (precioCapuchinoL / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        }
                    }

                    //Opcion 5 (Chocolate)
                    if (resultadoTipoCafe.equalsIgnoreCase("5")) {

                        System.out.println("Que tamaño desea?        S - M - L?");
                        size = entradaString.nextLine();

                        if (size.equalsIgnoreCase("s")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioChocolateS + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateS + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioChocolateS + " IVA incluido. El precio sin IVA será de " + (precioChocolateS / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("m")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioChocolateM + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateM + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioChocolateM + " IVA incluido. El precio sin IVA será de " + (precioChocolateM / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        } else if (size.equalsIgnoreCase("l")) {

                            System.out.println("Desea hielo?          1-Si          2-No");
                            quiereHielo = entradaInt.nextInt();

                            if (quiereHielo == 1) {
                                System.out.println("Serán " + (precioChocolateL + hielo) + " IVA incluido. El precio sin IVA será de " + ((precioChocolateL + hielo) / 1.21) + " €. Introduzca cantidad por favor.");
                            } else {
                                System.out.println("Serán " + precioChocolateL + " IVA incluido. El precio sin IVA será de " + (precioChocolateL / 1.21) + " €. Introduzca cantidad por favor");
                            }
                        }
                    }
                    System.out.println("Desea usted hacer otro pedido?     1-Si     2-No");
                    otroPedido = entradaInt.nextInt();
                }
            } else if (otroPedido == 2) {
                System.out.println("De acuerdo.");
            }
        }//cierre else if
        System.out.println("");
        System.out.println("Espero que esté a su gusto. Muchas gracias por confiar en Machine-Coffe 3000. Hasta pronto! ");
    }
}