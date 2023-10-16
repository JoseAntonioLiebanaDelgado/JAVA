package m3uf5_pou01;

import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<Persona> listaPersonas = new HashSet<>();
        listaPersonas.add(new Persona("Gerard","Torrents", "96587458"));
        listaPersonas.add(new Persona("Maria","Comes", "4564686598"));
        listaPersonas.add(new Persona("Eduard","Borrell", "985698547"));
        listaPersonas.add(new Persona("Zacarias","Smith", "435265214"));
        listaPersonas.add(new Persona("Andrea","Gutierrez", "124589658"));

        AgendaHashSet agenda = new AgendaHashSet(listaPersonas);
        agenda.init();
    }
}
