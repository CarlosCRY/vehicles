package org.ies.tierno;

import org.ies.tierno.models.Truck;
import org.ies.tierno.models.Car;
import org.ies.tierno.models.Pig;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Garfield", 47, "Atigrado");
        Car car = new Car("Dogbert", 36, "Supremacista");
        Pig pig = new Pig ("Capitalista", 249, "Dinero");

        truck.showInfo();
        truck.move(5);

        car.showInfo();
        car.talk();

        pig.showInfo();
        pig.talk();
    }
}