public class Alumno extends Persona {

    public Alumno(String nom, String carrera) {
        super(nom);
        this.carrera = carrera;
    }

    public String dameDescripcion() {
        return "Este alumno esta estudiando la cerrera de " + carrera;
    }

    private String carrera;

}
