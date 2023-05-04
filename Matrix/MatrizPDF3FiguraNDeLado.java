package Matrix;

public class MatrizPDF3FiguraNDeLado {
    public static void main(String[] args) {

        char[][] matriuX = new char[5][5];

        //Damos valor
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {//Si la fila es igual a la columna
                    matriuX[i][j] = 'x';
                } else if (i == 0) {//Si i es igual a "0" -->(fila numero 0, osea la primera)
                    matriuX[i][j] = 'x';
                } else if (i == matriuX.length - 1) {
                    matriuX[i][j] = 'x';
                } else {
                    matriuX[i][j] = ' ';
                }
            }
        }

        //Imprimimos la matriz completa
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriuX[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}



