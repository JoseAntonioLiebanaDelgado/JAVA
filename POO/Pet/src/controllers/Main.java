package controllers;

import interfaces.Pet;
import models.Animal;
import models.Cat;
import models.Fish;

public class Main {
    public static void main(String[] args) {
        Animal a = new Fish();
        ((Fish) a).play();
        a.eat();
        a.walk();

        Pet p = new Cat();
        p.play();
        ((Cat) p).eat();
        ((Cat) p).walk();
    }
}

//    Este código es un ejemplo de programación orientada a objetos en Java que incluye la definición de clases y la implementación de interfaces y herencia.
//    La clase principal Main contiene el método main que crea dos objetos, a y p, ambos implementando la interfaz Pet. El objeto a es un Fish, mientras que el objeto p es un Cat.
//    La clase Animal es una clase abstracta que contiene un método abstracto eat y un método concreto walk. Las clases Fish y Cat extienden la clase Animal y, por lo tanto, deben implementar el método eat. Además, la clase Fish anula el método walk de la clase Animal para imprimir un mensaje adicional.
//    La interfaz Pet define tres métodos: getName, setName y play. La clase Cat implementa la interfaz Pet y, por lo tanto, debe proporcionar una implementación de estos tres métodos.
//    La clase Spider también extiende la clase Animal, pero no proporciona una implementación del método eat.
//    En resumen, este código es un ejemplo de implementación de herencia, polimorfismo, interfaces y abstracción en Java. El programa crea objetos de diferentes tipos de animales que implementan la interfaz Pet y realiza acciones específicas, como caminar, comer y jugar.