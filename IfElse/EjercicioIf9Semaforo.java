package IfElse;

import java.util.Scanner;

public class EjercicioIf9Semaforo {
    public static void main(String[] args) {

	/*La guia de semàfors
	Desenvolupem un ajudant infantil per decidir que fer davant un semàfor (vermell, groc, verd).
	El programa demanarà de quin color està el semàfor i segons la resposta recomanarà passar,
	esperar, o córrer.*/

        int colorSemaforo = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("De que color está el semaforo? (1=Verde, 2=Ambar, 3=Rojo)");
        colorSemaforo = entrada.nextInt();

        if (colorSemaforo == 1) {
            System.out.println("Puedes pasar");
        } else if (colorSemaforo == 2) {
            System.out.println("Yo de ti frenaria");
        } else if (colorSemaforo == 3) {
            System.out.println("Te toca esperar");
        } else {
            System.out.println("Introduce 1=Verde, 2=Ambar, 3=Rojo, por favor");
        }
    }
}