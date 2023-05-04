public class Main {
    public static void main(String[] args) {

        Car cotxe1 = new Car("Super Berlina", "Model S", "Tesla", 5, 300);
        System.out.println(cotxe1);


        Car cotxe2 = new Car("Ford", "Mustang");
        System.out.println(cotxe2);


        cotxe2.setSpeed(200);
        System.out.println(cotxe2.getSpeed());
    }
}