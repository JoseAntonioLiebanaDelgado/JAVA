package Arrays;

public class ArraysE8UEFAClasificatoria {
    public static void main(String[] args) {

        //Creamos array
        String[] ulGroupRunner = {"ManU", "Nantes", "Unio Berlin", "Meed", "PSV", "Rennes", "Monaco", "AS Roma"};
        String[] uclThirdRankedList = {"Ajax", "FCB", "Salsburg", "Sevilla", "Leverskuen", "Sporting Lisboa", "Shaktar", "Juventus"};

        //El array esta iniciado en 0, hasta que no salen los equipos no se le asigna valor 1, y con valor 1 no pueden salir mas porque ya han salido
        int[] bombo1 = new int[ulGroupRunner.length];
        int[] bombo2 = new int[uclThirdRankedList.length];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < ulGroupRunner.length; i++) {

            do {
                //Haz que index1 sea un numero random de 0 a 8 para el array
                index1 = (int) (Math.random() * 8);
                //Mientras
            } while ((bombo1[index1] == 1));

            do {
                index2 = (int) (Math.random() * 8);
            } while ((bombo2[index2] == 1));


            System.out.println("S'enfrontaran " + ulGroupRunner[index1] + " vs " + uclThirdRankedList[index2]);

            bombo1[index1] = 1;
            bombo2[index2] = 1;
        }
    }
}
