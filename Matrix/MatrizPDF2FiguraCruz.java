package Matrix;

public class MatrizPDF2FiguraCruz {
    public static void main(String[] args) {

        char[][] matriuX = new char[5][5];

        //Damos valor
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {//si la fila es igual a la columna
                    matriuX[i][j] = 'x';
                } else if ((i + j) == 4) {//si el resultado de la posicion equivale a 4
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

