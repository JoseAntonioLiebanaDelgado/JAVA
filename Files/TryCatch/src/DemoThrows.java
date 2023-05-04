public class DemoThrows {
    public static void main(String[] args) {
        DemoThrows demo = new DemoThrows();
        demo.init();
    }

    private void init() {
        int x = 12, y = 3;
        int resultat;

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

    private int procediment(int x, int y) throws ArithmeticException {
        int resultat = x / y;
        return resultat;
    }

    private void resseguirVector(int[] vector) throws IndexOutOfBoundsException {
        int i = 0;
        while (true) {
            System.out.print(vector[i] + " ");
            i++;
        }
    }
}