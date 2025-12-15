package org.ies.tierno;

import org.ies.tierno.models.Truck;
import org.ies.tierno.models.Car;
import org.ies.tierno.models.MBike;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("1539AI", 2015, 2);
        Car car = new Car("KNIGHT", 1983, 2, 145);
        MBike bike = new MBike("1992SNK", 3939, 1745);

        truck.showInfo();
        truck.move(936);

        car.showInfo();
        car.move(8);

        bike.showInfo();
        bike.move(687);
    }
}