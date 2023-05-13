/**
 * DemoThrow
 */
public class DemoThrow {
    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        // Lanzamos una excepción
        try {
            // Llamamos al método procediment()
            procediment();
            // Capturamos la excepción IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException pepe) {
            System.out.println("ERROR: Index out of bounds." + pepe.getMessage());
            // Capturamos una excepción genérica
        } catch (Exception e) {
            System.out.println("ERROR: Error desconegut");
        }
    }

    /**
     * Método procediment
     */
    private static void procediment() {
        System.out.println("Estic a dins del procediment");
        // Creamos un objeto de tipo IndexOutOfBoundsException
        IndexOutOfBoundsException excepcio = new IndexOutOfBoundsException("missatge error");
        throw excepcio;
    }
}