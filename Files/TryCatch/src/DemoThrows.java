/**
 * DemoThrows
 */
public class DemoThrows {
    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        // Creamos un objeto de tipo DemoThrows
        DemoThrows demo = new DemoThrows();
        // Llamamos al método init()
        demo.init();
    }

    /**
     * Método init()
     * Éste método llama a los métodos procediment() y resseguirVector()
     */
    private void init() {
        int x = 12, y = 3;
        int resultat;

        // Llamamos al método procediment() y capturamos las excepciones que se puedan producir
        try {
            resultat = procediment(x, y);
            System.out.println(resultat);
        } catch (ArithmeticException ae) {
            System.out.println("ERROR: Divisió per zero " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: Desconegut " + e);
        }

        int[] vector = new int[10];

        try {
            resseguirVector(vector);
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("WARNING: Hem arribat al final del vector");
        } catch (Exception e) {
            System.out.println("ERROR: Desconegut - " + e);
        }
    }

    /**
     * Método procediment(), que divide dos números enteros
     *
     * @param x
     * @param y
     * @return
     * @throws ArithmeticException
     */
    private int procediment(int x, int y) throws ArithmeticException {
        int resultat = x / y;
        return resultat;
    }

    /**
     * Método resseguirVector(), que recorre un vector de enteros
     *
     * @param vector
     * @throws IndexOutOfBoundsException
     */
    private void resseguirVector(int[] vector) throws IndexOutOfBoundsException {
        int i = 0;
        while (true) {
            System.out.print(vector[i] + " ");
            i++;
        }
    }
}