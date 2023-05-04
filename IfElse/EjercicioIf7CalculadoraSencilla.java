package IfElse;

import java.util.Scanner;
public class EjercicioIf7CalculadoraSencilla {
    public static void main(String[] args) {


        /*Una calculadora senzilla
        Desenvolupa una calculadora senzilla que demani a l’usuari un primer operand numèric, una
        operació entre (+ - * /) i un segon operand, i escrigui el resultat d’aplicar l’operació als
        operands.
        Ves amb compte per si alguna operació no és vàlida amb certs operands (p.ex divisió per
        zero).*/

        int primerNumero = 0;
        int segundoNumero = 0;
        String operacion = "";

        Scanner entrada = new Scanner(System.in);
        Scanner entradaOperacion = new Scanner(System.in);


        System.out.println("Escribe un primer numero");
        primerNumero  = entrada.nextInt();
        System.out.println("Escribe un segundo numero");
        segundoNumero  = entrada.nextInt();
        System.out.println("Escribe una operacion (+, -, x, /)");
        operacion  = entradaOperacion.nextLine();


        if(operacion.equalsIgnoreCase("+")) {
            System.out.println("El resultado de la suma es " + (primerNumero + segundoNumero));
        }else if(operacion.equalsIgnoreCase("-")) {
            System.out.println("El resultado de la resta es " + (primerNumero - segundoNumero));
        }else if(operacion.equalsIgnoreCase("x")) {
            System.out.println("El resultado de la multiplicacion es " + (primerNumero * segundoNumero));
        }else if(operacion.equalsIgnoreCase("/")) {
            System.out.println("El resultado de la division es " + (primerNumero / segundoNumero));
        }else {
            System.out.println("Hay un error");
        }
    }
}