//package Funciones_Corregidas;
//
//import java.util.Random;
//import java.util.Scanner;
//
///**
// * Programa de simulació de La Primitiva
// * @auhor LiebanaJoseAntonio
// * @version 1.0
// * @date 31/01/2023
// */
//public class Primitiva {
//    public static void main(String[] args) {
//        int[] userVector = new int[7];
//        int menu = 0;
//
//        System.out.println("""
//            ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
//            LA PRIMITIVA:
//            COMO JUGAR?
//            ⥤ Hay 6 numeros aleatorios del 1 al 49 y un numero de reintegro del 0 al 9
//
//            ⥤ Si aciertas el numero y la posicion ganas 20€
//
//            ⥤ Si aciertas el numero pero no la posicion ganas 10€
//
//            ⥤ Si aciertas el reintegro ganas 6€
//
//            ⥤ Cada partida el bono ganador se reinicia a otros numeros aleatorios
//            ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━""");
//        do{
//            for (int i = 0; i < 7; i++) {
//                userVector[i] = userResult(i);
//            }
//            int[] IAvector = PrimitivaResult();
//
//            float prize = calculateResult(userVector, IAvector);
//
//            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
//
//            //ENSEÑAR BOLETOS:
//            System.out.println("Tu voleto es: ");
//            for (int i = 0; i < 7; i++) {
//                System.out.print(userVector[i] + " ");
//            }
//
//            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
//
//            System.out.println("La apuesta de ganadora es:");
//            for (int i = 0; i < 7; i++) {
//                System.out.print(IAvector[i] + " ");
//            }
//            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
//
//            System.out.println();
//            menu = menu(prize);
//
//        }while(menu == 1);
//
//        // menuPrincipal();
//    }
//
//    public static int menu(Float prize) {
//        boolean loop = false, correct = true;
//        Scanner read = new Scanner(System.in);
//        int inputusr = 0;
//
//        if (prize == 0.00f) {
//            System.out.println("Lo siento no has hacertado ninguno :(\n");
//        }else {
//            System.out.println("Felicidades has ganado " + prize + "€ :D\n");
//        }
//
//        do{
//            System.out.println("""
//                Quiere volver a jugar?
//                1 - Volver a jugar
//                2 - Salir""");
//                correct = read.hasNextInt();
//            if (!correct){
//                System.out.println("-- ERROR -- Esto no es un numero");
//                read.nextLine();
//            }else{
//                inputusr = read.nextInt();
//                    if (inputusr >= 3 || inputusr <= 0){
//                        System.out.println("Opcion no valida");
//                        correct = false;
//                    }
//                read.nextLine();
//            }
//        }while(!correct);
//
//        return inputusr;
//    }
//
//    public static float calculateResult(int userResult[], int IAresult[]) {
//        float prize = 0.00f;
//
//        // SI EL NUMERO DE USUARIO ES EL MISMO
//        for (int i = 0; i < 5; i++) {
//            if (userResult[i] == IAresult[i]) {
//                System.out.println("El numero " + userResult[i] + " esta en la misma posicion de la primitiva +20€");
//                prize = prize + 20.00f;
//            }
//        }
//
//        // SI EL NUMERO DEL USUARIO ESTA EN LA PRIMITIVA PERO NO EN LA MISMA POSICION
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (userResult[i] == IAresult[j]) {
//                    System.out.println("El numero " + userResult[i] + " esta en la posicion " + (j + 1) + " +10€");
//                    prize = prize + 10.00f;
//                }
//            }
//        }
//
//        // SI EL NUMERO DE REINTEGRO ES EL MISMO
//        if (userResult[6] == IAresult[6]) {
//            System.out.println("El numero de reintegro es el mismo +6€");
//            prize = prize + 6.00f;
//        }
//
//        return prize;
//    }
//
//    public static int userResult(int Index){
//        Scanner read = new Scanner(System.in);
//        int inputusr = 0;
//        boolean valorCorrecte = false;
//        do{
//            if (Index != 6) {
//                System.out.println("Posicion " + (Index + 1) + " de la primitiva: ");
//            }else {
//                System.out.println("Dime el numero de reintegro: ");
//            }
//            valorCorrecte = read.hasNextInt();
//            if (!valorCorrecte){
//                System.out.println("-- ERROR -- Esto no es un numero");
//                read.nextLine();
//            }else{ // Tinc un enter
//                inputusr = read.nextInt();
//                if (Index != 6) {
//                    if (inputusr >= 50 || inputusr <= 0) {
//                        System.out.println("Opcion no valida");
//                        valorCorrecte = false;
//                    }
//                }else{
//                    if (inputusr >= 10 || inputusr < 0){
//                        System.out.println("Opcion no valida");
//                        valorCorrecte = false;
//                    }
//                }
//                read.nextLine();
//            }
//        }while(!valorCorrecte);
//        return inputusr;
//    }
//
///**
// * @param min The minimum accepted value
// * @param max The max accepted value
// * @return int The random value which matches the provided interval
// */
//public static int getRandomNumberUsingNextInt(int min, int max) {
//    Random random = new Random();
//    return random.nextInt(max - min + 1) + min;
//}
//
//public static int[] PrimitivaResult() {
//    int[] randomResult = new int[7];
//
//    for (int i = 0; i <= 5; i++) {
//        int random = getRandomNumberUsingNextInt(1, 49);
//        randomResult[i] = random;
//        random = 0;
//    }
//    randomResult[6] = getRandomNumberUsingNextInt(1, 9);
//    return randomResult;
//}
//}