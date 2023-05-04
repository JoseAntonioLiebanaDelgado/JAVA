package IfElse;

import java.util.Scanner;

public class EjercicioSwitchCase12CalculadoraSencilla {
    public static void main(String[] args) {

	/*La calculadora senzilla (versionada)
	Tornem a desenvolupar la calculadora senzilla, fent servir el condicional múltiple amb casos.*/


        int primerNumero = 0;
        int segundoNumero = 0;
        String operacion = "";

        Scanner entrada = new Scanner(System.in);
        Scanner entradaOperacion = new Scanner(System.in);

        System.out.println("Escribe un primer numero");
        primerNumero = entrada.nextInt();
        System.out.println("Escribe un segundo numero");
        segundoNumero = entrada.nextInt();
        System.out.println("Escribe una operacion (+, -, x, /)");
        operacion = entradaOperacion.nextLine();

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
                System.out.println("El resultado de la division es " + (primerNumero / segundoNumero));
                break;
            default:
                System.out.println("La operacion no es correcta");
                break;
        }
    }
}