package Dia1_Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Crea algunos contactos
        Persona persona1 = new Persona("Pedro", "Diaz", "123456789");
        Persona persona2 = new Persona("Pepe", "Gomez", "987654321");
        Persona persona3 = new Persona("Mario", "Perez", "112233445");

        // Los añade a la colección de Agenda
        agenda.aniadirPersona(persona1);
        agenda.aniadirPersona(persona2);
        agenda.aniadirPersona(persona3);

        // Inicia la Agenda
        agenda.init();
    }
}
