public class Car {
    private String type;
    private String brand;
    private String model;
    private int seats;
    private double price;
    private boolean rented;
    private int speed;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String type, String brand, String model, int seats, float price) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.seats = seats;
        this.price = price;

        this.rented = false;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("La velocitat no pot ser negativa");
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void frenar(int kms) {
        this.speed = 0;
    }

}


//La palabra this sirve para definir a que variable nos referimos, en este caso a la variable de la clase, no a la variable del constructor.
//Para deshacer ambiguedades, es decir, para que el programa sepa a que variable nos referimos, usamos la palabra this.
//Overloading es cuando tenemos dos o mas metodos con el mismo nombre pero con diferentes parametros.
//En este caso, tenemos dos constructores con el mismo nombre pero con diferentes parametros.
//El constructor vacio es el que no tiene parametros, es decir, el que no tiene nada entre los parentesis.
//El constructor con parametros es el que tiene parametros, es decir, el que tiene algo entre los parentesis.

// - privat
// + public

// get =
// set =
