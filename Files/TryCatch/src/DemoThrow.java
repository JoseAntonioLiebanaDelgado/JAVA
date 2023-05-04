
public class DemoThrow {
    public static void main(String[] args) {
        try {
            procediment();
        } catch (IndexOutOfBoundsException pepe) {
            System.out.println("ERROR: Index out of bounds." + pepe.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: Error desconegut");
        }
    }

    private static void procediment() {
        System.out.println("Estic a dins del procediment");
        IndexOutOfBoundsException excepcio = new IndexOutOfBoundsException("missatge error");
        throw excepcio;
    }
}