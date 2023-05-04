public abstract class Persona {

    public Persona(String nom) {
        nombre = nom;
    }

    public String dameNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;
}
