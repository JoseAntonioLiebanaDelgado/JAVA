public class TryCatch {
    public static void main(String[] args) {
        float[] numero = new float[10];

        try {
            //int x = 0 / 0;
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