package WhileDoWhile;

import java.util.Scanner;

public class EjercicioWhileDoWhile1CalculadoraMultiOperacion {
    public static void main(String[] args) {


        /*Exercici 3: La calculadora multioperació
        Desenvolupa en una calculadora senzilla que demani a l’usuari un primer operand numèric,
        una operació entre (+ - * /) i un segon operand, i escrigui el resultat d’aplicar l’operació als
        operands. Un cop mostrat el resultat, la calculadora demana a l’usuari si vol realitzar un nou
        càlcul. El programa continuarà oferint a l’usuari la possibilitat de calcular, fins que l’usuari
        respongui negativament.
        Atenció: cal evitar divisió per zero. Aviseu a l'usuari de l'error, però permeteu continuar
        calculant.*/

        double primerNumero = 0;
        String operacion = "";
        double segundoNumero = 0;
        int question = 0;
        Scanner entradaDouble = new Scanner(System.in);
        Scanner entradaLine = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero");
            primerNumero = entradaDouble.nextDouble();
            System.out.println("Introduce una operacion entre (+, -, x, /)");
            operacion = entradaLine.nextLine();
            System.out.println("Introduce un numero");
            segundoNumero = entradaDouble.nextDouble();

            switch (operacion) {
                case "+":
                    System.out.println("El resultado de la suma es " + (primerNumero + segundoNumero));
                    break;
                case "-":
                    System.out.println("El resultado de la resta es " + (primerNumero - segundoNumero));
                    break;
                case "x":
                    System.out.println("El resultado de la multiplicacion es " + (primerNumero * segundoNumero));
                    break;
                case "/":
                    if (segundoNumero == 0) {
                        System.out.println("No se puede dividir entre 0");
                        break;
                    }
                    System.out.println("El resultado de la division es " + (primerNumero / segundoNumero));
                    break;
                default:
                    System.out.println("La operacion no es correcta");
                    break;
            }
            System.out.println("Quieres hacer otra operacion? (1=si -- 2=no)");
            question = entrada1.nextInt();
        } while (question == 1);

        if (question != 1) {
            System.out.println("De acuerdo, hasta pronto!");
        }
    }
}