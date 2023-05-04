package controllers;

import models.LiebanaDelgado_Character;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<LiebanaDelgado_Character> characters = new ArrayList<>();
        File file = new File("characters-one-piece.csv");
        Scanner valuesReader = null;

        try {
            valuesReader = new Scanner(file);
            readAndParseFileValues(valuesReader, characters);
            for (LiebanaDelgado_Character character : characters) {
                System.out.println(character);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: File not found: " + fnfe.getMessage());
        } catch (Exception e) {
            System.out.println("UNKNOWN ERROR!");
        } finally {
            if (valuesReader != null) {
                valuesReader.close();
            }
        }
    }

    /**
     * Este método recibe un Scanner de entrada y parsea las líneas del archivo de datos
     * usando String.split() para crear un objeto LiebanaDelgado_Character y añadirlo
     * al ArrayList de personajes.
     *
     * @param input      el Scanner de entrada para leer el archivo de datos
     * @param characters el ArrayList de personajes donde se añadirán los objetos
     */
    private static void readAndParseFileValues(Scanner input, ArrayList<LiebanaDelgado_Character> characters) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] values = line.split("&");
            LiebanaDelgado_Character character = new LiebanaDelgado_Character(
                    values[0],  // nombre
                    Integer.parseInt(values[1]),  // capítulo
                    Integer.parseInt(values[2]),  // episodio
                    Integer.parseInt(values[3]),  // año
                    values[4]  // nota
            );
            characters.add(character);
        }
    }
}
