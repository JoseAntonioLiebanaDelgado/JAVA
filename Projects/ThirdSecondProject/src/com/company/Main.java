package com.company;

import models.*;
import utils.Utilities;

import java.util.ArrayList;

/**
 * Creamos método main dónde va a estar el código principal.
 */
public class Main {

    /**
     * Creamos una instancia de un objeto de la clase 'ArrayList' que puede contener
     * elementos de tipo 'Animales'. El <> indica que no se especifica ningún tipo en
     * particular, lo que significa que la lista está vacía en el momento de la creación.
     * La clase ArrayList es una implementación de la interfaz List en Java, lo que significa
     * que se puede utilizar para almacenar y manipular una colección ordenada de elementos.
     * En este caso, la lista se utiliza para almacenar objetos de tipo Animales.
     *
     * Es posible utilizar otros tipos de datos en la parametrizacion de tipo en lugar de clases
     * personalizadas como tipos primitivos (ArrayList<Integer> o ArrayList<String>), no solo
     * tiene que ser el nombre de una clase.
     */
    ArrayList<Animales> animales = new ArrayList<>();


    /**
     * Éste es el método 'main' de la clase 'Main'. Él método crea una nueva instancia de la clase
     * 'Main' y llama al método 'init' de esa instancia.
     * @param args
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    /**
     * Definimos un método que crea un objeto de tipo animales a partir de la entrada del usuario.
     * @return
     */
    private Animales anadimosAnimal() {
        String especieAnimal = Utilities.llegirParaula("Introduce la especie del animal:");
        int anyoNacimiento = Utilities.llegirInt("Introduce el anyo de nacimiento:", 1900, 2023);
        String nombrePortador = Utilities.llegirParaula("Introduce el nombre del portador:");
        String paisPortador = Utilities.llegirParaula("Introduce el país del portador:");
        String apodoAnimal = Utilities.llegirParaula("Introduce el apodo del animal:");
        ArrayList<Portador> colaboradors = new ArrayList<>();

        Portador portador = new Portador(nombrePortador, paisPortador);

        Animales animal = null;
        int opcio = Utilities.llegirInt("Selecciona si el animal es macho o hembra (1 = hembra <---> 2 = macho):", 1, 2);

        switch (opcio) {
            case 1:
                int numeroIdentificadorCarnivoro = Utilities.llegirInt("Introduce el numero identificador del animal (1 - 1000):", 1, 1000);
                int pesoCarnivoro = Utilities.llegirInt("Introduce el peso en kg del animal:", 1, 2000);
                animal = new Herbivoro(portador, apodoAnimal, colaboradors, especieAnimal, anyoNacimiento, numeroIdentificadorCarnivoro, pesoCarnivoro);
                break;
            case 2:
                int numeroIdentificadorHerbivoro = Utilities.llegirInt("Introduce el numero identificador del animal (1 - 1000):", 1, 1000);
                int pesoHerbivoro = Utilities.llegirInt("Introduce el peso en kg del animal:", 1, 2000);
                animal = new Carnivoro(portador, apodoAnimal, colaboradors, especieAnimal, anyoNacimiento, numeroIdentificadorHerbivoro, pesoHerbivoro);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        if (animal == null) {
            System.out.println("No se ha podido añadir el animal.");
        }

        return animal;
    }

    public void init() {
        final String MENU_PRINCIPAL = "Les opciones disponibles son: \n\t1.Anadir Animal\n\t2.Interactual con el Animal\n\t3.Visualizar numero de animal/es\n\t4.Mostrar portadores\n\t5.Salir";
        cargarDatos();
        int opcion = 0;

        do {
            opcion = Utilities.llegirInt(MENU_PRINCIPAL, 1, 5);

            switch (opcion) {
                case 1:
                    Animales nuevoAnimal = anadimosAnimal();
                    if (nuevoAnimal != null) {
                        animales.add(nuevoAnimal);
                        System.out.println("El animal ha sido anadido correctamente.");
                    }
                    break;
                case 2:
                    // Mostrar lista de animales
                    for (int i = 0; i < animales.size(); i++) {
                        System.out.println((i + 1) + " - " + animales.get(i).getApodo());
                    }
                    // Seleccionar animal
                    int animalSeleccionado = Utilities.llegirInt("Selecciona un animal:", 1, animales.size());
                    // Decir que especie es
                    System.out.println("El animal seleccionado es un " + animales.get(animalSeleccionado - 1).getEspecie());
                    // Ejecutar acción utilizando la interfaz
                    // Mostrar lista de acciones
                    System.out.println("1. Alimentar");
                    System.out.println("2. Jugar");
                    System.out.println("3. Dormir");
                    // Seleccionar acción
                    int accionSeleccionada = Utilities.llegirInt("Selecciona una acción:", 1, 3);
                    // Ejecutar acción
                    switch (accionSeleccionada) {
                        case 1:
                            animales.get(animalSeleccionado - 1);
                            if (animales.get(animalSeleccionado - 1) instanceof Herbivoro) {
                                ((Herbivoro) animales.get(animalSeleccionado - 1)).alimentar();
                            } else if (animales.get(animalSeleccionado - 1) instanceof Carnivoro) {
                                ((Carnivoro) animales.get(animalSeleccionado - 1)).alimentar();
                            }
                            break;
                        case 2:
                            animales.get(animalSeleccionado - 1);
                            if (animales.get(animalSeleccionado - 1) instanceof Herbivoro) {
                                ((Herbivoro) animales.get(animalSeleccionado - 1)).jugar();
                            } else if (animales.get(animalSeleccionado - 1) instanceof Carnivoro) {
                                ((Carnivoro) animales.get(animalSeleccionado - 1)).jugar();
                            }
                            break;
                        case 3:
                            animales.get(animalSeleccionado - 1);
                            if (animales.get(animalSeleccionado - 1) instanceof Herbivoro) {
                                ((Herbivoro) animales.get(animalSeleccionado - 1)).dormir();
                            } else if (animales.get(animalSeleccionado - 1) instanceof Carnivoro) {
                                ((Carnivoro) animales.get(animalSeleccionado - 1)).dormir();
                            }
                            break;
                    }
                    break;
                case 3:
                    int numHerbivoros = 0;
                    int numCarnivoros = 0;
                    for (Animales animales : animales) {
                        if (animales instanceof Herbivoro) {
                            numHerbivoros++;
                        } else if (animales instanceof Carnivoro) {
                            numCarnivoros++;
                        }
                    }
                    System.out.println("Número total de herbivoros: " + numHerbivoros);
                    System.out.println("Número total de carnivoros: " + numCarnivoros);
                    break;
                case 4:
                    // Mostrar portadores
                    for (int i = 0; i < animales.size(); i++) {
                        System.out.println((i + 1) + " - " + animales.get(i).getPortador());
                    }
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion no vàlida!");
                    break;
            }
        } while (opcion != 5);
    }

    /**
     * Éste método es imprescindible para que el método init() pueda funcionar, ya que la información se carga desde
     * éste código. Si el programa no tuviera éste método no podría realizar ninguna de las acciones ya que no habría
     * datos en la lista de animales por lo tanto tampoco se podría interactuar con ningún animal.
     */
    private void cargarDatos() {

        Portador portador1 = new Portador("Rafel Herrerias", "Espana");
        Portador portador2 = new Portador("Jose Antonio Liebana", "España");

        ArrayList<Portador> portadores = new ArrayList<>();
        portadores.add(portador2);

        Animales herbivoro1 = new Herbivoro(portador2, "Timmy", portadores, "Raton");
        Animales carnivoro1 = new Carnivoro(portador1, "Peter", portadores, "Tigre");

        portadores.add(portador1);
        Animales herbivoro2 = new Herbivoro(portador2, "Sonica", portadores, "Oveja");

        animales.add(herbivoro1);
        animales.add(carnivoro1);
        animales.add(herbivoro2);
    }
}
