public class Octocat {
    String nom;
    String color;
    float pes;
    int edat;
    int xip;
    String raca;
    String colorUlls;
    int vides = 7;
    boolean esViu = true;

    public void perdreVida() {
        vides--;
        if (vides == 0) {
            esViu = false;
        }
    }
}
