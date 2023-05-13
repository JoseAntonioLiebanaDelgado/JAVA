public class TryCatch {
    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        // Igualamos un array llamada "numero" a un array de 10 elementos de tipo float
        float[] numero = new float[10];

        try {
            //int x = 0 / 0;
            // Creamos un bucle for para recorrer el array y mostrar los elementos
            for (int i = 0; i <= numero.length; i++) {
                System.out.println("" + i + "-->" + numero[i]);
            }
        } catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println(aio.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage()); //e.printStackTrace(); -- sout(e.getCause());
        } finally {
            System.out.println("Aixo s'imprimeix sempre, hi hagi errors o no");
        }
        System.out.println("Hola");
    }
}