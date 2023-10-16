package m3uf5_pou01;

import java.util.ArrayList;
import java.util.Objects;

public class Persona implements Comparable {

    private String nombre;
    private String apellidos;
    private ArrayList<String> telefons = new ArrayList<>();

    public Persona(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.addTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


    public String getTelefono() {
        return String.join(", ",telefons);
    }

    public void addTelefono(String telefono) {
        telefons.add(telefono);
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", telefons=" + getTelefono() + "]";
    }

    @Override
    //Necessari per treballar amb Hashset
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    //Necessari per treballar amb Hashset
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    @Override
    //Necessari per treballar amb Treeset
    public int compareTo(Object o) {
        if (this == o) return 0;
        Persona persona = (Persona) o;
        int result = this.getApellidos().compareTo(persona.getApellidos());
        if(result != 0){
            return result;
        }
        return this.getNombre().compareTo(persona.getNombre());
    }


}