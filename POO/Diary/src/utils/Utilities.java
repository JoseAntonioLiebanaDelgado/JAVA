package utils;

import java.util.Scanner;

public class Utilities {
    /**
     * Mètode per llegir un valor int amb control d'errors
     * @since 1.2
     * @param text de tipus String
     * @param error de tipus String
     * @return value de tipus int
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
     * Mètode per llegir un valor int amb control d'errors i amb màxims i mínims
     * @since 1.2
     * @param text de tipus String
     * @param error1 de tipus String
     * @param min de tipus int
     * @param max de tipus int
     * @param error2 de tipus String
     * @return value de tipus int
     */
    public static int inputIntMinMax(String text, String error1,int min, int max, String error2){
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

    /**
     * Mètode per llegir un valor float amb control d'errors
     * @since 1.2
     * @param text de tipus String
     * @param error de tipus String
     * @return value de tipus float
     */
    public static float inputFloat(String text, String error){
        Scanner input = new Scanner(System.in);

        float value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextFloat();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor float amb control d'errors i amb màxims i mínims
     * @since 1.2
     * @param text de tipus String
     * @param error1 de tipus String
     * @param min de tipus float
     * @param max de tipus float
     * @param error2 de tipus String
     * @return value de tipus float
     */
    public static float inputFloatMinMax(String text, String error1,float min, float max, String error2){
        Scanner input = new Scanner(System.in);

        float value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextFloat();
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
