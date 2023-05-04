/**
 * Ésta clase Director ahora tendria los metodos de la clase empleado, los de la clase Jefatura,
 * mas el constructor de esta misma, mas los futuros metodos que podriamos crear dentro de esta clase.
 */
public class Director extends Jefatura{
    public Director(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }
}

//public final class Director extends Jefatura
//Esto detendria la cadena de la herencia en esta clase Director
//Ninguna clase puede heredar de esta (Por el "final")