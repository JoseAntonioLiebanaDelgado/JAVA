public class Main {
    public static void main(String[] args) {

        Octocat lola = new Octocat();

        lola.nom = "Lola";
        lola.color = "Negre";
        lola.pes = 3.5f;
        lola.edat = 2;
        lola.xip = 123456789;
        lola.raca = "Egipcia";
        lola.colorUlls = "Verd";
        lola.vides = 7;

        System.out.println(lola.nom);

        System.out.println(lola.vides);
        lola.perdreVida();
        System.out.println(lola.vides);
        lola.perdreVida();
        System.out.println(lola.vides);
        lola.perdreVida();
        System.out.println(lola.vides);
        lola.perdreVida();
        System.out.println(lola.vides);
        lola.perdreVida();
        System.out.println(lola.vides);
        lola.perdreVida();
        System.out.println(lola.vides);
        lola.perdreVida();
    }
}