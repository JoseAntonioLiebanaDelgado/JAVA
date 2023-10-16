package m3uf5_pou01;

public class ContactExistingException extends Exception{
    Persona persona;
    public ContactExistingException(Persona p) {
        super(String.format("El contacte %s %s ja existeix.",p.getNombre(),p.getApellidos()));
        this.persona = p;
    }
}
